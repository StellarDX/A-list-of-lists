// PSR B0943+10
Remove "PSR B0943+10" {ParentBody "PSR J0946+0951 bar"}
Remove "PSR B0943+10 b" {ParentBody "PSR B0943+10"}
Remove "PSR B0943+10 c" {ParentBody "PSR B0943+10"}
// Reference: 
// Yue Y L , Cui X H , Xu R X .Is PSR B0943+10 a Low-Mass Quark Star?[J].
// Astrophysical Journal, 2006, 649(2):L95-L98.DOI:10.1086/508421.
Star "PSR B0943+10 A"
{
	DateUpdated     "2024-08-08"
	ParentBody      "PSR B0943+10"
	Class           "Q" // Quark star
	MassSol         0.02 // 1.5
	Radius          2.6
	LumBol          1.31E-5
	Teff            3.1E6
	RotationPeriod  3.0555555555555555555555555555556e-4
	Age             0.005
	KerrSpin        0
	KerrCharge      0

	AccretionDisk
	{
		InnerRadiusKm     2.63
		OuterRadiusKm     78.8
		InnerThicknessKm  1.56
		OuterThicknessKm  31.2
		ThicknessPow      3
		DetailScaleR      6
		DetailScaleV      1
		OctaveDistortionX 0.5
		OctaveDistortionY 0.35
		OctaveDistortionZ 0.2
		OctaveScale       0.5
		DiskNoiseContrast 1
		DiskTempContrast  0.15
		DiskOuterSpin     0.04
		TwistMagn         2.5e+03
		AccretionRate     3.53e-21
		Temperature       3.07e+04
		Density           0.02
		Luminosity        9.99e-06
		LuminosityBol     9.26e-05
		Brightness        1
		JetLengthKm       117
		JetStartRadiusKm  3.9
		JetEndRadiusKm    19.5
		JetStartTemp      3.07e+04
		JetEndTemp        2.3e+04
		JetVelocity       0.85
		JetDistortion     0.4
		JetThickness      0.3
		JetDensity        0.001
		JetBrightness     1
		LightingBright    1
		ShadowContrast    1
		ShadowLength      0.5
	}
}

Planet	"PSR B0943+10 b"
{
	ParentBody     "PSR B0943+10 A"
	DiscMethod     "Pulsar"
	DiscDate       "2014"
	MassJup        2.8
	Oblateness     0

	Orbit
	{
		PeriodDays      730
		SemiMajorAxis   1.8
	}
}

Planet	"PSR B0943+10 c"
{
	ParentBody     "PSR B0943+10 A"
	DiscMethod     "Pulsar"
	DiscDate       "2014"
	MassJup        2.6
	Oblateness     0

	Orbit
	{
		PeriodDays      1460
		SemiMajorAxis   2.9
	}
}

// RX J0720.4−3125
Remove "PSR J0720-3125" {ParentBody "PSR J0720-3125 bar"}
/*Star "RX J0720.4-3125 A"
{
	DateUpdated     "2024-08-08"
	ParentBody      "RX J0720.4-3125"
	Class           "Q"
	AbsMagn         19.38151250383644 // Calculated
	MassSol         0.125 // Modalized, unknown
	Radius          4.50 // 5.38
	LumBol          0.008859070236997562 // Calculated
	RotationPeriod  0.00196111111111111111111111111111
	Teff            696271.087304735 // 60 - 62 eV
	Age             0.00376
}*/

// 4U 1820-30
// Reference:
// Güver Tolga, Patricia W , Larry C ,et al.The Mass and Radius of the Neutron 
// Star in 4U 1820-30[J].Astrophysical Journal, 2010, 719(2).
// DOI:10.1088/0004-637X/719/2/1807.
Star "4U 1820-30 A"
{
	DateUpdated     "2024-08-08"
	ParentBody      "4U 1820-30"
	Class           "Q"
	MassSol         1.58
	Radius          9.11

	BinaryOrbit     
	{
		PeriodDays      0.00791666666666666666666666666667
	}
}

Star "4U 1820-30 B"
{
	DateUpdated     "2024-08-08"
	ParentBody      "4U 1820-30"
	Class           ""
	MassSol         0.07
	Oblateness      0
}

// Lich
Remove "PSR J1300+1240" {ParentBody "Lich"}
Remove "Draugr" {ParentBody "Lich"}
Remove "Phobetor" {ParentBody "Lich"}
Remove "Poltergeist" {ParentBody "Lich"}
// A lich is an undead creature known for controlling other undead creatures with magic.
Star "Lich/PSR B1257+12 A"
{
	DateUpdated     "2024-08-09"
	ParentBody      "PSR B1257+12"
	Class           "Q"
	MassSol         1.4
	Radius          10
	LumBol          1.290607512597469e-07 // Calculated
	Teff            28856
	RotationPeriod  0.0000017275
	Age             1 // 3
}

// Draugr refers to undead creatures in Norse mythology.
Planet "Draugr/PSR B1257+12 b"
{
	ParentBody     "PSR B1257+12 A"
	DiscMethod     "Pulsar"
	DiscDate       "1994"
	Class          "Terra"
	Mass           0.020
	Radius         2155.810306 // Estimate
	Oblateness     0

	Orbit
	{
		Epoch           2449765.1
		PeriodDays      25.262
		SemiMajorAxis   0.19
		Eccentricity    0
		Inclination     50
		ArgOfPericen    360
	}
}

// Poltergeist is a name for supernatural beings that create physical disturbances, from the German for "noisy ghost".
Planet "Poltergeist/PSR B1257+12 c"
{
	ParentBody     "PSR B1257+12 A"
	DiscMethod     "Pulsar"
	DiscDate       "1992"
	Class          "Terra"
	Mass           4.3
	Radius         12182.24167 // Estimate
	Oblateness     0

	Orbit
	{
		Epoch           2449768.1
		PeriodDays      66.5419
		SemiMajorAxis   0.36
		Eccentricity    0.0186
		Inclination     53
		ArgOfPericen    250.4
	}
}

// Phobetor is, in Ovid's Metamorphoses, one of the thousand sons of Somnus (Sleep) who appears in dreams in the form of beasts.
Planet "Phobetor/PSR B1257+12 d"
{
	ParentBody     "PSR B1257+12 A"
	DiscMethod     "Pulsar"
	DiscDate       "1992"
	Class          "Terra"
	Mass           3.9
	Radius         11480.6466
	Oblateness     0

	Orbit
	{
		Epoch           2449765.5
		PeriodDays      98.2114
		SemiMajorAxis   0.46
		Eccentricity    0.0252
		Inclination     47
		ArgOfPericen    108.3
	}
}

DwarfPlanet "PSR B1257+12 e(X)" // Retracted object
{
	ParentBody     "PSR B1257+12 A"
	DiscMethod     "Pulsar"
	DiscDate       "1996"
	Class          "Terra"
	Mass           0.0004
	Radius         237.66 // 1/5 * Pluto
	Oblateness     0

	Orbit
	{
		Period          4.6
		SemiMajorAxis   2.4
	}
}

Planet "PSR B1257+12 f(X)" // Retracted object
{
	ParentBody     "PSR B1257+12 A"
	DiscMethod     "Pulsar"
	DiscDate       "1996"
	Class          "GasGiant"
	Mass           100
	Oblateness     0

	Orbit
	{
		SemiMajorAxis   40
	}
}

// Geminga
// References: 
// Baiko D A , Yakovlev D G .Direct Urca process in strong magnetic fields 
// and neutron star cooling[J].Astronomy and Astrophysics, 1999, 342(1):192-200.
// DOI:10.1086/300744.
// Mattox J R , Halpern J P , Caraveo P A .Timing the Geminga Pulsar with 
// Gamma-Ray Observations[J].Astrophysical Journal, 2001, 493(2):891.
// DOI:10.1086/305144.
Remove "Geminga Pulsar" {ParentBody "PSR J0633+1746 bar"}
Star "Geminga Pulsar"
{
	DateUpdated     "2024-08-09"
	ParentBody      "Geminga"
	Class           "Q"
	MassSol         1.439 // ?
	Radius          10
	LumBol          0.00029501878599770586 // Calcuulated
	Teff            199526.23149688796013524553967395 // log(T) = 5.2 - 5.38 (5.3)
	Age             0.000342  

	RotationModel   "IAU"
	{
		ValidRange      "Unlimited"
		Epoch           2446600
		PoleRA          25 // From Chandra photo (?)
		PoleRARate      0
		PoleDec         -25 // From Chandra photo (?)
		PoleDecRate     0
		PrimeMeridian   0
		// 4.217705363081 - 1.9521712E-13 * t + 1.49E-25 * t^2 (Hz)
		RotationRate    131187507.613271424 //  4.217705363081 Hz
		RotationAccel   -19161.8798083227648 // -1.9521712E-13 Hz/s
	}
}

Planet "Geminga b"
{
	ParentBody     "Geminga Pulsar"
	DiscMethod     "Pulsar"
	DiscDate       "1996"
	Class          "Terra"
	Mass           1.7
	Oblateness     0

	Orbit
	{
		Epoch           2449360
		Period          5.1
		SemiMajorAxis   3.31
		Eccentricity    0
		LongOfPericen   90
	}
}

// XTE J1739-285
Star "XTE J1739-285 A"
{
	DateUpdated     "2024-08-09"
	ParentBody      "XTE J1739-285"
	Class           "Q"
	MassSol         1.51
	Radius          10.9
	RotationPeriod  2.4757377698554169142404436522084e-7 // 1122 Hz

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Separation      0.5141319832
		Eccentricity    0.88006131
		Inclination     -0.348091125
		AscendingNode   0
		ArgOfPericenter -119.475123
		MeanAnomaly     -141.891197
	}
}

