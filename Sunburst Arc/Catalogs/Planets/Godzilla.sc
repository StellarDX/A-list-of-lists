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
	LumBol     134000000 // Lower limit
	Teff       15000 // Miniimum Value
	Oblateness (0, 0, 0) */
}
