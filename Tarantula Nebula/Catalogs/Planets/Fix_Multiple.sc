// VFTS 1022
Star	"VFTS 1022 A"
{
	ParentBody "VFTS 1022"
	Class      "WN?"
	AbsMagn    -7.05 // Calculated (Extinction +2)
	Radius     22617752.588087532669305801391602 // Calculated
	LumBol     3019940.410708304 // MBol = -11.46
	Teff       42200
	Oblateness 0
}

// Melnick 34, High Mass X-ray Binary
Star	"Melnick 34 A"
{
	ParentBody "Brey 84"
	Class      "WN5h"
	MassSol    148
	RadSol     19.3
	AbsMagn    -7.42
	LumBol     2691524.724151786 // MBol = -11.335
	Teff       53000
	Age        0.005

	Orbit
	{
		PeriodDays      154.55
		Eccentricity    0.68
		Inclination     50
		Epoch           2457671.2
		ArgOfPericenter 200.9
		MeanAnomaly     0
	}
}

Star	"Melnick 34 B"
{
	ParentBody "Brey 84"
	Class      "WN5h"
	MassSol    135
	RadSol     18.2
	LumBol     2344220.0362027865 // MBol = -11.185
	Teff       53000
	Age        0.006

	Orbit
	{
		PeriodDays      154.55
		Eccentricity    0.68
		Inclination     50
		Epoch           2457671.2
		ArgOfPericenter 20.9
		MeanAnomaly     0
	}
}

// R145
Star	"RMC 145 A"
{
	ParentBody     "RMC 145"
	Class          "WN6h"
    AbsMagn        -7.21
	MassSol        53
	RadSol         20
    LumBol         2240000
	Teff           50000

	Orbit
	{
		PeriodDays      158.760
		Eccentricity    0.788
		Inclination     39
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"RMC 145 B"
{
	ParentBody     "RMC 145"
	Class          "O3.5If*/WN7"
    AbsMagn        -7.43
	MassSol        54
	RadSol         26
    LumBol         2140000
	Teff           43000
	Age            0.0022

	Orbit
	{
		PeriodDays      158.760
		Eccentricity    0.788
		Inclination     39
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// HD 38282
Star	"HD 38282 A"
{
	ParentBody     "HD 38282"
	Class          "WN5/6h"
    AbsMagn        -9.38
	MassSol        80 // 170
	Radius         21324489.10777233 // Calculated
    LumBol         4130459.5513075157 // MBol = -11.8
	Teff           47000
	Age            0.002

	BinaryOrbit // Generated, no orbit solutions is found
	{
		RefPlane        "Equator"
		Period          0.11641982
		Eccentricity    0
		Inclination     2.06236768
		AscendingNode   0
		ArgOfPericenter 164.451197
		MeanAnomaly     77.2439221
	}
}

Star	"HD 38282 B"
{
	ParentBody     "HD 38282"
	Class          "WN6/7h"
	MassSol        90 // 205
}