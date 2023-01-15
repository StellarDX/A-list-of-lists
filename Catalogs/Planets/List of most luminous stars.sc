// Godzilla Star, maybe a Intermediate mass blackhole
// Reference: J.M. Diego, M. Pascale, B.J. Kavanagh, P. Kelly, L. Dai, B. Frye, T. Broadhurst
// "Godzilla, a monster lurks in the Sunburst galaxy." (ESO 2022)
// https://arxiv.org/abs/2203.08158
Star	"Godzilla Star"
{
	ParentBody "Godzilla Star in PSZ1 G311.65-18.48"
	AbsMagn    -20.671903121758078 // Calculated from AppMagn and Dist, But its bolometric mag is only -14, WHY???
	// IMBH profile
	Class      "X"
	MassSol    1E+6 // 1E+5 - 1E+7
	KerrSpin   0
	KerrCharge 0 // Schwarzschild-BH assumption
	AccretionDisk
	{
		InnerRadiusKm     2.9828e+06
		OuterRadiusKm     152580670.7
		Luminosity        1.5877E10 // Calculated from Absolute Mag.
		LuminosityBol     3.38E+10
	}
	// Hyperluminous star profile
	/* Class      "B5 0" // Estimated.
	Radius     398968194.74062126874923706054688 // Calculated
	LumBol     15000000 // Lower limit
	Teff       15000 // Miniimum Value
	Oblateness (0, 0, 0) */
}

Remove "R136a1"{ParentBody "R136a1 system"}

// M33-013406.63, also called LGGS J013406.63+304147.8,
// was thought of as a star with over 8 million luminosity in the past,
// but a new reference indicated that M33-013406.63 may be a binary,
// the primary will be reduced to about 4.5 million luminosity.
Star	"M33-013406.63 A"
{
	AbsMagn        -9.1 // Combined
	ParentBody     "LGGS J013406.63+304147.8"
	Class          "O9.5Ia"
	RadSol         113.37
	LumBol         4677333.896230401 // MBol = -11.935
	Teff           30000
	Oblateness     (0, 0, 0)

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0571737903
		Eccentricity    0
		Inclination     0.576635361
		AscendingNode   0
		ArgOfPericenter 27.7919021
		MeanAnomaly     156.935764
	}
}

Star	"M33-013406.63 B"
{
	ParentBody     "LGGS J013406.63+304147.8"
	Class          "O"
	LumBol         4322666.103769599 // Total = 9e6

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0571737903
		Eccentricity    0
		Inclination     0.576635361
		AscendingNode   0
		ArgOfPericenter 207.791902
		MeanAnomaly     156.935764
	}
}
