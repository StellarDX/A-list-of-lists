// WOH G64 (Possibly binary)
Star	"WOH G 64 A"
{
	ParentBody     "WOH G 64"
	Class          "M5I" // M7.5(I)e
	AbsMagn        -6
	MassSol        25
	RadSol         1540
	LumBol         282000
	Teff           3400
	Age            0.005
	Oblateness     0

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          103.201101
		Eccentricity    0.303213546
		Inclination     -1.08109522
		AscendingNode   0
		ArgOfPericenter 169.904039
		MeanAnomaly     160.292915
	}
}

Star	"WOH G 64 B(?)"
{
	ParentBody     "WOH G 64"
	Class          "O" // lateO?
	LumBol         100000
}

// WY Velorum (Symbiotic Star)
Star	"WY Vel A"
{
	ParentBody     "V* WY Vel"
	Class          "M3Ibep:"
	AbsMagn        -4.390633494965295
	RadSol         1156.6938326170307
	LumBol         190260.49649615175 // MBol = -8.45837563040467
	Teff           3550
	Oblateness     0

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          3.22582072
		Eccentricity    0
		Inclination     -0.900334358
		AscendingNode   0
		ArgOfPericenter 130.798368
		MeanAnomaly     114.206447
	}
}

Star	"WY Vel B"
{
	ParentBody     "V* WY Vel"
	Class          "B"
}

// HD 143183 (Possibly binary)
Star	"HD 143183 A"
{
	ParentBody     "HD 143183"
	Class          "M3Ia"
	AbsMagn        -7.5
	MassSol        20
	RadSol         1147.23
	LumBol         167000
	Teff           3443 // 3605
	Oblateness     0

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          26.7951519
		Eccentricity    0
		Inclination     1.0420053
		AscendingNode   0
		ArgOfPericenter -77.001614
		MeanAnomaly     -130.071583
	}
}

Star	"HD 143183 B(?)"
{
	ParentBody     "HD 143183"
	Class          "OB+"
}

// LL Pegasi
Star	"LL Peg A"
{
	ParentBody     "V* LL Peg"
	Class          "C"
	MassSol        2 // Guess
	RadSol         1074
	LumBol         10900
	Teff           1800
	Oblateness     0

	BinaryOrbit
	{
		Separation      109
	}
}

// Companion reference:
// Morris, Mark; Sahai, Raghvendra; Matthews, Keith; 
// Cheng, Judy; Lu, Jessica; Claussen, Mark; 
// Sanchez-Contreras, Carmen (2006). "A Binary-Induced 
// Pinwheel Outflow from the Extreme Carbon Star, AFGL 
// 3068"
// The original paper mentioned that this companion is
// much bluer than primary and its mass is assumed to
// 1 - 2 solar. This system is surrounded a pre-planetary
// nebula so that this companion maybe a white dwarf or
// a OB subdwarf.
Star	"LL Peg B"
{
	ParentBody     "V* LL Peg"
	Class          "WD?"
	MassSol        1 // Guess
}

// V766 Centauri, Contact binary
Barycenter	"V766 Cen A"
{
	ParentBody     "V* V766 Cen"
	BinaryOrbit
	{
		Separation      35000
	}
}

