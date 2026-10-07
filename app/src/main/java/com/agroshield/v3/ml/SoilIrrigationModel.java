package com.agroshield.v3.ml;
public class SoilIrrigationModel {
    public static double[] score(double[] input) {
        double[] var0;
        if (input[19] <= 0.5) {
            if (input[26] <= 0.5) {
                if (input[1] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[24] <= 0.5) {
                            if (input[3] <= 0.5) {
                                if (input[35] <= 19.550339698791504) {
                                    if (input[6] <= 0.5) {
                                        if (input[18] <= 0.5) {
                                            if (input[29] <= 0.5) {
                                                var0 = new double[] {0.38688524590163936, 0.34918032786885245, 0.2639344262295082};
                                            } else {
                                                var0 = new double[] {0.2, 0.8, 0.0};
                                            }
                                        } else {
                                            if (input[35] <= 19.139720916748047) {
                                                var0 = new double[] {0.20512820512820512, 0.28205128205128205, 0.5128205128205128};
                                            } else {
                                                var0 = new double[] {0.3333333333333333, 0.3888888888888889, 0.2777777777777778};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 65.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[29] <= 0.5) {
                                        if (input[9] <= 0.5) {
                                            if (input[6] <= 0.5) {
                                                var0 = new double[] {0.3272438443208896, 0.33571617685994176, 0.33703997881916864};
                                            } else {
                                                var0 = new double[] {0.18421052631578946, 0.39473684210526316, 0.42105263157894735};
                                            }
                                        } else {
                                            if (input[35] <= 27.17419719696045) {
                                                var0 = new double[] {0.13636363636363635, 0.045454545454545456, 0.8181818181818182};
                                            } else {
                                                var0 = new double[] {0.3157894736842105, 0.42105263157894735, 0.2631578947368421};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 60.0) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[36] <= 84.88402557373047) {
                                                var0 = new double[] {0.0, 0.125, 0.875};
                                            } else {
                                                var0 = new double[] {0.0, 0.875, 0.125};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[36] <= 67.34541702270508) {
                                    if (input[34] <= 65.5) {
                                        if (input[34] <= 42.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[35] <= 33.90830039978027) {
                                        if (input[35] <= 33.35281944274902) {
                                            if (input[35] <= 32.2872428894043) {
                                                var0 = new double[] {0.45652173913043476, 0.30434782608695654, 0.2391304347826087};
                                            } else {
                                                var0 = new double[] {0.1111111111111111, 0.5555555555555556, 0.3333333333333333};
                                            }
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 34.163190841674805) {
                                            if (input[34] <= 64.5) {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            }
                        } else {
                            if (input[34] <= 71.0) {
                                if (input[36] <= 51.154869079589844) {
                                    if (input[36] <= 23.635446548461914) {
                                        if (input[36] <= 21.208666801452637) {
                                            if (input[35] <= 19.07376480102539) {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[36] <= 82.18187713623047) {
                                        if (input[34] <= 61.0) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 25.42268943786621) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[35] <= 27.7597017288208) {
                            if (input[34] <= 57.5) {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[34] <= 80.5) {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var0 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[36] <= 76.49293518066406) {
                        if (input[35] <= 26.016287803649902) {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[36] <= 75.9144287109375) {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[35] <= 28.61935520172119) {
                                    if (input[34] <= 84.0) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[36] <= 76.20525741577148) {
                                        if (input[34] <= 70.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[34] <= 72.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[34] <= 92.5) {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[36] <= 78.41854858398438) {
                            if (input[34] <= 70.5) {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[35] <= 27.833974838256836) {
                                    if (input[34] <= 85.5) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[35] <= 28.111863136291504) {
                                        if (input[34] <= 91.0) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[34] <= 90.5) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            }
                        } else {
                            if (input[35] <= 29.26854705810547) {
                                if (input[35] <= 29.216317176818848) {
                                    if (input[36] <= 83.37655639648438) {
                                        if (input[35] <= 28.807148933410645) {
                                            if (input[36] <= 81.67906951904297) {
                                                var0 = new double[] {0.2597402597402597, 0.3116883116883117, 0.42857142857142855};
                                            } else {
                                                var0 = new double[] {0.34, 0.18, 0.48};
                                            }
                                        } else {
                                            if (input[34] <= 72.5) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.75, 0.25};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 27.959463119506836) {
                                            if (input[35] <= 26.412578582763672) {
                                                var0 = new double[] {0.125, 0.5, 0.375};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 90.5) {
                                                var0 = new double[] {0.5, 0.5, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[34] <= 92.5) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                if (input[35] <= 29.40135955810547) {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[36] <= 83.73884201049805) {
                                        if (input[34] <= 69.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[34] <= 87.5) {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 92.0) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (input[34] <= 57.5) {
                    var0 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[35] <= 29.957589149475098) {
                        if (input[36] <= 91.09420776367188) {
                            if (input[34] <= 80.5) {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[34] <= 79.5) {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[34] <= 80.0) {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            if (input[34] <= 60.5) {
                if (input[34] <= 37.5) {
                    var0 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var0 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                var0 = new double[] {0.0, 0.0, 1.0};
            }
        }
        double[] var1;
        if (input[36] <= 16.658634185791016) {
            if (input[35] <= 17.17427349090576) {
                if (input[36] <= 15.28511667251587) {
                    var1 = new double[] {0.0, 0.0, 1.0};
                } else {
                    if (input[34] <= 37.5) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[34] <= 55.0) {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[36] <= 14.76987075805664) {
                    if (input[35] <= 18.34524154663086) {
                        if (input[36] <= 14.487070083618164) {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[35] <= 18.184860229492188) {
                                if (input[34] <= 39.5) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        if (input[35] <= 20.757930755615234) {
                            if (input[34] <= 63.5) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[34] <= 41.5) {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[34] <= 60.5) {
                        if (input[36] <= 16.424450874328613) {
                            if (input[34] <= 36.5) {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[34] <= 33.0) {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[35] <= 22.58277130126953) {
                if (input[16] <= 0.5) {
                    if (input[34] <= 45.5) {
                        if (input[17] <= 0.5) {
                            if (input[28] <= 0.5) {
                                if (input[35] <= 20.971588134765625) {
                                    if (input[8] <= 0.5) {
                                        if (input[27] <= 0.5) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[35] <= 19.590266227722168) {
                                                var1 = new double[] {0.875, 0.125, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 19.903111457824707) {
                                            if (input[36] <= 18.059508323669434) {
                                                var1 = new double[] {0.8461538461538461, 0.15384615384615385, 0.0};
                                            } else {
                                                var1 = new double[] {0.967741935483871, 0.03225806451612903, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[14] <= 0.5) {
                                        if (input[0] <= 0.5) {
                                            if (input[34] <= 43.5) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                }
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[34] <= 38.5) {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        if (input[34] <= 70.5) {
                            if (input[28] <= 0.5) {
                                if (input[8] <= 0.5) {
                                    if (input[14] <= 0.5) {
                                        if (input[27] <= 0.5) {
                                            if (input[2] <= 0.5) {
                                                var1 = new double[] {0.31343283582089554, 0.6417910447761194, 0.04477611940298507};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 65.5) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[35] <= 18.85193920135498) {
                                        if (input[35] <= 17.711485862731934) {
                                            if (input[35] <= 17.116451263427734) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.42105263157894735, 0.5789473684210527};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 20.5212345123291) {
                                            if (input[35] <= 19.95004653930664) {
                                                var1 = new double[] {0.0, 0.4375, 0.5625};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[36] <= 19.84516143798828) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.7142857142857143, 0.2857142857142857};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[35] <= 18.232318878173828) {
                                    if (input[34] <= 65.5) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[34] <= 66.0) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        } else {
                            if (input[23] <= 0.5) {
                                if (input[32] <= 0.5) {
                                    if (input[27] <= 0.5) {
                                        if (input[9] <= 0.5) {
                                            if (input[4] <= 0.5) {
                                                var1 = new double[] {0.0, 0.1786833855799373, 0.8213166144200627};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[35] <= 18.903889656066895) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[36] <= 78.12557220458984) {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                } else {
                    if (input[34] <= 70.5) {
                        if (input[36] <= 24.291889190673828) {
                            if (input[36] <= 22.968276023864746) {
                                if (input[34] <= 47.5) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[35] <= 19.32836151123047) {
                                    if (input[34] <= 45.0) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[35] <= 20.464452743530273) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[35] <= 21.09682559967041) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            }
                        } else {
                            if (input[36] <= 24.346529006958008) {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[35] <= 16.623474597930908) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[35] <= 19.54301357269287) {
                                        if (input[34] <= 47.0) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[34] <= 47.0) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[11] <= 0.5) {
                    if (input[36] <= 61.75881767272949) {
                        if (input[34] <= 41.5) {
                            if (input[27] <= 0.5) {
                                if (input[20] <= 0.5) {
                                    if (input[18] <= 0.5) {
                                        if (input[19] <= 0.5) {
                                            if (input[17] <= 0.5) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.9230769230769231, 0.07692307692307693, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 38.0) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[35] <= 24.394057273864746) {
                                        if (input[36] <= 60.613075256347656) {
                                            if (input[36] <= 59.02220344543457) {
                                                var1 = new double[] {0.5, 0.5, 0.0};
                                            } else {
                                                var1 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 31.008291244506836) {
                                            if (input[35] <= 26.09367084503174) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.803921568627451, 0.19607843137254902, 0.0};
                                            }
                                        } else {
                                            if (input[36] <= 44.204288482666016) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.5384615384615384, 0.46153846153846156, 0.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[20] <= 0.5) {
                                if (input[29] <= 0.5) {
                                    if (input[31] <= 0.5) {
                                        if (input[3] <= 0.5) {
                                            if (input[34] <= 60.5) {
                                                var1 = new double[] {0.04790419161676647, 0.9520958083832335, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.26148409893992935, 0.7385159010600707};
                                            }
                                        } else {
                                            if (input[36] <= 60.09107971191406) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.7, 0.3};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 47.31626892089844) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[36] <= 52.63620376586914) {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                if (input[34] <= 54.5) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    } else {
                        if (input[9] <= 0.5) {
                            if (input[35] <= 29.892597198486328) {
                                if (input[35] <= 26.4317626953125) {
                                    if (input[6] <= 0.5) {
                                        if (input[17] <= 0.5) {
                                            if (input[36] <= 99.13928604125977) {
                                                var1 = new double[] {0.3331043956043956, 0.35645604395604397, 0.31043956043956045};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 60.5) {
                                                var1 = new double[] {0.45714285714285713, 0.5428571428571428, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 85.2248420715332) {
                                            if (input[36] <= 80.16565322875977) {
                                                var1 = new double[] {0.3333333333333333, 0.0, 0.6666666666666666};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[36] <= 87.42031478881836) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[34] <= 65.5) {
                                        if (input[35] <= 29.575264930725098) {
                                            if (input[7] <= 0.5) {
                                                var1 = new double[] {0.6381818181818183, 0.35090909090909095, 0.010909090909090912};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[23] <= 0.5) {
                                                var1 = new double[] {0.4166666666666667, 0.5333333333333333, 0.05};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[1] <= 0.5) {
                                            if (input[21] <= 0.5) {
                                                var1 = new double[] {0.004629629629629629, 0.2847222222222222, 0.7106481481481481};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[36] <= 82.69018936157227) {
                                                var1 = new double[] {0.0, 0.47368421052631576, 0.5263157894736842};
                                            } else {
                                                var1 = new double[] {0.0, 0.6896551724137931, 0.3103448275862069};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[6] <= 0.5) {
                                    if (input[13] <= 0.5) {
                                        if (input[31] <= 0.5) {
                                            if (input[7] <= 0.5) {
                                                var1 = new double[] {0.3787878787878788, 0.34415584415584416, 0.27705627705627706};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[35] <= 42.07969665527344) {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                }
                            }
                        } else {
                            if (input[34] <= 55.0) {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[34] <= 72.5) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    }
                } else {
                    if (input[35] <= 26.605485916137695) {
                        if (input[35] <= 26.400925636291504) {
                            if (input[36] <= 57.80645751953125) {
                                if (input[35] <= 26.173450469970703) {
                                    if (input[35] <= 25.865321159362793) {
                                        if (input[36] <= 50.22583198547363) {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[34] <= 81.0) {
                                                var1 = new double[] {0.5609756097560976, 0.43902439024390244, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 62.5) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[35] <= 26.291531562805176) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 57.0) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[34] <= 80.0) {
                                    if (input[36] <= 61.07104301452637) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[35] <= 24.056615829467773) {
                                            if (input[35] <= 23.266528129577637) {
                                                var1 = new double[] {0.5, 0.5, 0.0};
                                            } else {
                                                var1 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 56.5) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[34] <= 76.5) {
                                if (input[35] <= 26.50658130645752) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[34] <= 56.0) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[34] <= 57.5) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[35] <= 27.069294929504395) {
                                if (input[36] <= 68.06255340576172) {
                                    if (input[34] <= 80.5) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[36] <= 57.54689598083496) {
                                    if (input[34] <= 76.5) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[34] <= 79.0) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        double[] var2;
        if (input[6] <= 0.5) {
            if (input[35] <= 42.93486976623535) {
                if (input[34] <= 54.5) {
                    if (input[19] <= 0.5) {
                        if (input[0] <= 0.5) {
                            if (input[34] <= 44.5) {
                                if (input[34] <= 38.5) {
                                    if (input[3] <= 0.5) {
                                        if (input[34] <= 34.5) {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[20] <= 0.5) {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var2 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[36] <= 69.52106475830078) {
                                        if (input[17] <= 0.5) {
                                            if (input[11] <= 0.5) {
                                                var2 = new double[] {0.6022727272727273, 0.3977272727272727, 0.0};
                                            } else {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var2 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[33] <= 0.5) {
                                            if (input[25] <= 0.5) {
                                                var2 = new double[] {0.9320388349514563, 0.06796116504854369, 0.0};
                                            } else {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[36] <= 90.01715469360352) {
                                    if (input[15] <= 0.5) {
                                        if (input[35] <= 18.66076946258545) {
                                            if (input[8] <= 0.5) {
                                                var2 = new double[] {0.1111111111111111, 0.8888888888888888, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[17] <= 0.5) {
                                                var2 = new double[] {0.39872068230277186, 0.6012793176972282, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var2 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[26] <= 0.5) {
                                        if (input[5] <= 0.5) {
                                            if (input[28] <= 0.5) {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var2 = new double[] {1.0, 0.0, 0.0};
                                    }
                                }
                            }
                        } else {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[35] <= 35.66311073303223) {
                            if (input[36] <= 54.08917427062988) {
                                if (input[34] <= 38.0) {
                                    var2 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var2 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[34] <= 33.5) {
                                    var2 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var2 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[34] <= 65.5) {
                        if (input[22] <= 0.5) {
                            if (input[1] <= 0.5) {
                                if (input[34] <= 60.5) {
                                    if (input[31] <= 0.5) {
                                        if (input[15] <= 0.5) {
                                            if (input[5] <= 0.5) {
                                                var2 = new double[] {0.09302325581395349, 0.8329809725158562, 0.07399577167019028};
                                            } else {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var2 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[8] <= 0.5) {
                                        if (input[18] <= 0.5) {
                                            if (input[15] <= 0.5) {
                                                var2 = new double[] {0.08042895442359249, 0.6380697050938338, 0.28150134048257375};
                                            } else {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var2 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var2 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[3] <= 0.5) {
                            if (input[36] <= 70.91983032226562) {
                                if (input[5] <= 0.5) {
                                    if (input[11] <= 0.5) {
                                        if (input[31] <= 0.5) {
                                            if (input[17] <= 0.5) {
                                                var2 = new double[] {0.0, 0.13179916317991633, 0.8682008368200836};
                                            } else {
                                                var2 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[35] <= 22.530038833618164) {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 0.4, 0.6};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 27.542343139648438) {
                                            if (input[34] <= 80.5) {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var2 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[34] <= 85.5) {
                                        var2 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var2 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                if (input[33] <= 0.5) {
                                    if (input[7] <= 0.5) {
                                        if (input[34] <= 90.5) {
                                            if (input[21] <= 0.5) {
                                                var2 = new double[] {0.0035398230088495575, 0.5035398230088496, 0.4929203539823009};
                                            } else {
                                                var2 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var2 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[36] <= 85.88462448120117) {
                                            if (input[35] <= 28.42987823486328) {
                                                var2 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var2 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    var2 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[5] <= 0.5) {
                    if (input[32] <= 0.5) {
                        if (input[26] <= 0.5) {
                            if (input[2] <= 0.5) {
                                if (input[24] <= 0.5) {
                                    if (input[4] <= 0.5) {
                                        var2 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var2 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    var2 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[36] <= 91.60167694091797) {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[34] <= 62.5) {
                                    var2 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[36] <= 93.87588119506836) {
                                        var2 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var2 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        }
                    } else {
                        var2 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    var2 = new double[] {0.0, 1.0, 0.0};
                }
            }
        } else {
            if (input[35] <= 22.705775260925293) {
                if (input[35] <= 19.015347480773926) {
                    var2 = new double[] {0.0, 0.0, 1.0};
                } else {
                    if (input[36] <= 74.21125984191895) {
                        var2 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[34] <= 51.0) {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[34] <= 71.0) {
                    if (input[35] <= 27.857803344726562) {
                        var2 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[36] <= 67.43036460876465) {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[36] <= 86.32376480102539) {
                                var2 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    }
                } else {
                    var2 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        return mulVectorNumber(addVectors(addVectors(addVectors(subroutine0(input), var0), var1), var2), 0.05);
    }
    public static double[] subroutine0(double[] input) {
        double[] var0;
        if (input[34] <= 54.5) {
            if (input[34] <= 38.5) {
                if (input[35] <= 27.091042518615723) {
                    var0 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[34] <= 34.5) {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[14] <= 0.5) {
                            if (input[11] <= 0.5) {
                                if (input[10] <= 0.5) {
                                    if (input[19] <= 0.5) {
                                        if (input[34] <= 36.5) {
                                            if (input[36] <= 62.698734283447266) {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[22] <= 0.5) {
                                                var0 = new double[] {0.8095238095238095, 0.19047619047619047, 0.0};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[36] <= 89.83592987060547) {
                    if (input[17] <= 0.5) {
                        if (input[21] <= 0.5) {
                            if (input[30] <= 0.5) {
                                if (input[15] <= 0.5) {
                                    if (input[11] <= 0.5) {
                                        if (input[34] <= 46.5) {
                                            if (input[23] <= 0.5) {
                                                var0 = new double[] {0.5532646048109966, 0.44673539518900346, 0.0};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[2] <= 0.5) {
                                                var0 = new double[] {0.16338028169014085, 0.8366197183098592, 0.0};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[36] <= 83.56396865844727) {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[35] <= 28.585254669189453) {
                                    if (input[36] <= 83.640380859375) {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[35] <= 27.9463529586792) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[34] <= 43.0) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[35] <= 29.34099006652832) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[36] <= 87.73246002197266) {
                                            if (input[35] <= 29.638747215270996) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        var0 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    if (input[35] <= 25.00669765472412) {
                        if (input[28] <= 0.5) {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[34] <= 43.0) {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        if (input[36] <= 89.95656967163086) {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[13] <= 0.5) {
                if (input[31] <= 0.5) {
                    if (input[34] <= 65.5) {
                        if (input[20] <= 0.5) {
                            if (input[19] <= 0.5) {
                                if (input[7] <= 0.5) {
                                    if (input[15] <= 0.5) {
                                        if (input[1] <= 0.5) {
                                            if (input[25] <= 0.5) {
                                                var0 = new double[] {0.09610027855153204, 0.7771587743732591, 0.12674094707520892};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[35] <= 31.363529205322266) {
                                        if (input[34] <= 62.0) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    }
                                }
                            } else {
                                if (input[34] <= 60.5) {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var0 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[34] <= 55.5) {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[28] <= 0.5) {
                            if (input[19] <= 0.5) {
                                if (input[34] <= 80.5) {
                                    if (input[0] <= 0.5) {
                                        if (input[21] <= 0.5) {
                                            if (input[8] <= 0.5) {
                                                var0 = new double[] {0.0017761989342806395, 0.4351687388987567, 0.5630550621669627};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[36] <= 83.88385391235352) {
                                        if (input[35] <= 20.126954078674316) {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        } else {
                                            if (input[30] <= 0.5) {
                                                var0 = new double[] {0.0, 0.1674641148325359, 0.8325358851674641};
                                            } else {
                                                var0 = new double[] {0.0, 0.3888888888888889, 0.6111111111111112};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 27.622193336486816) {
                                            if (input[30] <= 0.5) {
                                                var0 = new double[] {0.0, 0.027888446215139442, 0.9721115537848606};
                                            } else {
                                                var0 = new double[] {0.0, 0.125, 0.875};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[36] <= 84.04341125488281) {
                        if (input[34] <= 65.0) {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[34] <= 86.0) {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[34] <= 85.0) {
                            if (input[34] <= 67.0) {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[34] <= 85.5) {
                    if (input[36] <= 92.74794006347656) {
                        if (input[34] <= 69.5) {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    var0 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        double[] var1;
        if (input[34] <= 55.5) {
            if (input[36] <= 69.22713088989258) {
                if (input[34] <= 39.5) {
                    if (input[35] <= 26.280611038208008) {
                        if (input[8] <= 0.5) {
                            if (input[16] <= 0.5) {
                                if (input[36] <= 59.94176483154297) {
                                    if (input[27] <= 0.5) {
                                        if (input[18] <= 0.5) {
                                            if (input[35] <= 24.26272678375244) {
                                                var1 = new double[] {0.8, 0.2, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[35] <= 26.3221492767334) {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[34] <= 34.5) {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[11] <= 0.5) {
                                    if (input[19] <= 0.5) {
                                        if (input[34] <= 38.5) {
                                            if (input[3] <= 0.5) {
                                                var1 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[3] <= 0.5) {
                                                var1 = new double[] {0.07692307692307693, 0.9230769230769231, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        }
                    }
                } else {
                    if (input[18] <= 0.5) {
                        if (input[29] <= 0.5) {
                            if (input[11] <= 0.5) {
                                if (input[36] <= 31.617998123168945) {
                                    if (input[2] <= 0.5) {
                                        if (input[9] <= 0.5) {
                                            if (input[34] <= 47.5) {
                                                var1 = new double[] {0.5555555555555556, 0.4444444444444444, 0.0};
                                            } else {
                                                var1 = new double[] {0.06153846153846154, 0.9384615384615385, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[32] <= 0.5) {
                                        if (input[5] <= 0.5) {
                                            if (input[31] <= 0.5) {
                                                var1 = new double[] {0.09090909090909091, 0.9090909090909091, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                }
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[34] <= 47.5) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[33] <= 0.5) {
                    if (input[11] <= 0.5) {
                        if (input[36] <= 90.14547348022461) {
                            if (input[21] <= 0.5) {
                                if (input[12] <= 0.5) {
                                    if (input[2] <= 0.5) {
                                        if (input[35] <= 20.023801803588867) {
                                            if (input[28] <= 0.5) {
                                                var1 = new double[] {0.803921568627451, 0.19607843137254902, 0.0};
                                            } else {
                                                var1 = new double[] {0.5862068965517241, 0.41379310344827586, 0.0};
                                            }
                                        } else {
                                            if (input[36] <= 85.0490951538086) {
                                                var1 = new double[] {0.952755905511811, 0.047244094488188976, 0.0};
                                            } else {
                                                var1 = new double[] {0.8, 0.2, 0.0};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[36] <= 76.07612609863281) {
                                        if (input[35] <= 23.295775413513184) {
                                            if (input[36] <= 75.47412109375) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[36] <= 77.42749786376953) {
                                            if (input[36] <= 77.27985000610352) {
                                                var1 = new double[] {0.41379310344827586, 0.5862068965517241, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[36] <= 84.00566482543945) {
                                                var1 = new double[] {0.6785714285714286, 0.32142857142857145, 0.0};
                                            } else {
                                                var1 = new double[] {0.35294117647058826, 0.6470588235294118, 0.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[36] <= 81.80677032470703) {
                                    if (input[34] <= 41.0) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[34] <= 42.5) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            }
                        } else {
                            if (input[36] <= 94.26812744140625) {
                                if (input[28] <= 0.5) {
                                    if (input[6] <= 0.5) {
                                        if (input[35] <= 29.079153060913086) {
                                            if (input[34] <= 54.5) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                            }
                                        } else {
                                            if (input[26] <= 0.5) {
                                                var1 = new double[] {0.9466666666666667, 0.05333333333333334, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[36] <= 93.13915634155273) {
                                        if (input[36] <= 91.08625411987305) {
                                            if (input[36] <= 90.85990142822266) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 20.86253547668457) {
                                            if (input[34] <= 41.5) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 46.5) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[22] <= 0.5) {
                                    if (input[28] <= 0.5) {
                                        if (input[26] <= 0.5) {
                                            if (input[10] <= 0.5) {
                                                var1 = new double[] {0.84375, 0.15625, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 21.79269504547119) {
                                            if (input[36] <= 94.91649627685547) {
                                                var1 = new double[] {0.5714285714285714, 0.42857142857142855, 0.0};
                                            } else {
                                                var1 = new double[] {0.2, 0.8, 0.0};
                                            }
                                        } else {
                                            if (input[36] <= 94.48795700073242) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.25, 0.75, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        }
                    } else {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[35] <= 26.672231674194336) {
                        if (input[35] <= 26.279324531555176) {
                            if (input[35] <= 25.942821502685547) {
                                if (input[34] <= 47.5) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[36] <= 80.6419677734375) {
                                    if (input[34] <= 46.5) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        } else {
                            if (input[34] <= 45.0) {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            }
        } else {
            if (input[1] <= 0.5) {
                if (input[26] <= 0.5) {
                    if (input[12] <= 0.5) {
                        if (input[15] <= 0.5) {
                            if (input[31] <= 0.5) {
                                if (input[36] <= 73.29264068603516) {
                                    if (input[20] <= 0.5) {
                                        if (input[8] <= 0.5) {
                                            if (input[7] <= 0.5) {
                                                var1 = new double[] {0.002938295788442703, 0.3535749265426053, 0.643486777668952};
                                            } else {
                                                var1 = new double[] {0.25, 0.625, 0.125};
                                            }
                                        } else {
                                            if (input[35] <= 20.508402824401855) {
                                                var1 = new double[] {0.0, 0.0759493670886076, 0.9240506329113924};
                                            } else {
                                                var1 = new double[] {0.0, 0.35714285714285715, 0.6428571428571429};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[21] <= 0.5) {
                                        if (input[35] <= 26.336413383483887) {
                                            if (input[23] <= 0.5) {
                                                var1 = new double[] {0.047619047619047616, 0.4181184668989547, 0.5342624854819977};
                                            } else {
                                                var1 = new double[] {0.0, 0.08333333333333333, 0.9166666666666666};
                                            }
                                        } else {
                                            if (input[5] <= 0.5) {
                                                var1 = new double[] {0.034722222222222224, 0.4652777777777778, 0.5};
                                            } else {
                                                var1 = new double[] {0.4444444444444444, 0.2777777777777778, 0.2777777777777778};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 65.5) {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[35] <= 19.189605712890625) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[34] <= 85.0) {
                                        if (input[34] <= 65.0) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        } else {
                            if (input[34] <= 90.5) {
                                if (input[35] <= 23.480219841003418) {
                                    if (input[35] <= 23.155400276184082) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[35] <= 23.211645126342773) {
                                            if (input[35] <= 23.17109203338623) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.4, 0.6, 0.0};
                                            }
                                        } else {
                                            if (input[35] <= 23.297456741333008) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.6, 0.4, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[36] <= 88.24821853637695) {
                                        if (input[35] <= 25.506328582763672) {
                                            if (input[36] <= 72.87528228759766) {
                                                var1 = new double[] {0.4, 0.6, 0.0};
                                            } else {
                                                var1 = new double[] {0.125, 0.875, 0.0};
                                            }
                                        } else {
                                            if (input[36] <= 81.81538009643555) {
                                                var1 = new double[] {0.3684210526315789, 0.631578947368421, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[36] <= 82.77068328857422) {
                            if (input[34] <= 60.5) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[34] <= 61.0) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                } else {
                    if (input[35] <= 30.263928413391113) {
                        if (input[36] <= 90.27471542358398) {
                            if (input[35] <= 26.864282608032227) {
                                if (input[34] <= 72.5) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[35] <= 24.561488151550293) {
                                if (input[34] <= 81.0) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[36] <= 93.50609588623047) {
                                    if (input[34] <= 78.0) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[36] <= 93.79835891723633) {
                                        if (input[34] <= 74.0) {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[35] <= 26.109734535217285) {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        } else {
                                            if (input[36] <= 94.30817031860352) {
                                                var1 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                            } else {
                                                var1 = new double[] {0.0, 0.4, 0.6};
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[35] <= 42.663909912109375) {
                            if (input[35] <= 42.34954643249512) {
                                if (input[35] <= 31.263882637023926) {
                                    if (input[36] <= 94.03340530395508) {
                                        if (input[34] <= 82.5) {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[34] <= 79.5) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[34] <= 80.5) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                }
            } else {
                if (input[34] <= 90.5) {
                    if (input[34] <= 67.5) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var1 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    var1 = new double[] {0.0, 0.0, 1.0};
                }
            }
        }
        double[] var2;
        if (input[6] <= 0.5) {
            if (input[2] <= 0.5) {
                if (input[14] <= 0.5) {
                    if (input[24] <= 0.5) {
                        if (input[34] <= 55.5) {
                            if (input[11] <= 0.5) {
                                if (input[10] <= 0.5) {
                                    if (input[25] <= 0.5) {
                                        if (input[1] <= 0.5) {
                                            if (input[17] <= 0.5) {
                                                var2 = new double[] {0.7289719626168224, 0.27102803738317754, 0.0};
                                            } else {
                                                var2 = new double[] {0.5481481481481482, 0.45185185185185184, 0.0};
                                            }
                                        } else {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[34] <= 52.5) {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var2 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    var2 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[5] <= 0.5) {
                                if (input[34] <= 65.5) {
                                    if (input[36] <= 84.7184829711914) {
                                        if (input[36] <= 70.93357467651367) {
                                            if (input[19] <= 0.5) {
                                                var2 = new double[] {0.051829268292682924, 0.6371951219512195, 0.31097560975609756};
                                            } else {
                                                var2 = new double[] {0.0, 0.22950819672131148, 0.7704918032786885};
                                            }
                                        } else {
                                            if (input[1] <= 0.5) {
                                                var2 = new double[] {0.44387755102040816, 0.4030612244897959, 0.15306122448979592};
                                            } else {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 88.19694519042969) {
                                            if (input[34] <= 64.5) {
                                                var2 = new double[] {0.047619047619047616, 0.9523809523809523, 0.0};
                                            } else {
                                                var2 = new double[] {0.4, 0.6, 0.0};
                                            }
                                        } else {
                                            if (input[22] <= 0.5) {
                                                var2 = new double[] {0.013793103448275862, 0.9862068965517241, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[15] <= 0.5) {
                                        if (input[36] <= 68.34011459350586) {
                                            if (input[27] <= 0.5) {
                                                var2 = new double[] {0.0, 0.1901840490797546, 0.8098159509202454};
                                            } else {
                                                var2 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[34] <= 80.5) {
                                                var2 = new double[] {0.002554278416347382, 0.45721583652618136, 0.5402298850574713};
                                            } else {
                                                var2 = new double[] {0.0, 0.11463046757164404, 0.8853695324283559};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 88.34899139404297) {
                                            if (input[36] <= 87.93292617797852) {
                                                var2 = new double[] {0.0, 0.4966887417218543, 0.5033112582781457};
                                            } else {
                                                var2 = new double[] {0.0, 0.16666666666666666, 0.8333333333333334};
                                            }
                                        } else {
                                            if (input[36] <= 89.00640106201172) {
                                                var2 = new double[] {0.0, 0.75, 0.25};
                                            } else {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[36] <= 83.20251846313477) {
                                    if (input[35] <= 19.696267127990723) {
                                        if (input[35] <= 18.92835807800293) {
                                            var2 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 21.58720302581787) {
                                            var2 = new double[] {0.0, 0.0, 1.0};
                                        } else {
                                            if (input[35] <= 25.302355766296387) {
                                                var2 = new double[] {0.0, 0.8888888888888888, 0.1111111111111111};
                                            } else {
                                                var2 = new double[] {0.0, 0.4, 0.6};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[35] <= 24.15500545501709) {
                                        var2 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[36] <= 94.54394149780273) {
                                            if (input[35] <= 26.790393829345703) {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.2222222222222222, 0.6666666666666666, 0.1111111111111111};
                                            }
                                        } else {
                                            if (input[34] <= 79.5) {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[36] <= 94.96309661865234) {
                            if (input[35] <= 36.1967658996582) {
                                if (input[36] <= 83.01969528198242) {
                                    if (input[36] <= 78.8740119934082) {
                                        if (input[35] <= 33.77512741088867) {
                                            if (input[35] <= 23.2922306060791) {
                                                var2 = new double[] {0.4, 0.2, 0.4};
                                            } else {
                                                var2 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var2 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[36] <= 80.92498016357422) {
                                            if (input[36] <= 80.03823852539062) {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.6, 0.4, 0.0};
                                            }
                                        } else {
                                            if (input[35] <= 21.855941772460938) {
                                                var2 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[34] <= 57.5) {
                                        var2 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var2 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[36] <= 83.93428421020508) {
                        if (input[35] <= 9.693414211273193) {
                            if (input[34] <= 46.5) {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[36] <= 82.5954475402832) {
                                    var2 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[34] <= 66.0) {
                                        var2 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var2 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        } else {
                            if (input[35] <= 10.551536083221436) {
                                if (input[34] <= 62.5) {
                                    var2 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var2 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[35] <= 11.276475429534912) {
                                    if (input[36] <= 80.2884407043457) {
                                        if (input[34] <= 49.0) {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var2 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 11.10549783706665) {
                                            if (input[34] <= 42.0) {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 52.5) {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[36] <= 83.80558013916016) {
                                        if (input[34] <= 48.0) {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[36] <= 80.2828483581543) {
                                                var2 = new double[] {0.0, 0.38461538461538464, 0.6153846153846154};
                                            } else {
                                                var2 = new double[] {0.0, 0.6018518518518519, 0.39814814814814814};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 83.87623977661133) {
                                            if (input[34] <= 73.0) {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[34] <= 52.5) {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 0.75, 0.25};
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        var2 = new double[] {1.0, 0.0, 0.0};
                    }
                }
            } else {
                if (input[36] <= 91.21368408203125) {
                    if (input[34] <= 59.0) {
                        var2 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[34] <= 77.5) {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    var2 = new double[] {0.0, 0.0, 1.0};
                }
            }
        } else {
            if (input[34] <= 70.0) {
                if (input[34] <= 55.0) {
                    var2 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var2 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                var2 = new double[] {0.0, 0.0, 1.0};
            }
        }
        double[] var3;
        if (input[19] <= 0.5) {
            if (input[8] <= 0.5) {
                if (input[18] <= 0.5) {
                    if (input[24] <= 0.5) {
                        if (input[34] <= 55.5) {
                            if (input[32] <= 0.5) {
                                if (input[20] <= 0.5) {
                                    if (input[34] <= 44.5) {
                                        if (input[21] <= 0.5) {
                                            if (input[12] <= 0.5) {
                                                var3 = new double[] {0.9760820045558086, 0.023917995444191344, 0.0};
                                            } else {
                                                var3 = new double[] {0.9204545454545454, 0.07954545454545454, 0.0};
                                            }
                                        } else {
                                            var3 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[12] <= 0.5) {
                                            if (input[3] <= 0.5) {
                                                var3 = new double[] {0.6442857142857142, 0.3557142857142857, 0.0};
                                            } else {
                                                var3 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[34] <= 32.5) {
                                        var3 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var3 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            } else {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[15] <= 0.5) {
                                if (input[30] <= 0.5) {
                                    if (input[1] <= 0.5) {
                                        if (input[31] <= 0.5) {
                                            if (input[2] <= 0.5) {
                                                var3 = new double[] {0.01098901098901099, 0.38665038665038665, 0.6023606023606024};
                                            } else {
                                                var3 = new double[] {0.17391304347826086, 0.43478260869565216, 0.391304347826087};
                                            }
                                        } else {
                                            if (input[34] <= 65.0) {
                                                var3 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var3 = new double[] {0.0, 0.43478260869565216, 0.5652173913043478};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 26.496024131774902) {
                                            if (input[35] <= 26.25024127960205) {
                                                var3 = new double[] {0.09302325581395349, 0.4186046511627907, 0.4883720930232558};
                                            } else {
                                                var3 = new double[] {0.0, 0.25, 0.75};
                                            }
                                        } else {
                                            if (input[34] <= 90.5) {
                                                var3 = new double[] {0.33783783783783783, 0.6621621621621622, 0.0};
                                            } else {
                                                var3 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[34] <= 90.5) {
                                        if (input[36] <= 82.21687698364258) {
                                            if (input[36] <= 80.93034362792969) {
                                                var3 = new double[] {0.1875, 0.8125, 0.0};
                                            } else {
                                                var3 = new double[] {0.4444444444444444, 0.5555555555555556, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 67.5) {
                                                var3 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var3 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var3 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                if (input[35] <= 23.36053466796875) {
                                    if (input[34] <= 90.5) {
                                        if (input[34] <= 67.5) {
                                            var3 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var3 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[36] <= 71.19236755371094) {
                                        if (input[35] <= 24.48357105255127) {
                                            if (input[36] <= 71.01891708374023) {
                                                var3 = new double[] {0.0, 0.5, 0.5};
                                            } else {
                                                var3 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                            }
                                        } else {
                                            var3 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[36] <= 81.97726821899414) {
                                            if (input[36] <= 79.46920394897461) {
                                                var3 = new double[] {0.23529411764705882, 0.4264705882352941, 0.3382352941176471};
                                            } else {
                                                var3 = new double[] {0.12, 0.8, 0.08};
                                            }
                                        } else {
                                            if (input[34] <= 68.0) {
                                                var3 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var3 = new double[] {0.0, 0.5, 0.5};
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[35] <= 36.01787185668945) {
                            if (input[36] <= 50.1258430480957) {
                                if (input[34] <= 49.5) {
                                    var3 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var3 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[34] <= 65.5) {
                                    if (input[35] <= 21.84003448486328) {
                                        var3 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 52.0) {
                                            var3 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    var3 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    if (input[36] <= 61.3273811340332) {
                        if (input[36] <= 60.92997169494629) {
                            if (input[36] <= 55.75430488586426) {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[34] <= 48.0) {
                                    var3 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[36] <= 56.4318790435791) {
                                        var3 = new double[] {0.0, 0.0, 1.0};
                                    } else {
                                        if (input[36] <= 56.997724533081055) {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[35] <= 22.025315284729004) {
                                                var3 = new double[] {0.0, 0.5294117647058824, 0.47058823529411764};
                                            } else {
                                                var3 = new double[] {0.0, 0.7647058823529411, 0.23529411764705882};
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[36] <= 73.71491622924805) {
                            if (input[35] <= 26.15684986114502) {
                                if (input[36] <= 71.54561996459961) {
                                    if (input[34] <= 70.5) {
                                        if (input[34] <= 47.5) {
                                            var3 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var3 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[36] <= 72.42589950561523) {
                                        if (input[35] <= 23.410598754882812) {
                                            if (input[34] <= 47.0) {
                                                var3 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var3 = new double[] {0.0, 0.4, 0.6};
                                            }
                                        } else {
                                            if (input[36] <= 71.58414077758789) {
                                                var3 = new double[] {0.4, 0.4, 0.2};
                                            } else {
                                                var3 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 24.986502647399902) {
                                            if (input[36] <= 72.7055549621582) {
                                                var3 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var3 = new double[] {0.26666666666666666, 0.4, 0.3333333333333333};
                                            }
                                        } else {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[36] <= 72.42716979980469) {
                                    if (input[34] <= 61.0) {
                                        var3 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var3 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[34] <= 52.5) {
                                        var3 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 68.5) {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            }
                        } else {
                            if (input[34] <= 46.0) {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[36] <= 17.152097702026367) {
                    if (input[36] <= 17.09891700744629) {
                        if (input[34] <= 37.5) {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[36] <= 14.76987075805664) {
                                if (input[34] <= 63.0) {
                                    var3 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var3 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[36] <= 15.382278442382812) {
                                    if (input[36] <= 14.874372959136963) {
                                        if (input[35] <= 19.27227783203125) {
                                            var3 = new double[] {0.0, 0.0, 1.0};
                                        } else {
                                            if (input[34] <= 64.0) {
                                                var3 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var3 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 58.0) {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[34] <= 60.5) {
                                        var3 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var3 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        }
                    } else {
                        var3 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[36] <= 17.623180389404297) {
                        if (input[35] <= 19.29658603668213) {
                            if (input[35] <= 17.117959022521973) {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[34] <= 61.5) {
                                    if (input[35] <= 18.462764739990234) {
                                        var3 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[34] <= 31.5) {
                                            var3 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    var3 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[34] <= 36.5) {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        if (input[34] <= 37.0) {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[36] <= 19.60075283050537) {
                                if (input[36] <= 19.277393341064453) {
                                    if (input[35] <= 18.013819694519043) {
                                        if (input[34] <= 58.5) {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[35] <= 18.690086364746094) {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[36] <= 17.944954872131348) {
                                                var3 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var3 = new double[] {0.0, 0.75, 0.25};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[36] <= 19.479187965393066) {
                                        var3 = new double[] {0.0, 0.0, 1.0};
                                    } else {
                                        if (input[34] <= 59.0) {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[34] <= 62.0) {
                                    var3 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var3 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (input[34] <= 60.5) {
                if (input[35] <= 31.238296508789062) {
                    if (input[36] <= 45.726776123046875) {
                        if (input[36] <= 45.491512298583984) {
                            if (input[34] <= 31.5) {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[34] <= 31.5) {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        if (input[35] <= 30.019537925720215) {
                            if (input[36] <= 47.477020263671875) {
                                if (input[36] <= 46.45305824279785) {
                                    if (input[34] <= 36.0) {
                                        var3 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var3 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    var3 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[35] <= 29.89413833618164) {
                                    if (input[35] <= 27.055131912231445) {
                                        var3 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 37.0) {
                                            var3 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[34] <= 37.0) {
                                        var3 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var3 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            }
                        } else {
                            if (input[35] <= 30.99689769744873) {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[35] <= 31.148162841796875) {
                                    if (input[34] <= 34.5) {
                                        var3 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var3 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    var3 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                } else {
                    if (input[35] <= 34.73118591308594) {
                        if (input[34] <= 38.5) {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[35] <= 35.39570617675781) {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[35] <= 35.43732452392578) {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[34] <= 39.0) {
                                    var3 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var3 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                }
            } else {
                var3 = new double[] {0.0, 0.0, 1.0};
            }
        }
        return addVectors(addVectors(addVectors(addVectors(subroutine1(input), var0), var1), var2), var3);
    }
    public static double[] subroutine1(double[] input) {
        double[] var0;
        if (input[36] <= 74.75618362426758) {
            if (input[34] <= 45.5) {
                if (input[16] <= 0.5) {
                    if (input[19] <= 0.5) {
                        if (input[34] <= 38.5) {
                            if (input[27] <= 0.5) {
                                if (input[11] <= 0.5) {
                                    if (input[35] <= 28.68624973297119) {
                                        if (input[35] <= 24.210164070129395) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[35] <= 24.29826068878174) {
                                                var0 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                                            } else {
                                                var0 = new double[] {0.9788732394366197, 0.02112676056338028, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[6] <= 0.5) {
                                            if (input[20] <= 0.5) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.7796610169491526, 0.22033898305084745, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    }
                                } else {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[35] <= 27.238948822021484) {
                                if (input[11] <= 0.5) {
                                    if (input[24] <= 0.5) {
                                        if (input[34] <= 41.5) {
                                            if (input[18] <= 0.5) {
                                                var0 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[17] <= 0.5) {
                                                var0 = new double[] {0.4878048780487805, 0.5121951219512195, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                if (input[4] <= 0.5) {
                                    if (input[27] <= 0.5) {
                                        if (input[20] <= 0.5) {
                                            if (input[34] <= 42.0) {
                                                var0 = new double[] {0.9166666666666666, 0.08333333333333333, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[36] <= 55.778038024902344) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[36] <= 50.16059875488281) {
                            if (input[36] <= 48.67075538635254) {
                                if (input[36] <= 47.73396110534668) {
                                    if (input[34] <= 36.5) {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                if (input[34] <= 37.0) {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            if (input[35] <= 29.911699295043945) {
                                if (input[36] <= 51.68705749511719) {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[36] <= 52.24201774597168) {
                                        if (input[36] <= 51.958818435668945) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[34] <= 37.5) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 53.43461036682129) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[34] <= 37.0) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[35] <= 34.050594329833984) {
                                    if (input[35] <= 31.765830039978027) {
                                        if (input[36] <= 51.10441207885742) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[34] <= 37.5) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[34] <= 35.0) {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var0 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                if (input[35] <= 27.317688941955566) {
                    if (input[16] <= 0.5) {
                        if (input[23] <= 0.5) {
                            if (input[35] <= 26.433735847473145) {
                                if (input[7] <= 0.5) {
                                    if (input[34] <= 61.5) {
                                        if (input[15] <= 0.5) {
                                            if (input[31] <= 0.5) {
                                                var0 = new double[] {0.17452830188679244, 0.7783018867924528, 0.04716981132075472};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[31] <= 0.5) {
                                            if (input[11] <= 0.5) {
                                                var0 = new double[] {0.012376237623762377, 0.21534653465346534, 0.7722772277227723};
                                            } else {
                                                var0 = new double[] {0.0, 0.46846846846846846, 0.5315315315315315};
                                            }
                                        } else {
                                            if (input[36] <= 19.047463417053223) {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.6666666666666666, 0.25, 0.08333333333333333};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[36] <= 23.635446548461914) {
                                        if (input[35] <= 20.603449821472168) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 21.24886131286621) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[34] <= 57.0) {
                                    if (input[3] <= 0.5) {
                                        if (input[34] <= 49.0) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[36] <= 52.80790710449219) {
                                                var0 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                            } else {
                                                var0 = new double[] {0.8947368421052632, 0.10526315789473684, 0.0};
                                            }
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[17] <= 0.5) {
                                        if (input[13] <= 0.5) {
                                            if (input[2] <= 0.5) {
                                                var0 = new double[] {0.0, 0.6119402985074627, 0.3880597014925373};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        } else {
                            if (input[35] <= 19.48051929473877) {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[34] <= 53.0) {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[34] <= 70.5) {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[29] <= 0.5) {
                        if (input[31] <= 0.5) {
                            if (input[11] <= 0.5) {
                                if (input[3] <= 0.5) {
                                    if (input[4] <= 0.5) {
                                        if (input[9] <= 0.5) {
                                            if (input[35] <= 30.56696128845215) {
                                                var0 = new double[] {0.015151515151515152, 0.2474747474747475, 0.7373737373737373};
                                            } else {
                                                var0 = new double[] {0.01092896174863388, 0.4207650273224044, 0.5683060109289617};
                                            }
                                        } else {
                                            if (input[36] <= 51.45096778869629) {
                                                var0 = new double[] {0.5, 0.5, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[36] <= 60.737749099731445) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[36] <= 65.9371566772461) {
                                            if (input[36] <= 65.65345001220703) {
                                                var0 = new double[] {0.0, 0.4406779661016949, 0.559322033898305};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[36] <= 67.86187744140625) {
                                                var0 = new double[] {0.0, 0.23076923076923078, 0.7692307692307693};
                                            } else {
                                                var0 = new double[] {0.0, 0.4444444444444444, 0.5555555555555556};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[35] <= 27.60411548614502) {
                                    if (input[36] <= 65.68739318847656) {
                                        if (input[35] <= 27.384319305419922) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[34] <= 81.5) {
                                                var0 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[34] <= 55.5) {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            }
                        } else {
                            if (input[36] <= 54.41622352600098) {
                                if (input[35] <= 33.59623336791992) {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var0 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[34] <= 70.0) {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[36] <= 58.175418853759766) {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            if (input[14] <= 0.5) {
                if (input[34] <= 54.5) {
                    if (input[26] <= 0.5) {
                        if (input[12] <= 0.5) {
                            if (input[0] <= 0.5) {
                                if (input[10] <= 0.5) {
                                    if (input[25] <= 0.5) {
                                        if (input[36] <= 80.25505447387695) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[34] <= 44.5) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.5906976744186047, 0.40930232558139534, 0.0};
                                            }
                                        }
                                    } else {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[35] <= 25.78588581085205) {
                                if (input[34] <= 37.5) {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[15] <= 0.5) {
                        if (input[35] <= 25.938745498657227) {
                            if (input[12] <= 0.5) {
                                if (input[30] <= 0.5) {
                                    if (input[36] <= 86.2725944519043) {
                                        if (input[1] <= 0.5) {
                                            if (input[36] <= 77.31261825561523) {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.05185185185185185, 0.2814814814814815, 0.6666666666666666};
                                            }
                                        } else {
                                            if (input[36] <= 77.9531478881836) {
                                                var0 = new double[] {0.0, 0.8333333333333334, 0.16666666666666666};
                                            } else {
                                                var0 = new double[] {0.13513513513513514, 0.35135135135135137, 0.5135135135135135};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 24.905780792236328) {
                                            if (input[0] <= 0.5) {
                                                var0 = new double[] {0.006578947368421052, 0.4605263157894737, 0.5328947368421053};
                                            } else {
                                                var0 = new double[] {0.006289308176100629, 0.5220125786163522, 0.4716981132075472};
                                            }
                                        } else {
                                            if (input[36] <= 89.20718383789062) {
                                                var0 = new double[] {0.0, 0.6, 0.4};
                                            } else {
                                                var0 = new double[] {0.0, 0.23404255319148937, 0.7659574468085106};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[36] <= 80.49932861328125) {
                                        if (input[35] <= 21.234257698059082) {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        } else {
                                            if (input[34] <= 71.0) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.5, 0.5};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 20.85225772857666) {
                                            if (input[36] <= 82.55105590820312) {
                                                var0 = new double[] {0.0, 0.8888888888888888, 0.1111111111111111};
                                            } else {
                                                var0 = new double[] {0.0, 0.5, 0.5};
                                            }
                                        } else {
                                            if (input[34] <= 90.0) {
                                                var0 = new double[] {0.2857142857142857, 0.7142857142857143, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[36] <= 79.38422012329102) {
                                    if (input[34] <= 60.5) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[35] <= 25.0166072845459) {
                                        if (input[36] <= 84.62252807617188) {
                                            if (input[36] <= 81.50241470336914) {
                                                var0 = new double[] {0.0, 0.1111111111111111, 0.8888888888888888};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[34] <= 61.5) {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 81.88959503173828) {
                                            if (input[35] <= 25.5146541595459) {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.14285714285714285, 0.8571428571428571};
                                            }
                                        } else {
                                            if (input[36] <= 83.90065383911133) {
                                                var0 = new double[] {0.0, 0.6363636363636364, 0.36363636363636365};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (input[34] <= 68.5) {
                                if (input[10] <= 0.5) {
                                    if (input[22] <= 0.5) {
                                        if (input[25] <= 0.5) {
                                            if (input[36] <= 83.51860046386719) {
                                                var0 = new double[] {0.515625, 0.359375, 0.125};
                                            } else {
                                                var0 = new double[] {0.20000000000000004, 0.7000000000000001, 0.10000000000000002};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[35] <= 28.042155265808105) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[34] <= 57.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[35] <= 36.80160713195801) {
                                    if (input[36] <= 84.54260635375977) {
                                        if (input[33] <= 0.5) {
                                            if (input[9] <= 0.5) {
                                                var0 = new double[] {0.010101010101010102, 0.47474747474747475, 0.5151515151515151};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[24] <= 0.5) {
                                            if (input[35] <= 26.035929679870605) {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.18181818181818182, 0.8181818181818182};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[2] <= 0.5) {
                                        if (input[34] <= 80.0) {
                                            if (input[23] <= 0.5) {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[35] <= 24.97110652923584) {
                            if (input[36] <= 76.31357955932617) {
                                if (input[36] <= 74.94602584838867) {
                                    var0 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                if (input[34] <= 91.0) {
                                    if (input[34] <= 65.0) {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    var0 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[35] <= 25.67558193206787) {
                                if (input[34] <= 86.5) {
                                    if (input[35] <= 25.218122482299805) {
                                        if (input[34] <= 70.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    var0 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[36] <= 80.62705612182617) {
                                    if (input[34] <= 67.0) {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[35] <= 26.13334369659424) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[34] <= 90.5) {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[35] <= 25.744815826416016) {
                                        if (input[34] <= 70.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[34] <= 89.0) {
                                            if (input[36] <= 87.32963180541992) {
                                                var0 = new double[] {0.25, 0.75, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (input[36] <= 83.49699020385742) {
                    if (input[36] <= 81.54076385498047) {
                        if (input[35] <= 10.287133693695068) {
                            if (input[34] <= 65.5) {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[35] <= 11.130883693695068) {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[36] <= 80.61165618896484) {
                                    if (input[36] <= 80.56937026977539) {
                                        if (input[35] <= 13.24399185180664) {
                                            if (input[36] <= 80.15685653686523) {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var0 = new double[] {0.2857142857142857, 0.14285714285714285, 0.5714285714285714};
                                            }
                                        } else {
                                            if (input[34] <= 47.0) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.8888888888888888, 0.1111111111111111};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 45.0) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[35] <= 18.36299991607666) {
                                        if (input[36] <= 81.02018737792969) {
                                            if (input[34] <= 47.5) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.8, 0.2};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[36] <= 80.93781661987305) {
                                            if (input[36] <= 80.71403503417969) {
                                                var0 = new double[] {0.0, 0.2, 0.8};
                                            } else {
                                                var0 = new double[] {0.18181818181818182, 0.2727272727272727, 0.5454545454545454};
                                            }
                                        } else {
                                            if (input[34] <= 71.0) {
                                                var0 = new double[] {0.5789473684210527, 0.42105263157894735, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[35] <= 36.977033615112305) {
                            if (input[35] <= 16.562267303466797) {
                                if (input[34] <= 47.0) {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[34] <= 67.5) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                if (input[35] <= 17.60470676422119) {
                                    if (input[35] <= 17.159701347351074) {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 51.0) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[35] <= 20.807170867919922) {
                                        if (input[36] <= 83.42023468017578) {
                                            if (input[34] <= 46.0) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.9090909090909091, 0.09090909090909091};
                                            }
                                        } else {
                                            if (input[34] <= 51.0) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.5, 0.5};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 47.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[36] <= 82.54423904418945) {
                                                var0 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                            } else {
                                                var0 = new double[] {0.0, 0.46153846153846156, 0.5384615384615384};
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (input[36] <= 82.12446594238281) {
                                if (input[34] <= 42.0) {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[35] <= 38.85475540161133) {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[34] <= 59.5) {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (input[35] <= 30.140324592590332) {
                        if (input[36] <= 83.74569320678711) {
                            if (input[34] <= 73.0) {
                                if (input[36] <= 83.5810546875) {
                                    if (input[35] <= 12.713475227355957) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[35] <= 20.55995750427246) {
                                            if (input[34] <= 49.5) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[36] <= 83.66885757446289) {
                                        if (input[34] <= 45.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[34] <= 45.0) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[34] <= 67.5) {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[34] <= 75.5) {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        }
        double[] var1;
        if (input[34] <= 54.5) {
            if (input[36] <= 89.71092987060547) {
                if (input[11] <= 0.5) {
                    if (input[20] <= 0.5) {
                        if (input[8] <= 0.5) {
                            if (input[17] <= 0.5) {
                                if (input[15] <= 0.5) {
                                    if (input[36] <= 88.70766830444336) {
                                        if (input[1] <= 0.5) {
                                            if (input[23] <= 0.5) {
                                                var1 = new double[] {0.7575496117342536, 0.24245038826574633, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[13] <= 0.5) {
                                            if (input[35] <= 20.043898582458496) {
                                                var1 = new double[] {0.3076923076923077, 0.6923076923076923, 0.0};
                                            } else {
                                                var1 = new double[] {0.6333333333333333, 0.36666666666666664, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    }
                                } else {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                if (input[36] <= 69.35258865356445) {
                                    if (input[36] <= 63.33637237548828) {
                                        if (input[34] <= 37.5) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[34] <= 38.0) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[36] <= 69.62419509887695) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[34] <= 39.0) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            }
                        } else {
                            if (input[36] <= 19.723607063293457) {
                                if (input[36] <= 15.488182544708252) {
                                    if (input[34] <= 37.5) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[34] <= 38.0) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            } else {
                                if (input[36] <= 19.865809440612793) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[34] <= 35.0) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[34] <= 32.0) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    var1 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                if (input[2] <= 0.5) {
                    if (input[28] <= 0.5) {
                        if (input[35] <= 27.52497959136963) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[22] <= 0.5) {
                                if (input[36] <= 89.9676513671875) {
                                    if (input[35] <= 27.594565391540527) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        if (input[35] <= 18.306974411010742) {
                            if (input[36] <= 90.77229690551758) {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[35] <= 18.13681697845459) {
                                    if (input[34] <= 41.5) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            if (input[35] <= 24.87998867034912) {
                                if (input[36] <= 92.60002136230469) {
                                    if (input[34] <= 41.5) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[34] <= 42.5) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            } else {
                                if (input[34] <= 43.0) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                } else {
                    var1 = new double[] {1.0, 0.0, 0.0};
                }
            }
        } else {
            if (input[8] <= 0.5) {
                if (input[36] <= 71.19236755371094) {
                    if (input[31] <= 0.5) {
                        if (input[19] <= 0.5) {
                            if (input[20] <= 0.5) {
                                if (input[34] <= 68.5) {
                                    if (input[7] <= 0.5) {
                                        if (input[34] <= 65.5) {
                                            if (input[2] <= 0.5) {
                                                var1 = new double[] {0.02888086642599278, 0.8700361010830325, 0.10108303249097472};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[17] <= 0.5) {
                                                var1 = new double[] {0.0, 0.6056338028169014, 0.39436619718309857};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[34] <= 84.5) {
                                        if (input[11] <= 0.5) {
                                            if (input[15] <= 0.5) {
                                                var1 = new double[] {0.0, 0.07042253521126761, 0.9295774647887324};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 81.0) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[13] <= 0.5) {
                                            if (input[35] <= 19.63364601135254) {
                                                var1 = new double[] {0.0, 0.125, 0.875};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[34] <= 55.5) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[35] <= 33.77512741088867) {
                                if (input[36] <= 52.57210159301758) {
                                    if (input[36] <= 49.356651306152344) {
                                        if (input[34] <= 60.5) {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[34] <= 61.0) {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[35] <= 31.369173049926758) {
                                        if (input[35] <= 28.212594032287598) {
                                            if (input[36] <= 54.70175361633301) {
                                                var1 = new double[] {0.0, 0.625, 0.375};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[36] <= 53.365577697753906) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 32.22343635559082) {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[35] <= 32.85777473449707) {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[36] <= 52.08485412597656) {
                                    if (input[35] <= 34.81525230407715) {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    } else {
                                        if (input[34] <= 60.0) {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[35] <= 34.77796936035156) {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    } else {
                                        if (input[36] <= 53.37393760681152) {
                                            if (input[35] <= 35.69082260131836) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.5, 0.5};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[34] <= 74.0) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[36] <= 39.708218574523926) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                } else {
                    if (input[1] <= 0.5) {
                        if (input[15] <= 0.5) {
                            if (input[2] <= 0.5) {
                                if (input[30] <= 0.5) {
                                    if (input[31] <= 0.5) {
                                        if (input[34] <= 70.5) {
                                            if (input[34] <= 65.5) {
                                                var1 = new double[] {0.06289308176100629, 0.8846960167714885, 0.05241090146750524};
                                            } else {
                                                var1 = new double[] {0.025547445255474453, 0.5693430656934306, 0.4051094890510949};
                                            }
                                        } else {
                                            if (input[21] <= 0.5) {
                                                var1 = new double[] {0.0, 0.18778801843317972, 0.8122119815668203};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 85.0) {
                                            if (input[36] <= 84.04341125488281) {
                                                var1 = new double[] {0.8571428571428571, 0.14285714285714285, 0.0};
                                            } else {
                                                var1 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[34] <= 90.5) {
                                        if (input[35] <= 25.457847595214844) {
                                            if (input[36] <= 84.87867736816406) {
                                                var1 = new double[] {0.21978021978021978, 0.7802197802197802, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 67.0) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                if (input[34] <= 78.0) {
                                    if (input[34] <= 59.5) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[36] <= 88.26591110229492) {
                                if (input[35] <= 25.29252815246582) {
                                    if (input[35] <= 23.181350708007812) {
                                        if (input[35] <= 23.17109203338623) {
                                            if (input[36] <= 75.83232498168945) {
                                                var1 = new double[] {0.75, 0.0, 0.25};
                                            } else {
                                                var1 = new double[] {0.0, 0.25, 0.75};
                                            }
                                        } else {
                                            if (input[34] <= 73.0) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 90.5) {
                                            if (input[34] <= 67.5) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[35] <= 26.941500663757324) {
                                        if (input[35] <= 26.336535453796387) {
                                            if (input[35] <= 25.67558193206787) {
                                                var1 = new double[] {0.35714285714285715, 0.07142857142857142, 0.5714285714285714};
                                            } else {
                                                var1 = new double[] {0.5000000000000001, 0.33333333333333337, 0.16666666666666669};
                                            }
                                        } else {
                                            if (input[34] <= 87.0) {
                                                var1 = new double[] {0.5714285714285714, 0.42857142857142855, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 73.0) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[35] <= 24.322964668273926) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[36] <= 88.7112808227539) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[36] <= 89.47347259521484) {
                                            if (input[34] <= 92.5) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[34] <= 88.5) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[36] <= 79.37776565551758) {
                            if (input[36] <= 76.53948974609375) {
                                if (input[36] <= 76.08380889892578) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[34] <= 90.5) {
                                        if (input[34] <= 72.5) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                if (input[34] <= 69.5) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[34] <= 91.0) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        } else {
                            if (input[34] <= 91.0) {
                                if (input[36] <= 81.38384628295898) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[34] <= 66.5) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                }
            } else {
                if (input[35] <= 19.996094703674316) {
                    if (input[35] <= 19.883047103881836) {
                        if (input[35] <= 17.494325637817383) {
                            if (input[34] <= 61.0) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[34] <= 61.0) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[34] <= 64.0) {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[36] <= 16.62057590484619) {
                        if (input[34] <= 58.5) {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        }
        return addVectors(addVectors(subroutine2(input), var0), var1);
    }
    public static double[] subroutine2(double[] input) {
        double[] var0;
        if (input[34] <= 54.5) {
            if (input[11] <= 0.5) {
                if (input[25] <= 0.5) {
                    if (input[17] <= 0.5) {
                        if (input[26] <= 0.5) {
                            if (input[35] <= 27.577713012695312) {
                                if (input[12] <= 0.5) {
                                    if (input[10] <= 0.5) {
                                        if (input[0] <= 0.5) {
                                            if (input[28] <= 0.5) {
                                                var0 = new double[] {0.8113839285714286, 0.18861607142857142, 0.0};
                                            } else {
                                                var0 = new double[] {0.6486486486486487, 0.35135135135135137, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[36] <= 82.3925552368164) {
                                        if (input[35] <= 25.980085372924805) {
                                            if (input[35] <= 25.004634857177734) {
                                                var0 = new double[] {0.71875, 0.28125, 0.0};
                                            } else {
                                                var0 = new double[] {0.9230769230769231, 0.07692307692307693, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[36] <= 82.47517776489258) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[34] <= 38.0) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[34] <= 38.5) {
                                    if (input[34] <= 36.5) {
                                        if (input[20] <= 0.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[35] <= 28.85087299346924) {
                                                var0 = new double[] {0.9, 0.1, 0.0};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[10] <= 0.5) {
                                            if (input[27] <= 0.5) {
                                                var0 = new double[] {0.8064516129032258, 0.1935483870967742, 0.0};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[34] <= 49.5) {
                                        if (input[20] <= 0.5) {
                                            if (input[2] <= 0.5) {
                                                var0 = new double[] {0.6073298429319371, 0.39267015706806285, 0.0};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[36] <= 90.16705322265625) {
                                            if (input[34] <= 52.5) {
                                                var0 = new double[] {0.09859154929577464, 0.9014084507042254, 0.0};
                                            } else {
                                                var0 = new double[] {0.3793103448275862, 0.6206896551724138, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    }
                                }
                            }
                        } else {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[35] <= 26.193893432617188) {
                            if (input[34] <= 38.5) {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[35] <= 27.068675994873047) {
                                if (input[36] <= 66.88393783569336) {
                                    if (input[36] <= 64.55424690246582) {
                                        if (input[36] <= 61.97359275817871) {
                                            if (input[34] <= 38.0) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[34] <= 38.0) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[36] <= 63.17065238952637) {
                                    if (input[36] <= 62.07733726501465) {
                                        if (input[34] <= 34.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[35] <= 28.933093070983887) {
                                        if (input[36] <= 63.76931381225586) {
                                            if (input[34] <= 29.5) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 37.0) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 29.795625686645508) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[34] <= 36.5) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var0 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                var0 = new double[] {1.0, 0.0, 0.0};
            }
        } else {
            if (input[34] <= 65.5) {
                if (input[33] <= 0.5) {
                    if (input[20] <= 0.5) {
                        if (input[34] <= 61.5) {
                            if (input[36] <= 71.50578308105469) {
                                if (input[35] <= 35.69082260131836) {
                                    if (input[16] <= 0.5) {
                                        if (input[29] <= 0.5) {
                                            if (input[5] <= 0.5) {
                                                var0 = new double[] {0.07766990291262135, 0.912621359223301, 0.009708737864077669};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[34] <= 59.5) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                if (input[1] <= 0.5) {
                                    if (input[35] <= 26.99711322784424) {
                                        if (input[25] <= 0.5) {
                                            if (input[0] <= 0.5) {
                                                var0 = new double[] {0.4528301886792453, 0.5094339622641509, 0.03773584905660377};
                                            } else {
                                                var0 = new double[] {0.14285714285714285, 0.8571428571428571, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[36] <= 95.03756713867188) {
                                            if (input[2] <= 0.5) {
                                                var0 = new double[] {0.04716981132075472, 0.9528301886792453, 0.0};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[10] <= 0.5) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.6, 0.4, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        } else {
                            if (input[30] <= 0.5) {
                                if (input[27] <= 0.5) {
                                    if (input[22] <= 0.5) {
                                        if (input[31] <= 0.5) {
                                            if (input[36] <= 83.5617904663086) {
                                                var0 = new double[] {0.13402061855670103, 0.41237113402061853, 0.4536082474226804};
                                            } else {
                                                var0 = new double[] {0.08421052631578947, 0.9157894736842105, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        if (input[35] <= 26.398755073547363) {
                            if (input[35] <= 26.040693283081055) {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[34] <= 55.5) {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                } else {
                    var0 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[1] <= 0.5) {
                    if (input[19] <= 0.5) {
                        if (input[30] <= 0.5) {
                            if (input[28] <= 0.5) {
                                if (input[11] <= 0.5) {
                                    if (input[13] <= 0.5) {
                                        if (input[3] <= 0.5) {
                                            if (input[31] <= 0.5) {
                                                var0 = new double[] {0.002785515320334262, 0.23342618384401115, 0.7637883008356546};
                                            } else {
                                                var0 = new double[] {0.0, 0.5357142857142857, 0.4642857142857143};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[36] <= 88.15875625610352) {
                                            if (input[36] <= 82.39892196655273) {
                                                var0 = new double[] {0.0, 0.5, 0.5};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[35] <= 19.8760929107666) {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[34] <= 80.5) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[34] <= 90.5) {
                                var0 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        var0 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[36] <= 75.40278244018555) {
                        var0 = new double[] {0.0, 0.0, 1.0};
                    } else {
                        if (input[34] <= 90.5) {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        }
        double[] var1;
        if (input[29] <= 0.5) {
            if (input[6] <= 0.5) {
                if (input[34] <= 60.5) {
                    if (input[30] <= 0.5) {
                        if (input[20] <= 0.5) {
                            if (input[15] <= 0.5) {
                                if (input[26] <= 0.5) {
                                    if (input[1] <= 0.5) {
                                        if (input[34] <= 45.5) {
                                            if (input[34] <= 41.5) {
                                                var1 = new double[] {0.9868173258003766, 0.013182674199623353, 0.0};
                                            } else {
                                                var1 = new double[] {0.6431535269709544, 0.35684647302904565, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 54.5) {
                                                var1 = new double[] {0.31993006993006995, 0.6800699300699301, 0.0};
                                            } else {
                                                var1 = new double[] {0.08056872037914692, 0.919431279620853, 0.0};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[34] <= 57.5) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[34] <= 32.5) {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[34] <= 55.5) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    } else {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[8] <= 0.5) {
                        if (input[36] <= 70.0032844543457) {
                            if (input[11] <= 0.5) {
                                if (input[31] <= 0.5) {
                                    if (input[35] <= 26.02328586578369) {
                                        if (input[13] <= 0.5) {
                                            if (input[34] <= 70.5) {
                                                var1 = new double[] {0.006711409395973154, 0.6510067114093959, 0.3422818791946309};
                                            } else {
                                                var1 = new double[] {0.0, 0.05752212389380531, 0.9424778761061947};
                                            }
                                        } else {
                                            if (input[34] <= 86.0) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 65.5) {
                                            if (input[36] <= 63.080230712890625) {
                                                var1 = new double[] {0.0, 0.1978021978021978, 0.8021978021978022};
                                            } else {
                                                var1 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                            }
                                        } else {
                                            if (input[34] <= 77.5) {
                                                var1 = new double[] {0.0, 0.04721030042918455, 0.9527896995708155};
                                            } else {
                                                var1 = new double[] {0.0, 0.21428571428571427, 0.7857142857142857};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[35] <= 20.237446784973145) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 85.0) {
                                            if (input[36] <= 60.02978324890137) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[35] <= 23.2201566696167) {
                                    if (input[35] <= 23.110663414001465) {
                                        if (input[36] <= 65.36045837402344) {
                                            if (input[35] <= 23.069236755371094) {
                                                var1 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 74.0) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 60.069801330566406) {
                                            if (input[34] <= 75.5) {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[36] <= 51.29092979431152) {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    } else {
                                        if (input[36] <= 53.288259506225586) {
                                            if (input[35] <= 25.211033821105957) {
                                                var1 = new double[] {0.0, 0.875, 0.125};
                                            } else {
                                                var1 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                            }
                                        } else {
                                            if (input[36] <= 55.65069007873535) {
                                                var1 = new double[] {0.0, 0.13333333333333333, 0.8666666666666667};
                                            } else {
                                                var1 = new double[] {0.0, 0.5301204819277109, 0.46987951807228917};
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (input[34] <= 81.5) {
                                if (input[12] <= 0.5) {
                                    if (input[34] <= 65.5) {
                                        if (input[36] <= 83.43876266479492) {
                                            if (input[35] <= 29.32516860961914) {
                                                var1 = new double[] {0.7352941176470589, 0.2647058823529412, 0.0};
                                            } else {
                                                var1 = new double[] {0.07142857142857142, 0.9285714285714286, 0.0};
                                            }
                                        } else {
                                            if (input[5] <= 0.5) {
                                                var1 = new double[] {0.06329113924050633, 0.9367088607594937, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[30] <= 0.5) {
                                            if (input[28] <= 0.5) {
                                                var1 = new double[] {0.009234828496042216, 0.5501319261213721, 0.44063324538258575};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[10] <= 0.5) {
                                    if (input[0] <= 0.5) {
                                        if (input[14] <= 0.5) {
                                            if (input[15] <= 0.5) {
                                                var1 = new double[] {0.0, 0.13948497854077252, 0.8605150214592274};
                                            } else {
                                                var1 = new double[] {0.0, 0.34615384615384615, 0.6538461538461539};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    } else {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[34] <= 68.0) {
                    if (input[34] <= 54.5) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var1 = new double[] {0.0, 1.0, 0.0};
                    }
                } else {
                    var1 = new double[] {0.0, 0.0, 1.0};
                }
            }
        } else {
            if (input[35] <= 31.539151191711426) {
                if (input[35] <= 27.938602447509766) {
                    if (input[34] <= 60.0) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[35] <= 19.463770866394043) {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[35] <= 20.335750579833984) {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[35] <= 27.783584594726562) {
                                    if (input[36] <= 68.28231430053711) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[35] <= 25.993632316589355) {
                                            if (input[36] <= 84.97822189331055) {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var1 = new double[] {0.0, 0.5, 0.5};
                                            }
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    }
                } else {
                    var1 = new double[] {1.0, 0.0, 0.0};
                }
            } else {
                if (input[35] <= 40.27336311340332) {
                    if (input[35] <= 33.625091552734375) {
                        var1 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[34] <= 59.5) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    var1 = new double[] {1.0, 0.0, 0.0};
                }
            }
        }
        return addVectors(addVectors(subroutine3(input), var0), var1);
    }
    public static double[] subroutine3(double[] input) {
        double[] var0;
        if (input[28] <= 0.5) {
            if (input[33] <= 0.5) {
                if (input[34] <= 55.5) {
                    if (input[22] <= 0.5) {
                        if (input[15] <= 0.5) {
                            if (input[34] <= 39.5) {
                                if (input[35] <= 27.868897438049316) {
                                    if (input[34] <= 34.5) {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[0] <= 0.5) {
                                            if (input[11] <= 0.5) {
                                                var0 = new double[] {0.967741935483871, 0.03225806451612903, 0.0};
                                            } else {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[24] <= 0.5) {
                                        if (input[20] <= 0.5) {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[36] <= 55.48893165588379) {
                                                var0 = new double[] {0.8709677419354839, 0.12903225806451613, 0.0};
                                            } else {
                                                var0 = new double[] {0.5, 0.5, 0.0};
                                            }
                                        }
                                    } else {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    }
                                }
                            } else {
                                if (input[26] <= 0.5) {
                                    if (input[0] <= 0.5) {
                                        if (input[1] <= 0.5) {
                                            if (input[36] <= 84.88063049316406) {
                                                var0 = new double[] {0.3219178082191781, 0.678082191780822, 0.0};
                                            } else {
                                                var0 = new double[] {0.9024390243902439, 0.0975609756097561, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var0 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        } else {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[34] <= 52.5) {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[15] <= 0.5) {
                        if (input[36] <= 78.28150939941406) {
                            if (input[18] <= 0.5) {
                                if (input[34] <= 65.5) {
                                    if (input[11] <= 0.5) {
                                        if (input[20] <= 0.5) {
                                            if (input[24] <= 0.5) {
                                                var0 = new double[] {0.0944055944055944, 0.6048951048951049, 0.3006993006993007};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[8] <= 0.5) {
                                        if (input[17] <= 0.5) {
                                            if (input[11] <= 0.5) {
                                                var0 = new double[] {0.0, 0.12079207920792079, 0.8792079207920792};
                                            } else {
                                                var0 = new double[] {0.0, 0.34532374100719426, 0.6546762589928058};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                if (input[34] <= 70.5) {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var0 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[12] <= 0.5) {
                                if (input[30] <= 0.5) {
                                    if (input[31] <= 0.5) {
                                        if (input[0] <= 0.5) {
                                            if (input[34] <= 70.5) {
                                                var0 = new double[] {0.07925407925407925, 0.8601398601398601, 0.06060606060606061};
                                            } else {
                                                var0 = new double[] {0.0, 0.2260536398467433, 0.7739463601532567};
                                            }
                                        } else {
                                            if (input[35] <= 23.117976188659668) {
                                                var0 = new double[] {0.0, 0.47540983606557374, 0.5245901639344263};
                                            } else {
                                                var0 = new double[] {0.0, 0.5806451612903226, 0.41935483870967744};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 92.1820068359375) {
                                            if (input[35] <= 23.66538715362549) {
                                                var0 = new double[] {0.0, 0.6666666666666666, 0.3333333333333333};
                                            } else {
                                                var0 = new double[] {0.35714285714285715, 0.14285714285714285, 0.5};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[36] <= 84.48868942260742) {
                                        if (input[34] <= 90.5) {
                                            if (input[34] <= 67.5) {
                                                var0 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[36] <= 84.6927719116211) {
                                            if (input[35] <= 24.767894744873047) {
                                                var0 = new double[] {0.7142857142857143, 0.2857142857142857, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[34] <= 86.0) {
                                                var0 = new double[] {0.14285714285714285, 0.8571428571428571, 0.0};
                                            } else {
                                                var0 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[36] <= 81.55061340332031) {
                                    if (input[34] <= 60.5) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[35] <= 22.096033096313477) {
                                        var0 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[34] <= 61.0) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[35] <= 26.515841484069824) {
                            if (input[34] <= 90.5) {
                                if (input[34] <= 68.0) {
                                    var0 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var0 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var0 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[34] <= 65.5) {
                                var0 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[35] <= 26.606870651245117) {
                                    var0 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    if (input[35] <= 26.951129913330078) {
                                        if (input[34] <= 89.0) {
                                            var0 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var0 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        var0 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (input[35] <= 26.8145694732666) {
                    if (input[34] <= 65.5) {
                        if (input[34] <= 47.5) {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var0 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[35] <= 26.81734561920166) {
                        var0 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[34] <= 50.0) {
                            var0 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                }
            }
        } else {
            if (input[35] <= 21.73274040222168) {
                if (input[34] <= 42.5) {
                    var0 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[35] <= 19.85656452178955) {
                        if (input[34] <= 65.5) {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[34] <= 63.5) {
                            var0 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var0 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[34] <= 43.5) {
                    var0 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[34] <= 65.5) {
                        var0 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        var0 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        }
        double[] var1;
        if (input[34] <= 54.5) {
            if (input[26] <= 0.5) {
                if (input[17] <= 0.5) {
                    if (input[0] <= 0.5) {
                        if (input[20] <= 0.5) {
                            if (input[36] <= 89.93183135986328) {
                                if (input[30] <= 0.5) {
                                    if (input[1] <= 0.5) {
                                        if (input[34] <= 45.5) {
                                            if (input[9] <= 0.5) {
                                                var1 = new double[] {0.9421407907425265, 0.05785920925747348, 0.0};
                                            } else {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[18] <= 0.5) {
                                                var1 = new double[] {0.290167865707434, 0.709832134292566, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                if (input[22] <= 0.5) {
                                    if (input[24] <= 0.5) {
                                        if (input[28] <= 0.5) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[35] <= 20.29365062713623) {
                                                var1 = new double[] {0.5238095238095238, 0.47619047619047616, 0.0};
                                            } else {
                                                var1 = new double[] {0.8333333333333334, 0.16666666666666666, 0.0};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        } else {
                            if (input[35] <= 24.394057273864746) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[34] <= 32.5) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    } else {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[35] <= 20.85878276824951) {
                        if (input[35] <= 20.579265594482422) {
                            if (input[36] <= 61.466901779174805) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[36] <= 66.80324172973633) {
                                    if (input[36] <= 62.64082145690918) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 42.0) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        } else {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[36] <= 63.45793914794922) {
                            if (input[36] <= 60.587650299072266) {
                                if (input[36] <= 60.14289093017578) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[34] <= 36.0) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            } else {
                                if (input[34] <= 38.5) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            if (input[35] <= 28.794370651245117) {
                                if (input[34] <= 37.5) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[34] <= 40.0) {
                                    var1 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                }
            } else {
                var1 = new double[] {1.0, 0.0, 0.0};
            }
        } else {
            if (input[15] <= 0.5) {
                if (input[31] <= 0.5) {
                    if (input[20] <= 0.5) {
                        if (input[19] <= 0.5) {
                            if (input[1] <= 0.5) {
                                if (input[17] <= 0.5) {
                                    if (input[28] <= 0.5) {
                                        if (input[8] <= 0.5) {
                                            if (input[7] <= 0.5) {
                                                var1 = new double[] {0.027058823529411764, 0.44392156862745097, 0.5290196078431373};
                                            } else {
                                                var1 = new double[] {0.2978723404255319, 0.425531914893617, 0.2765957446808511};
                                            }
                                        } else {
                                            if (input[36] <= 18.581539154052734) {
                                                var1 = new double[] {0.0, 0.25301204819277107, 0.7469879518072289};
                                            } else {
                                                var1 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 65.5) {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[36] <= 66.97653198242188) {
                                        if (input[34] <= 61.0) {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[34] <= 61.5) {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[36] <= 79.28907775878906) {
                                    if (input[35] <= 28.032761573791504) {
                                        if (input[35] <= 26.856969833374023) {
                                            if (input[35] <= 25.28610324859619) {
                                                var1 = new double[] {0.4, 0.0, 0.6};
                                            } else {
                                                var1 = new double[] {0.06666666666666667, 0.4666666666666667, 0.4666666666666667};
                                            }
                                        } else {
                                            if (input[35] <= 27.833974838256836) {
                                                var1 = new double[] {0.7272727272727273, 0.0, 0.2727272727272727};
                                            } else {
                                                var1 = new double[] {0.14285714285714285, 0.42857142857142855, 0.42857142857142855};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 29.305994033813477) {
                                            if (input[36] <= 75.9144287109375) {
                                                var1 = new double[] {0.0, 0.5, 0.5};
                                            } else {
                                                var1 = new double[] {0.1875, 0.03125, 0.78125};
                                            }
                                        } else {
                                            if (input[35] <= 29.407938957214355) {
                                                var1 = new double[] {0.6666666666666666, 0.0, 0.3333333333333333};
                                            } else {
                                                var1 = new double[] {0.2, 0.3, 0.5};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[34] <= 90.5) {
                                        if (input[36] <= 81.39472198486328) {
                                            if (input[34] <= 68.5) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 67.0) {
                                                var1 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var1 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        } else {
                            if (input[34] <= 60.5) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[35] <= 26.398755073547363) {
                            if (input[35] <= 26.339760780334473) {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[34] <= 61.0) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[34] <= 65.0) {
                        var1 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[36] <= 89.5919189453125) {
                            if (input[36] <= 68.6703987121582) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[34] <= 83.5) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var1 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[34] <= 80.5) {
                                var1 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                }
            } else {
                if (input[35] <= 23.302910804748535) {
                    if (input[35] <= 23.268321990966797) {
                        if (input[35] <= 23.155400276184082) {
                            if (input[36] <= 79.95549392700195) {
                                if (input[36] <= 76.72849655151367) {
                                    if (input[34] <= 77.0) {
                                        var1 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[34] <= 87.5) {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var1 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                var1 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[36] <= 73.87651824951172) {
                                var1 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                if (input[35] <= 23.17109203338623) {
                                    var1 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[35] <= 23.190434455871582) {
                                        if (input[34] <= 73.0) {
                                            var1 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var1 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var1 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[34] <= 78.5) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var1 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[34] <= 90.5) {
                        if (input[34] <= 67.5) {
                            var1 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var1 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var1 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        }
        double[] var2;
        if (input[35] <= 36.64948081970215) {
            if (input[32] <= 0.5) {
                if (input[36] <= 14.958463191986084) {
                    if (input[35] <= 19.47087001800537) {
                        if (input[34] <= 58.0) {
                            if (input[35] <= 17.70620632171631) {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[34] <= 39.5) {
                                    var2 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var2 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[34] <= 47.0) {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var2 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[5] <= 0.5) {
                        if (input[27] <= 0.5) {
                            if (input[3] <= 0.5) {
                                if (input[16] <= 0.5) {
                                    if (input[12] <= 0.5) {
                                        if (input[6] <= 0.5) {
                                            if (input[9] <= 0.5) {
                                                var2 = new double[] {0.32982770194674427, 0.3246811367196241, 0.3454911613336317};
                                            } else {
                                                var2 = new double[] {0.2, 0.275, 0.525};
                                            }
                                        } else {
                                            if (input[36] <= 67.46829223632812) {
                                                var2 = new double[] {0.05555555555555555, 0.16666666666666666, 0.7777777777777778};
                                            } else {
                                                var2 = new double[] {0.3142857142857143, 0.37142857142857144, 0.3142857142857143};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 37.5) {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[35] <= 22.065356254577637) {
                                                var2 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var2 = new double[] {0.0, 0.5595238095238095, 0.44047619047619047};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[35] <= 18.19537925720215) {
                                        if (input[34] <= 48.5) {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[35] <= 16.749810218811035) {
                                                var2 = new double[] {0.0, 0.8, 0.2};
                                            } else {
                                                var2 = new double[] {0.0, 0.45, 0.55};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 18.97294521331787) {
                                            if (input[36] <= 20.662057876586914) {
                                                var2 = new double[] {0.1111111111111111, 0.1111111111111111, 0.7777777777777778};
                                            } else {
                                                var2 = new double[] {0.2, 0.25, 0.55};
                                            }
                                        } else {
                                            if (input[34] <= 70.5) {
                                                var2 = new double[] {0.3619047619047619, 0.638095238095238, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[34] <= 42.5) {
                                    var2 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[35] <= 34.48705863952637) {
                                        if (input[35] <= 29.459519386291504) {
                                            if (input[34] <= 65.5) {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[35] <= 30.776576042175293) {
                                                var2 = new double[] {0.0, 0.3611111111111111, 0.6388888888888888};
                                            } else {
                                                var2 = new double[] {0.0, 0.58, 0.42};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 64.5) {
                                            var2 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var2 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            }
                        } else {
                            if (input[34] <= 65.5) {
                                if (input[35] <= 30.45403480529785) {
                                    if (input[34] <= 42.5) {
                                        var2 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var2 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[36] <= 35.092506408691406) {
                                        var2 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[35] <= 31.229745864868164) {
                                            var2 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[36] <= 67.91795349121094) {
                                                var2 = new double[] {0.38235294117647056, 0.6176470588235294, 0.0};
                                            } else {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                var2 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[34] <= 70.0) {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[36] <= 88.21635055541992) {
                                if (input[34] <= 85.5) {
                                    var2 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var2 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var2 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                if (input[34] <= 82.0) {
                    if (input[36] <= 21.208666801452637) {
                        var2 = new double[] {0.0, 1.0, 0.0};
                    } else {
                        if (input[34] <= 62.5) {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var2 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    var2 = new double[] {0.0, 0.0, 1.0};
                }
            }
        } else {
            if (input[13] <= 0.5) {
                if (input[35] <= 36.74106979370117) {
                    var2 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[34] <= 55.0) {
                        if (input[27] <= 0.5) {
                            if (input[4] <= 0.5) {
                                if (input[2] <= 0.5) {
                                    if (input[36] <= 82.14271545410156) {
                                        if (input[35] <= 39.21829032897949) {
                                            if (input[34] <= 46.0) {
                                                var2 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var2 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var2 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var2 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var2 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[7] <= 0.5) {
                            if (input[29] <= 0.5) {
                                if (input[31] <= 0.5) {
                                    if (input[36] <= 94.1624526977539) {
                                        if (input[9] <= 0.5) {
                                            if (input[36] <= 91.64260864257812) {
                                                var2 = new double[] {0.07142857142857142, 0.375, 0.5535714285714286};
                                            } else {
                                                var2 = new double[] {0.0, 0.75, 0.25};
                                            }
                                        } else {
                                            var2 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[34] <= 75.5) {
                                            var2 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var2 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[34] <= 78.5) {
                                        if (input[35] <= 42.07969665527344) {
                                            var2 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var2 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var2 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                var2 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var2 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            } else {
                var2 = new double[] {0.0, 0.0, 1.0};
            }
        }
        double[] var3;
        if (input[21] <= 0.5) {
            if (input[5] <= 0.5) {
                if (input[3] <= 0.5) {
                    if (input[34] <= 55.5) {
                        if (input[20] <= 0.5) {
                            if (input[0] <= 0.5) {
                                if (input[29] <= 0.5) {
                                    if (input[17] <= 0.5) {
                                        if (input[8] <= 0.5) {
                                            if (input[30] <= 0.5) {
                                                var3 = new double[] {0.8, 0.2, 0.0};
                                            } else {
                                                var3 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[36] <= 19.76090908050537) {
                                                var3 = new double[] {0.5769230769230769, 0.4230769230769231, 0.0};
                                            } else {
                                                var3 = new double[] {0.2857142857142857, 0.7142857142857143, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 26.09226131439209) {
                                            if (input[36] <= 68.95697784423828) {
                                                var3 = new double[] {0.654320987654321, 0.345679012345679, 0.0};
                                            } else {
                                                var3 = new double[] {0.25, 0.75, 0.0};
                                            }
                                        } else {
                                            if (input[35] <= 28.02419948577881) {
                                                var3 = new double[] {0.19047619047619047, 0.8095238095238095, 0.0};
                                            } else {
                                                var3 = new double[] {0.6129032258064516, 0.3870967741935484, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    var3 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[36] <= 62.85432434082031) {
                                if (input[36] <= 54.3790225982666) {
                                    if (input[35] <= 26.107955932617188) {
                                        if (input[36] <= 47.55092239379883) {
                                            if (input[36] <= 46.39497375488281) {
                                                var3 = new double[] {0.6, 0.4, 0.0};
                                            } else {
                                                var3 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var3 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 31.34070587158203) {
                                            if (input[34] <= 32.0) {
                                                var3 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var3 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var3 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[35] <= 24.210164070129395) {
                                        var3 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 32.5) {
                                            var3 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[36] <= 64.13860893249512) {
                                    var3 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[35] <= 26.945220947265625) {
                                        if (input[34] <= 35.5) {
                                            var3 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[34] <= 27.5) {
                                            var3 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[4] <= 0.5) {
                            if (input[17] <= 0.5) {
                                if (input[30] <= 0.5) {
                                    if (input[36] <= 65.39945602416992) {
                                        if (input[34] <= 65.5) {
                                            if (input[16] <= 0.5) {
                                                var3 = new double[] {0.07224334600760456, 0.44866920152091255, 0.4790874524714829};
                                            } else {
                                                var3 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[23] <= 0.5) {
                                                var3 = new double[] {0.0, 0.16539923954372623, 0.8346007604562737};
                                            } else {
                                                var3 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 80.5) {
                                            if (input[35] <= 25.511777877807617) {
                                                var3 = new double[] {0.042682926829268296, 0.5411585365853658, 0.41615853658536583};
                                            } else {
                                                var3 = new double[] {0.11969696969696969, 0.6712121212121213, 0.20909090909090908};
                                            }
                                        } else {
                                            if (input[36] <= 89.94864273071289) {
                                                var3 = new double[] {0.0, 0.22346368715083798, 0.776536312849162};
                                            } else {
                                                var3 = new double[] {0.0, 0.005420054200542005, 0.994579945799458};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[34] <= 90.5) {
                                        if (input[34] <= 67.5) {
                                            var3 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var3 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                if (input[36] <= 62.481523513793945) {
                                    if (input[36] <= 62.400869369506836) {
                                        if (input[35] <= 24.61052894592285) {
                                            if (input[34] <= 59.5) {
                                                var3 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var3 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var3 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[36] <= 62.45233917236328) {
                                            if (input[34] <= 62.0) {
                                                var3 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var3 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var3 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[34] <= 61.0) {
                                        var3 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var3 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        } else {
                            if (input[34] <= 74.0) {
                                if (input[34] <= 59.5) {
                                    var3 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var3 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                } else {
                    if (input[36] <= 60.31485176086426) {
                        if (input[36] <= 60.12472343444824) {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[35] <= 32.312808990478516) {
                                if (input[34] <= 66.5) {
                                    var3 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var3 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[34] <= 68.0) {
                                    var3 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var3 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    } else {
                        if (input[34] <= 42.5) {
                            var3 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[34] <= 65.5) {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                }
            } else {
                if (input[36] <= 91.20338439941406) {
                    if (input[36] <= 80.16565322875977) {
                        if (input[36] <= 52.32540512084961) {
                            if (input[35] <= 24.04586887359619) {
                                if (input[36] <= 17.858838081359863) {
                                    var3 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var3 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[34] <= 86.0) {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var3 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[35] <= 23.964709281921387) {
                            if (input[36] <= 80.92498016357422) {
                                var3 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[36] <= 89.10317611694336) {
                                    var3 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var3 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        } else {
                            if (input[35] <= 27.47128200531006) {
                                if (input[36] <= 83.20251846313477) {
                                    var3 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var3 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var3 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[34] <= 69.0) {
                        var3 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[35] <= 37.62066650390625) {
                            var3 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var3 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        } else {
            if (input[34] <= 65.5) {
                if (input[34] <= 42.5) {
                    var3 = new double[] {1.0, 0.0, 0.0};
                } else {
                    var3 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                var3 = new double[] {0.0, 0.0, 1.0};
            }
        }
        double[] var4;
        if (input[34] <= 55.5) {
            if (input[11] <= 0.5) {
                if (input[17] <= 0.5) {
                    if (input[3] <= 0.5) {
                        if (input[8] <= 0.5) {
                            if (input[19] <= 0.5) {
                                if (input[22] <= 0.5) {
                                    if (input[20] <= 0.5) {
                                        if (input[0] <= 0.5) {
                                            if (input[27] <= 0.5) {
                                                var4 = new double[] {0.8152173913043478, 0.18478260869565216, 0.0};
                                            } else {
                                                var4 = new double[] {0.6546762589928058, 0.34532374100719426, 0.0};
                                            }
                                        } else {
                                            var4 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 25.475565910339355) {
                                            if (input[35] <= 24.111239433288574) {
                                                var4 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var4 = new double[] {0.7368421052631579, 0.2631578947368421, 0.0};
                                            }
                                        } else {
                                            if (input[34] <= 32.5) {
                                                var4 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var4 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[35] <= 28.48753547668457) {
                                        var4 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 52.0) {
                                            var4 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var4 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[35] <= 27.264033317565918) {
                                    var4 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[34] <= 37.5) {
                                        var4 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var4 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            }
                        } else {
                            if (input[36] <= 17.492794036865234) {
                                if (input[35] <= 17.928133010864258) {
                                    if (input[35] <= 17.496363639831543) {
                                        if (input[34] <= 44.0) {
                                            var4 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var4 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[34] <= 39.5) {
                                            var4 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var4 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[34] <= 37.5) {
                                        var4 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var4 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            } else {
                                if (input[35] <= 17.663305282592773) {
                                    if (input[36] <= 18.75285053253174) {
                                        if (input[36] <= 18.749354362487793) {
                                            if (input[36] <= 18.50034523010254) {
                                                var4 = new double[] {0.25, 0.75, 0.0};
                                            } else {
                                                var4 = new double[] {0.5, 0.5, 0.0};
                                            }
                                        } else {
                                            var4 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var4 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[34] <= 36.0) {
                                        var4 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var4 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[34] <= 42.5) {
                            var4 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[34] <= 38.0) {
                        var4 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var4 = new double[] {0.0, 1.0, 0.0};
                    }
                }
            } else {
                var4 = new double[] {1.0, 0.0, 0.0};
            }
        } else {
            if (input[31] <= 0.5) {
                if (input[20] <= 0.5) {
                    if (input[36] <= 69.66311264038086) {
                        if (input[7] <= 0.5) {
                            if (input[36] <= 20.357654571533203) {
                                if (input[36] <= 14.381524562835693) {
                                    if (input[36] <= 14.298209190368652) {
                                        var4 = new double[] {0.0, 0.0, 1.0};
                                    } else {
                                        var4 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[24] <= 0.5) {
                                        if (input[8] <= 0.5) {
                                            if (input[2] <= 0.5) {
                                                var4 = new double[] {0.0, 0.25862068965517243, 0.7413793103448276};
                                            } else {
                                                var4 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[34] <= 60.5) {
                                                var4 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var4 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 17.877307891845703) {
                                            var4 = new double[] {0.0, 0.0, 1.0};
                                        } else {
                                            var4 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[11] <= 0.5) {
                                    if (input[35] <= 23.532357215881348) {
                                        if (input[29] <= 0.5) {
                                            if (input[4] <= 0.5) {
                                                var4 = new double[] {0.021739130434782608, 0.391304347826087, 0.5869565217391305};
                                            } else {
                                                var4 = new double[] {0.0, 0.75, 0.25};
                                            }
                                        } else {
                                            if (input[34] <= 63.0) {
                                                var4 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var4 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[2] <= 0.5) {
                                            if (input[34] <= 61.5) {
                                                var4 = new double[] {0.045454545454545456, 0.8863636363636364, 0.06818181818181818};
                                            } else {
                                                var4 = new double[] {0.0, 0.14720812182741116, 0.8527918781725888};
                                            }
                                        } else {
                                            if (input[34] <= 73.5) {
                                                var4 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var4 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[34] <= 80.5) {
                                        var4 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var4 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        } else {
                            if (input[35] <= 18.903889656066895) {
                                var4 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                if (input[35] <= 29.078035354614258) {
                                    if (input[34] <= 65.5) {
                                        var4 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 78.0) {
                                            var4 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var4 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    var4 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[26] <= 0.5) {
                            if (input[3] <= 0.5) {
                                if (input[1] <= 0.5) {
                                    if (input[36] <= 87.46267700195312) {
                                        if (input[28] <= 0.5) {
                                            if (input[12] <= 0.5) {
                                                var4 = new double[] {0.0744297719087635, 0.4117647058823529, 0.5138055222088835};
                                            } else {
                                                var4 = new double[] {0.0, 0.24731182795698925, 0.7526881720430108};
                                            }
                                        } else {
                                            if (input[34] <= 66.0) {
                                                var4 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var4 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[6] <= 0.5) {
                                            if (input[35] <= 29.14995765686035) {
                                                var4 = new double[] {0.015286624203821656, 0.4942675159235669, 0.49044585987261147};
                                            } else {
                                                var4 = new double[] {0.0392156862745098, 0.3333333333333333, 0.6274509803921569};
                                            }
                                        } else {
                                            if (input[35] <= 28.341336250305176) {
                                                var4 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                            } else {
                                                var4 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[34] <= 90.5) {
                                        if (input[36] <= 79.37776565551758) {
                                            if (input[35] <= 27.833974838256836) {
                                                var4 = new double[] {0.6818181818181818, 0.3181818181818182, 0.0};
                                            } else {
                                                var4 = new double[] {0.21739130434782608, 0.782608695652174, 0.0};
                                            }
                                        } else {
                                            if (input[35] <= 27.396809577941895) {
                                                var4 = new double[] {0.10810810810810811, 0.8918918918918919, 0.0};
                                            } else {
                                                var4 = new double[] {0.3125, 0.6875, 0.0};
                                            }
                                        }
                                    } else {
                                        var4 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                var4 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[34] <= 80.5) {
                                var4 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var4 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                } else {
                    var4 = new double[] {0.0, 0.0, 1.0};
                }
            } else {
                if (input[35] <= 19.745882034301758) {
                    var4 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[35] <= 26.790393829345703) {
                        if (input[35] <= 25.860414505004883) {
                            if (input[34] <= 86.5) {
                                if (input[36] <= 23.635446548461914) {
                                    var4 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[36] <= 87.8958969116211) {
                                        if (input[36] <= 59.27816390991211) {
                                            if (input[35] <= 23.89652156829834) {
                                                var4 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var4 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var4 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var4 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            } else {
                                var4 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var4 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        if (input[36] <= 83.82686614990234) {
                            if (input[35] <= 29.456482887268066) {
                                var4 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[36] <= 57.208736419677734) {
                                    var4 = new double[] {0.0, 0.0, 1.0};
                                } else {
                                    var4 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            if (input[36] <= 94.53712844848633) {
                                var4 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var4 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    }
                }
            }
        }
        double[] var5;
        if (input[6] <= 0.5) {
            if (input[9] <= 0.5) {
                if (input[35] <= 32.49447822570801) {
                    if (input[34] <= 57.5) {
                        if (input[8] <= 0.5) {
                            if (input[34] <= 45.5) {
                                if (input[17] <= 0.5) {
                                    if (input[35] <= 27.091042518615723) {
                                        if (input[18] <= 0.5) {
                                            if (input[36] <= 84.84458541870117) {
                                                var5 = new double[] {0.9399141630901288, 0.060085836909871244, 0.0};
                                            } else {
                                                var5 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var5 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[14] <= 0.5) {
                                            if (input[35] <= 27.095900535583496) {
                                                var5 = new double[] {0.5, 0.5, 0.0};
                                            } else {
                                                var5 = new double[] {0.8842592592592593, 0.11574074074074074, 0.0};
                                            }
                                        } else {
                                            var5 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[36] <= 64.302001953125) {
                                        if (input[36] <= 63.43978309631348) {
                                            if (input[34] <= 38.0) {
                                                var5 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var5 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[35] <= 23.755311965942383) {
                                                var5 = new double[] {0.5, 0.5, 0.0};
                                            } else {
                                                var5 = new double[] {0.2, 0.8, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 21.341179847717285) {
                                            var5 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[35] <= 21.44980812072754) {
                                                var5 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var5 = new double[] {0.8529411764705882, 0.14705882352941177, 0.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[0] <= 0.5) {
                                    if (input[17] <= 0.5) {
                                        if (input[1] <= 0.5) {
                                            if (input[16] <= 0.5) {
                                                var5 = new double[] {0.4140845070422535, 0.5690140845070423, 0.016901408450704224};
                                            } else {
                                                var5 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var5 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var5 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    var5 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        } else {
                            if (input[36] <= 17.61142921447754) {
                                if (input[35] <= 17.15396213531494) {
                                    var5 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[36] <= 17.21722412109375) {
                                        if (input[34] <= 37.5) {
                                            var5 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var5 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var5 = new double[] {1.0, 0.0, 0.0};
                                    }
                                }
                            } else {
                                if (input[35] <= 17.553105354309082) {
                                    var5 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[35] <= 20.87829875946045) {
                                        if (input[34] <= 37.0) {
                                            var5 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var5 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        var5 = new double[] {1.0, 0.0, 0.0};
                                    }
                                }
                            }
                        }
                    } else {
                        if (input[34] <= 65.5) {
                            if (input[1] <= 0.5) {
                                if (input[15] <= 0.5) {
                                    if (input[30] <= 0.5) {
                                        if (input[8] <= 0.5) {
                                            if (input[5] <= 0.5) {
                                                var5 = new double[] {0.025735294117647058, 0.7702205882352942, 0.20404411764705882};
                                            } else {
                                                var5 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[36] <= 14.38161325454712) {
                                                var5 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var5 = new double[] {0.0, 0.26666666666666666, 0.7333333333333333};
                                            }
                                        }
                                    } else {
                                        var5 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var5 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            }
                        } else {
                            if (input[21] <= 0.5) {
                                if (input[1] <= 0.5) {
                                    if (input[36] <= 71.12113952636719) {
                                        if (input[3] <= 0.5) {
                                            if (input[34] <= 80.5) {
                                                var5 = new double[] {0.0, 0.2576419213973799, 0.74235807860262};
                                            } else {
                                                var5 = new double[] {0.0, 0.03067484662576687, 0.9693251533742331};
                                            }
                                        } else {
                                            var5 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[30] <= 0.5) {
                                            if (input[4] <= 0.5) {
                                                var5 = new double[] {0.005172413793103448, 0.2982758620689655, 0.696551724137931};
                                            } else {
                                                var5 = new double[] {0.0, 0.6153846153846154, 0.38461538461538464};
                                            }
                                        } else {
                                            if (input[36] <= 81.99100875854492) {
                                                var5 = new double[] {0.0, 0.611764705882353, 0.38823529411764707};
                                            } else {
                                                var5 = new double[] {0.0, 0.4065934065934066, 0.5934065934065934};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[36] <= 83.61752319335938) {
                                        if (input[35] <= 28.965189933776855) {
                                            if (input[35] <= 25.42195224761963) {
                                                var5 = new double[] {0.0, 0.14285714285714285, 0.8571428571428571};
                                            } else {
                                                var5 = new double[] {0.0, 0.5434782608695652, 0.45652173913043476};
                                            }
                                        } else {
                                            if (input[34] <= 90.5) {
                                                var5 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var5 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 90.5) {
                                            var5 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var5 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            } else {
                                var5 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                } else {
                    if (input[36] <= 47.4926700592041) {
                        if (input[27] <= 0.5) {
                            if (input[5] <= 0.5) {
                                if (input[34] <= 33.5) {
                                    var5 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[34] <= 47.5) {
                                        if (input[19] <= 0.5) {
                                            var5 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var5 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[36] <= 45.87004852294922) {
                                            var5 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[36] <= 46.79210090637207) {
                                                var5 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                                            } else {
                                                var5 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                var5 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[35] <= 35.52267074584961) {
                                if (input[35] <= 33.166534423828125) {
                                    var5 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[35] <= 33.297264099121094) {
                                        var5 = new double[] {0.0, 0.0, 1.0};
                                    } else {
                                        if (input[34] <= 46.0) {
                                            var5 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[36] <= 30.693660736083984) {
                                                var5 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var5 = new double[] {0.0, 0.8571428571428571, 0.14285714285714285};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[34] <= 68.0) {
                                    var5 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var5 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    } else {
                        if (input[25] <= 0.5) {
                            if (input[19] <= 0.5) {
                                if (input[34] <= 56.0) {
                                    if (input[36] <= 86.71004104614258) {
                                        if (input[34] <= 46.0) {
                                            var5 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[35] <= 33.80488967895508) {
                                                var5 = new double[] {0.5714285714285714, 0.42857142857142855, 0.0};
                                            } else {
                                                var5 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var5 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    if (input[26] <= 0.5) {
                                        if (input[34] <= 65.5) {
                                            if (input[34] <= 59.5) {
                                                var5 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var5 = new double[] {0.16666666666666666, 0.8333333333333334, 0.0};
                                            }
                                        } else {
                                            if (input[5] <= 0.5) {
                                                var5 = new double[] {0.0, 0.17647058823529413, 0.8235294117647058};
                                            } else {
                                                var5 = new double[] {0.5, 0.25, 0.25};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 80.0) {
                                            var5 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var5 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[34] <= 35.0) {
                                    var5 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[36] <= 52.35801887512207) {
                                        if (input[34] <= 59.5) {
                                            var5 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var5 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[34] <= 63.0) {
                                            var5 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var5 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            }
                        } else {
                            if (input[36] <= 91.30981826782227) {
                                if (input[36] <= 90.55379867553711) {
                                    var5 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[34] <= 55.5) {
                                        var5 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 78.0) {
                                            var5 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var5 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[35] <= 34.66591835021973) {
                                    if (input[36] <= 92.80838775634766) {
                                        if (input[35] <= 34.322378158569336) {
                                            if (input[34] <= 80.0) {
                                                var5 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var5 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            var5 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[35] <= 33.8101749420166) {
                                            var5 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var5 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[36] <= 93.00068664550781) {
                                        if (input[34] <= 52.0) {
                                            var5 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[34] <= 76.0) {
                                                var5 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var5 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 81.5) {
                                            var5 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var5 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (input[34] <= 69.5) {
                    if (input[35] <= 29.456482887268066) {
                        if (input[36] <= 83.65581893920898) {
                            if (input[34] <= 59.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[35] <= 25.398146629333496) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[36] <= 84.90495681762695) {
                                    var5 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var5 = new double[] {1.0, 0.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[35] <= 40.27336311340332) {
                            var5 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                } else {
                    var5 = new double[] {0.0, 0.0, 1.0};
                }
            }
        } else {
            if (input[34] <= 70.5) {
                if (input[36] <= 54.41622352600098) {
                    var5 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[36] <= 88.21635055541992) {
                        if (input[35] <= 19.463770866394043) {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[35] <= 26.323427200317383) {
                                if (input[36] <= 70.59825325012207) {
                                    var5 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[35] <= 25.203397750854492) {
                                        var5 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var5 = new double[] {1.0, 0.0, 0.0};
                                    }
                                }
                            } else {
                                var5 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    } else {
                        if (input[36] <= 90.91239929199219) {
                            var5 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[34] <= 54.5) {
                                var5 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var5 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            } else {
                var5 = new double[] {0.0, 0.0, 1.0};
            }
        }
        double[] var6;
        if (input[28] <= 0.5) {
            if (input[6] <= 0.5) {
                if (input[34] <= 55.5) {
                    if (input[36] <= 84.80722045898438) {
                        if (input[20] <= 0.5) {
                            if (input[35] <= 20.852293968200684) {
                                if (input[29] <= 0.5) {
                                    if (input[31] <= 0.5) {
                                        if (input[34] <= 45.5) {
                                            if (input[35] <= 17.482190132141113) {
                                                var6 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var6 = new double[] {0.8571428571428571, 0.14285714285714285, 0.0};
                                            }
                                        } else {
                                            if (input[9] <= 0.5) {
                                                var6 = new double[] {0.07692307692307693, 0.9230769230769231, 0.0};
                                            } else {
                                                var6 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var6 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var6 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                if (input[12] <= 0.5) {
                                    if (input[34] <= 40.5) {
                                        if (input[17] <= 0.5) {
                                            if (input[16] <= 0.5) {
                                                var6 = new double[] {0.9948849104859335, 0.005115089514066497, 0.0};
                                            } else {
                                                var6 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            if (input[35] <= 29.834675788879395) {
                                                var6 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var6 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 69.63523483276367) {
                                            if (input[17] <= 0.5) {
                                                var6 = new double[] {0.341991341991342, 0.658008658008658, 0.0};
                                            } else {
                                                var6 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[21] <= 0.5) {
                                                var6 = new double[] {0.7989690721649485, 0.20103092783505155, 0.0};
                                            } else {
                                                var6 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[35] <= 25.908884048461914) {
                                        if (input[35] <= 25.54698371887207) {
                                            if (input[36] <= 82.29074478149414) {
                                                var6 = new double[] {0.6853932584269663, 0.3146067415730337, 0.0};
                                            } else {
                                                var6 = new double[] {0.3548387096774194, 0.6451612903225806, 0.0};
                                            }
                                        } else {
                                            var6 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 25.980085372924805) {
                                            if (input[34] <= 32.5) {
                                                var6 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var6 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var6 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            }
                        } else {
                            if (input[35] <= 30.014838218688965) {
                                if (input[35] <= 24.18757915496826) {
                                    var6 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[35] <= 24.85005283355713) {
                                        if (input[35] <= 24.210164070129395) {
                                            if (input[34] <= 34.0) {
                                                var6 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var6 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var6 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[34] <= 32.0) {
                                            var6 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var6 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[34] <= 33.0) {
                                    var6 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[21] <= 0.5) {
                            if (input[34] <= 54.5) {
                                if (input[36] <= 86.80828857421875) {
                                    if (input[33] <= 0.5) {
                                        var6 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 46.0) {
                                            var6 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var6 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    var6 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                if (input[36] <= 92.58695602416992) {
                                    if (input[35] <= 27.563949584960938) {
                                        if (input[30] <= 0.5) {
                                            var6 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var6 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var6 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[35] <= 29.60166358947754) {
                                        if (input[10] <= 0.5) {
                                            var6 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var6 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var6 = new double[] {1.0, 0.0, 0.0};
                                    }
                                }
                            }
                        } else {
                            if (input[35] <= 29.9034366607666) {
                                if (input[34] <= 42.5) {
                                    var6 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var6 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                } else {
                    if (input[20] <= 0.5) {
                        if (input[19] <= 0.5) {
                            if (input[8] <= 0.5) {
                                if (input[5] <= 0.5) {
                                    if (input[17] <= 0.5) {
                                        if (input[34] <= 70.5) {
                                            if (input[31] <= 0.5) {
                                                var6 = new double[] {0.12968299711815562, 0.7252641690682037, 0.14505283381364073};
                                            } else {
                                                var6 = new double[] {0.88, 0.12, 0.0};
                                            }
                                        } else {
                                            if (input[35] <= 19.663748741149902) {
                                                var6 = new double[] {0.0, 0.06666666666666667, 0.9333333333333333};
                                            } else {
                                                var6 = new double[] {0.0, 0.28503843879361324, 0.7149615612063868};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 18.208969116210938) {
                                            var6 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[34] <= 61.0) {
                                                var6 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var6 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[36] <= 94.89941024780273) {
                                        if (input[35] <= 22.53550624847412) {
                                            if (input[34] <= 85.5) {
                                                var6 = new double[] {0.5714285714285714, 0.42857142857142855, 0.0};
                                            } else {
                                                var6 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[35] <= 28.276745796203613) {
                                                var6 = new double[] {0.04, 0.8, 0.16};
                                            } else {
                                                var6 = new double[] {0.5454545454545454, 0.2727272727272727, 0.18181818181818182};
                                            }
                                        }
                                    } else {
                                        var6 = new double[] {1.0, 0.0, 0.0};
                                    }
                                }
                            } else {
                                if (input[34] <= 61.0) {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var6 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[35] <= 31.86193084716797) {
                                if (input[34] <= 60.5) {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var6 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[35] <= 31.879987716674805) {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    if (input[34] <= 60.0) {
                                        var6 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var6 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            }
                        }
                    } else {
                        var6 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[36] <= 50.78183937072754) {
                    if (input[36] <= 23.635446548461914) {
                        if (input[34] <= 67.5) {
                            if (input[35] <= 20.603449821472168) {
                                var6 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var6 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var6 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var6 = new double[] {0.0, 0.0, 1.0};
                    }
                } else {
                    if (input[34] <= 71.5) {
                        if (input[35] <= 31.363529205322266) {
                            if (input[35] <= 26.323427200317383) {
                                if (input[34] <= 56.5) {
                                    var6 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var6 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        var6 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[35] <= 18.844759941101074) {
                if (input[35] <= 18.33698844909668) {
                    if (input[35] <= 18.08411979675293) {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[36] <= 86.93782806396484) {
                            if (input[34] <= 52.0) {
                                var6 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var6 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            if (input[34] <= 37.5) {
                                var6 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                if (input[36] <= 89.29478454589844) {
                                    if (input[34] <= 57.0) {
                                        var6 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var6 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    }
                } else {
                    if (input[36] <= 88.54583358764648) {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[36] <= 90.52692413330078) {
                            if (input[36] <= 89.81188583374023) {
                                if (input[34] <= 46.0) {
                                    var6 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var6 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var6 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        }
                    }
                }
            } else {
                if (input[36] <= 94.5735969543457) {
                    if (input[36] <= 94.26681137084961) {
                        if (input[35] <= 18.917041778564453) {
                            if (input[35] <= 18.909217834472656) {
                                if (input[34] <= 56.5) {
                                    var6 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var6 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var6 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[34] <= 65.0) {
                                if (input[36] <= 93.05401992797852) {
                                    if (input[34] <= 43.0) {
                                        var6 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var6 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[35] <= 23.53177833557129) {
                                        if (input[34] <= 48.0) {
                                            var6 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var6 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 23.959877967834473) {
                                            var6 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[36] <= 94.02721786499023) {
                                                var6 = new double[] {0.2, 0.8, 0.0};
                                            } else {
                                                var6 = new double[] {0.25, 0.75, 0.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                var6 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[36] <= 94.39382934570312) {
                            var6 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[34] <= 53.0) {
                                var6 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var6 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                } else {
                    if (input[34] <= 47.0) {
                        var6 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        var6 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        }
        double[] var7;
        if (input[35] <= 36.54018974304199) {
            if (input[11] <= 0.5) {
                if (input[34] <= 60.5) {
                    if (input[30] <= 0.5) {
                        if (input[20] <= 0.5) {
                            if (input[36] <= 90.14547348022461) {
                                if (input[15] <= 0.5) {
                                    if (input[1] <= 0.5) {
                                        if (input[5] <= 0.5) {
                                            if (input[35] <= 29.799641609191895) {
                                                var7 = new double[] {0.60431654676259, 0.39568345323741005, 0.0};
                                            } else {
                                                var7 = new double[] {0.4981132075471698, 0.5018867924528302, 0.0};
                                            }
                                        } else {
                                            var7 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        var7 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var7 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                if (input[26] <= 0.5) {
                                    if (input[9] <= 0.5) {
                                        if (input[22] <= 0.5) {
                                            if (input[0] <= 0.5) {
                                                var7 = new double[] {0.7970479704797048, 0.2029520295202952, 0.0};
                                            } else {
                                                var7 = new double[] {0.9848484848484849, 0.015151515151515152, 0.0};
                                            }
                                        } else {
                                            if (input[36] <= 94.72168350219727) {
                                                var7 = new double[] {0.8118811881188119, 0.18811881188118812, 0.0};
                                            } else {
                                                var7 = new double[] {0.3333333333333333, 0.6666666666666666, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 27.928921699523926) {
                                            var7 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var7 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[34] <= 57.5) {
                                        var7 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var7 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            }
                        } else {
                            if (input[35] <= 25.67534351348877) {
                                if (input[34] <= 31.0) {
                                    var7 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[35] <= 25.47661781311035) {
                                        if (input[34] <= 53.5) {
                                            var7 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var7 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        var7 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                if (input[36] <= 43.946245193481445) {
                                    if (input[35] <= 26.97655963897705) {
                                        var7 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        if (input[36] <= 43.47077178955078) {
                                            if (input[36] <= 41.14583396911621) {
                                                var7 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var7 = new double[] {0.4444444444444445, 0.33333333333333337, 0.22222222222222224};
                                            }
                                        } else {
                                            if (input[35] <= 27.63444995880127) {
                                                var7 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                            } else {
                                                var7 = new double[] {0.875, 0.125, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[35] <= 26.572081565856934) {
                                        if (input[34] <= 30.0) {
                                            var7 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[36] <= 45.67419624328613) {
                                                var7 = new double[] {0.0, 0.75, 0.25};
                                            } else {
                                                var7 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 27.211496353149414) {
                                            if (input[34] <= 31.0) {
                                                var7 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var7 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[35] <= 27.48846435546875) {
                                                var7 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var7 = new double[] {0.43089430894308944, 0.42276422764227645, 0.14634146341463414};
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        var7 = new double[] {1.0, 0.0, 0.0};
                    }
                } else {
                    if (input[17] <= 0.5) {
                        if (input[8] <= 0.5) {
                            if (input[36] <= 71.98353576660156) {
                                if (input[19] <= 0.5) {
                                    if (input[9] <= 0.5) {
                                        if (input[15] <= 0.5) {
                                            if (input[5] <= 0.5) {
                                                var7 = new double[] {0.010869565217391304, 0.26811594202898553, 0.7210144927536232};
                                            } else {
                                                var7 = new double[] {0.09090909090909091, 0.5, 0.4090909090909091};
                                            }
                                        } else {
                                            if (input[35] <= 23.866405487060547) {
                                                var7 = new double[] {0.25, 0.75, 0.0};
                                            } else {
                                                var7 = new double[] {0.0, 0.3333333333333333, 0.6666666666666666};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 61.51639747619629) {
                                            if (input[36] <= 52.34247589111328) {
                                                var7 = new double[] {0.0, 0.6, 0.4};
                                            } else {
                                                var7 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[35] <= 21.48543357849121) {
                                                var7 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var7 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    var7 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[36] <= 74.1825942993164) {
                                    if (input[36] <= 73.4058952331543) {
                                        if (input[36] <= 72.13107299804688) {
                                            var7 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[15] <= 0.5) {
                                                var7 = new double[] {0.0, 0.0, 1.0};
                                            } else {
                                                var7 = new double[] {0.0, 0.4166666666666667, 0.5833333333333334};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 87.0) {
                                            if (input[15] <= 0.5) {
                                                var7 = new double[] {0.0, 0.8461538461538461, 0.15384615384615385};
                                            } else {
                                                var7 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            var7 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[34] <= 80.5) {
                                        if (input[12] <= 0.5) {
                                            if (input[28] <= 0.5) {
                                                var7 = new double[] {0.06566200215285253, 0.6103336921420882, 0.3240043057050592};
                                            } else {
                                                var7 = new double[] {0.0, 0.15294117647058825, 0.8470588235294118};
                                            }
                                        } else {
                                            var7 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    } else {
                                        if (input[36] <= 86.17595291137695) {
                                            if (input[34] <= 90.5) {
                                                var7 = new double[] {0.0, 0.6623376623376623, 0.33766233766233766};
                                            } else {
                                                var7 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[36] <= 91.0416488647461) {
                                                var7 = new double[] {0.0, 0.053763440860215055, 0.946236559139785};
                                            } else {
                                                var7 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            var7 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        var7 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            } else {
                if (input[35] <= 24.482358932495117) {
                    if (input[35] <= 24.349045753479004) {
                        if (input[36] <= 60.45623779296875) {
                            if (input[35] <= 24.275625228881836) {
                                if (input[35] <= 23.115382194519043) {
                                    if (input[34] <= 85.5) {
                                        var7 = new double[] {0.0, 1.0, 0.0};
                                    } else {
                                        var7 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    if (input[36] <= 60.39585304260254) {
                                        if (input[36] <= 57.51494026184082) {
                                            if (input[34] <= 58.5) {
                                                var7 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var7 = new double[] {0.0, 0.75, 0.25};
                                            }
                                        } else {
                                            if (input[34] <= 56.5) {
                                                var7 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var7 = new double[] {0.0, 0.4, 0.6};
                                            }
                                        }
                                    } else {
                                        if (input[34] <= 78.5) {
                                            var7 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var7 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[34] <= 63.5) {
                                    var7 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var7 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[34] <= 78.0) {
                                if (input[35] <= 24.207279205322266) {
                                    if (input[35] <= 23.8371524810791) {
                                        if (input[35] <= 23.092947006225586) {
                                            if (input[34] <= 52.5) {
                                                var7 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var7 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[36] <= 64.77496337890625) {
                                                var7 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var7 = new double[] {0.6666666666666666, 0.3333333333333333, 0.0};
                                            }
                                        }
                                    } else {
                                        var7 = new double[] {1.0, 0.0, 0.0};
                                    }
                                } else {
                                    var7 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                var7 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    } else {
                        if (input[34] <= 61.5) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[34] <= 84.0) {
                                var7 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var7 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                } else {
                    if (input[34] <= 80.0) {
                        if (input[34] <= 57.5) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        }
                    } else {
                        var7 = new double[] {0.0, 0.0, 1.0};
                    }
                }
            }
        } else {
            if (input[14] <= 0.5) {
                if (input[35] <= 42.98659896850586) {
                    if (input[7] <= 0.5) {
                        if (input[6] <= 0.5) {
                            if (input[23] <= 0.5) {
                                if (input[24] <= 0.5) {
                                    if (input[13] <= 0.5) {
                                        if (input[27] <= 0.5) {
                                            if (input[36] <= 90.95624542236328) {
                                                var7 = new double[] {0.5, 0.041666666666666664, 0.4583333333333333};
                                            } else {
                                                var7 = new double[] {0.4305555555555556, 0.2638888888888889, 0.3055555555555556};
                                            }
                                        } else {
                                            if (input[34] <= 45.0) {
                                                var7 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var7 = new double[] {0.0, 0.5, 0.5};
                                            }
                                        }
                                    } else {
                                        var7 = new double[] {0.0, 0.0, 1.0};
                                    }
                                } else {
                                    var7 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                if (input[34] <= 65.5) {
                                    var7 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var7 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[35] <= 42.07969665527344) {
                                var7 = new double[] {0.0, 0.0, 1.0};
                            } else {
                                var7 = new double[] {1.0, 0.0, 0.0};
                            }
                        }
                    } else {
                        if (input[35] <= 41.03975868225098) {
                            var7 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        }
                    }
                } else {
                    if (input[34] <= 62.5) {
                        var7 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[35] <= 43.19113731384277) {
                            var7 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            if (input[34] <= 76.5) {
                                var7 = new double[] {0.0, 1.0, 0.0};
                            } else {
                                var7 = new double[] {0.0, 0.0, 1.0};
                            }
                        }
                    }
                }
            } else {
                if (input[35] <= 37.098466873168945) {
                    var7 = new double[] {1.0, 0.0, 0.0};
                } else {
                    if (input[34] <= 49.0) {
                        var7 = new double[] {1.0, 0.0, 0.0};
                    } else {
                        if (input[36] <= 81.08689498901367) {
                            if (input[35] <= 39.32615852355957) {
                                if (input[34] <= 66.0) {
                                    var7 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var7 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var7 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            if (input[35] <= 39.67811965942383) {
                                if (input[35] <= 39.35703659057617) {
                                    var7 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var7 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                var7 = new double[] {0.0, 1.0, 0.0};
                            }
                        }
                    }
                }
            }
        }
        double[] var8;
        if (input[18] <= 0.5) {
            if (input[24] <= 0.5) {
                if (input[22] <= 0.5) {
                    if (input[34] <= 60.5) {
                        if (input[15] <= 0.5) {
                            if (input[25] <= 0.5) {
                                if (input[0] <= 0.5) {
                                    if (input[11] <= 0.5) {
                                        if (input[30] <= 0.5) {
                                            if (input[7] <= 0.5) {
                                                var8 = new double[] {0.6182893539581438, 0.3666969972702457, 0.015013648771610554};
                                            } else {
                                                var8 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var8 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[34] <= 57.5) {
                                            var8 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var8 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                } else {
                                    if (input[35] <= 21.135628700256348) {
                                        if (input[36] <= 93.9525260925293) {
                                            var8 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var8 = new double[] {1.0, 0.0, 0.0};
                                        }
                                    } else {
                                        if (input[34] <= 57.5) {
                                            var8 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var8 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            } else {
                                if (input[35] <= 30.11971378326416) {
                                    if (input[34] <= 52.5) {
                                        var8 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var8 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[34] <= 50.5) {
                                        var8 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var8 = new double[] {0.0, 1.0, 0.0};
                                    }
                                }
                            }
                        } else {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[12] <= 0.5) {
                            if (input[8] <= 0.5) {
                                if (input[36] <= 70.92353439331055) {
                                    if (input[13] <= 0.5) {
                                        if (input[35] <= 27.34343719482422) {
                                            if (input[35] <= 24.20768928527832) {
                                                var8 = new double[] {0.006578947368421052, 0.29605263157894735, 0.6973684210526315};
                                            } else {
                                                var8 = new double[] {0.0, 0.3645833333333333, 0.6354166666666666};
                                            }
                                        } else {
                                            if (input[9] <= 0.5) {
                                                var8 = new double[] {0.003076923076923077, 0.16307692307692306, 0.8338461538461538};
                                            } else {
                                                var8 = new double[] {0.0, 0.8, 0.2};
                                            }
                                        }
                                    } else {
                                        if (input[36] <= 35.229289054870605) {
                                            if (input[35] <= 18.865736961364746) {
                                                var8 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var8 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        } else {
                                            if (input[36] <= 53.68182563781738) {
                                                var8 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var8 = new double[] {0.0, 0.5714285714285714, 0.42857142857142855};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[36] <= 84.44850158691406) {
                                        if (input[1] <= 0.5) {
                                            if (input[31] <= 0.5) {
                                                var8 = new double[] {0.05321100917431193, 0.3926605504587156, 0.5541284403669725};
                                            } else {
                                                var8 = new double[] {0.45454545454545453, 0.36363636363636365, 0.18181818181818182};
                                            }
                                        } else {
                                            if (input[34] <= 90.5) {
                                                var8 = new double[] {0.25263157894736843, 0.7473684210526316, 0.0};
                                            } else {
                                                var8 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[28] <= 0.5) {
                                            if (input[35] <= 22.43816089630127) {
                                                var8 = new double[] {0.0, 0.5220125786163522, 0.4779874213836478};
                                            } else {
                                                var8 = new double[] {0.009333333333333334, 0.37066666666666664, 0.62};
                                            }
                                        } else {
                                            if (input[35] <= 18.150668144226074) {
                                                var8 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var8 = new double[] {0.0, 0.12121212121212122, 0.8787878787878788};
                                            }
                                        }
                                    }
                                }
                            } else {
                                var8 = new double[] {0.0, 0.0, 1.0};
                            }
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    if (input[36] <= 90.08525085449219) {
                        if (input[34] <= 66.0) {
                            if (input[36] <= 90.0484733581543) {
                                if (input[36] <= 90.02101135253906) {
                                    var8 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var8 = new double[] {1.0, 0.0, 0.0};
                                }
                            } else {
                                var8 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    } else {
                        if (input[34] <= 70.5) {
                            if (input[35] <= 27.319531440734863) {
                                if (input[34] <= 52.5) {
                                    var8 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var8 = new double[] {0.0, 1.0, 0.0};
                                }
                            } else {
                                if (input[34] <= 52.5) {
                                    var8 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var8 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            } else {
                if (input[35] <= 29.062464714050293) {
                    if (input[36] <= 84.37635040283203) {
                        if (input[35] <= 19.294358253479004) {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        } else {
                            if (input[36] <= 80.16565322875977) {
                                if (input[34] <= 67.5) {
                                    if (input[34] <= 50.5) {
                                        var8 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var8 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    var8 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[34] <= 48.5) {
                                    var8 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    var8 = new double[] {0.0, 1.0, 0.0};
                                }
                            }
                        }
                    } else {
                        if (input[34] <= 69.5) {
                            var8 = new double[] {0.0, 1.0, 0.0};
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                } else {
                    var8 = new double[] {1.0, 0.0, 0.0};
                }
            }
        } else {
            if (input[35] <= 18.120051383972168) {
                if (input[36] <= 61.75430679321289) {
                    var8 = new double[] {0.0, 0.0, 1.0};
                } else {
                    var8 = new double[] {0.0, 1.0, 0.0};
                }
            } else {
                if (input[35] <= 24.970745086669922) {
                    if (input[36] <= 60.196800231933594) {
                        if (input[34] <= 46.5) {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        } else {
                            if (input[35] <= 23.07202434539795) {
                                if (input[34] <= 68.0) {
                                    var8 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var8 = new double[] {0.0, 0.0, 1.0};
                                }
                            } else {
                                if (input[34] <= 65.5) {
                                    var8 = new double[] {0.0, 1.0, 0.0};
                                } else {
                                    var8 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        }
                    } else {
                        if (input[36] <= 64.62932968139648) {
                            if (input[35] <= 20.398414611816406) {
                                if (input[36] <= 61.466033935546875) {
                                    var8 = new double[] {1.0, 0.0, 0.0};
                                } else {
                                    if (input[34] <= 68.5) {
                                        if (input[36] <= 61.95538902282715) {
                                            var8 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[35] <= 19.835844039916992) {
                                                var8 = new double[] {0.4, 0.6, 0.0};
                                            } else {
                                                var8 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    } else {
                                        var8 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                if (input[34] <= 71.5) {
                                    if (input[36] <= 61.902584075927734) {
                                        if (input[35] <= 23.205832481384277) {
                                            if (input[35] <= 22.361099243164062) {
                                                var8 = new double[] {0.2857142857142857, 0.7142857142857143, 0.0};
                                            } else {
                                                var8 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        } else {
                                            var8 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[36] <= 63.175537109375) {
                                            var8 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[34] <= 44.5) {
                                                var8 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var8 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    var8 = new double[] {0.0, 0.0, 1.0};
                                }
                            }
                        } else {
                            if (input[35] <= 23.310221672058105) {
                                if (input[36] <= 68.65353775024414) {
                                    if (input[35] <= 19.95323944091797) {
                                        if (input[34] <= 48.5) {
                                            var8 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            var8 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    } else {
                                        if (input[35] <= 21.30351448059082) {
                                            if (input[34] <= 54.5) {
                                                var8 = new double[] {1.0, 0.0, 0.0};
                                            } else {
                                                var8 = new double[] {0.0, 1.0, 0.0};
                                            }
                                        } else {
                                            if (input[35] <= 22.28115749359131) {
                                                var8 = new double[] {0.0, 0.5, 0.5};
                                            } else {
                                                var8 = new double[] {1.0, 0.0, 0.0};
                                            }
                                        }
                                    }
                                } else {
                                    if (input[36] <= 73.24005508422852) {
                                        if (input[34] <= 45.0) {
                                            var8 = new double[] {1.0, 0.0, 0.0};
                                        } else {
                                            if (input[34] <= 65.5) {
                                                var8 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var8 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    } else {
                                        if (input[35] <= 21.14191246032715) {
                                            var8 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            if (input[34] <= 74.5) {
                                                var8 = new double[] {0.0, 1.0, 0.0};
                                            } else {
                                                var8 = new double[] {0.0, 0.0, 1.0};
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (input[36] <= 69.39402770996094) {
                                    if (input[34] <= 49.5) {
                                        var8 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[34] <= 70.5) {
                                            var8 = new double[] {0.0, 1.0, 0.0};
                                        } else {
                                            var8 = new double[] {0.0, 0.0, 1.0};
                                        }
                                    }
                                } else {
                                    if (input[34] <= 47.5) {
                                        var8 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        if (input[35] <= 24.70380973815918) {
                                            if (input[35] <= 24.609116554260254) {
                                                var8 = new double[] {0.0, 0.8888888888888888, 0.1111111111111111};
                                            } else {
                                                var8 = new double[] {0.0, 0.5, 0.5};
                                            }
                                        } else {
                                            var8 = new double[] {0.0, 1.0, 0.0};
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (input[36] <= 63.39459800720215) {
                        if (input[35] <= 25.82730007171631) {
                            if (input[35] <= 25.358829498291016) {
                                if (input[36] <= 59.647674560546875) {
                                    if (input[34] <= 47.0) {
                                        var8 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var8 = new double[] {0.0, 1.0, 0.0};
                                    }
                                } else {
                                    if (input[34] <= 59.0) {
                                        var8 = new double[] {1.0, 0.0, 0.0};
                                    } else {
                                        var8 = new double[] {0.0, 0.0, 1.0};
                                    }
                                }
                            } else {
                                var8 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var8 = new double[] {1.0, 0.0, 0.0};
                        }
                    } else {
                        if (input[34] <= 70.5) {
                            if (input[34] <= 48.0) {
                                var8 = new double[] {1.0, 0.0, 0.0};
                            } else {
                                var8 = new double[] {0.0, 1.0, 0.0};
                            }
                        } else {
                            var8 = new double[] {0.0, 0.0, 1.0};
                        }
                    }
                }
            }
        }
        return addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(addVectors(var0, var1), var2), var3), var4), var5), var6), var7), var8);
    }
    private static double[] addVectors(double[] v1, double[] v2) {
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] + v2[i];
        }
        return result;
    }
    private static double[] mulVectorNumber(double[] v1, double num) {
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] * num;
        }
        return result;
    }
}
