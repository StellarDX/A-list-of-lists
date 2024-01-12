Star	"DMS NGC 604 2a/[BMS2003] 867A/[DMS93] NGC 604 84/[LJ2009] Shell-1 1"
{
	RA             01 33 33.76
	Dec            +30 41 34.0
	AbsMagn        -8.38
	ParentBody     "DMS NGC 604 2"
	Class          "O4Iab"
	Radius         28730463.85913499 // Calculated
	LumBol         4965904.617162825 // MBol = -12
	Teff           42400

	BinaryOrbit
	{
		Separation      447173 // Maybe no physically bond?
		PositionAngle   90
	}
}

Star	"DMS NGC 604 2b/[BMS2003] 867B/[DMS93] NGC 604 81/[LJ2009] Shell-1 2"
{
	RA             01 33 33.72
	Dec            +30 41 34.0
	ParentBody     "DMS NGC 604 2"
	Class          "O4Ia"
	Radius         27060925.01219472 // Calculated
	LumBol         4405532.136323064 // MBol = -11.87
	Teff           42400
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

// Sk -69° 249
Star	"TYC 9167-759-1/HD 269927 A/[ST92] 5-65/Gaia DR2 4657650041187537152/** TDS 3273A/WDS J05390-6929A/Gaia DR3 4657650041187537152"
{
	ParentBody     "Sk -69 249"
	Class          "O7If"
	AbsMagn        -7.812677462810008 // Calculated, Combine
	Radius         31129715.266928628087043762207031 // Calculated
	LumBol         4130459.5513075157 // MBol = -11.8
	Teff           38900

	BinaryOrbit
	{
		Separation      90909.1
	}
}

Star	"TYC 9167-759-2/HD 269927 B/[ST92] 5-66/Gaia DR2 4657650041187537920/** TDS 3273B/WDS J05390-6929B/Gaia DR3 4657650041187537920"
{
	ParentBody     "Sk -69 249"
	Class          "B0I"
}

// V1429 Aql, Eclipsing binary
Star	"V1429 Aql A"
{
	ParentBody "V* V1429 Aql"
	Class      "B3Ibe"
	MassSol    39.66
	RadSol     86.80
	AbsMagn    -8.2 // Combined
	LumBol     3801879.7251447947 // MBol = -11.71
	Teff       30000 // 18000

	Orbit
	{
		PeriodDays      60.737
		Eccentricity    0.244
		Epoch           2449546.01
		ArgOfPericenter 38.7
		MeanAnomaly     0
	}
}

Star	"V1429 Aql B"
{
	ParentBody "V* V1429 Aql"
	Class      "F7II?"
	MassSol    26.26
	RadSol     20.41
	Teff       6227
	Age        0.006

	Orbit
	{
		PeriodDays      60.737
		Eccentricity    0.244
		Epoch           2449546.01
		ArgOfPericenter 218.7
		MeanAnomaly     0
	}
}

// [BMS2003] 578 C, triple system
// the three stars are sharing a single position
// but no orbit soluution just now.
Barycenter	"[BMS2003] 578AB"
{
	ParentBody     "DMS NGC 604 4"
	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          1.12357477
		Eccentricity    0.157848738
		Inclination     -1.88309956
		AscendingNode   0
		ArgOfPericenter 46.3182239
		MeanAnomaly     -148.591712
	}
}

Star	"DMS NGC 604 4a/[BMS2003] 578A/[DMS93] NGC 604 202"
{
	ParentBody     "[BMS2003] 578AB"
	Class          "O9II"

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.00374786801
		Eccentricity    0
		Inclination     0.171998978
		AscendingNode   0
		ArgOfPericenter -13.0252499
		MeanAnomaly     53.8568192
	}
}

Star	"[BMS2003] 578B/[DMS93] NGC 604 200"
{
	ParentBody     "[BMS2003] 578AB"
	Class          "O9Ia"
}

