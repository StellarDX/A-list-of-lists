// HM 1 1
Star	"Cl HM 1 1 A"
{
	ParentBody     "Cl HM 1 1"
	Class          "WN8h"
	AbsMagn        -7.56
    MassSol        87
	Radius         21444118.9143455 // Calculated
	LumBol         2147822.430523528 // MBol = -11.09
	Teff           39800
    Oblateness     0
}

// HM 1 8, Eclipsing binary
// Reference: https://arxiv.org/abs/2109.13054
Star	"Cl HM 1 8 A"
{
	ParentBody "Cl HM 1 8"
	Class      "O4.5IV(f)"
	AbsMagn    -5.2
	MassSol    26.8
	RadSol     11
	LumBol     309029.54325135905195513065388439 // log(L) = 5.49
	Teff       41200

	Orbit // Spectroscopic orbit solution
	{
		PeriodDays      5.8782
		Epoch           2456815.3 // HJD
		Eccentricity    0.14
		ArgOfPericenter 299
		Inclination     68 // 70? 72?
		MeanAnomaly     0
	}
}

Star	"Cl HM 1 8 B"
{
	ParentBody "Cl HM 1 8"
	Class      "O9.7V"
	AbsMagn    -3.7
	MassSol    9.7
	RadSol     5.7
	LumBol     40738.027780411273050465560078916 // log(L) = 4.61
	Teff       34500

	Orbit // Spectroscopic orbit solution
	{
		PeriodDays      5.8782
		Epoch           2456815.3 // HJD
		Eccentricity    0.14
		ArgOfPericenter 119 // Secondary?
		Inclination     68 // 70? 72?
		MeanAnomaly     0
	}
}
