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