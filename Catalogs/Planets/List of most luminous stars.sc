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