Star "XTE J1739-285 B"
{
	ParentBody      "XTE J1739-285"
	Class           "L3.1?" // Unknown, LMXB
}

// PSR J1906+07
// Reference:
// Van Leeuwen J , Kasian L , Stairs I H ,et al.The Binary Companion of Young, 
// Relativistic Pulsar J1906+0746[J].Astrophysical Journal, 2014, 798(2):118.
// DOI:10.1088/0004-637X/798/2/118.
Remove "PSR J1906+0746 A" {ParentBody "PSR J1906+0746"}
Remove "PSR J1906+0746 B" {ParentBody "PSR J1906+0746"}
Star "PSR J1906+0746 A"
{
	DateUpdated     "2024-08-09"
	ParentBody      "PSR J1906+0749"
	Class           "Q"
	MassSol         1.291
	Radius          11.99 // 12.85
	LumBol          0.14043910003721158 // Calculated
	Teff            851138.03820237646781712631859249 // log(T) = 5.93
	
	RotationModel   "IAU"
	{
		ValidRange      "Unlimited"
		Epoch           2454289.000001
		PoleRA          151 // Unknown
		PoleRARate      0
		PoleDec         -5 // Unknown
		PoleDecRate     0
		PrimeMeridian   0
		// 6.940918295 - 9.7642E-13 * t + 4.9E-23 * t^2 - 1.8E-30 * t^3 - 1.7E-37 * t^4 (Hz)
		RotationRate    215890322.64768 // 6.940918295 Hz
		RotationAccel   -95842.2226618368 // -9.7642E-13 Hz/s
	}

	BinaryOrbit
	{
		Epoch           2454288.9298808
		PeriodDays      0.16599304686 // 0.16599304686 - 5.6498E-13 * t (days)
		SemiMajorAxisKm 616154.75193392664251394612596815 // Asini = 1.4199506 light-second
		Eccentricity    0.0852996
		Inclination     43.7
		AscendingNode   0 // Unknown
		LongOfPericen   76.3317
		ArgOfPeriPreces 7.5841
		MeanAnomaly     0
	}
}

Star "PSR J1906+0746 B"
{
	DateUpdated     "2024-08-09"
	ParentBody      "PSR J1906+0749"
	Class           "Q"
	MassSol         1.322
}

// PSR J2043+1711
// Reference:
// Guillemot L , Freire P C C , Cognard I ,et al.Discovery of the millisecond 
// pulsar PSR J2043+1711 in a Fermi source with the Nançay Radio Telescope[J].
// Monthly Notices of the Royal Astronomical Society, 2012.
// DOI:10.1111/j.1365-2966.2012.20694.x.
Remove "PSR J2043+1711 A" {ParentBody "PSR J2043+1711"}
Remove "PSR J2043+1711 B" {ParentBody "PSR J2043+1711"}
Star "PSR J2043+1711 A"
{
	DateUpdated     "2024-08-09"
	ParentBody      "2FGL J2043.2+1711"
	Class           "Q"
	MassSol         1.38 // Assumed
	Radius          12.13 // 12.96
	LumBol          0.11955597162420518 // Calculated
	Teff            812830.51616409924654127879773133 // log(T) = 5.91
	
	RotationModel   "IAU"
	{
		ValidRange      "Unlimited"
		Epoch           2455400.00019
		PoleRA          213 // Unknown
		PoleRARate      0
		PoleDec         -3 // Unknown
		PoleDecRate     0
		PrimeMeridian   0
		// 0.00237987896026 + 5.24E-21 * t (s?)
		RotationRate    13069572242.7 // 2.37987896026 ms
		RotationAccel   -90.811618984638509504159494956127 // +5.24E-21 (?)
	}

	BinaryOrbit
	{
		Epoch           2455253.8038503 // Ascending Node
		PeriodDays      1.482290809
		SemiMajorAxisKm 492518.35170665863153918495106832 // Asini = 1.6239614 light-second
		Eccentricity    3.4E-6
		Inclination     81.3 // Best fit value
		AscendingNode   0 // Unknown
		LongOfPericen   38.9 // esinω = -2.1E-6 (~(38 - 40) +- K * 180)
		MeanAnomaly     -38.9 // Fix to Ascending Node
	}
}

Star "PSR J2043+1711 B"
{
	DateUpdated     "2024-08-09"
	ParentBody      "2FGL J2043.2+1711"
	Class           "DB" // He White dwarf
	MassSol         0.21 // 0.2 - 0.22
}

// PSR J1933-6211
// Reference: https://www.aanda.org/articles/aa/abs/2023/06/aa44654-22/aa44654-22.html
Remove "PSR J1933-6211 A" {ParentBody "PSR J1933-6211"}
Remove "PSR J1933-6211 B" {ParentBody "PSR J1933-6211"}
Star "PSR J1933-6211 A"
{
	DateUpdated     "2024-08-09"
	ParentBody      "PSR J1933-6210"
	Class           "Q"
	MassSol         1.4 // Assumed
	Radius          12.15 // 12.98
	LumBol          0.009977051808738261 // Calculated
	Teff            436515.83224016596746383499610535 // log(T) = 5.64
	
	RotationModel   "IAU"
	{
		ValidRange      "Unlimited"
		Epoch           2458831
		PoleRA          101 // Unknown
		PoleRARate      0
		PoleDec         8 // Unknown
		PoleDecRate     0
		PrimeMeridian   0
		// 0.00237987896026 + 5.24E-21 * t (s?)
		RotationRate    8777931797.859497856 // 282.212313459989 Hz
		RotationAccel   -30.261728812032 // -3.0830E-16 Hz/s
	}

	BinaryOrbit
	{
		Epoch           2453004.13
		PeriodDays      12.819406716 // 12.819406716 + 7E-13 * t(sec) (day)
		SemiMajorAxisKm 4494795.7887568024193819506216496 // Asini = 12.2815670 (+ 1.60E-14 * t(sec)) light-second
		Eccentricity    1.26E-6
		Inclination     55
		AscendingNode   255
		LongOfPericen   102.1
		MeanAnomaly     0
	}
}

Star "PSR J1933-6211 B"
{
	DateUpdated     "2024-08-09"
	ParentBody      "PSR J1933-6210"
	Class           "DQ" // CO White dwarf
	MassSol         0.43
}

// Vela Pulsar
// Reference: https://arxiv.org/abs/2402.13795
Remove "Vela Pulsar" {ParentBody "PSR J0835-4510 bar"}
Star "Vela Pulsar"
{
	DateUpdated     "2024-08-10"
	ParentBody      "Vela PSR"
	Class           "Q"
	AbsMagn         16.258263347939213 // Calculated
	MassSol         1.88
	Radius          12.52 // 13.30
	LumBol          0.05559789247775076 // Calculated
	Teff            660693.44800759600650964628363505 // log(T) = 5.82
	Age             0.000011 // 0.0000123
	RotationPeriod  2.4722222222222222222222222222222e-5
}

// PSR J0348+0432
// Reference: 
// Antoniadis J , Freire P C C , Wex N ,et al.A Massive Pulsar in a Compact 
// Relativistic Binary[J].ence, 2013, 340(6131):448, 1233232.
// DOI:10.1126/science.1233232.
Remove "PSR J0348+0432 A" {ParentBody "PSR J0348+0432"}
Remove "PSR J0348+0432 B" {ParentBody "PSR J0348+0432"}
Star "PSR J0348+0432 A"
{
	DateUpdated     "2024-08-09"
	ParentBody      "Gaia DR3 3273288485744249344"
	Class           "Q"
	MassSol         2.01
	Radius          13 // Verification needed
	
	RotationModel   "IAU"
	{
		ValidRange      "Unlimited"
		Epoch           2451545
		PoleRA          277 // Unknown
		PoleRARate      0
		PoleDec         -3 // Unknown
		PoleDecRate     0
		PrimeMeridian   0
		// 255606361937675 - 1.5729E-16 * t(s) (Hz)
		RotationRate    795038028.17094432 // 25.5606361937675 Hz
		RotationAccel   -15.4390766294016 // -1.5729E-16 Hz/s
	}

	BinaryOrbit
	{
		Epoch           2456000.084771047 // Ascending Node
		PeriodDays      0.102424062722 // 0.102424062722 - 2.73E-13 * t(s) (days)
		SemiMajorAxisKm 8.32E5 // Asini = 0.14097938 light-second
		Eccentricity    2.4E-6 // Very low (Verification needed)
		Inclination     40.2
		AscendingNode   0 // Unknown
		LongOfPericen   53.34 // esinω = 1.9E-6 (~(52 - 54) +- K * 180) (Verification needed)
		MeanAnomaly     -53.34 // Fix to Ascending Node
	}
}

Star "PSR J0348+0432 B"
{
	DateUpdated     "2024-08-09"
	ParentBody      "Gaia DR3 3273288485744249344"
	Class           "WD"
	MassSol         0.172
	Radius          45268
	LumBol          0.04 // Calculated
	Teff            10120
	AccretionDisk{Temperature 10120}
}