Star	"DMS NGC 604 4b/[BMS2003] 578C/[DMS93] NGC 604 196"
{
	ParentBody     "DMS NGC 604 4"
	Class          "O9II"
	AbsMagn        -8.7 // Calculated
	Radius         32071296.50311733 // Calculated
	LumBol         2558576.3050230816 // MBol = -11.28
	Teff           34000
}

// BAT99 80
Star	"BAT99 80 A"
{
	ParentBody     "BAT99 80"
	Class          "O4If"
	AbsMagn         -5.492677462810008 // Calculateed
	Radius          18140502.9349952 // Calculated
	LumBol          2511877.0245160875 // MBol = -11.26
	Teff            45000

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0408066658
		Eccentricity    0
		Inclination     2.20503616
		AscendingNode   0
		ArgOfPericenter 345.856334
		MeanAnomaly     99.9347206
	}
}

Star	"BAT99 80 B"
{
	ParentBody     "BAT99 80"
	Class          "OB"
	AbsMagn        -5 // ?

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0408066658
		Eccentricity    0
		Inclination     2.20503616
		AscendingNode   0
		ArgOfPericenter 165.856334
		MeanAnomaly     99.9347206
	}
}

// Hen 3-519
Star	"Hen 3-519 A"
{
	ParentBody     "Hen 3-519"
	Class          "WN11h"
	AbsMagn        -6.71
	MassSol        17
	RadSol         29.8
	LumBol         1819694.0438456186 // MBol = -10.91
	Teff           30200 // 27500
	Oblateness     0
}

// WR 130
Star	"WR 130 A"
{
	ParentBody     "WR 130"
	Class          "WN8(h)"
	AbsMagn        -7.22
	MassSol        47
	RadSol         22.1
	LumBol         1778272.7503975346 // MBol = -10.885
	Teff           44700
	Oblateness     0
}

// WR 140
Remove "V1687 Cyg A" {ParentBody "V1687 Cyg"}
Remove "V1687 Cyg B" {ParentBody "V1687 Cyg"}
Star	"WR 140 A"
{
	ParentBody      "WR 140"
	Class           "WC7pd"
	AbsMagn         -6.6
	MassSol         8.4
	Radius          3466300.637614196 // Calculated
	LumBol          537000
	Teff            70000

	Orbit
	{
		Period          7.9241
		Eccentricity    0.9012
		Inclination     119.4
		AscendingNode   349.1
		Epoch           2449054.494707910344005 // 1993.1825
		ArgOfPericenter 42.31
		MeanAnomaly     0
	}
}

Star	"WR 140 B"
{
	ParentBody      "WR 140"
	Class           "O5.5fc"
	AbsMagn         -6.11
	MassSol         20.5
	RadSol          35
	LumBol          1584887.2570494793 // MBol = -10.76
	Teff            35000

	Orbit
	{
		Period          7.9241
		Eccentricity    0.9012
		Inclination     119.4
		AscendingNode   349.1
		Epoch           2449054.494707910344005 // 1993.1825
		ArgOfPericenter 222.31
		MeanAnomaly     0
	}
}

