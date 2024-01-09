// SK 183 binary version derivated from composite model fit.
// Orbit data is procedural generated where real data is still completely unknown.
Star	"SK 183 A"
{
	ParentBody     "SK 183"
	Class          "O3V((f*))z"
    AbsMagn        -5.14 // Combined
    MassSol        40 // Spec
	RadSol         9.6
	LumBol         371535.22909717253861655841353555 // log(L) = 5.57
	Teff           47500
    Oblateness     0

	BinaryOrbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   31.2124823
		Eccentricity    0.743731467
		Inclination     -2.02682924
		AscendingNode   0
		ArgOfPericenter -101.644516
		MeanAnomaly     -57.0142152
	}
}

Star	"SK 183 B"
{
	ParentBody     "SK 183"
	Class          "B" // OB
    MassSol        8.7 // Spec
	RadSol         8.5
	LumBol         12589.254117941672104239541063958 // log(L) = 4.1
	Teff           21000
    Oblateness     0
}

// AB8
// A Wolf-Rayet star and a main sequence companion of spectral type O orbit in a period of 16.638 days.
Star	"AB8 A"
{
	ParentBody     "SMC AB 8"
	Class          "WO4"
	AbsMagn         -4.9
	MassSol         19
	RadSol          2
	LumBol          1400000
	Teff            141000

	Orbit
	{
		PeriodDays      16.638
		Eccentricity    0.10
		Inclination     40
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"AB8 B"
{
	ParentBody     "SMC AB 8"
	Class          "O4V"
	AbsMagn         -5.9
	MassSol         61
	RadSol          14
	LumBol          708000
	Teff            45000
	Age             0.003

	Orbit
	{
		PeriodDays      16.638
		Eccentricity    0.10
		Inclination     40
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}