// PSR J1614-2230
// Reference:
// Demorest P , Pennucci T , Ransom S ,et al.Shapiro delay measurement 
// of a two solar mass neutron star[J].Nature, 2010, 467.
// DOI:10.1038/nature09466.
Remove "PSR J1614-2230 A" {ParentBody "PSR J1614-2230"}
Remove "PSR J1614-2230 B" {ParentBody "PSR J1614-2230"}
Star "PSR J1614-2230 A"
{
	DateUpdated     "2024-08-09"
	ParentBody      "PSR J1614-22"
	Class           "Q"
	MassSol         1.908
	Radius          13
	
	RotationModel   "IAU"
	{
		ValidRange      "Unlimited"
		Epoch           2453600
		PoleRA          153 // Unknown
		PoleRARate      0
		PoleDec         0 // Unknown
		PoleDecRate     0
		PrimeMeridian   0
		// 0.0031508076534271 + 9.6216E-21 * t (s)
		RotationRate    9871754617 // 3.1508076534271 ms
		RotationAccel   -95.130700102605683161435029134058 // 9.6216E-21 s/s
	}

	BinaryOrbit
	{
		Epoch           2452331.1701098 // Ascending Node
		PeriodDays      8.6866194196 // 0.102424062722 - 2.73E-13 * t(s) (days)
		SemiMajorAxisKm 8.32E5 // Asini = 11.2911975 light-second
		Eccentricity    1.3E-6
		Inclination     89.17
		AscendingNode   0 // Unknown
		LongOfPericen   175.1 // esinω = 1.9E-6 (~(5 - 7) +- K * 180) (Verification needed)
		MeanAnomaly     -175.1 // Fix to Ascending Node
	}
}

Star "PSR J1614-2230 B"
{
	DateUpdated     "2024-08-09"
	ParentBody      "PSR J1614-22"
	Class           "WD"
	MassSol         0.5
}

// GX 13+1
// References:
// Corbet R H D , Pearlman A B , Buxton M ,et al.Properties of the 24 Day 
// Modulation in GX 13+1 from Near-Infrared and X-ray Observations[J].
// Astrophysical Journal, 2010, 719(1).DOI:10.1088/0004-637X/719/1/979.
// Bandyopadhyay R M , Shahbaz T , Charles P A ,et al.Infrared spectroscopy 
// of low-mass X-ray binaries - II[J].Monthly Notices of the Royal Astronomical 
// Society, 1999.DOI:10.1046/j.1365-8711.1999.02547.x.
// https://academic.oup.com/mnras/article/527/4/11855/7491082
Star "GX 13+01 A"
{
	DateUpdated     "2024-08-10"
	ParentBody      "GX 13+01"
	Class           "Q"
	MassSol         1.4
	Radius          14.50

	BinaryOrbit     
	{
		PeriodDays      24.065
		Inclination     77
	}
}

Star "GX 13+01 B"
{
	DateUpdated     "2024-08-10"
	ParentBody      "GX 13+01"
	Class           "K5III"
	MassSol         5
	RadSol          25
	Oblateness      0
}

// PSR J1748-2446ad
// Reference:
// Hessels J , Ransom S , Stairs I ,et al.A Radio Pulsar Spinning at 716 Hz[J].
// Science, 2006, 311(5769):p. 1901-1904.DOI:10.1126/science.1123430.
Remove "PSR J1748-2446ad A" {ParentBody "PSR J1748-2446ad"}
Remove "PSR J1748-2446ad B" {ParentBody "PSR J1748-2446ad"}
Star "PSR J1748-2446ad A"
{
	DateUpdated     "2024-08-10"
	ParentBody      "[LMD90] Terzan 5 Psr ad"
	Class           "Q"
	MassSol         1.4 // <2
	Radius          16
	Age             0.025

	RotationModel   "IAU"
	{
		ValidRange      "Unlimited"
		Epoch           2453500
		PoleRA          0 // Unknown
		PoleRARate      0
		PoleDec         0 // Unknown
		PoleDecRate     0
		PrimeMeridian   0
		// 716.35556 + 3E-13 * t(s) (Hz)
		RotationRate    22281523338.24 // 716.35556 Hz
		RotationAccel   29447.027712 // 3E-13 Hz/s
	}

	BinaryOrbit
	{
		Epoch           2453318.995689 // Ascending Node
		PeriodDays      1.09443034
		//SemiMajorAxisKm 330611.1226824 // Asini = 1.10280 light-second
		Eccentricity    0.0001
		Inclination     90 // Eclipsing Binary
		AscendingNode   0 // Unknown
		LongOfPericen   0 // Unknown
		MeanAnomaly     0 // Unknown
	}
}

Star "PSR J1748-2446ad B"
{
	DateUpdated     "2024-08-10"
	ParentBody      "[LMD90] Terzan 5 Psr ad"
	Class           "M3.4V" // bloated main-sequence star
	MassSol         0.14
	RadSol          5 // 6
	Oblateness      0
}

// RX J1856.5−3754
Remove "PSR J1856-3754" {ParentBody "PSR J1856-3754 bar"}

// PSR B1620-26
// References:
// Thorsett S E , Arzoumanian Z , Taylor J H .PSR B1620-26: A Binary Radio 
// Pulsar with a Planetary Companion?[J].The Astrophysical Journal, 1993, 
// 412(1):L33-L36.DOI:10.1086/186933.
// Ford E B , Joshi K J , Rasio F A ,et al.Theoretical Implications of the PSR 
// B1620-26 Triple System and Its Planet[J].IOP Publishing Ltd. 2000(1).
// DOI:10.1086/308167.
// Thorsett S E , Arzoumanian Z , Camilo F ,et al.The Triple Pulsar System 
// PSR B1620-26 in M4[J].Astrophysical Journal, 2012, 523(2):763-770.
// DOI:10.1086/307771.
Remove "PSR B1620-26 A" {ParentBody "PSR B1620-26"}
Remove "PSR B1620-26 B" {ParentBody "PSR B1620-26"}
Remove "PSR B1620-26 b" {ParentBody "PSR B1620-26"}
Star "PSR B1620-26 A"
{
	DateUpdated     "2024-08-10"
	ParentBody      "PSR J1623-2631"
	Class           "Q"
	MassSol         1.35
	Radius          24
	Teff            30000
	Age             12.2

	RotationModel   "IAU"
	{
		ValidRange      "Unlimited"
		Epoch           2448725.5
		PoleRA          120 // Unknown
		PoleRARate      0
		PoleDec         40 // Unknown
		PoleDecRate     0
		PrimeMeridian   0
		// 90.287332005426 - 5.4693E-15 * t + 1.9283E-23 * t^2 + 6.39E-33 * t^3 - 2.1E-40 * t^4 + 3E-49 * t^5 (Hz)
		RotationRate    2808297174.696770304 // 90.287332005426 Hz
		RotationAccel   -536.848762217472 // -5.4693e-15 Hz/s
	}

	AccretionDisk {Temperature 30000}

	BinaryOrbit
	{
		Epoch           2453318.995689 // Ascending Node
		PeriodDays      191.44281 // 16540659.6 sec
		//SemiMajorAxisKm 19429392.111732008 // Asini = 64.809460 light-second
		Eccentricity    0.02531545
		Inclination     40
		AscendingNode   0 // Unknown
		Epoch           2448728.76242
		ArgOfPericenter 117.1291
		MeanAnomaly     0
	}
}

Star "WD B1620-26/WD J1623-266"
{
	DateUpdated     "2024-08-10"
	ParentBody      "PSR J1623-2631"
	Class           "DB"
	MassSol         0.34
	Radius          6950
	LumBol          0.03625946933898026 // Calculated
	Teff            25200
}

Planet	"Methuselah/PSR B1620-26 b"
{
	ParentBody     "PSR J1623-2631"
	DiscMethod     "Pulsar"
	DiscDate       "2003"
	Class	       "GasGiant"
	MassJup         2.5
	Oblateness      0
	Color          (0.186 0.248 0.447)

	Surface
	{
		Preset         "Methuselah.cfg"
		SurfStyle       0.858844
		Randomize      (0.319, -0.939, -0.537)
		detailScale     198102
		colorConversion true
		tropicLatitude  0.971132
		icecapLatitude  1
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     6.85229
		stripeFluct     0.39034
		stripeTwist     11.3663
		cycloneMagn     13.8431
		cycloneFreq     0.784893
		cycloneDensity  0.435286
		cycloneOctaves  5
		BumpHeight      8.56295
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          17.7031
		Velocity        686.735
		BumpHeight      9.14371
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.0941
		mainOctaves     12
		Coverage        0.0972833
		stripeZones     6.85229
		stripeFluct     0.39034
		stripeTwist     11.3663
	}

	Clouds
	{
		Height          26.8516
		Velocity        1962.58
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		ModulateColor  (1.000 1.000 1.000 0.800)
		mainFreq        1.0941
		mainOctaves     12
		Coverage        0.0972833
		stripeZones     6.85229
		stripeFluct     0.39034
		stripeTwist     11.3663
	}

	Atmosphere
	{
		Model          "Earth"
		Height          100
		Density         11236.5
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      1

		Composition
		{
			H2    	92.1556
			He    	7.84304
			Ne    	0.0011305
			N2    	0.000240876
		}
	}

	Aurora
	{
		Height      2541.57
		NorthLat    81.8727
		NorthLon    -173.512
		NorthRadius 16099.7
		NorthWidth  6094.32
		NorthRings  5
		NorthBright 1
		NorthParticles 0
		SouthLat    -80.5459
		SouthLon    4.7682
		SouthRadius 21662.8
		SouthWidth  7224.51
		SouthRings  4
		SouthBright 1
		SouthParticles 0
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     86774.6
		OuterRadius     200624
		EdgeRadius      1.57e+05
		MeanRadius      1.1e+05
		Thickness       0.55
		RocksMaxSize    0.022
		RocksSpacing    1
		DustDrawDist    1.65e+03
		ChartRadius     1.57e+05
		RotationPeriod  5.35
		Brightness      1
		FrontBright     0.614
		BackBright      0.769
		Density         0.818
		Opacity         0.818
		SelfShadow      0.409
		PlanetShadow    0.409
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.34
		densityScale    1.42
		densityOffset   -0.425
		densityPower    0.976
		colorContrast   0.0973
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		SemiMajorAxis   23
		Period          100
		Inclination     55
	}
}

