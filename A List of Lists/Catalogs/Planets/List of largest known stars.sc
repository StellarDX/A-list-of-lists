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
	AbsMagn        -5.6254187600320744
	RadSol         1157
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