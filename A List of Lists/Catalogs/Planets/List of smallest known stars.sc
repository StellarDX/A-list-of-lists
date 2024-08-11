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