// HD 49798
Star "HD 49798 A"
{
	DateUpdated     "2024-08-11"
	ParentBody      "HD 49798"
	Class           "sdO6"
	AbsMagn         -0.2969462936980811 // Calculated
	MassSol         1.50
	RadSol          1.45
	LumBol          3943
	Teff            47500

	BinaryOrbit     
	{
		PeriodDays      1.55
		Eccentricity    0.0
		Inclination     82
	}
}

Star "HD 49798 B"
{
	DateUpdated     "2024-08-11"
	ParentBody      "HD 49798"
	Class           "WD"
	MassSol         1.28
	Radius          1600
	LumBol          12.212925540586173 // Calculated
	Teff            225000
}

// Wolf 1130
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=98906
Remove "Wolf 1130 A" {ParentBody "Wolf 1130"}
Remove "Wolf 1130 B" {ParentBody "Wolf 1130"}
Barycenter "Wolf 1130 A"
{
	ParentBody      "GJ 781"
	BinaryOrbit     
	{
		Period          137030
		Separation      3150
	}
}

Star "Wolf 1130 Aa"
{
	DateUpdated     "2024-08-11"
	ParentBody      "Wolf 1130 A"
	Class           "sdM1"
	AbsMagn         12.784435308598715 // Calculated
	MassSol         0.26
	Radius          229580
	LumBol          0.015234092778604982 // Calculated
	Teff            3530
	FeH             -0.70
	TiH             -0.22
	OtoH            -0.5
	CaH             -0.20
	Age             10
	RotationPeriod  11.9208 // Equal to orbital period
	Obliquity       29
	TidalLocked     true

	BinaryOrbit // 2018ApJ...854..145M (Visible Light)
	{
		PeriodDays      0.4967013
		SemiMajorAxisKm 2087100      
		Eccentricity    0.011
		Inclination     29
		AscendingNode   210
		Epoch           2449559.04
		ArgOfPericenter 210
		MeanAnomaly     0
	}

	/*BinaryOrbit // 2018ApJ...854..145M (Infrared)
	{
		PeriodDays      0.4967040
		SemiMajorAxisKm 2087100      
		Eccentricity    0.002
		Inclination     29
		AscendingNode   210
		Epoch           2456849.09
		ArgOfPericenter 160
		MeanAnomaly     0
	}*/

	/*BinaryOrbit // 2018ApJ...854..145M (Free-parameter)
	{
		PeriodDays      0.49670419
		SemiMajorAxisKm 2087100      
		Eccentricity    0.002
		Inclination     29
		AscendingNode   210
		Epoch           2456849.10
		ArgOfPericenter 164
		MeanAnomaly     0
	}*/
}

Star "Wolf 1130 Ab"
{
	DateUpdated     "2024-08-11"
	ParentBody      "Wolf 1130 A"
	Class           "WDONe"
	MassSol         1.24
	Radius          3480
	LumBol          5.412530037091634e-05 // Calculated
	Teff            7000
}

Star "Wolf 1130 B/GJ 781 B/WISEA J200520.35+542433.6/WISE J200520.38+542433.9/** MGN 1B/WDS J20050+5426B"
{
	DateUpdated     "2024-08-11"
	ParentBody      "GJ 781"
	Class           "sdT8p"
	MassJup         44.9
	Radius          58625
	LumBol          1.121069418515309e-06 // Calculated
	Teff            647
}

// IK Pegasi
Remove "IK Peg A" {ParentBody "IK Peg"}
Remove "IK Peg B" {ParentBody "IK Peg"}
Star "IK Peg A"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* IK Peg"
	Class           "A8m:"
	AbsMagn         2.75
	MassSol         1.65
	RadSol          1.47
	LumBol          6.568
	Teff            7624
	FeH             0.07
	Age             0.050 // 0.6

	BinaryOrbit     
	{
		PeriodDays      21.72168
		Inclination     90
	}
}

Star "IK Peg B"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* IK Peg"
	Class           "DA"
	MassSol         1.15
	Radius          4174
	LumBol          0.12
	Teff            35500
}

// U Gem
Remove "U Gem A" {ParentBody "U Gem"}
Remove "U Gem B" {ParentBody "U Gem"}
Star "U Gem A"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* U Gem"
	Class           "DA"
	AbsMagn         9.68937309132553 // Calculated
	MassSol         1.2
	Radius          5565
	LumBol          0.04190939724315617 // Calculated
	Teff            29200

	AccretionDisk
	{
		Radius        0.002838 // AU
		Temperature   29200 // This temperature overrides the Teff above, commented out for now -MTan
		Density       5000
	}

	BinaryOrbit     
	{
		PeriodDays      0.1769062
		SemiMajorAxisKm 1078335 // 1.55 RSun
		Eccentricity    0.027
		Inclination     69.7
	}
}

Star "U Gem B"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* U Gem"
	Class           "M4.5Ve"
	MassSol         0.42
	Radius          299150
}

// AE Aqr
Remove "AE Aqr A" {ParentBody "AE Aqr"}
Remove "AE Aqr B" {ParentBody "AE Aqr"}
Star "HIP 101991 A"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* AE Aqr"
	Class           "WD"
	AbsMagn         6.6
	MassSol         0.63
	Radius          6950
	RotationPeriod  0.00918888888888888888888888888889

	AccretionDisk
	{
		InnerRadiusKm     34750
		OuterRadiusKm     48650
		InnerThicknessKm  2000
		OuterThicknessKm  3000
		Temperature       12000
		Brightness        10
	}

	BinaryOrbit     
	{
		PeriodDays      0.41166666666666666666666666666667
		SemiMajorAxisKm 1627938
		Inclination     70
	}
}

Star "HIP 101991 B"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* AE Aqr"
	Class           "K3IV" // K3-5IV/V
	MassSol         0.37
	RadSol          0.79
}

// AR Scorpii
Remove "AR Sco A" {ParentBody "AR Sco"}
Remove "AR Sco B" {ParentBody "AR Sco"}
Star "AR Sco A"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* AR Sco"
	Class           "WD"
	AbsMagn         9.408229951563797 // Calculated
	MassSol         0.8
	Radius          6950
	RotationPeriod  0.0325

	BinaryOrbit     
	{
		PeriodDays      0.14853529166666666666666666666667
	}
}

Star "AR Sco B"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* AR Sco"
	Class           "M5"
	MassSol         0.28 // 0.45
}

// YZ Leonis Minoris
Star "YZ LMi A"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* YZ LMi"
	Class           "DB"
	AbsMagn         9.774576733024528 // Calculated
	MassSol         0.79 // 0/89
	Radius          6957
	LumBol          0.00946 // 0.0352
	Teff            18000 // 25000

	AccretionDisk
	{
		InnerRadiusKm     20871
		OuterRadiusKm     166968
		Temperature       8000
	}

	BinaryOrbit     
	{
		PeriodDays      0.47166666666666666666666666666667
		SemiMajorAxisKm 201753
		Inclination     83.1
	}
}

Star "YZ LMi B"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* YZ LMi"
	Class           ""
	MassJup         28.3 // 39.8
	Radius          29900
	LumBol          0.00035
	Teff            3570
}

// QS Virginis
Star "QS Vir A"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* QS Vir"
	Class           "DA3"
	AbsMagn         11.74
	MassSol         0.78
	Radius          7658
	LumBol          0.0044
	Teff            14200

	AccretionDisk{Temperature 14200}

	BinaryOrbit     
	{
		PeriodDays      0.15075833333333333333333333333333
		Separation      0.0056
		Eccentricity    0.0
		Inclination     60
	}
}

Star "QS Vir B"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* QS Vir"
	Class           "M3.5V"
	AbsMagn         11.82
	MassSol         0.43
	RadSol          0.42
	LumBol          0.015
	Teff            3100
}

Planet "QS Vir c"
{
	ParentBody     "V* QS Vir"
	DiscMethod     "TTV"
	DiscDate       "2009"
	Class          "GasGiant"
	MassJup        57.71
	Oblateness     0

	Orbit
	{
		PeriodDays      6091.85
		SemiMajorAxis   7.06
		Eccentricity    0.91
		Inclination     90
		ArgOfPericen    215.95
	}
}

Planet "QS Vir d"
{
	ParentBody     "V* QS Vir"
	DiscMethod     "TTV"
	DiscDate       "2009"
	Class          "GasGiant"
	MassJup        9
	Oblateness     0

	Orbit
	{
		PeriodDays      5259.6
		Eccentricity    0.62
	}
}

// Stein 2051
Remove "Stein 2051 A" {ParentBody "Stein 2051"}
Remove "Stein 2051 B" {ParentBody "Stein 2051"}
Remove "GJ 169.1 A" {ParentBody "GJ 169.1"}
Remove "GJ 169.1 B" {ParentBody "GJ 169.1"}
Star "G 175-34/GJ 169.1 A/HIP 21088/AP J04311147+5858375/Gaia DR3 470826482637310080/TIC 356322721/ASCC 176742/2MASS J04311147+5858375/USNO-B1.0 1489-00136092/8pc 181.36A/CCDM J04312+5858A/CSI+58-04268 1/IDS 04224+5849 A/JP11 5943/LHS 26/NLTT 13373/UBV 4295/USNO 120/USNO 807/Zkh 62/[RHG95] 780/LSPM J0431+5858W/WDS J04312+5858A/Gaia DR2 470826482635704064/IRAS 04268+5852/AKARI-IRC-V1 J0431126+585823/WISE J043113.20+585816.7/UCAC4 745-033846/WISEA J043113.21+585816.7/PM J04311+5858/Stein 2051A/Karmn J04311+589/HIC 21088/PM 04268+5854/** STI 2051A"
{
	DateUpdated     "2024-08-11"
	ParentBody      "CCDM J04312+5858"
	Parallax        181.2438
	AppMagn         10.98
	Class           "M4.0V"
	AbsMagn         12.271315795612619 // Calculated
	MassSol         0.252
	Radius          203150
	LumBol          0.0081
	Teff            3277
	FeH             0.26

	BinaryOrbit     
	{
		Separation      49.7672200622355 // 9.02 asec
	}
}

