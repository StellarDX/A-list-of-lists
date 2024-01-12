// W51 GMC complex
// Reference: A. Bik, Th. Henning, S. -W. Wu, M. Zhang, W. Brandner, A. Pasquali, A. Stolte
// "Near-infrared spectroscopy of the massive stellar population of W51: evidence for multi-seeded star formation"
// https://arxiv.org/abs/1902.05460

// Main
Nebula "W 51/SNR G049.2-00.5/CTB 73/LMH 47/[HC69] 35/1AGL J1922+1351/2E 4241/MM 49/[L89b] 49.486-00.381/AJG 98/2E 1921.0+1357/NEK 49.3-00.8/[M94] 49.5 -0.4/ASB 53/GAL 049.2-00.7/SNR G049.2-00.7/EQ 1921+1424/3C 400/GPSR 049.486-0.382/TeV J1923+141/3C 400.0/GRS G049.20 -00.70/3CR 400/GRS G049.50 -00.40/[DGW65] 123"
{
	RA	      19 23 50.0
	Dec	      +14 06 00
	Dist      5410
	Galaxy    "Milky Way"
	Radius    40 // 70 * 80
	Type      "SNR"
}

// Sub-Regions

Nebula "W 51a/[M94] 49.5 -0.4 a/[OMN2000] Region 3"
{
	RA	      19 23 39.4
	Dec	      +14 31 3.31
	Dist      5410
	Galaxy    "Milky Way"
	Radius    13 // 16.67'?
	Type      "Diffuse"
	Quat      (-0.3312218, -0.5572432, -0.3372154, 0.6826844)
	Randomize (0.14513, 1, -0.55326)
}

Nebula "W 51b"
{
	RA	      19 22 40.64
	Dec	      +14 09 55.58 // Approximate
	Dist      5410
	Galaxy    "Milky Way"
	Radius    16 // 20'?
	Type      "Diffuse"
	Quat      (0.4517443, -0.8841026, 0.005561229, 0.1194098)
	Randomize (-0.47151, 0.41066, -0.83456)
}

Nebula "SNR G049.1-00.1/2FGL J1923.2+1408e/1FHL J1923.2+1408/3FHL J1923.2+1408e/0FGL J1923.0+1411/3FGL J1923.2+1408e/2FHL J1923.2+1408/SNR G049.5-00.4/1FGL J1922.9+1411/4FGL J1923.2+1408e/2FHL J1923.2+1408e/W 51c"
{
	RA	      19 23 19.300
	Dec	      +14 09 21.00
	Dist      5410 // 6Kpc
	Galaxy    "Milky Way"
	Radius    22 // 44 * 33
	Type      "SNR"
}

// HII Sub-regions

Nebula "GAL 049.58-00.38/IRAS 19216+1429/[KJB2003] G49.586-0.385/[WWB83] G049.58-0.38"
{
	RA	      19 23 52.4
	Dec	      +14 35 27
	Dist      5410 // 6Kpc
	Galaxy    "Milky Way"
	Radius    3
	Type      "Diffuse"
	Quat      (0.7725471, -0.3518135, -0.4881384, 0.202779)
	Randomize (-0.16971, -0.63648, 0.14361)
}

Nebula "GAL 049.5-00.4/[GS70] 049.5-00.4"
{
	RA	      19 23 43.5
	Dec	      +14 31 10
	Dist      5410 // 6Kpc
	Galaxy    "Milky Way"
	Radius    3
	Type      "Diffuse"
	Quat      (0.6734916, -0.1305633, -0.6876284, 0.2377593)
	Randomize (-0.15586, -0.36166, 0.33051)
}

Nebula "GAL 049.2-00.3/GAL 049.2-00.35/[GS70] 049.2-00.3"
{
	RA	      19 23 01.9
	Dec	      +14 16 17
	Dist      5410 // 6Kpc
	Galaxy    "Milky Way"
	Radius    3
	Type      "Diffuse"
	Quat      (0.1149329, -0.1600162, -0.3294883, 0.9233757)
	Randomize (-0.39568, -0.55119, 0.86193)
}

Nebula "GAL 048.9-00.3/[GS70] 048.9-00.3"
{
	RA	      19 22 13.7
	Dec	      +14 02 09
	Dist      5410 // 6Kpc
	Galaxy    "Milky Way"
	Radius    3
	Type      "Diffuse"
	Quat      (-0.1583213, 0.08019812, 0.719254, 0.6714074)
	Randomize (0.13469, -0.88734, -0.27974)
}