Star	"V766 Cen Aa"
{
	ParentBody     "V766 Cen A"
	Class          "K0Ia+"
	AbsMagn        -5.780456295278407 // Calculated (+1)
	MassSol        27 // 36
	RadSol         1060 // 1160
	LumBol         200000 // 251000
	Teff           4287 // 3855 - 5012
	Age            0.0035
	Oblateness     0

	Orbit
	{
		PeriodDays      1304
		Eccentricity    0
		Inclination     60
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"V766 Cen Ab"
{
	ParentBody     "V766 Cen A"
	Class          "GI"
	MassSol        5
	RadSol         650 // 312 - 401
	LumBol         202062.32278181714 // Calculated
	Teff           4800 // 5200

	Orbit
	{
		PeriodDays      1304
		Eccentricity    0
		Inclination     60
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"V766 Cen B"
{
	ParentBody     "V* V766 Cen"
	Class          "B0Ibp"
	Radius         13714767.81565264 // Calculated
	LumBol         160000
	Teff           26000
	Age            0.004
}

// VV Cephei
Remove "VV Cep A" {ParentBody "VV Cep"}
Remove "VV Cep B" {ParentBody "VV Cep"}
Star	"VV Cep A"
{
	ParentBody     "V* VV Cep"
	Class          "M2Iab"
	AbsMagn        -6.93
	MassSol        18.2 // 2.5
	RadSol         779.27 // 1050
	LumBol         72881
	Teff           3396
	FeH            -0.06
	Oblateness     0

	Orbit
	{
		PeriodDays      7430.5
		Eccentricity    0.346
		Inclination     84
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"VV Cep B"
{
	ParentBody     "V* VV Cep"
	Class          "B0-2V"
	MassSol        18.6 // 8
	RadSol         25 // 13
	FeH            -0.14
	Age            0.025
	Oblateness     0

	Orbit
	{
		PeriodDays      7430.5
		Eccentricity    0.346
		Inclination     84
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// RW Leonis Minoris
Star	"CIT 6 A"
{
	ParentBody     "CIT 6"
	Class          "C4.3"
	AbsMagn        -3.656808469171363 // Calculated (+9)
	MassSol        1
	// 2009 Data
	/*RadSol         575
	LumBol         10000
	Teff           2445*/
	// 2014 Data
	RadSol         1028
	LumBol         10000
	Teff           1800
	Oblateness     0

	BinaryOrbit
	{
		// Reference: https://arxiv.org/abs/1510.03916
		PericenterDist  20
		Eccentricity    0.6
	}
}

Star	"CIT 6 B"
{
	ParentBody     "CIT 6"
	Class          "WD?" // Guess
	MassSol        1 // 2
}

// U Lacertae
Star	"U Lac A"
{
	ParentBody     "V* U Lac"
	Class          "M4Iabep"
	AbsMagn        -5.6
	MassSol        22
	RadSol         1013
	LumBol         152000
	Teff           3535
	Oblateness     0

	BinaryOrbit // Generated (Real orbit is unknown)
	{
		RefPlane        "Equator"
		Period          2327.87094
		Eccentricity    0.29980137
		Inclination     0.196240425
		AscendingNode   0
		ArgOfPericenter -4.81313129
		MeanAnomaly     5.98997924
	}
}

Star	"U Lac B"
{
	ParentBody     "V* U Lac"
	Class          "B" // Guess
}

// V381 Cephei
Barycenter	"HD 203338/DO 39440/JP11 3337/V* V381 Cep/** BAG 9/GC 29860/2MASS J21191567+5837246/WDS J21193+5837A/** STF 2790A/GCRV 13414/PLX 5140.00/WDS J21193+5837Aa,Ab/ADS 14864 A/HIC 105259/PPM 39339/WEB 19118/AG+58 1339/HIP 105259/RAFGL 2748/YZ 58 12073/BD+58 2249/HR 8164/SAO 33318/[KW97] 57-18/BD+58 2249p/IDS 21165+5812 A/SKY# 40598/Gaia DR2 2191213153886504704/CCDM J21193+5838A/IRAS 21178+5824/TIC 314919220/Gaia DR3 2191213153886504704/CSI+58 2249 1/IRC +60313/TYC 3965-453-1"
{
	ParentBody     "CCDM J21193+5838"
	BinaryOrbit
	{
		Separation      2885.4 // 4.58"
	}
}

Star	"HD 203338 A"
{
	ParentBody     "HD 203338"
	Class          "M1Ibep"
	AbsMagn        -5.2
	MassSol        7.2 // 16
	RadSol         977
	LumBol         178000
	Teff           3745
	Oblateness     0

	Orbit
	{
		Period          280
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 203338 B"
{
	ParentBody     "HD 203338"
	Class          "B1-2Vep?"
	MassSol        13

	Orbit
	{
		Period          280
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HD 203339/CSI+58 2249 4/PMSC 21165+5814B/WDS J21193+5837B/** STF 2790B/GEN# +1.00203339/TD1 27980/Gaia DR2 2191213153886823552/ADS 14864 B/HGAM 990/TYC 3965-1805-1/Gaia DR3 2191213153886823552/CCDM J21193+5838B/IDS 21165+5812 B/UCAC4 744-068006/CEL 5296/PLX 5140/uvby98 100203339"
{
	ParentBody     "CCDM J21193+5838"
	Class          "B2.5V"
	MassSol        7.1
	RadSol         3.4
	LumBol         1487
	Teff           19965
	FeH            -0.3
	Age            0.0491
}

// μ Cephei
Star	"The Garnet Star"
{
	DateUpdated    "2020-03-16"
	ParentBody     "MU Cep"
	Class	       "M2Iae"
	MassSol        19.2
	RadSol         972 // 1259 // 1420
	Luminosity     269000 // 135000 /// 340000
	Teff           3551 // 3750 // 3700
	Age            0.01
	Oblateness     0

	Orbit
	{
		RefPlane        "Static"
	}
}

// TYC 3996-552-2
Star	"TYC 3996-552-1/** TDT 3675A/WDS J22432+5945A"
{
	ParentBody     "** TDT 3675"
	Class	       "MIII?"

	BinaryOrbit
	{
		Separation      2798.18 // 0.83"
	}
}

Star	"TYC 3996-552-2/** TDT 3675B/WDS J22432+5945B"
{
	ParentBody     "** TDT 3675"
	Class	       "M5Ib"
	AbsMagn        -3.962664774482631
	RadSol         870.829689454698
	Luminosity     96192.49915042444 // MBol = -7.71785708649249
	Teff           3450
	Oblateness     0
}

// V509 Cassiopeiae
Star	"V509 Cas A"
{
	ParentBody     "V* V509 Cas"
	Class          "G0Ia+"
	AbsMagn        -8.6
	MassSol        11
	RadSol         845 // 390 - 910
	LumBol         269000 // 180000 - 400000
	Teff           4000 // 8000
	FeH            0
	Oblateness     0

	BinaryOrbit
	{
		Separation      1400
	}
}

Star	"V509 Cas B"
{
	ParentBody     "V* V509 Cas"
	Class          "B1V"
	AbsMagn        -4.5
}