Star "EGGR 180/GJ 169.1 B/Gaia DR3 470826482637310848/TYC 3744-2062-1/ASCC 176743/LSPM J0431+5858E/8pc 181.36B/AC +58 2500/CCDM J04312+5858B/CSI+58-04268 2/G 175-34B/IDS 04224+5849 B/KPD 0426+5852/LHS 27/NLTT 13375/UBV 4296/USNO 121/USNO 808/WD 0426+588/Zkh 63/WDS J04312+5858B/UCAC4 745-033849/Stein 2051 B/Gaia DR2 470826482635701376/PM J04312+5858/TYC 3744-412-1/** STI 2051B"
{
	DateUpdated     "2024-08-11"
	ParentBody      "CCDM J04312+5858"
	Parallax        181.273
	Class           "DC5"
	MassSol         0.675
	Radius          7930
	LumBol          0.0003011646011050155 // Calculated
	Teff            7122
}

// CR Bootis
Star "CR Boo A"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* CR Boo"
	Class           "WD"
	AbsMagn         7.269495249404969 // Calculated
	MassSol         0.80
	Radius          8350

	BinaryOrbit     
	{
		PeriodDays      0.01702916666666666666666666666667
		Inclination     30
	}
}

Star "CR Boo B"
{
	DateUpdated     "2024-08-11"
	ParentBody      "V* CR Boo"
	Class           "DB"
	MassSol         0.07
	Radius          36593.82
}

// DQ Herculis
Star "DQ Her A"
{
	DateUpdated     "2024-08-12"
	ParentBody      "V* DQ Her"
	Class           "DBe"
	//AbsMagn         -6.94
	MassSol         0.6
	Radius          8420

	AccretionDisk 
	{
		Luminosity      51200 // AbsMagn = -6.94
	}

	BinaryOrbit     
	{
		PeriodDays      0.1936208977
		Separation      0.003
		Inclination     86.5
	}
}

Star "DQ Her B"
{
	DateUpdated     "2024-08-12"
	ParentBody      "V* DQ Her"
	Class           "M2V"
	MassSol         0.4
}

Planet "DQ Her c"
{
	ParentBody     "V* DQ Her"
	DiscMethod     "Other"
	DiscDate       "2009"
	Class          "GasGiant"
	MassJup        20
	Oblateness     0

	Orbit
	{
		PeriodDays      6460
		SemiMajorAxis   6.49
		Inclination     86.5
	}
}

// GD 165
Remove "GD 165 A" {ParentBody "GD 165"}
Remove "GD 165 B" {ParentBody "GD 165"}
Star "GD 165A/GALEX J142439.1+091712/Gaia DR3 1176717792385803136/TIC 421809466/NLTT 37242/LSPM J1424+0917/2MASS J14243914+0917139/USNO-B1.0 0992-00238920/BPS CS 22883-0042/EGGR 222/GEN# +6.10060165/L 1124-10/LP 500-17/LTT 14236/PG 1422+095/V* CX Boo/WD 1422+09/WD 1422+095/uvby98 610060165/PLX 3269.01/1SWASP J142439.16+091714.2/** ZUC 12A/WDS J14247+0917A/Gaia DR2 1176717792385803136/PM J14246+0917/SDSS J142439.10+091713.7/SDSS J142439.10+091713.6"
{
	DateUpdated     "2024-08-12"
	ParentBody      "WDS J14247+0917"
	Class           "DA4.1"
	AbsMagn         11.705179175358404 // Calculated
	MassSol         0.64
	Radius          8626.5
	LumBol          0.0030
	Teff            12130
	RotationPeriod  2.3870833333333333333333333333333
	Age             1.2 // 5.5

	BinaryOrbit     
	{
		Separation      123
	}
}

Star "GD 165B/TIC 421809465/[B2006] J142439.0+091710/2MASS J14243909+0917104/2MASSW J1424390+091710/WISEP J142438.96+091709.8/** ZUC 12B/WDS J14247+0917B/ULAS J142438.98+091709.4"
{
	DateUpdated     "2024-08-12"
	ParentBody      "WDS J14247+0917"
	Parallax        31.7
	Class           "L4V"
	MassJup         62.58
	Radius          71492
	LumBol          9.025536942155812e-05 // Calculated
	Teff            1755
	Age             1.2 // 5.5
}

// HD 44120
Star "HD 44120/GJ 9209 A/HIP 29788/Gaia DR3 5482551183847322752/TIC 260266504/2MASS J06161877-5912483/IRAS 06156-5911/PLX 1471/uvby98 100044120 A/UBV M 11987/UBV 6365/SPOCS 301/SKY# 10599/SAO 234418/PPM 335049/NLTT 16354/LTT 2510/IDS 06149-5910 A/HR 2274/HIC 29788/GCRV 57418/GC 8084/CSI-59 619 41/CPD-59 619/CPC 20 1543/CD-59 1275/CCDM J06163-5913A/** LDS 157A/WDS J06163-5913A/TYC 8546-1675-1/WISEA J061618.73-591252.0/WEB 5883/Gaia DR2 5482551183847322752"
{
	DateUpdated     "2024-08-12"
	ParentBody      "CCDM J06163-5913"
	Class           "F9.5V"
	AbsMagn         3.57
	MassSol         1.214
	RadSol          1.58
	LumBol          2.952
	Teff            6005
	FeH             0.09
	Age             4.105

	BinaryOrbit     
	{
		Period          51100
		Separation      1702.6
	}
}

Star "WG 8/GJ 9209 B/Gaia DR3 5482551252566796928/TIC 260266507/2MASS J06161426-5912275/BPM 18164/CCDM J06163-5913C/IDS 06149-5910 C/L 182-61/LTT 2511/NLTT 16355/NSV 16822/WD 0615-591/WD 0615-59/uvby98 600102511/WDS J06163-5913C/** LDS 157C/GCRV 27424/Gaia DR2 5482551252566796928"
{
	DateUpdated     "2024-08-12"
	ParentBody      "CCDM J06163-5913"
	Class           "DB3.2"
	MassSol         0.67
	Radius          9044
	LumBol          0.009359481007071685 // Calculated
	Teff            15746
}

// WD 1856+534
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?ids=18576%2B5331
Remove "WD 1856+534 b" {ParentBody "WD 1856+534"}
Barycenter "G 229-20/ASCC 268218/2MASS J18573793+5331140/USNO-B1.0 1435-00280837/WISEA J185738.22+533113.6/PM J18576+5331N/UCAC4 718-062610/LSPM J1857+5331/** LDS 4802AB/WDS J18576+5331AB"
{
	ParentBody      "WDS J18576+5331"
	BinaryOrbit     
	{
		Period          31722
		Separation      1030
	}
}

Star "G 229-20A/Gaia DR3 2146576757065535360/** LDS 4802A/WDS J18576+5331A/Gaia DR2 2146576757065535360/LSPM J1857+5331E/NLTT 47260"
{
	DateUpdated     "2024-08-12"
	ParentBody      "G 229-20"
	Class           ""
	MassSol         0.335
	RadSol          0.35
	LumBol          0.01696265648829511 // Calculated
	Teff            3521

	BinaryOrbit     
	{
		Period          513.622
		Separation      56
	}
}

Star "G 229-20B/Gaia DR3 2146576761360909056/** LDS 4802B/WDS J18576+5331B/Gaia DR2 2146576761360909056/LSPM J1857+5331W/NLTT 47261/LP 141-13"
{
	DateUpdated     "2024-08-12"
	ParentBody      "G 229-20"
	Class           ""
	MassSol         0.322
	RadSol          0.34
	LumBol          0.015862225205487444 // Calculated
	Teff            3513
}

Star "LP 141-14/Gaia DR3 2146576589564898688/PSO J284.4153+53.5090/LSPM J1857+5330/USNO-B1.0 1435-00280850/NLTT 47263/WD 1856+534/2MASS J18573936+5330332/** LDS 4802C/WDS J18576+5331C/Gaia DR2 2146576589564898688/PM J18576+5330/TIC 267574918/TOI-1690"
{
	DateUpdated     "2024-08-12"
	ParentBody      "WDS J18576+5331"
	Class           "DC" // DC11
	AbsMagn         15.2755359235908 // Calculated
	MassSol         0.518
	Radius          9113.67
	LumBol          7.608865339585333e-05 // Calculated
	Teff            4710
	FeH             -8.8
	Age             5.85
}

Planet "WD 1856+534 b"
{
	ParentBody     "LP 141-14"
	DiscMethod     "Transit"
	DiscDate       "2020"
	Class          "GasGiant"
	MassJup        2.4 // 13.8
	Radius         66332.6248
	Oblateness     0

	Surface {Preset "neptune_warm_default.cfg"}

	Atmosphere
	{
		Model          "Earth"
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.2
		Saturation      1.5
	}

	Orbit
	{
		Epoch           2458779.37508 // Transit date
		PeriodDays      1.4079405
		SemiMajorAxis   0.0204
		Eccentricity    0
		Inclination     88.778
	}
}

