// WR 93
Star	"WR 93 A"
{
	ParentBody     "WR 93"
	Class          "WC7"
	MassSol         120
	RadSol          10
    AbsMagn         -6.5 // ?
    LumBol          2376831.385378052
	Teff            71000

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0288684479
		Eccentricity    0
		Inclination     1.45148635
		AscendingNode   0
		ArgOfPericenter 31.79825
		MeanAnomaly     -64.6075446
	}
}

Star	"WR 93 B"
{
	ParentBody     "WR 93"
	Class          "O7-9"

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0288684479
		Eccentricity    0
		Inclination     1.45148635
		AscendingNode   0
		ArgOfPericenter 211.79825
		MeanAnomaly     -64.6075446
	}
}

// PISMIS 24-1NE
Star	"PISMIS 24-1NE A"
{
	ParentBody     "CL PISMIS 24-1NE"
	Class          "O3.5If*"
	MassSol        74
	RadSol         18
    AbsMagn        -6.41
    LumBol         776247.11662869173389370097799424 // log(L) = 5.89
	Teff           42500
    Oblateness     0

	Orbit // Eclipsing binary
	{
		PeriodDays      2.36088
		Inclination     90
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"PISMIS 24-1NE B"
{
	ParentBody     "CL PISMIS 24-1NE"
	Class          ""
    Teff           41500
    Oblateness     0

	Orbit // Eclipsing binary
	{
		PeriodDays      2.36088
		Inclination     90
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}