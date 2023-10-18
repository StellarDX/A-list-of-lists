// AB6 multiple system
// Reference: T. Shenar, R. Hainich, H. Todt, A. F. J. Moffat, A. Sander, L. M. Oskinova, V. Ramachandran, M. Munoz,
// H. Pablo, H. Sana, and W.-R. Hamann "The shortest-period Wolf-Rayet binary in the Small Magellanic Cloud: Part of a high-order multiple system"
// --Spectral and orbital analysis of SMC AB 6 (ESO Science)
// https://www.aanda.org/articles/aa/full_html/2018/08/aa33006-18/aa33006-18.html

// Total: WN3:h+O5.5V+O5.5If+O7.5V+(B2V/X?)

Barycenter	"AB6 AB"
{
  ParentBody     "SMC AB 6"
  Orbit // There is a doubt in the stability of this orbit.
  {
    PeriodDays      139.1
    ArgOfPericenter 244
    Eccentricity    0.46
    Epoch           2451937.8
    MeanAnomaly     0
    SemiMajorAxisKm 83241460.181880548596382141113281 // Total ~500RSun
  }
}

Star	"AB6 A"
{
	ParentBody     "AB6 AB"
	Class          "WN3:h"
  Teff           80000
  Luminosity     741310.24130091751491339041492424 // LogL = 5.87
  MassSol        18.061007703336442028767820885703 // Calculated from M*(Sin(i))^3 = 9.2
  Radius         3118136.9826996130868792533874512 // Manually calculated, Value is 4.7 RSun in paper.
  RotationPeriod 43.463147560581375889206729176512 // v*sin(i) < 100, Calculated assuming i is aligned with the rotation axis.
  Age            0.0039

	Orbit
  {
    PeriodDays      6.53840
    Epoch           2451924.67
    Eccentricity    0.03 // Fixed? or 0.1?
		ArgOfPericenter 103
    Inclination     53
		MeanAnomaly     0
  }
}

Star	"AB6 B"
{
	ParentBody     "AB6 AB"
	Class          "O5.5V"
  Teff           41500
  Luminosity     446683.59215096311855625052431938 // LogL = 5.65
  MassKg         121213842298709879481911071473664 // Calculated from log(g) = 4 cm/s^2, Value 41 Adopted to orbit(M*(Sin(i))^3 = 20.4)
  Radius         8994540.2753797229379415512084961 // Manually calculated.
  RotationPeriod 59.701557356574077232035052039268 // v*sin(i) = 210, Calculated assuming i is aligned with the rotation axis.

	Orbit
	{
    PeriodDays      6.53840
    Epoch           2451924.67
    Eccentricity    0.03 // Fixed? or 0.1?
		ArgOfPericenter 283
    Inclination     53
		MeanAnomaly     0
	}
}

// To know whether these additional components are gravitationally bound to the WR binary,
// more observations are needed.

Star	"AB6 C"
{
	ParentBody     "SMC AB 6"
	Class          "O5.5I(f)"
  Teff           37000
  Luminosity     562341.32519034908039495103977648 // LogL = 5.75
  MassKg         96147436284407844672691670876160  // Calculated from log(g) = 3.6 cm/s^2
  Radius         12696140.390600446611642837524414 // Manually calculated, Value is 47 RSun in paper.

	Orbit
	{
    SemiMajorAxis  15 // guess,
	}
}

Barycenter	"AB6 D"
{
	ParentBody     "SMC AB 6"
  Orbit
  {
    PeriodDays      139.1
    ArgOfPericenter 64
    Eccentricity    0.46
    Epoch           2451937.8
    MeanAnomaly     0
    SemiMajorAxisKm 254040735.27502959966659545898438 // Total ~500RSun
  }
}

Star	"AB6 Da"
{
	ParentBody     "AB6 D"
	Class          "O7.5V"
  Teff           33000
  Luminosity     75857.757502918376875376674666203 // LogL = 4.88
  MassKg         51485963595360730978992236003328  // Calculated from log(g) = 4 cm/s^2
  Radius         5862019.8466442953795194625854492 // Manually calculated

  Orbit
  {
    PeriodDays      5 // guess
    ArgOfPericenter 0
    MeanAnomaly     0
  }
}

Star	"AB6 Db"
{
	ParentBody     "AB6 D"
	Class          "B2V/X?"

  Orbit
  {
    PeriodDays      5 // guess
    ArgOfPericenter 180
    MeanAnomaly     0
  }
}

// Hodge53-47(ab), Eclipsing Binary
// Simbad shows that a and b has the same coordinate, and star h53-47 is an eclipsing binary.
// so maybe a and b are members of this system.
// The spectal type of these members are O4V+O6.5V since 2000, But now they are O6V+O4/5III(f)
Star	"[MWD2000] h53-47a"
{
	ParentBody     "[MWD2000] h53-47"
	Class          "O4III(f)"
  MassSol        50
  Radius         6306694.7680615801364183425903322 // Manually calculated
  AbsMagn        -4.9
  LumBol         413045.95513075154 // MBol = -9.3
  Teff           48600

	Orbit
  {
    PeriodDays      2.206112
    Epoch           2457001.8798
    Inclination     90
    ArgOfPericenter 0
		MeanAnomaly     0
  }
}

Star	"[MWD2000] h53-47b"
{
	ParentBody     "[MWD2000] h53-47"
	Class          "O6V"
  MassSol        37
  Radius         6891958.2483992744237184524536133 // Manually calculated
  AbsMagn        -4.9
  LumBol         285757.98417224723 // MBol = -8.9
  Teff           42400

  Orbit
  {
    PeriodDays      2.206112
    Epoch           2457001.8798
    Inclination     90
    ArgOfPericenter 180
		MeanAnomaly     0
  }
}

// Hodge53-91, Eclipsing Binary
Star	"Hodge53-91 A"
{
	ParentBody     "[MWD2000] h53-91"
	Class          "O8.5V"
  MassSol        32
	Radius         8165606.9469497837126255035400391 // Manually calculated
  AbsMagn        -5.1
	LumBol         237683.1385378055 // MBol = -8.7
	Teff           37200

	Orbit
  {
    PeriodDays      2.241705
    Epoch           2457000.4846
    Inclination     90
    ArgOfPericenter 0
		MeanAnomaly     0
  }
}

Star	"Hodge53-91 B"
{
	ParentBody     "[MWD2000] h53-91"
	Class          "O8.5V"

  Orbit
  {
    PeriodDays      2.241705
    Epoch           2457000.4846
    Inclination     90
    ArgOfPericenter 180
		MeanAnomaly     0
  }
}