// Epsilon Reticuli
Remove "EPS Ret A" {ParentBody "EPS Ret"}
Remove "EPS Ret B" {ParentBody "EPS Ret"}
Remove "EPS Ret A b" {ParentBody "EPS Ret A"}
Star "EPS Ret A/GJ 9153/GJ 167.3/HIP 19921/Gaia DR3 4678664766393829504/1RXS J041631.2-591815/TIC 198079199/PLX 958/HD 27442A/CCDM J04165-5918A/CPC 20 1085/CPD-59 324/CSI-59 324 41/FAUST 538/GC 5194/GCRV 2468/GEN# +1.00027442/GSC 08508-02041/HIC 19921/HR 1355/IDS 04148-5932 A/JP11 882/PPM 333351/SAO 233463/SKY# 6536/SPOCS 209/TD1 3044/TYC 8508-2041-1/UBV 4189/UBV M 10085/[BBW2000] FD 58/uvby98 100027442/Gaia DR2 4678664766394767616/PLX 958.00/WDS J04165-5918A/** JSP 56A/IRAS 04156-5925/AKARI-IRC-V1 J0416290-591809/2MASS J04162902-5918078/WEB 3804"
{
	DateUpdated     "2024-08-12"
	ParentBody      "CCDM J04165-5918"
	Class           "K2III"
	AbsMagn         0.87
	MassSol         1.46
	RadSol          3.18
	LumBol          6.2
	Teff            4961
	FeH             0.26
	Age             2.89

	BinaryOrbit     
	{
		Period          2700
		Separation      240
	}
}

Star "EPS Ret B/GALEX J041629.7-591757/Gaia DR3 4678664766393827328/HD 27442B/WD 0415-594/CCDM J04165-5918B/CPD-59 324B/CSI-59 324 42/IDS 04148-5932 B/WDS J04165-5918B/** JSP 56B/Gaia DR2 4678664766393827328"
{
	DateUpdated     "2024-08-12"
	ParentBody      "CCDM J04165-5918"
	Class           "DA3.3"
	MassSol         0.60
	Radius          9185
	LumBol          0.008627972568136126 // Calculated
	Teff            15310
	Age             1.5
}

Planet "EPS Ret Ab/HD 27442 Ab"
{
	ParentBody     "EPS Ret A"
	DiscMethod     "Radvel"
	DiscDate       "2000"
	Class          "GasGiant"
	MassJup        1.55
	Oblateness     0

	Orbit
	{
		Epoch           2451849.3
		PeriodDays      429.1
		SemiMajorAxis   1.269
		Eccentricity    0.057
		ArgOfPericenter 347.0
	}
}

// KOI-256
Remove "KOI-256 A" {ParentBody "KOI-256"}
Remove "KOI-256 B" {ParentBody "KOI-256"}
Star "KOI-256 A"
{
	DateUpdated     "2024-08-12"
	ParentBody      "Gaia DR3 2132027576829358208"
	Class           "M3V"
	AbsMagn         9.137187518626128 // Calculated
	MassSol         0.51
	RadSol          0.54
	LumBol          0.03721838964006643 // Calculated
	Teff            3450
	FeH             0.31

	BinaryOrbit     
	{
		PeriodDays      1.3786548
		Separation      0.0250
		Eccentricity    0
		Inclination     89.01
		Epoch           2455373.635498
		ArgOfPericenter 90
		MeanAnomaly     0
	}
}

Star "KOI-256 B"
{
	DateUpdated     "2024-08-12"
	ParentBody      "Gaia DR3 2132027576829358208"
	Class           "WD"
	AbsMagn         13.21718751862613 // Calculated
	MassSol         0.592
	Radius          9350
	LumBol          0.0004135293018209554 // Calculated
	Teff            7100

	AccretionDisk{Temperature 7100}
}

// RR Caeli
Remove "RR Cae A" {ParentBody "RR Cae"}
Remove "RR Cae B" {ParentBody "RR Cae"}
Remove "RR Cae b" {ParentBody "RR Cae"}
Star "RR Cae A"
{
	DateUpdated     "2024-08-12"
	ParentBody      "V* RR Cae"
	Class           "DA7.8"
	AbsMagn         12.769709993170439 // Calculated
	MassSol         0.453
	Radius          10908.5
	LumBol          0.0007
	Teff            7540

	AccretionDisk{Temperature 7540}

	BinaryOrbit     
	{
		PeriodDays      0.30370833333333333333333333333333
		SemiMajorAxisKm 1015722
		Eccentricity    0
		Inclination     87.9
	}
}

Star "RR Cae B"
{
	DateUpdated     "2024-08-12"
	ParentBody      "V* RR Cae"
	Class           "M4"
	MassSol         0.168
	RadSol          0.203 // 0.215
	LumBol          0.0038
	Teff            3100
}

Planet "RR Cae (AB) b"
{
	ParentBody     "V* RR Cae"
	DiscMethod     "TTV"
	DiscDate       "2012"
	Class          "GasGiant"
	MassJup        3.0
	Oblateness     0

	Orbit
	{
		PeriodDays      5479.0
		SemiMajorAxis   5.2
		Eccentricity    0
		Inclination     17.6
	}
}

Planet "RR Cae (AB) c"
{
	ParentBody     "V* RR Cae"
	DiscMethod     "TTV"
	DiscDate       "2021"
	Class          "GasGiant"
	MassJup        2.7
	Oblateness     0

	Orbit
	{
		PeriodDays      14244.75
		SemiMajorAxis   9.7
		Eccentricity    0
	}
}

// WD 1145+017
Remove "WD 1145+017 b" {ParentBody "WD 1145+017"}
DwarfPlanet "WD 1145+017 b/EPIC 201563164.01"
{
	ParentBody     "EPIC 201563164"
	DiscMethod     "Transit"
	DiscDate       "2015"
	Class          "Terra"
	MassKg         95554688000000000000
	Radius         200
	Oblateness     0

	CometTail{}

	Orbit
	{
		PeriodDays      0.187454
		SemiMajorAxis   0.0054
		Inclination     90
	}
}

// NN Serpentis
Remove "NN Ser A" {ParentBody "NN Ser"}
Remove "NN Ser B" {ParentBody "NN Ser"}
Remove "NN Ser c" {ParentBody "NN Ser"}
Remove "NN Ser d" {ParentBody "NN Ser"}
Star "NN Ser A"
{
	DateUpdated     "2024-08-12"
	ParentBody      "V* NN Ser"
	Class           "DAO1"
	AbsMagn         7.953257888947327 // Calculated
	MassSol         0.535
	Radius          14679.5
	LumBol          4.234202466567094 // Calculated
	Teff            57000

	BinaryOrbit     
	{
		PeriodDays      0.13008017141
		SemiMajorAxisKm 649783.8
		Eccentricity    0.0
		Inclination     89.6 
	}
}

Star "NN Ser B"
{
	DateUpdated     "2024-08-12"
	ParentBody      "V* NN Ser"
	Class           "M4V"
	MassSol         0.111
	Radius          103660
}

Planet "NN Ser c"
{
	ParentBody     "V* NN Ser"
	DiscMethod     "ETV"
	DiscDate       "2010"
	Class          "GasGiant"
	MassJup        6.91
	Oblateness     0

	Orbit
	{
		PeriodDays      5660
		SemiMajorAxis   5.38
		Eccentricity    0
	}
}

Planet "NN Ser d"
{
	ParentBody     "V* NN Ser"
	DiscMethod     "ETV"
	DiscDate       "2009"
	Class          "GasGiant"
	MassJup        2.28
	Oblateness     0

	Orbit
	{
		Epoch           2454515
		PeriodDays      2830
		SemiMajorAxis   3.39
		Eccentricity    0.2
		ArgOfPericenter 74
	}
}

Planet "NN Ser e"
{
	ParentBody     "V* NN Ser"
	DiscMethod     "TTV"
	DiscDate       "2023"
	Class          "GasGiant"
	MassJup        9.43
	Oblateness     0

	Orbit
	{
		PeriodDays      7371
		SemiMajorAxis   6.43
		Eccentricity    0.2
		Inclination     80 // ?
		ArgOfPericenter -89.56
	}
}

// Feige 55
Star "Feige 55 A"
{
	DateUpdated     "2024-08-12"
	ParentBody      "Feige 55"
	Class           "DAO0.9"
	AbsMagn         7.040367873005124 // Calculated
	MassSol         0.486
	Radius          19450
	LumBol          10.7
	Teff            56300

	AccretionDisk{Temperature 56300}

	BinaryOrbit     
	{
		PeriodDays      1.49303
		Epoch           2449793.678
	}
}

Star "Feige 55 B"
{
	DateUpdated     "2024-08-12"
	ParentBody      "Feige 55"
	Class           "M5.5V"
	MassSol         0.3
	RadSol          0.33
	LumBol          0.0079
	Teff            3000
}

// TMTS J052610.43+593445.1
// Reference:
// A seven-Earth-radius helium-burning star inside a 20.5-min detached binary[J].
// Nature Astronomy, 2024, 8(4):491-503.DOI:10.1038/s41550-023-02188-2.
// https://arxiv.org/abs/2312.13612
Star "ZTF J0526+5934 A"
{
	DateUpdated     "2024-08-13"
	ParentBody      "ZTF J0526+5934"
	Class           "sdB"
	MassSol         0.361
	Radius          45916
	LumBol          1.70
	Teff            25410

	BinaryOrbit     
	{
		PeriodDays      0.01424044625
		SemiMajorAxisKm 177403.5
		Inclination     68.2
		Epoch           2459933.175697
	}
}

Star "ZTF J0526+5934 B"
{
	DateUpdated     "2024-08-13"
	ParentBody      "ZTF J0526+5934"
	Class           "WD"
	MassSol          0.735
}