// WR 148
Star	"WR 148 A"
{
	ParentBody      "WR 148"
	Class           "WN8h"
	AbsMagn         -7.22
	MassSol         44
	RadSol          26.5
	LumBol          1584887.2570494793 // MBol = -10.76
	Teff            39800
	Oblateness      0

	Orbit
	{
		PeriodDays      4.317336
		Eccentricity    0
		Inclination     18
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"WR 148 B"
{
	ParentBody      "WR 148"
	Class           "O5?" // BlackHole?
	MassSol         37

	Orbit
	{
		PeriodDays      4.317336
		Eccentricity    0
		Inclination     18
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// SK -69 194
Star	"SK -69 194 A"
{
	ParentBody     "SK -69 194"
	Class          "B0I"
	AbsMagn        -6.36211214851049 // Calculated
	Radius         12783486.68586932 // Calculated
	LumBol         1247378.842802206 // Mbol = -10.51
	Teff           45000

	BinaryOrbit
	{
		RefPlane        "Equator"
		Period          0.0138699138
		Eccentricity    0
		Inclination     2.24180108
		AscendingNode   0
		ArgOfPericenter -77.4391325
		MeanAnomaly     -145.962603
	}
}

Star	"SK -69 194 B"
{
	ParentBody     "SK -69 194"
	Class          "WN"
}

// HD 269215 (B is possibly a optical companion)
Star	"HD 269215 A"
{
	ParentBody     "HD 269215"
	Class          "BI:"
	AbsMagn        -6.655546747212936 // Calculated
	Radius         19645410.17909021 // Calculated
	LumBol         1247378.842802206 // Mbol = -10.5
	Teff           36300

	BinaryOrbit
	{
		Separation      53467.9 // 1.07 asec
		PositionAngle   240
	}
}

Star	"HD 269215 B"
{
	ParentBody     "HD 269215"
	Class          "B?"
}

// AB1
Star	"AB1 A"
{
	ParentBody     "SMC AB 1"
	Class          "WN3"
	AbsMagn        -6.8027427562020275 // Calculated (+3)
	Radius         4025503.12781478 // Calculated
	LumBol         1174893.1549580991 // MBol = -10.435
	Teff           79000

	BinaryOrbit
	{
		RefPlane        "Equator"
		Period          0.00790460697
		Eccentricity    0
		Inclination     -1.76480961
		AscendingNode   0
		ArgOfPericenter -173.769325
		MeanAnomaly     51.2159693
	}
}

Star	"AB1 B"
{
	ParentBody     "SMC AB 1"
	Class          "O4:"
}

// WR 158
// Reference:
// W.-R. Hamann, G. Grafener, A. Liermann, R. Hainich, A. A. C. Sander, T. Shenar,
// V. Ramachandran, H. Todt, and L. M. Oskinova
// "The Galactic WN stars revisited Impact of Gaia distances on fundamental stellar parameters"
// https://www.aanda.org/articles/aa/full_html/2019/05/aa34850-18/aa34850-18.html
Star	"WR 158 A"
{
	ParentBody     "WR 158"
	Class          "WN7"
	AbsMagn        -6.49
	MassSol        35
	RadSol         17.85
	LumBol         1148153.6214968827515462246116628 // log(L) = 6.06
	Teff           44700

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0243051207
		Eccentricity    0
		Inclination     2.02790421
		AscendingNode   0
		ArgOfPericenter 51.1559529
		MeanAnomaly     51.5534979
	}
}

Star	"WR 158 B"
{
	ParentBody     "WR 158"
	Class          "B I" // Be?
	MassSol        35
}

// M33C-15235
Star	"LGGS J013351.45+304057.0 A"
{
	ParentBody     "LGGS J013351.45+304057.0"
	Class          "WN/Of"
	AbsMagn        -6.9495506821525375 // Calculated
	Radius         28994034.28437629 // Calculated
	LumBol         1137623.0254188431 // MBol = -10.4
	Teff           29200
	Oblateness     0
}

// BAT99-64
Star	"BAT99 64 A"
{
	ParentBody     "BAT99 64"
	Class          "WN4o"
	AbsMagn        -6.420199075209709 // Calculated (+2)
	Radius         4870321.754896907 // Calculated
	LumBol         1122014.2523523173 // MBol = -10.385
	Teff           71000

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0173610955
		Eccentricity    0
		Inclination     1.71597391
		AscendingNode   0
		ArgOfPericenter -57.7679212
		MeanAnomaly     120.030482
	}
}

Star	"BAT99 64 B"
{
	ParentBody     "BAT99 64"
	Class          "O9:"
}

// M33C-10788
Star	"[HS80] B517 A"
{
	ParentBody     "[HS80] B517"
	Class          "WN9"
	AbsMagn        -6.7262764089202385 // Calculated
	Radius         23055491.99717424 // Calculated
	LumBol         1037524.5302828484 // MBol = -10.3
	Teff           32000
	Oblateness     0
}