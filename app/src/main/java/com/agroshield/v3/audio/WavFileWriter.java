package com.agroshield.v3.audio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * ============================================================
 * WavFileWriter.java
 * ============================================================
 * AudioRecorderHelper.recordClip() namakku float[] waveform
 * (-1.0..+1.0) kudukkum. FastAPI server ku upload panna, idha
 * standard 16-bit PCM mono WAV file bytes ah convert pannuthu
 * indha class.
 *
 * AudioRecorderHelper.java idha use panna, adha touch pannala.
 * ============================================================
 */
public class WavFileWriter {

    /**
     * @param waveform   float samples, -1.0f..+1.0f range (AudioRecorderHelper output)
     * @param sampleRate e.g. 16000 (AudioRecorderHelper.SAMPLE_RATE)
     * @return complete WAV file bytes (44-byte header + 16-bit PCM data), mono
     */
    public static byte[] writeWavBytes(float[] waveform, int sampleRate) throws IOException {
        int numSamples = waveform.length;
        int numChannels = 1;
        int bitsPerSample = 16;
        int byteRate = sampleRate * numChannels * bitsPerSample / 8;
        int dataSize = numSamples * numChannels * bitsPerSample / 8;

        ByteArrayOutputStream out = new ByteArrayOutputStream(44 + dataSize);

        // ---- RIFF header ----
        writeAscii(out, "RIFF");
        writeInt32LE(out, 36 + dataSize);
        writeAscii(out, "WAVE");

        // ---- fmt sub-chunk ----
        writeAscii(out, "fmt ");
        writeInt32LE(out, 16);                 // PCM sub-chunk size
        writeInt16LE(out, 1);                  // audio format = 1 (PCM)
        writeInt16LE(out, numChannels);
        writeInt32LE(out, sampleRate);
        writeInt32LE(out, byteRate);
        writeInt16LE(out, numChannels * bitsPerSample / 8); // block align
        writeInt16LE(out, bitsPerSample);

        // ---- data sub-chunk ----
        writeAscii(out, "data");
        writeInt32LE(out, dataSize);

        for (float sample : waveform) {
            short s = (short) Math.max(-32768, Math.min(32767, Math.round(sample * 32768.0f)));
            writeInt16LE(out, s);
        }

        return out.toByteArray();
    }

    private static void writeAscii(ByteArrayOutputStream out, String s) {
        for (int i = 0; i < s.length(); i++) out.write(s.charAt(i));
    }

    private static void writeInt32LE(ByteArrayOutputStream out, int v) {
        out.write(v & 0xFF);
        out.write((v >> 8) & 0xFF);
        out.write((v >> 16) & 0xFF);
        out.write((v >> 24) & 0xFF);
    }

    private static void writeInt16LE(ByteArrayOutputStream out, int v) {
        out.write(v & 0xFF);
        out.write((v >> 8) & 0xFF);
    }
}