// EPIC 201702477
// Reference:
// Dragomir D .EPIC 201702477b: A TRANSITING BROWN DWARF FROM 
// K2 IN A 41 DAY ORBIT[J].The Astronomical Journal, 2017, 153(1):15 (10pp).
// DOI:10.3847/1538-3881/153/1/15.
Star "EPIC 201702477 A"
{
	DateUpdated     "2024-08-13"
	ParentBody      "EPIC 201702477"
	Class           ""
	AbsMagn         5.032427814687454 // Calculated
	MassSol         0.870
	RadSol          0.901
	LumBol          0.6775716024089933 // Calculated
	Teff            5517
	FeH             -0.164
	Age             8.8
}

Planet "EPIC 201702477 b/EPIC 201702477.01"
{
	ParentBody     "EPIC 201702477 A"
	DiscMethod     "TTV"
	DiscDate       "2015"
	Class          "GasGiant"
	MassJup        66.9
	Radius         54120
	LumBol         4.2696073315825484e-07 // Calculated
	Teff           529
	Oblateness     0

	Orbit
	{
		Epoch           2456811.5462
		PeriodDays      40.73691
		SemiMajorAxis   0.2265
		Eccentricity    0.2281
		Inclination     89.105
		ArgOfPericenter 195.9
	}
}

// BE Ursae Majoris
Star "BE UMa A"
{
	DateUpdated     "2024-08-13"
	ParentBody      "V* BE UMa"
	Class           "sdO"
	AbsMagn         4.622859561644251 // Calculated
	MassSol         0.59
	Radius          54250
	LumBol          665.895918366305 // Calculated
	Teff            105000
	FeH             1

	BinaryOrbit     
	{
		PeriodDays      2.2911658
		SemiMajorAxisKm 5217750
		Inclination     84
	}
}

Star "BE UMa B"
{
	DateUpdated     "2024-08-13"
	ParentBody      "V* BE UMa"
	Class           "M1/5e"
	MassSol         0.25
	RadSol          0.72
	LumBol          0.23775688909270332 // Calculated
	Teff            4750
	CtoO            0.6
}

// Epsilon Indi
Remove "EPS Ind A" {ParentBody "EPS Ind"}
Remove "EPS Ind A b" {ParentBody "EPS Ind A"}
Remove "EPS Ind B" {ParentBody "EPS Ind"}
Remove "EPS Ind Ba" {ParentBody "EPS Ind B"}
Remove "EPS Ind Bb" {ParentBody "EPS Ind B"}
Star "EPS Ind A/GJ 845 A/** SOZ 1A"
{
	DateUpdated     "2024-08-13"
	ParentBody      "GJ 845"
	Class           "K5V"
	AbsMagn         6.89
	MassSol         0.782
	RadSol          0.711
	LumBol          0.21
	Teff            4649
	FeH             -0.13
	RotationPeriod  857.568
	Age             3.5
}

Planet "EPS Ind Ab"
{
	ParentBody     "EPS Ind A"
	DiscMethod     "RadVel"
	DiscDate       "2018"
	Class          "GasGiant"
	MassJup        2.96
	Radius         77211.36
	Oblateness     0

	Orbit
	{
		Epoch           2443293.7
		PeriodDays      63407.4 // 15676.5
		SemiMajorAxis   28.4 // 11.08
		Eccentricity    0.40 // 0.42
		Inclination     103.7 // 98.73
		ArgOfPericenter 77.83
	}
}

Barycenter "EPS Ind B/GJ 845 C/GJ 845 B/Gaia DR3 6412596012146801152/TIC 231700016/V* CI Ind/2MASS J22041052-5646577/[B2006] J220410.5-564657/WDS J22034-5647Ba,Bb/WISEP J220415.66-564723.5/** VLK 1/WDS J22034-5647B/** SOZ 1B/WISE J220415.65-564723.6/Gaia DR2 6412596012146094848/WISEA J220415.75-564724.4/1WGA J2203.9-5647"
{
	ParentBody      "EPS Ind A"
	Orbit     
	{
		SemiMajorAxis   1500 // 11600
		ArgOfPericenter 89
		MeanAnomaly     0
	}
}

Star "EPS Ind Ba"
{
	DateUpdated     "2024-08-13"
	ParentBody      "Gaia DR3 6412596012146801152"
	Class           "T1V"
	MassJup         66.92
	Radius          55656
	LumBol          2.04E-5
	Teff            1352 // 1385

	BinaryOrbit // 2022AJ....163..288C
	{
		Period          11.0197
		Separation      2.4058
		Eccentricity    0.54042
		Inclination     77.082
		AscendingNode   147.959
		Epoch           2455233.479605787899345
		ArgOfPericenter 148.27
		MeanAnomaly     0
	}
}

Star "EPS Ind Bb"
{
	DateUpdated     "2024-08-13"
	ParentBody      "Gaia DR3 6412596012146801152"
	Class           "T6V"
	MassJup         53.25
	Radius          57050
	LumBol          5.97E-6
	Teff            976 // 1011
}

// LHS 6343
Remove "LHS 6343 AC" {ParentBody "LHS 6343"}
Remove "LHS 6343 B" {ParentBody "LHS 6343"}
Star "G 205-57A/Gaia DR3 2130469362695417856/** KOI 959A/WDS J19102+4657A/Gaia DR2 2130469362695417856/LHS 6343 A"
{
	DateUpdated     "2024-08-13"
	ParentBody      "G 205-57"
	Class           "M2.5"
	AbsMagn         11.118982974830267 // Calculated
	MassSol         0.358
	Radius          259495
	LumBol          0.017369628590929456 // Calculated
	Teff            3431
	FeH             0.04
	RotationPeriod  315.288

	BinaryOrbit     
	{
		Separation      20
	}
}

Star "G 205-57B/Gaia DR3 2130469362695417728/LHS 6343 B/** KOI 959B/WDS J19102+4657B/Gaia DR2 2130469362695417728"
{
	DateUpdated     "2024-08-13"
	ParentBody      "G 205-57"
	Class           "M3.6"
	MassSol         0.292
	Radius          274100
	LumBol          0.017697828232640052 // Calculated
	Teff            3354
	FeH             0.04
}

Star "G 205-57C/LHS 6343 C"
{
	DateUpdated     "2024-08-13"
	ParentBody      "G 205-57A"
	DiscMethod      "Transit"
	DiscDate        "2011"
	Class           "TP"
	MassJup         62.1
	Radius          55978
	LumBol          6.91E-6
	Teff            1130
	Age             5
	Oblateness      0

	Orbit
	{
		Epoch           2455008.07259
		PeriodDays      12.7137941
		SemiMajorAxis   0.0797
		Eccentricity    0.030
		Inclination     90.45
		ArgOfPericenter 320
	}
}

Planet "LHS 6343 Ab"
{
	DateUpdated     "2024-08-13"
	ParentBody      "G 205-57A"
	DiscMethod      "TTV"
	DiscDate        "2012"
	Class           "IceGiant" // GasGiant
	MassJup         0.1 // 1
	Oblateness      0

	Orbit
	{
		PeriodDays      44.45 // 101.6
	}
}

// Gliese 570
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=131976
Remove "Gliese 570 (ABC)" {ParentBody "Gliese 570"}
Remove "Gliese 570 A" {ParentBody "Gliese 570 (ABC)"}
Remove "Gliese 570 (BC)" {ParentBody "Gliese 570 (ABC)"}
Remove "Gliese 570 B" {ParentBody "Gliese 570 (BC)"}
Remove "Gliese 570 C" {ParentBody "Gliese 570 (BC)"}
Remove "Gliese 570 D" {ParentBody "Gliese 570"}
Star "HD 131977/GJ 570 A/HIP 73184/Gaia DR3 6232511606838403968/StKM 2-1093/TIC 287157634/PLX 3375/V* KX Lib/GSC 06180-00855/GSC 06180-01226/8pc 169.32A/ADS 9446 A/BD-20 4125/CCDM J14574-2124A/CSI-20 4125 1/Ci 20 900/FK5 1391/GC 20113/GCRV 8668/GEN# +1.00131977A/HIC 73184/HR 5568/IRAS 14545-2112/IRC -20275/JP11 2553/LAL 27173/LFT 1161/LHS 387/LPM 551/LTT 5949/N30 3376/NLTT 38872/PM 14545-2111/PMC 90-93 979/PPM 263609/SACS 325/SAO 183040/SKY# 27162/SPOCS 627/SRS 31391/TYC 6180-855-1/UBV 12988/VVO 266/YZ 111 6202/Zkh 214/[RHG95] 2367/uvby98 100131977 A/2MASS J14572788-2124526/WDS J14575-2125A/Gaia DR2 6232511606838403968/PMSC 14516-2058A/** HN 28A/MCC 726/UBV 12990/CSI-20 4123 2/UCAC4 343-073968/WEB 12542"
{
	DateUpdated     "2024-08-13"
	ParentBody      "ADS 9446"
	Class           "K4V"
	AbsMagn         6.89
	MassSol         0.802
	RadSol          0.739
	LumBol          0.22
	Luminosity      0.16
	Teff            4597
	FeH             0.06
	RotationPeriod  1159.2
}

