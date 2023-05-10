// C
Star	"HD 97950 C1"
{
	ParentBody     "HD 97950C"
	Class          "WN6h"
    MassSol        113
	RadSol         26.2
    AbsMagn        -7.17
	LumBol         2238918.9571370427 // MBol = -11.135
	Teff           44000
    Age            0.0015

	Orbit
	{
		PeriodDays      8.89
		Eccentricity    0.30
		Inclination     71
		Epoch           2453546.61
		ArgOfPericenter 101
		MeanAnomaly     0
	}
}

Star	"HD 97950 C2"
{
	ParentBody     "HD 97950C"
	Class          "WN6h" // ?

	Orbit
	{
		PeriodDays      8.89
		Eccentricity    0.30
		Inclination     71
		Epoch           2453546.61
		ArgOfPericenter 281
		MeanAnomaly     0
	}
}

// A1
Remove "NGC 3603-A1 A"{ParentBody "NGC 3603-A1"}
Remove "NGC 3603-A1 B"{ParentBody "NGC 3603-A1"}

Star	"HD 97950 A1a"
{
	ParentBody     "Cl* NGC 3603 BLW A1"
	Class          "WN6h"
    MassSol        120
	RadSol         29
    AbsMagn        -8.13
	LumBol         2454699.722820848 // MBol = -11.235
	Teff           42000
    Age            0.0015

	Orbit
	{
		PeriodDays      3.7724
		Eccentricity    0
		Inclination     71
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HD 97950 A1b"
{
	ParentBody     "Cl* NGC 3603 BLW A1"
	Class          "WN6h"
	MassSol        92
	RadSol         26
    AbsMagn        -8.13
	LumBol         1513555.5801621038 // MBol = -10.71
	Teff           40000
    Age            0.0015

	Orbit
	{
		PeriodDays      3.7724
		Eccentricity    0
		Inclination     71
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 33
Star	"Cl* NGC 3603 MDS 33 A"
{
	ParentBody     "Cl* NGC 3603 MDS 33"
	Class          "O5V"
	AbsMagn        -5.8
}

Star	"Cl* NGC 3603 MDS 33 B"
{
	ParentBody     "Cl* NGC 3603 MDS 33"
	Class          "OB?"
	AbsMagn        -5 // Limit

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          2.39720845
		Eccentricity    0.284536882
		Inclination     2.10501826
		AscendingNode   0
		ArgOfPericenter 206.439905
		MeanAnomaly     -112.749606
	}
}

// 37
Star	"Cl* NGC 3603 MDS 37 A"
{
	ParentBody     "Cl* NGC 3603 MDS 37"
	Class          "O6.5V"
	AbsMagn        -5

	Orbit
	{
		RefPlane        "Equator"
		Period          0.048935442
		SemiMajorAxis   0.288860462
		Eccentricity    0.470263108
		Inclination     0.998175144
		AscendingNode   0
		ArgOfPericenter 176.692924
		MeanAnomaly     146.939164
	}
}

Star	"Cl* NGC 3603 MDS 37 B"
{
	ParentBody     "Cl* NGC 3603 MDS 37"
	Class          "O"
	AbsMagn        -4.5 // Limit

	BinaryOrbit  // Generated
	{
		RefPlane        "Equator"
		Period          0.048935442
		SemiMajorAxis   0.288860462
		Eccentricity    0.470263108
		Inclination     0.998175144
		AscendingNode   0
		ArgOfPericenter 176.692924
		MeanAnomaly     146.939164
	}
}

