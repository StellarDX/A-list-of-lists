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
// 
Remove "PSR J1906+0746 A" {ParentBody "PSR J1906+0746"}
Remove "PSR J1906+0746 B" {ParentBody "PSR J1906+0746"}
Star "PSR J1906+0746 A"
{
	DateUpdated     "2024-08-09"
	ParentBody      "PSR J1906+0749"
	Class           "Q"
	MassSol         1.291
	Radius          11.99 // 12.85
	LumBol          2.508927072398826e-09 // Calculated
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
		PeriodDays      0.16599304686 // 0.16599304686 - 5.6498E-11 * t (days)
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