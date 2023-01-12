// WR 142
// Hard X-ray emission has been detected from this star with the help of the Chandra space telescope,
// that has been suggested to be caused by the presence of a companion,
// a B-type main sequence star located at a distance of 1 AU from WR 142.
Star	"WR 142 A"
{
	ParentBody "WR 142"
	Class      "WO2"
  MassSol    28.6
	RadSol     0.80
  AbsMagn    -3.13
	LumBol     912000
	Teff       200000
	FeH        0
	BinaryOrbit
  {
    Separation 1
  }
}

Star	"WR 142 B"
{
	ParentBody     "WR 142"
	Class          "B"
}

// BAT99 53
// Eclipsing Binary
Star	"BAT99 53 A"
{
	ParentBody "BAT99 53"
	Class      "WC4"
  MassSol    13
	Radius     439425.24089379416545853018760681 // Calculated by Stefan-Boltzmann law
	Luminosity 224000
	Teff       158000

	Orbit
  {
    PeriodDays      3.234671
		Inclination     90
		ArgOfPericenter 0
		MeanAnomaly     0
  }
}

Star	"BAT99 53 B"
{
	ParentBody     "BAT99 53"
	Class          "O9"

	Orbit
	{
		PeriodDays      3.234671
		Inclination     90
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// WR 2
// Weak-lined Wolf-Rayet stars often have hot luminous companions which dilute the emission.
// WR 2 does have a companion, but it is much fainter than the primary and not thought to be the cause of the weak-lined spectrum.
Star	"WR 2 A"
{
	ParentBody     "WR 2"
	Class          "WN2"
	MassSol         16
	RadSol          0.89
	Luminosity      282000
	Teff            141000
	Age             0.0041

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.00570193732
		Eccentricity    0
		Inclination     0.162185907
		AscendingNode   0
		ArgOfPericenter 308.317549
		MeanAnomaly     25.9179065
	}
}

Star	"WR 2 B"
{
	ParentBody     "WR 2"
	Class          "B?"
}

// AB8
// A Wolf-Rayet star and a main sequence companion of spectral type O orbit in a period of 16.638 days.
Star	"AB8 A"
{
	ParentBody     "SMC AB 8"
	Class          "WO4"
	MassSol         19
	RadSol          2
	Luminosity      1400000
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
	MassSol         61
	RadSol          14
	Luminosity      708000
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

// WR 9
// Spectroscopic Binary
Star	"WR 9 A"
{
	ParentBody     "WR 9"
	Class          "WC4"
	MassSol         9
	RadSol          5
	Luminosity      500000
	Teff            139700

	Orbit
	{
		PeriodDays      14.305
		Eccentricity    0
		Inclination     55
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"WR 9 B"
{
	ParentBody     "WR 9"
	Class          "O7"
	MassSol         32

	Orbit
	{
		PeriodDays      14.305
		Eccentricity    0
		Inclination     55
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// WR 30a
// Spectroscopic Binary
Star	"WR 30a A"
{
	ParentBody     "WR 30a"
	Class          "WO4"
	MassSol         7.5 // 9.7
	RadSol          0.88
	Luminosity      195000
	Teff            129500

	Orbit
	{
		PeriodDays      4.619
		Eccentricity    0.2
		Inclination     20
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"WR 30a B"
{
	ParentBody     "WR 30a"
	Class          "O5III/V((f))"
	MassSol         40 // 60

	Orbit
	{
		PeriodDays      4.619
		Eccentricity    0.2
		Inclination     20
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}
