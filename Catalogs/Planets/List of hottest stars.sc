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

// WR 38
// B maybe optical companion because thay have defferent parallaxes
Star	"** WLC 1A/WDS J11058-6114A/Gaia DR2 5337277763391646336/Gaia DR3 5337277763391646336"
{
	ParentBody     "WR 38"
	Class          "WC4"
	MassSol         10.4
	Radius          587613.25161121622659265995025635 // Calculated by Stefan-Boltzmann law
	Luminosity      162000
	Teff            126000

	/* BinaryOrbit
	{
		Separation 14940.4 // 1.63 Asec.
	} */
}

/* Star	"** WLC 1B/WDS J11058-6114B/Gaia DR2 5337277763372243840/Gaia DR3 5337277763372243840"
{
	ParentBody     "WR 38"
	Class          "?"
} */

// AB7
// binary star in SMC, complete data
Remove "AB7 A"{ParentBody "AB7"}
Remove "AB7 B"{ParentBody "AB7"}
Star	"AB7 A"
{
	ParentBody     "SMC AB 7"
	Class          "WN4"
	MassSol         23
	RadSol          3.4
	Luminosity      1259000
	Teff            105000

	Orbit
	{
		PeriodDays      19.560
		Eccentricity    0.07
		Inclination     68
		Epoch           2451549.2
		ArgOfPericenter 101
		MeanAnomaly     0
	}
}

Star	"AB7 B"
{
	ParentBody     "SMC AB 7"
	Class          "O6I(f)"
	MassSol         44
	RadSol          14
	Luminosity      316000
	Teff            36000
	Age             0.0034

	Orbit
	{
		PeriodDays      19.560
		Eccentricity    0.07
		Inclination     68
		Epoch           2451549.2
		ArgOfPericenter 281
		MeanAnomaly     0
	}
}

// WR 143
Star	"WR 143 A"
{
	ParentBody     "WR 143"
	Class          "WC4"
	MassSol        8
	Radius         691853.29914601473137736320495605 // Calculated by Stefan-Boltzmann law
	Luminosity     89100
	Teff           100000

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.105489793
		Eccentricity    0.293935835
		Inclination     -0.796666145
		AscendingNode   0
		ArgOfPericenter 77.4150417
		MeanAnomaly     -95.5759196
	}
}

Star	"WR 143 B"
{
	ParentBody     "WR 143"
	Class          "Be"
}

// EZ CMa
Star	"EZ CMa A"
{
	ParentBody     "V* EZ CMa"
	Class          "WN4b"
	MassSol        23
	RadSol         3.25
	LumBol         620000
	Teff           89100

	Orbit
	{
		PeriodDays      3.63
		Eccentricity    0.10
		Inclination     74
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"EZ CMa B"
{
	ParentBody     "V* EZ CMa"
	Class          ""
	MassSol        1.5

	Orbit
	{
		PeriodDays      3.63
		Eccentricity    0.10
		Inclination     74
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// TET Mus
// Reference: NoirLab
// http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=113904
// G. M. Hill, A. F. J. Moffat2 and N. St-Louis2
// "Modelling the colliding-winds spectra of the 19-d WR + OB binary in the massive triple system θ Muscae"
// https://academic.oup.com/mnras/article/335/4/1069/962568
Remove "TET Mus (Aa)"{ParentBody "TET Mus"}
Remove "TET Mus Aa1"{ParentBody "TET Mus (Aa)"}
Remove "TET Mus Aa2"{ParentBody "TET Mus (Aa)"}
Remove "TET Mus Ab"{ParentBody "TET Mus"}
Barycenter "TET Mus Aa"
{
	ParentBody "TET Mus A"
	BinaryOrbit
	{
		Period   153.43
	}
}

Star	"TET Mus A1"
{
	ParentBody     "TET Mus Aa"
	Class          "WC5"
	MassSol        11.5
	Radius         1627522.1511263046413660049438477 // Calculated by Stefan-Boltzmann law
	Luminosity     234000
	Teff           83000
	// The newest data released by Universe Guide, But its reference is unknown.
	// RadSol         906
	// LumBol         6440000
	// Teff           9660

	Orbit
	{
		PeriodDays      19.1375 // adopted
		Eccentricity    0.00 // adopted
		Epoch           2451377.51
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"TET Mus A2"
{
	ParentBody     "TET Mus Aa"
	Class          "O6/7V"
	MassSol        44

	Orbit
	{
		PeriodDays      19.1375 // adopted
		Eccentricity    0.00 // adopted
		Epoch           2451377.51
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"TET Mus Ab"
{
	ParentBody     "TET Mus A"
	Class          "B0III"
}

// WR 19
// Reference: P. M. Williams,G. Rauw2 and K. A. van der Hucht
// "Dust formation by the colliding wind WC5+O9 binary WR 19 at periastron passage"
// https://academic.oup.com/mnras/article/395/4/2221/972096
Star	"WR 19 A"
{
	ParentBody     "WR 19"
	Class          "WC5"
	MassSol        11
	Radius         2325220.5633415766060352325439453
	Luminosity     400000
	Teff           79400

	Orbit
	{
		PeriodDays      3689 // Fixed
		Epoch           2450500.5
		Eccentricity    0.80
		ArgOfPericenter 4
		MeanAnomaly     0
	}
}

Star	"WR 19 B"
{
	ParentBody     "WR 19"
	Class          "O9"
	MassSol        20

	Orbit
	{
		PeriodDays      3689 // Fixed
		Epoch           2450500.5
		Eccentricity    0.80
		ArgOfPericenter 184
		MeanAnomaly     0
		// asini = 5.3 AU
	}
}

// WR 86, visual binary
Star	"WR 86 A"
{
	ParentBody     "WR 86"
	Class          "WC7"
	RadSol         10
	Luminosity     200000
	Teff           56000

	BinaryOrbit
	{
		Separation      630
	}
}

Star	"WR 86 B"
{
	ParentBody     "WR 86"
	Class          "B0III"
	MassSol        19
	RadSol         8.5
	Luminosity     63000
	Teff           31405
	Age            0.004
}

// WR 134, Eclipsing Binary
Star	"WR 134 A"
{
	ParentBody "WR 134"
	Class      "WN6-s"
	MassSol    18
	RadSol     5.25
	Luminosity 407000
	Teff       63100

	Orbit
  {
		PeriodDays      1.887 // 2.25?
		Inclination     90
		ArgOfPericenter 0
		MeanAnomaly     0
  }
}

Star	"WR 134 B"
{
	ParentBody     "WR 134"
	Class          "K-M?"

	Orbit
	{
		PeriodDays      1.887 // 2.25?
		Inclination     90
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}
