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

// 海山二(LBV**)
// SpaceEngineer; wiki
Remove "ETA Car A" {ParentBody "ETA Car"}
Remove "ETA Car B" {ParentBody "ETA Car"}
/* Star	"HD 93308 A"
{
	ParentBody "V* ETA Car"
	Class      "Variable" // LBV
	MassSol    100 // >90 // 100 - 120
	RadSol     240 // 60 - 881 // 1400??? // 250
  LumBol     4600429.4353008345 // MBol = -11.917
	Teff       35200 // 9400 - 35200 // 20000 - 25000
	Age        0.003
  Oblateness 0

	// powerful star wind imitation
	Corona
	{
		Radius      2E+10
		Brightness  12
		RayDensity  17.244
		RayCurv     45
	}

	Orbit
	{
		PeriodDays      2022.7
		//Separation      2.2 // 15.4 AU mutual
		Eccentricity    0.9
		Inclination     130 // 130 - 145
		AscendingNode   0	// unknown
    Epoch           2454842.67045309
		ArgOfPericenter 0	// unknown
		MeanAnomaly     0	// unknown
	}
}

Star	"HD 93308 B"
{
	ParentBody "V* ETA Car"
	Class      "O" // WR?
	MassSol    30	// 30 - 80 // 30 - 60
	RadSol     23.6	// 14.3 - 23.6
	Teff       37200
	Luminosity 1000000
	Age        0.003
	Oblateness 0

	// powerful star wind imitation
	Corona
	{
		Period      0.020234
		Brightness  0.91603
		RayDensity  12.133
		RayCurv     3.0263
	}

	Orbit
	{
		PeriodDays      2022.7
		//Separation      13.2 // 15.4 AU mutual
		Eccentricity    0.9
		Inclination     130 // 130 - 145
		AscendingNode   0	// unknown
    Epoch           2454842.67045309
		ArgOfPericenter 180	// unknown
		MeanAnomaly     0	// unknown
	}
} */