Barycenter "HD 131976/HIP 73182/StKM 2-1092/TIC 287157635/SBC9 1475/BD-20 4123/8pc 163.63B/CSI-20 4123 1/Ci 20 899/GC 20111/GCRV 8667/GEN# +1.00131976/HIC 73182/JP11 2550/LFT 1160/LHS 386/LPM 550/LTT 5948/NLTT 38871/PPM 263608/SAO 183039/UBV 12989/UBV M 20455/VVO 267/YZ 111 6201/Zkh 215/[RHG95] 2368/uvby98 100131976/GSC 06180-01230/GSC 06180-01225/TYC 6180-1230-1/2MASS J14572643-2124384/UCAC2 23639754/** HN 28B/WDS J14575-2125Ba,Bb/PMSC 14516-2058Bab/PMSC 14516-2058B/WDS J14575-2125B/CCDM J14574-2124B/ADS 9446 B/8pc 163.63C/** HN 28Ba,Bb/DENIS J145726.4-212439/UCAC4 343-073964/PM J14574-2124W/WEB 12541/Gaia DR2 6232511675556408320"
{
	ParentBody      "ADS 9446"
	BinaryOrbit // VB6_Hle1994 H_N28AB Gr.5
	{
		Period          2130
		Separation      190
		Eccentricity    0.2
		Inclination     72.5
		AscendingNode   317.3
		Epoch           2337954.209577208850533
		ArgOfPericenter 252.1
		MeanAnomaly     0
	}
}

Star "GJ 570 Ba"
{
	DateUpdated     "2024-08-13"
	ParentBody      "HD 131976"
	Class           "M1V"
	AbsMagn         9.19
	MassSol         0.55
	RadSol          0.65
	LumBol          0.04
	Luminosity      0.003
	Teff            2700

	BinaryOrbit // SB9_1475 2000A&AS..145..215P
	{
		PeriodDays      307.8540
		Separation      0.883141082583451 // 0.150 asec
		Eccentricity    0.765
		Inclination     107.6
		AscendingNode   195.9
		Epoch           2446564.801
		ArgOfPericenter 311.5
		MeanAnomaly     0
	}
}

Star "GJ 570 Bb"
{
	DateUpdated     "2024-08-13"
	ParentBody      "HD 131976"
	Class           "M3V"
	AbsMagn         11.05
	MassSol         0.35
}

Planet "GJ 570 D/TIC 287157669/2MASS J14571496-2121477/2MASSW J1457150-212148/8pc 169.32D/WISEP J145715.85-212207.6/WISEP J145715.84-212207.5/WDS J14575-2125G/WISEA J145715.83-212208.0"
{
	DateUpdated     "2024-08-13"
	ParentBody      "ADS 9446"
	DiscMethod      "Imaging"
	DiscDate        "2000"
	Class           "T8" // GasGiant
	MassJup         42.5
	Radius          59350 // 66090
	Oblateness      0

	Orbit
	{
		Separation      1500
	}
}

Planet "HD 131977 b/GJ 570 Ab"
{
	DateUpdated     "2024-08-13"
	ParentBody      "GJ 570 A"
	DiscMethod      "RadVel"
	DiscDate        "1997"
	Class           "GasGiant"
	MassJup         62.841
	Oblateness      0

	Orbit
	{
		PeriodDays      33
	}
}

// EBLM J0555-57
Barycenter "CD-57 1311A/Gaia DR3 4765618612685018368/UCAC4 164-006717/WDS J05555-5717A/** RST 164A/TIC 734505581/Gaia DR2 4765618612685018368/TYC 8528-926-1"
{
	ParentBody      "EBLM J0555-57"
	BinaryOrbit     
	{
		Epoch           2450815
		Separation      479
		PositionAngle   254
	}
}

Star "EBLM J0555-57 Aa"
{
	DateUpdated     "2024-08-13"
	ParentBody      "CD-57 1311A"
	Parallax        4.8611
	AppMagn         10.03
	Class           "F8"
	AbsMagn         3.4636727762238566 // Calculated
	MassSol         1.13
	RadSol          0.99
	LumBol          3.245
	Teff            6461
	FeH             -0.24
	Age             1.9

	BinaryOrbit     
	{
		PeriodDays      7.757676
		Separation      0.0817
		Eccentricity    0.0894
		Inclination     89.84
		ArgOfPericenter 126.3
		MeanAnomaly     0
	}
}

Star "EBLM J0555-57 Ab"
{
	DateUpdated     "2024-08-13"
	ParentBody      "CD-57 1311A"
	Class           "M"
	MassJup         85.2
	Radius          60000
	Teff            1800 // Unknown
}

Star "CD-57 1311B/Gaia DR3 4765618681404494976/UCAC4 164-006716/Gaia DR2 4765618681404494976/TIC 734505586/WDS J05555-5717B/** RST 164B/TYC 8528-926-2"
{
	DateUpdated     "2024-08-13"
	ParentBody      "EBLM J0555-57"
	Parallax        4.8747
	AppMagn         10.98
	Class           "G0V"
	AbsMagn         4.419739466989592 // Calculated
	MassSol         1.01
	RadSol          0.94
	LumBol          1.501
	Teff            5717
	FeH             -0.38
}

// Luhman 16
Remove "Luhman 16 A" {ParentBody "Luhman 16"}
Remove "Luhman 16 B" {ParentBody "Luhman 16"}
Star "Luhman 16A/WISE J1049-5319A/** LUH 16A/WDS J10493-5319A/Gaia DR2 5353626573555863424"
{
	DateUpdated     "2024-08-14"
	ParentBody      "** LUH 16"
	Class           "L7.5"
	AbsMagn         19.677408382450984 // Calculated
	MassJup         35.4
	Radius          60768
	LumBol          0.0000219
	Teff            1350
	RotationPeriod  6.94

	BinaryOrbit     
	{
		Period          26.55
		Separation      3.52
		Eccentricity    0.344
		Inclination     79.92
		AscendingNode   130.02
		Epoch           2458140.807508084923029
		ArgOfPericenter 316.67
		MeanAnomaly     0
	}
}

Star "Luhman 16B/WISE J1049-5319B/** LUH 16B/WDS J10493-5319B/Gaia DR2 5353626573562355584"
{
	DateUpdated     "2024-08-14"
	ParentBody      "** LUH 16"
	Class           "T0.5"
	MassJup         29.4
	Radius          74350
	LumBol          0.0000209
	Teff            1210
	RotationPeriod  5.28

	Surface
	{
		DiffMap         "Luhman16B-VLT"
		DayAmbient      0
		RingsWinter     0 
		GlowMap         "Luhman16B-VLT"
		GlowMode        "Permanent"
		GlowColor       (1.0, 1.0, 1.0)
		GlowBright      2.0
	}

	NoClouds        true
}

// 2MASS 0939-2448
Star "2MASS J09393548-2448279 A"
{
	DateUpdated     "2024-08-14"
	ParentBody      "2MASS J09393548-2448279"
	Class           "T8"
	MassJup         20 // 50
	Radius          87220
	LumBol          0.000002
	Teff            611
	FeH             -0.3 // 0
	Age             2 // 10

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0125484269
		SemiMajorAxis   0.0223335542
		Eccentricity    0
		Inclination     -1.97912025
		AscendingNode   0
		ArgOfPericenter 90.6103308
		MeanAnomaly     -175.033391
	}
}

Star "2MASS J09393548-2448279 B"
{
	DateUpdated     "2024-08-14"
	ParentBody      "2MASS J09393548-2448279"
	Class           ""
	MassJup         20 // 50
	Radius          62600
	LumBol          9.453733153862217e-07 // Calculated
	Teff            600 // 700
	FeH             -0.3 // 0
	Age             2 // 10
}

// WISE 0855-0714
Remove "WISE 0855-0714 b" {ParentBody "WISE 0855-0714"}
Planet "WISEA J085510.74-071442.5 A"
{
	DateUpdated     "2024-08-14"
	ParentBody      "WISEA J085510.74-071442.5"
	DiscMethod      "Imaging"
	DiscDate        "2014"
	Class           "GasGiant"
	MassJup         3 // 10
	Radius          63500
	LumBol          4.9545E-8
	Teff            285
	FeH             0
	Age             1 // 10
	Oblateness      0
}

// 2MASS J0348−6022
Remove "2MASS J03480772-6022270" {ParentBody "2MASS 03480-60222"}
Star "2MASS J03480772-6022270 A"
{
	DateUpdated     "2024-08-14"
	ParentBody      "2MASS J03480772-6022270"
	Class           "T7"
	MassSol         0.041
	Radius          64700
	LumBol          4.672926192170577e-06 // Calculated
	Teff            880
	Age             3.5
	RotationPeriod  1.080
	Oblateness      0.08
	Obliquity       81
}

// SDSS J1416+1348
Remove "SDSS J141624.08+134826.7"{ParentBody "2MASS J14162408+1348263"}
Remove "2MASS J14162408+1348263A"{ParentBody "2MASS J14162408+1348263"}
Star "2MASS J14162408+1348263/SDSS J141624.12+134827.4/Gaia DR3 1227133699053734528/TIC 310417889/SDSS J141624.08+134826.7/WDS J14164+1348A/[BLL2010] SDSS J1416+13A/** SOZ 3A/WISEA J141624.14+134827.6/SDSS J141624.09+134826.7/Gaia DR2 1227133699053734528"
{
	DateUpdated     "2024-08-14"
	ParentBody      "WDS J14164+1348"
	Class           "sdL7"
	MassJup         60
	Radius          65772.5
	LumBol          6.6069344800759600650964628363505e-5 // log(L) = -4.18
	Teff            1694
	Age             0.5 // 10

	BinaryOrbit     
	{
		Separation      89.3 // 105
	}
}

Star "ULAS J141623.94+134836.3/WISEA J141623.96+134836.0/WDS J14164+1348B/[BLL2010] SDSS J1416+13B/** SOZ 3B/WISE J141623.93+134836.0"
{
	DateUpdated     "2024-08-14"
	ParentBody      "WDS J14164+1348"
	Class           "T7.5p"
	MassJup         33
	Radius          67200
	LumBol          1.5848931924611134852021013733915e-6 // log(l) = -5.80
	Teff            660
	Age             0.5 // 10
}
