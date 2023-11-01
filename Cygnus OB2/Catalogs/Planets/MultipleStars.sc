// WR 145
// Companion and orbit data is from
// "The Galactic hybrid Wolf–Rayet WN 7o/CE + O7V((f)) binary system WR 145"
// By V. Muntean, A. F. J. Moffat, A. N. Chené, A. De La Chevrotière
// https://academic.oup.com/mnras/article/399/4/1977/1034544
Star	"WR 145 A"
{
	ParentBody "WR 145"
	Class      "WN7o/CE"
	MassSol    17.7 // 25
	Radius     5624386.5916064232588 // Calculated
	AbsMagn    -6.9516677024208793
	LumBol     371535.22909717253861655841353555 // log(L) = 5.57
	Teff       50118.723362727228500155418688495 // log(T) = 4.70
    Age        0.002 // 0.007

	Orbit
    {
		PeriodDays      22.544 // λ4603
		Eccentricity    0.054
		Inclination     63
		ArgOfPericenter 0
		MeanAnomaly     0
    }
}

Star	"WR 145 B"
{
	ParentBody     "WR 145"
	Class          "O7V(f)"
	MassSol        30.9

	Orbit
	{
		PeriodDays      22.544 // λ4603
		Eccentricity    0.054
		Inclination     63
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// WR 146
// Composition data from 
// "Multiple variations in the radio light-curve of the colliding wind binary WR 146 (WC6+O): evidence for a third component"
// By Setia Gunawan, D. Y. A. ; de Bruyn, A. G. ; van der Hucht, K. A. ; Williams, P. M.
// https://ui.adsabs.harvard.edu/abs/2000A%26A...356..676S/abstract
Star	"WR 146 A"
{
	ParentBody "WR 146"
	Class      "WC6"
	MassSol    15
	Radius     1303392.3396743168123 // Calculated with new data, 5 RSun
	AbsMagn    -5.5828682949236707
	LumBol     125892.54117941672104239541063958 // log(L) = 5.1
	Teff       79432.823472428150206591828283639 // log(T) = 4.90 // 49000
    Age        0.002 // 0.004

	Orbit
    {
		Period          556 // 351
		Eccentricity    0.75 // 0.48
		ArgOfPericenter 0
		MeanAnomaly     0
    }
}

Star	"WR 146 B"
{
	ParentBody     "WR 146"
	Class          "O8I-IIf"
	MassSol        15 // 60
	RadSol         7 // 16
	LumBol         63095.734448019324943436013662234 // log(L) = 4.8 - 5.2
	Teff           43000 // 23500

	Orbit
	{
		Period          556 // 351
		Eccentricity    0.75 // 0.48
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// Star	"WR 146 C" // A third companion is mentioned in this paper.
// {
// 	ParentBody     "WR 146 A" // B?
// 	Class          ""
// 	MassSol        7

// 	Orbit
// 	{
// 		Period          3.38
// 		ArgOfPericenter 0
// 		MeanAnomaly     0
// 	}
// }

// WR 147
Star	"WR 147 A"
{
	ParentBody "WR 147"
	Class      "WN8(h)"
	MassSol    51
	RadSol     29.8
	AbsMagn    -7.22
	LumBol     1995254.8427283422 // MBol = -11.01
	Teff       39800
	Oblateness 0

	Orbit
    {
		Period          1300
		Inclination     30 // 60
		ArgOfPericenter 0
		MeanAnomaly     0
    }
}

Star	"WR 147 B"
{
	ParentBody     "WR 147"
	Class          "B0.5V"
	RadSol         9.18
	LumBol         50000
	Teff           28500

	Orbit
	{
		Period          1300
		Inclination     30 // 60
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// Star	"WR 147 C" // A much closer companion is also suspected on the basis of a "radio pinwheel"
// {
// 	ParentBody     "WR 147 A"
// 	Class          ""

// 	Orbit
// 	{
// 		Period          1.7
// 		ArgOfPericenter 0
// 		MeanAnomaly     0
// 	}
// }

// V1827 Cyg
// Composition data from 
// "The eclipsing, double-lined, Of supergiant binary Cygnus OB2-B17"
// By V. E. Stroud, J. S. Clark, I. Negueruela, P. Roche, A. J. Norton, and F. Vilardell
// https://www.aanda.org/articles/aa/abs/2010/03/aa12123-09/aa12123-09.html
Star	"[CPR2002] B17 A"
{
	ParentBody "[CPR2002] B17"
	Class      "O6Iaf"
	MassSol    60
	RadSol     22
	AbsMagn    -6.2610003475727022
	LumBol     654633.7224603263 // MBol = -9.8
	Teff       35000

	Orbit
    {
		Epoch           2454273.034
		PeriodDays      4.02174
		Inclination     72
		Eccentricity    0
		ArgOfPericenter 0
		MeanAnomaly     0
    }
}

Star	"[CPR2002] B17 B"
{
	ParentBody     "[CPR2002] B17"
	Class          "O9Ia"
	MassSol        45
	RadSol         19
	LumBol         260614.37899758396 // MBol = -8.8
	Teff           29000

	Orbit
	{
		Epoch           2454273.034
		PeriodDays      4.02174
		Inclination     72
		Eccentricity    0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

//////////////////////////////SCHULTE-MT91//////////////////////////////

// Schulte 1
Star	"Cyg OB2 1 A"
{
	ParentBody "Cyg OB2 1"
	Class      "O8V"
	MassSol    21 // Adopted
	Radius     7432907.260811545 // Calculated
	AbsMagn    -4.81
	LumBol     120226.44346174129058326127151935 // log(L) = 5.08
	Teff       32882 // log(T) = 4.54
	Age        0.00446

	Orbit
    {
		PeriodDays      4.8523
		Eccentricity    0.14
		ArgOfPericenter 225
		Epoch           2456338.2
		Inclination     19 // 90
		MeanAnomaly     0
    }
}

Star	"Cyg OB2 1 B"
{
	ParentBody     "Cyg OB2 1"
	Class          "B"
	MassSol        5 // 21?

	Orbit
    {
		PeriodDays      4.8523
		Eccentricity    0.14
		ArgOfPericenter 45
		Epoch           2456338.2
		Inclination     19 // 90
		MeanAnomaly     0
    }
}

// Schulte 3
Star	"Cyg OB2 3 A"
{
	ParentBody "Cyg OB2 3"
	Class      "O6IV:"
	MassSol    17.2
	Radius     12622887.57501002 // Calculated
	AbsMagn    -6.52
	LumBol     346736.85045253163945291131705991 // log(L) = 5.54
	Teff       32882 // log(T) = 4.59
	Age        0.00418
	Oblateness 0

	Orbit
    {
		PeriodDays      4.7464
		Eccentricity    0.070
		ArgOfPericenter 5.5
		Epoch           2453987.81
		Inclination     51.911734367977210525 // Asini = 7.4 * RSun
		MeanAnomaly     0
    }
}

Star	"Cyg OB2 3 B"
{
	ParentBody     "Cyg OB2 3"
	Class          "O9III"
	MassSol        7.6

	Orbit
    {
		PeriodDays      4.7464
		Eccentricity    0.070
		ArgOfPericenter 185.5
		Epoch           2453987.81
		Inclination     51.911734367977210525 // Asini = 16.7 * RSun, 51.705442947519067332
		MeanAnomaly     0
    }
}

// Schulte 5
// Composition data from:
// 1. "The Interacting Early-Type Binary BD +40°4220 (V729 Cyg): Modeling the Colliding Winds Region"
// By G. Rauw, J.-M. Vreux, and B. Bohannan
// https://iopscience.iop.org/article/10.1086/307185
// 2. "Period change of massive binaries from combined photometric and spectroscopic data in Cygnus OB2"
// By Jaan Laur, ElmoTempel, Taavi Tuvikene, Tonis Eenmae, and Indrek Kolka
// https://www.aanda.org/articles/aa/ref/2015/09/aa26520-15/aa26520-15.html
Barycenter "Cyg OB2 5 AB"
{
	ParentBody     "Cyg OB2 5"
	BinaryOrbit
    {
		PeriodDays      138.8
		Eccentricity    0.49
		ArgOfPericenter 0
		MeanAnomaly     0
    }
}

Star	"Cyg OB2 5 A"
{
	ParentBody "Cyg OB2 5 AB"
	Class      "O7Ianfp"
	MassSol    38.18 // 38-55
	RadSol     27.16 // 26.9-35.4 (27.0)
	AbsMagn    -7.2
	LumBol     1367723.7034629364 // MBol = -10.6
	Teff       36100 // Fixed
	Age        0.00295

	Orbit
    {
		Epoch           2456182.906
		PeriodDays      6.597989 // PHOEBE Modalized (Fixed: 6.5980120)
		Inclination     64.65
		Eccentricity    0 // Fixed
		ArgOfPericenter 0 // Fixed
		MeanAnomaly     0
    }
}

Star	"Cyg OB2 5 B"
{
	ParentBody     "Cyg OB2 5 AB"
	Class          "Ofpe/WN9"
	MassSol        10.24 // 10.5-15.5
	RadSol         15.15 // 22.6-32.6 (15.5)
	AbsMagn        -7
	LumBol         1247378.842802206 // MBol = -10.6
	Teff           23681

	Orbit
    {
		Epoch           2456182.906
		PeriodDays      6.597989 // PHOEBE Modalized (Fixed: 6.5980120)
		Inclination     64.65
		Eccentricity    0 // Fixed
		ArgOfPericenter 180 // Fixed
		MeanAnomaly     0
    }
}

Star	"Cyg OB2 5 C"
{
	ParentBody     "Cyg OB2 5"
	Class          "B0V:"
}

// Schulte 8A
Star	"Cyg OB2 8A1"
{
	ParentBody "Cyg OB2 8A"
	Class      "O6Ib(fc)"
	MassSol    44.1
	RadSol     20
	AbsMagn    -6.78
	LumBol     650000
	Teff       36800

	Orbit
    {
		PeriodDays      21.908 // Fixed
		Eccentricity    0.24
		Epoch           2451807.139
		ArgOfPericenter 0
		MeanAnomaly     0
    }
}

Star	"Cyg OB2 8A2"
{
	ParentBody     "Cyg OB2 8A"
	Class          "O4.5III:(fc)"
	MassSol        37.4
	RadSol         14.8
	LumBol         468000
	Teff           39200
	Age            0.005

	Orbit
    {
		PeriodDays      21.908 // Fixed
		Eccentricity    0.24
		Epoch           2451807.139
		ArgOfPericenter 180
		MeanAnomaly     0
    }
}

// Schulte 8D
Barycenter "Cyg OB2 8Dab"
{
	ParentBody     "Cyg OB2 8D"
	BinaryOrbit
    {
		PeriodDays      1687
		Eccentricity    0.59
		ArgOfPericenter 255
		Epoch           2464990
		Inclination     12 // 90
		MeanAnomaly     0
    }
}

Star	"Cyg OB2 8Da"
{
	ParentBody "Cyg OB2 8Dab"
	Class      "O8.5V"
	MassSol    19 // Adopted
	Radius     4469037.496205795 // Calculated
	AbsMagn    -3.94
	LumBol     48977.881936844619591030856135485 // log(L) = 4.69
	Teff       33879 // log(T) = 4.53
	Age        0.00259

	Orbit
    {
		PeriodDays      3.6 // Double-lined system
		Inclination     10
		ArgOfPericenter 0
		MeanAnomaly     0
    }
}

Star	"Cyg OB2 8Db"
{
	ParentBody     "Cyg OB2 8Dab"
	Class          "O9V"
	MassSol        19 // Adopted

	Orbit
    {
		PeriodDays      3.6 // Double-lined system
		Inclination     10
		ArgOfPericenter 180
		MeanAnomaly     0
    }
}

Star	"Cyg OB2 8Dc"
{
	ParentBody     "Cyg OB2 8D"
	Class          "A2V-O"
	MassSol        5 // max is 39
}

// Schulte 9
// Orbit solution from:
// "First Orbital Solution for the Non-thermal Emitter Cyg OB2 No. 90"0
// By Y. Naze, Y. Damerdji, G. Rauw, D.C. Kiminki, L. Mahy, H.A. Kobulnicky, T. Morel, M. De Becker, P. Eenens, and C. Barbieri
// https://ui.adsabs.harvard.edu/abs/2010ApJ...719..634N/abstract
Star	"Cyg OB2 9 A"
{
	ParentBody "Cyg OB2 9"
	Class      "O5I"
	MassSol    51.6
	Radius     13080687.46310357 // Calculated
	AbsMagn    -6.82
	LumBol     707945.78438413791080221494218931 // log(L) = 5.85
	Teff       38612 // log(T) = 4.59
	Age        0.00426

	Orbit // SB2 Orbit
    {
		PeriodDays      852.9
		Epoch           2454036.8
		Eccentricity    0.744
		ArgOfPericenter -164.4
		Inclination     48.521958884547384899877232826647 // M(sin(i))^3 =  21.7
		MeanAnomaly     0
    }
}

Star	"Cyg OB2 9 B"
{
	ParentBody     "Cyg OB2 9"
	Class          "O4III"
	MassSol        44.102564102564102564102564102564 // M1/M2 = 1.17

	Orbit
    {
		PeriodDays      852.9
		Epoch           2454036.8
		Eccentricity    0.744
		ArgOfPericenter 15.6
		Inclination     48.521958884547384899877232826647 // M(sin(i))^3 =  18.6, 48.583662675585222178478626119244
		MeanAnomaly     0
    }
}

// Schulte 11
Star	"Cyg OB2 11 A"
{
	ParentBody "Cyg OB2 11"
	Class      "O5I(f)"
	MassSol    51
	Radius     11392802.51195818 // Calculated
	AbsMagn    -6.24
	LumBol     537031.79637025273090358120985192 // log(L) = 5.73
	Teff       38612 // log(T) = 4.59
	Age        0.00456

	Orbit // SB2 Orbit
    {
		PeriodDays      72.43
		Eccentricity    0.5
		ArgOfPericenter 262.6
		Epoch           2455722
		Inclination     13 // 90
		MeanAnomaly     0
    }
}

Star	"Cyg OB2 11 B"
{
	ParentBody     "Cyg OB2 11"
	Class          "B0V"
	MassSol        7.7

	Orbit
    {
		PeriodDays      72.43
		Eccentricity    0.5
		ArgOfPericenter 82.6
		Epoch           2455722
		Inclination     13 // 90
		MeanAnomaly     0
    }
}

// Schulte 15
Star	"Schulte 15 A"
{
	ParentBody "Schulte 15"
	Class      "O8V"
	MassSol    21 // Adopted
	Radius     4787129.369671641 // Calculated
	AbsMagn    -4.45224039375728843
	LumBol     61659.500186148216632034834387861 // log(L) = 4.79
	Teff       34673.685045253163945291131705991 // log(T) = 4.54
	Age        0.00245

	Orbit // SB2 Orbit
    {
		PeriodDays      14.6584
		Eccentricity    0.15
		ArgOfPericenter 43
		Epoch           2454287.5
		Inclination     15 // 90
		MeanAnomaly     0
    }
}

Star	"Schulte 15 B"
{
	ParentBody     "Schulte 15"
	Class          "B" // O-B
	MassSol        3.9 // 21

	Orbit
    {
		PeriodDays      14.6584
		Eccentricity    0.15
		ArgOfPericenter 223
		Epoch           2454287.5
		Inclination     15 // 90
		MeanAnomaly     0
    }
}

// Schulte 17
Star	"Schulte 17 A"
{
	ParentBody "Schulte 17"
	Class      "O8V"
	MassSol    21 // Adopted
	Radius     5012739.826196085 // Calculated
	AbsMagn    -4.85371797196559747
	LumBol     61659.500186148216632034834387861 // log(L) = 4.79
	Teff       33884.415613920254704827359050211 // log(T) = 4.53
	Age        0.00367

	Orbit
    {
		PeriodDays      44.63
		Eccentricity    0.21
		ArgOfPericenter 251
		Epoch           2455229.7
		Inclination     2 // 90
		MeanAnomaly     0
    }
}

Star	"Schulte 17 B"
{
	ParentBody     "Schulte 17"
	Class          "G" // O–K
	MassSol        0.5 // 21

	Orbit
    {
		PeriodDays      44.63
		Eccentricity    0.21
		ArgOfPericenter 71
		Epoch           2455229.7
		Inclination     2 // 90
		MeanAnomaly     0
    }
}

// Schulte 19
Star	"Schulte 19 A"
{
	ParentBody "Schulte 19"
	Class      "B0Iab"
	MassSol    21 // Adopted
	Radius     10473097.92384943 // Calculated
	AbsMagn    -5.76589639401177159
	LumBol     186208.71366628674486717789978037 // log(L) = 5.27
	Teff       30902.954325135905195513065388439 // log(T) = 4.49
	Age        0.00674

	Orbit
    {
		PeriodDays      510.2
		Eccentricity    0.67 // Fixed
		ArgOfPericenter 41
		Epoch           2456222.3
		Inclination     18 // 90
		MeanAnomaly     0
    }
}

Star	"Schulte 19 B"
{
	ParentBody     "Schulte 19"
	Class          "B" // O–B
	MassSol        4.1 // 21

	Orbit
    {
		PeriodDays      510.2
		Eccentricity    0.67 // Fixed
		ArgOfPericenter 221
		Epoch           2456222.3
		Inclination     18 // 90
		MeanAnomaly     0
    }
}

// Schulte 20
Star	"Schulte 20 A"
{
	ParentBody "Schulte 20"
	Class      "O9III"
	MassSol    23 // Adopted
	Radius     3759024.568554624 // Calculated
	AbsMagn    -3.91841581955089147
	LumBol     26302.679918953819172897987967726 // log(L) = 4.42
	Teff       31622.776601683793319988935444327 // log(T) = 4.50
	Age        0.00146

	Orbit
    {
		PeriodDays      25.126
		Eccentricity    0.37
		ArgOfPericenter 125
		Epoch           2453922.94
		Inclination     19 // 90
		MeanAnomaly     0
    }
}

Star	"Schulte 20 B"
{
	ParentBody     "Schulte 20"
	Class          "B" // mid B
	MassSol        5.3 // 23

	Orbit
    {
		PeriodDays      25.126
		Eccentricity    0.37
		ArgOfPericenter 305
		Epoch           2453922.94
		Inclination     19 // 90
		MeanAnomaly     0
    }
}

// Schulte 22
Star	"Schulte 22A/** WSI 66A/USNO-B1.0 1312-00390041/[MT91] 417A/GOS G080.14+00.75 01/WDS J20331+4113A/Gaia DR3 2067781905528395264/[M2010] Cyg OB2-22 A/Gaia DR2 2067781905528395264"
{
	RA             20 33 08.7655811880
	Dec            +41 13 18.702872112
	ParentBody     "Schulte 22"
	Class          "O3If*"
	MassSol        49.9
	Radius         10353213.36326651 // Calculated
	AbsMagn        -6.74411897822834135
	LumBol         660693.44800759600650964628363505 // log(L) = 5.82
	Teff           42657.951880159265800452389660098 // log(T) = 4.63
	Age            0.00412
}

Barycenter "Schulte 22B/** WSI 66B/GOS G080.14+00.75 02/WDS J20331+4113Ba,Bb/Gaia DR2 2067781909827712384/** MZA 26Ba,Bb/[M2010] Cyg OB2-22 B/Gaia DR3 2067781909827712384/ALS 19499/WDS J20331+4113B/[MT91] 417B"
{
	RA             20 33 08.8427353416
	Dec            +41 13 17.413536036
	ParentBody     "Schulte 22"
	Class          "O6V+A-O"
	BinaryOrbit
    {
		Separation      2937.3 // 1.56"
		PositionAngle   50
    }
}

Star	"Schulte 22Ba"
{
	ParentBody "Schulte 22B"
	Class      "O6V"
	MassSol    31 // Adopted

	Orbit
    {
		PeriodDays      38
		Eccentricity    0.21
		ArgOfPericenter 244
		Epoch           2456719.9
		Inclination     5 // 90
		MeanAnomaly     0
    }
}

Star	"Schulte 22Bb"
{
	ParentBody     "Schulte 22B"
	Class          "A" // O-A
	MassSol        1.8

	Orbit
    {
		PeriodDays      38
		Eccentricity    0.21
		ArgOfPericenter 64
		Epoch           2456719.9
		Inclination     5 // 90
		MeanAnomaly     0
    }
}

// Schulte 27
Star	"Schulte 27 A"
{
	ParentBody "Schulte 27"
	Class      "O9.5V"
	MassSol    15.1
	Radius     4027867.394068744 // Calculated
	AbsMagn    -6.74411897822834135
	LumBol     30199.517204020161986311451785768 // log(L) = 4.48
	Teff       31622.776601683793319988935444327 // log(T) = 4.50
	Age        0.00258

	Orbit
    {
		PeriodDays      1.4692
		Eccentricity    0.01
		ArgOfPericenter 170
		Epoch           2454729
		Inclination     26
		MeanAnomaly     0
    }
}

Star	"Schulte 27 B"
{
	ParentBody     "Schulte 27"
	Class          "B0V"
	MassSol        12.8

	Orbit
    {
		PeriodDays      1.4692
		Eccentricity    0.01
		ArgOfPericenter 350
		Epoch           2454729
		Inclination     26
		MeanAnomaly     0
    }
}

// A third composition(Schulte 27 C, B-type star) is mentioned in this system
// but information and orbit of it is unknown.

// Schulte 29
Star	"Schulte 29 A"
{
	ParentBody "Schulte 29"
	Class      "O7V"
	MassSol    25 // Adopted
	Radius     4955359.467896224 // Calculated
	AbsMagn    -4.6497727836449455
	LumBol     87096.358995608063751082742520877 // log(L) = 4.94
	Teff       37153.522909717253861655841353555 // log(T) = 4.57
	Age        0.00178

	Orbit
    {
		PeriodDays      151.2
		Eccentricity    0.60
		ArgOfPericenter 15
		Epoch           2456543.7
		Inclination     15 // 90
		MeanAnomaly     0
    }
}

Star	"Schulte 29 B"
{
	ParentBody     "Schulte 29"
	Class          "B" // O-B
	MassSol        4

	Orbit
    {
		PeriodDays      151.2
		Eccentricity    0.60
		ArgOfPericenter 195
		Epoch           2456543.7
		Inclination     15 // 90
		MeanAnomaly     0
    }
}

// Schulte 41
Star	"Schulte 41 A"
{
	ParentBody "Schulte 41"
	Class      "B0V"
	MassSol    18 // Adopted
	Radius     5129501.536273097 // Calculated
	AbsMagn    -4.8055494500311336
	LumBol     44668.359215096311855625052431938 // log(L) = 4.65
	Teff       30902.954325135905195513065388439 // log(T) = 4.49
	Age        0.00655

	Orbit
    {
		PeriodDays      29.41
		Eccentricity    0.23
		ArgOfPericenter 299
		Epoch           2456310.98
		Inclination     19 // 90
		MeanAnomaly     0
    }
}

Star	"Schulte 41 B"
{
	ParentBody     "Schulte 41"
	Class          "B:"
	MassSol        4.1

	Orbit
    {
		PeriodDays      29.41
		Eccentricity    0.23
		ArgOfPericenter 119
		Epoch           2456310.98
		Inclination     19 // 90
		MeanAnomaly     0
    }
}

// Schulte 50
// Star map shows that A and B has an 2.82" separation and position angle is ~140
// But their orbital period is only 4 days. That means the two data are from different systems.
// And there are at least 3 stars in Schulte 50
Star	"Schulte 50A/** MZA 26C/WDS J20331+4113C/Gaia DR3 2067781905528395776/Gaia DR2 2067781905528395776"
{
	RA             20 33 09.6047787600
	Dec            +41 13 00.608957004
	ParentBody     "Schulte 50"
	Class          "B?"
}

Barycenter "Schulte 50B/** MZA 26E/WDS J20331+4113E/Gaia DR3 2067781909827930624/Gaia DR2 2067781909827930624"
{
	RA             20 33 09.4493565240
	Dec            +41 12 58.395804048
	ParentBody     "Schulte 50"
	Class          "O9.7V:"
	BinaryOrbit
    {
		Separation      4918.89 // 2.82"
		PositionAngle   140
    }
}

Star	"Schulte 50Ba"
{
	ParentBody     "Schulte 50B"
	Class          "O9V"
	MassSol        16.3
	Radius         2851511.74168929 // Calculated
	AbsMagn        -5.1180897202464526
	LumBol         18197.008586099834401036808062981 // log(L) = 4.26
	Teff           33113.112148259109430169989415583 // log(T) = 4.52
	Age            0

	Orbit
    {
		PeriodDays      4.161
		ArgOfPericenter 0
		MeanAnomaly     0
    }
}

Star	"Schulte 50Bb"
{
	ParentBody     "Schulte 50B"
	Class          "B9V" // A0V

	Orbit
    {
		PeriodDays      4.161
		ArgOfPericenter 180
		MeanAnomaly     0
    }
}

// Schulte 70
Star	"Schulte 70 A"
{
	ParentBody "Schulte 70"
	Class      "B0V"
	MassSol    18 // Adopted
	Radius     1698537.596352785 // Calculated
	AbsMagn    -4.762048970967394
	LumBol     48977.881936844619591030856135485 // log(L) = 4.69
	Teff       30902.954325135905195513065388439 // log(T) = 4.49
	Age        0.0068

	Orbit
    {
		PeriodDays      245.1
		Eccentricity    0.51
		ArgOfPericenter 242
		Epoch           2456549.1
		Inclination     15 // 90
		MeanAnomaly     0
    }
}

Star	"Schulte 70 B"
{
	ParentBody     "Schulte 70"
	Class          "A" // B-A
	MassSol        3.2

	Orbit
    {
		PeriodDays      245.1
		Eccentricity    0.51
		ArgOfPericenter 62
		Epoch           2456549.1
		Inclination     15 // 90
		MeanAnomaly     0
    }
}

// Schulte 71
Star	"Schulte 71 A"
{
	ParentBody "Schulte 71"
	Class      "B1V"
	MassSol    14 // Adopted
	Radius     3631408.988596499 // Calculated
	AbsMagn    -2.9461317785149556
	LumBol     6760.8297539198177105899194961757 // log(L) = 3.83
	Teff       22908.676527677730457240849198746 // log(T) = 4.36
	Age        0.01

	Orbit
    {
		PeriodDays      49.8
		Eccentricity    0.31
		ArgOfPericenter 260
		Epoch           2456476.7
		Inclination     75 // 90
		MeanAnomaly     0
    }
}

Star	"Schulte 71 B"
{
	ParentBody     "Schulte 71"
	Class          "B1.5V"
	MassSol        12

	Orbit
    {
		PeriodDays      49.8
		Eccentricity    0.31
		ArgOfPericenter 80
		Epoch           2456476.7
		Inclination     75 // 90
		MeanAnomaly     0
    }
}

// Schulte 73
Star	"Schulte 73 A"
{
	ParentBody "Schulte 73"
	Class      "O8III"
	MassSol    11.2
	Radius     4121688.478186689 // Calculated
	AbsMagn    -5.0205297440690306
	LumBol     41686.93834703354017710921288892 // log(L) = 4.62
	Teff       33884.415613920254704827359050211 // log(T) = 4.53
	Age        0.00136

	Orbit
    {
		PeriodDays      17.28
		Eccentricity    0.169
		ArgOfPericenter 7.3
		Epoch           2454700.89
		MeanAnomaly     0
    }
}

Star	"Schulte 73 B"
{
	ParentBody     "Schulte 73"
	Class          "O8III"
	MassSol        11.1

	Orbit
    {
		PeriodDays      17.28
		Eccentricity    0.169
		ArgOfPericenter 187.3
		Epoch           2454700.89
		MeanAnomaly     0
    }
}

// Schulte 74
Star	"Schulte 74 A"
{
	ParentBody "Schulte 74"
	Class      "O8V"
	MassSol    21
	Radius     6383739.612995638 // Calculated
	AbsMagn    -4.4781354955799031
	LumBol     109647.81961431850131437136061411 // log(L) = 5.04
	Teff       34673.685045253163945291131705991 // log(T) = 4.54
	Age        0.00431

	Orbit
    {
		PeriodDays      1278.7
		Eccentricity    0.55
		ArgOfPericenter 2
		Epoch           2457208
		Inclination     34 // 90
		MeanAnomaly     0
    }
}

Star	"Schulte 74 B"
{
	ParentBody     "Schulte 74"
	Class          "B2" // O–B2
	MassSol        10

	Orbit
    {
		PeriodDays      1278.7
		Eccentricity    0.55
		ArgOfPericenter 182
		Epoch           2457208
		Inclination     34 // 90
		MeanAnomaly     0
    }
}

// [MT91] 516
Star	"[MT91] 516 A"
{
	ParentBody "[MT91] 516"
	Class      "O6IV((f))"
	MassSol    51.6
	Radius     12304817.14337295 // Calculated
	AbsMagn    -8.3774339683297845
	LumBol     707945.78438413791080221494218931 // log(L) = 5.85
	Teff       39810.717055349725077025230508775 // log(T) = 4.60
	Age        0.00421

	BinaryOrbit
    {
		Separation      2479.33
		PositionAngle   45
    }
}

Star	"[MT91] 516 B"
{
	ParentBody     "[MT91] 516"
	Class          "O?" // Optical companion?
}

// [MT91] 448
Star	"[MT91] 448 A"
{
	ParentBody "[MT91] 448"
	Class      "O6V"
	MassSol    31
	Radius     5012739.826196083 // Calculated
	AbsMagn    -5.008376917562921
	LumBol     107151.93052376064174083022246945 // log(L) = 5.03
	Teff       38904.514499428060109370370285858 // log(T) = 4.59
	Age        0.00076

	Orbit
    {
		PeriodDays      3.1704
		Eccentricity    0.10
		ArgOfPericenter 3
		Epoch           2455971.2
		Inclination     6 // 90
		MeanAnomaly     0
    }
}

Star	"[MT91] 448 B"
{
	ParentBody     "[MT91] 448"
	Class          "A" // O6V-A
	MassSol        2 // 31

	Orbit
    {
		PeriodDays      3.1704
		Eccentricity    0.10
		ArgOfPericenter 183
		Epoch           2455971.2
		Inclination     6 // 90
		MeanAnomaly     0
    }
}

// [MT91] 771
Star	"[MT91] 771 A"
{
	ParentBody "[MT91] 771"
	Class      "O7V"
	MassSol    4.5
	Radius     6532436.010523489 // Calculated
	AbsMagn    -6.50681885727281923
	LumBol     151356.12484362081624640694285516 // log(L) = 5.18
	Teff       37153.522909717253861655841353555 // log(T) = 4.57
	Age        0.0035
	Oblateness 0

	Orbit
    {
		PeriodDays      2.8635
		Eccentricity    0.05
		ArgOfPericenter 41
		Epoch           2454408.4
		Inclination     37
		MeanAnomaly     0
    }
}

Star	"[MT91] 771 B"
{
	ParentBody     "[MT91] 771"
	Class          "O9V"
	MassSol        3.8

	Orbit
    {
		PeriodDays      2.8635
		Eccentricity    0.05
		ArgOfPericenter 221
		Epoch           2454408.4
		Inclination     37
		MeanAnomaly     0
    }
}

// [MT91] 267
Star	"[MT91] 267 A"
{
	ParentBody "[MT91] 267"
	Class      "O7.5III-I"
	MassSol    32
	Radius     10001730.8699527 // Calculated
	AbsMagn    -5.6944348878846955
	LumBol     323593.65692962826267867485075456 // log(L) = 5.51
	Teff       36307.805477010134246737121236246 // log(T) = 4.56
	Age        0.00517

	Orbit
    {
		PeriodDays      15.511
		Eccentricity    0.21
		ArgOfPericenter 37
		Epoch           2455745.7
		Inclination     13 // 8 - 81
		MeanAnomaly     0
    }
}

Star	"[MT91] 267 B"
{
	ParentBody     "[MT91] 267"
	Class          "B0" // O-B
	MassSol        3 // 30

	Orbit
    {
		PeriodDays      15.511
		Eccentricity    0.21
		ArgOfPericenter 217
		Epoch           2455745.7
		Inclination     13 // 8 - 81
		MeanAnomaly     0
    }
}

// [MT91] 390
Star	"[MT91] 390 A"
{
	ParentBody "[MT91] 390"
	Class      "B1V"
	MassSol    21 // Adopted
	Radius     5624386.591606422 // Calculated
	AbsMagn    -4.995305118456698
	LumBol     85113.803820237646781712631859249 // log(L) = 4.93
	Teff       34673.685045253163945291131705991 // log(T) = 4.54
	Age        0.0037

	Orbit
    {
		PeriodDays      4.6252
		Eccentricity    0.15
		ArgOfPericenter 240
		Epoch           2455971.8
		Inclination     2 // 90
		MeanAnomaly     0
    }
}

Star	"[MT91] 390 B"
{
	ParentBody     "[MT91] 390"
	Class          "K" // O-K
	MassSol        0.32

	Orbit
    {
		PeriodDays      4.6252
		Eccentricity    0.15
		ArgOfPericenter 60
		Epoch           2455971.8
		Inclination     2 // 90
		MeanAnomaly     0
    }
}

// [MT91] 485
Star	"[MT91] 485 A"
{
	ParentBody "[MT91] 485"
	Class      "O8V"
	MassSol    21 // Adopted
	Radius     4787129.369671641 // Calculated
	AbsMagn    -4.816424705030872
	LumBol     61659.500186148216632034834387861 // log(L) = 4.79
	Teff       34673.685045253163945291131705991 // log(T) = 4.54
	Age        0.0024

	Orbit
    {
		PeriodDays      4066
		Eccentricity    0.75 // Fixed
		ArgOfPericenter 352
		Epoch           2452229
		Inclination     40 // 90
		MeanAnomaly     0
    }
}

Star	"[MT91] 485 B"
{
	ParentBody     "[MT91] 485"
	Class          "B" // O-B
	MassSol        11

	Orbit
    {
		PeriodDays      4066
		Eccentricity    0.75 // Fixed
		ArgOfPericenter 172
		Epoch           2452229
		Inclination     40 // 90
		MeanAnomaly     0
    }
}

// [MT91] 70
Star	"[MT91] 70 A"
{
	ParentBody "[MT91] 70"
	Class      "O9III"
	MassSol    22 // Adopted
	Radius     3981760.777274436 // Calculated
	AbsMagn    -5.0308826367764015
	LumBol     35481.338923357545843321870226449 // log(L) = 4.55
	Teff       33113.112148259109430169989415583 // log(T) = 4.52
	Age        0.00197

	Orbit
    {
		PeriodDays      2259
		Eccentricity    0.34 // Fixed
		ArgOfPericenter 157.9
		Epoch           2453355
		Inclination     18 // 90
		MeanAnomaly     0
    }
}

Star	"[MT91] 70 B"
{
	ParentBody     "[MT91] 70"
	Class          "B6V" // Approximately
	MassSol        5

	Orbit
    {
		PeriodDays      2259
		Eccentricity    0.34 // Fixed
		ArgOfPericenter 337.9
		Epoch           2453355
		Inclination     18 // 90
		MeanAnomaly     0
    }
}

// [MT91] 213
// Data refernece: 
// Ho, Wynn C. G. ; Ng, C. -Y. ; Lyne, Andrew G. ; Stappers, Ben W. ; 
// Coe, Malcolm J. ; Halpern, Jules P. ; Johnson, Tyrel J. ; Steele, Iain A.
// "Multiwavelength monitoring and X-ray brightening of Be X-ray binary PSR J2032+4127/MT91 213 on its approach to periastron"
// https://ui.adsabs.harvard.edu/abs/2017MNRAS.464.1211H/abstract
Remove "PSR J2032+4127" {ParentBody "PSR J2032+4127"}
Star	"[MT91] 213 A"
{
	ParentBody "[MT91] 213"
	Class      "B0Vp"
	MassSol    14.5 // 15
	Radius     2985899.349825199 // Calculated
	AbsMagn    -4.263023656639933
	LumBol     15135.612484362081624640694285516 // log(L) = 4.18
	Teff       30902.954325135905195513065388439 // log(T) = 4.49
	Age        0

	Orbit
    {
		PeriodDays      17000 // 16000 - 17670
		Epoch           2458069.5 // 2458053.5 - 2458068.5
		Eccentricity    0.961 // 0.936 - 0.989
		ArgOfPericenter 40 // 21 - 52
		MeanAnomaly     0
    }
}

Star	"[MT91] 213 B"
{
	ParentBody     "[MT91] 213"
	Class          "Q" // Pulsar
	MassSol        1.35
	KerrSpin       0
	KerrCharge     0

	RotationEpoch  2455700.5
	RotationPeriod 3.9790685080204094381913382840904e-5 // 6.980975Hz (6.980973 - 6.980979)

	AccretionDisk
	{
		//OuterRadiusKm 32844892.848077189 // FRODOspec Disk(11 * R_OB), 5.4 * R_OB - 13.1 * R_OB
	}

	Orbit
    {
		PeriodDays      17000 // 16000 - 17670
		Epoch           2458069.5 // 2458053.5 - 2458068.5
		Eccentricity    0.961 // 0.936 - 0.989
		ArgOfPericenter 220
		MeanAnomaly     0
    }
}

// [MT91] 429
Star	"[MT91] 429 A"
{
	ParentBody     "[MT91] 429"
	Class          "B0V"
	MassSol        13.5
	Radius         2399248.125801598 // Calculated
	AbsMagn        -3.792356939925374
	LumBol         9772.3722095581068269707600696156 // log(L) = 3.99
	Teff           30902.954325135905195513065388439 // log(T) = 4.49
	Age            0
}

Barycenter "[MT91] 429 Bab"
{
	ParentBody     "[MT91] 429"
	BinaryOrbit
    {
		Separation      138
    }
}

Star	"[MT91] 429 Ba"
{
	ParentBody     "[MT91] 429 Bab"
	Class          "B3V"
	MassSol        7.6
	RadSol         4.8
	Teff           19100

	Orbit
    {
		PeriodDays      2.9786
		Eccentricity    0 // Fixed
		ArgOfPericenter 339
		Epoch           2451784.66
		Inclination     89
		MeanAnomaly     0
    }
}

Star	"[MT91] 429 Bb"
{
	ParentBody     "[MT91] 429 Bab"
	Class          "B6V"
	MassSol        5.2
	RadSol         3.6
	Teff           13700

	Orbit
    {
		PeriodDays      2.9786
		Eccentricity    0 // Fixed
		ArgOfPericenter 159
		Epoch           2451784.66
		Inclination     89
		MeanAnomaly     0
    }
}

// [MT91] 372
Star	"[MT91] 372 A"
{
	ParentBody "[MT91] 372"
	Class      "B0V"
	MassSol    17.5
	Radius     2042091.3429555 // Calculated
	AbsMagn    -3.255617740586912
	LumBol     7079.4578438413791080221494218931 // log(L) = 3.85
	Teff       30902.954325135905195513065388439 // log(T) = 4.49
	Age        0

	Orbit
    {
		PeriodDays      2.228 // Fixed
		Eccentricity    0 // Fixed
		ArgOfPericenter 344
		Epoch           2454755
		Inclination     30.11017850154996 // a1 * sin(i) = 3.4 * RSun
		MeanAnomaly     0
    }
}

Star	"[MT91] 372 B"
{
	ParentBody     "[MT91] 372"
	Class          "B2:V" // ?
	MassSol        10.0

	Orbit
    {
		PeriodDays      2.228 // Fixed
		Eccentricity    0 // Fixed
		ArgOfPericenter 164
		Epoch           2454755
		Inclination     30.11017850154996 // a1 * sin(i) = 3.4 * RSun
		MeanAnomaly     0
    }
}

// [MT91] 187
Star	"[MT91] 187 A"
{
	ParentBody "[MT91] 187"
	Class      "B1V"
	MassSol    14 // Adopted
	Radius     3236496.667833946 // Calculated
	AbsMagn    -3.281880880678721
	LumBol     11220.184543019634355910389464779 // log(L) = 4.05
	Teff       27542.287033381664486312106594222 // log(T) = 4.44
	Age        0.00374

	Orbit
    {
		PeriodDays      13.531
		Eccentricity    0.51
		ArgOfPericenter 15
		Epoch           2456282.7
		Inclination     3 // 85
		MeanAnomaly     0
    }
}

Star	"[MT91] 187 B"
{
	ParentBody     "[MT91] 187"
	Class          ""
	MassSol        0.43

	Orbit
    {
		PeriodDays      13.531
		Eccentricity    0.51
		ArgOfPericenter 195
		Epoch           2456282.7
		Inclination     3 // 85
		MeanAnomaly     0
    }
}

// [MT91] 605
Star	"[MT91] 605 A"
{
	ParentBody "[MT91] 605"
	Class      "B0.5V"
	MassSol    1.3
	Radius     3428271.15192699 // Calculated
	AbsMagn    -3.979395432006182
	LumBol     12589.254117941672104239541063958 // log(L) = 4.10
	Teff       27542.287033381664486312106594222 // log(T) = 4.44
	Age        0.00539

	Orbit
    {
		PeriodDays      12.27
		Eccentricity    0.24
		ArgOfPericenter 56
		Epoch           2454653.2
		Inclination     80
		MeanAnomaly     0
    }
}

Star	"[MT91] 605 B"
{
	ParentBody     "[MT91] 605"
	Class          "B2.5:V"
	MassSol        0.7

	Orbit
    {
		PeriodDays      12.27
		Eccentricity    0.24
		ArgOfPericenter 236
		Epoch           2454653.2
		Inclination     80
		MeanAnomaly     0
    }
}

// [MT91] 720
Star	"[MT91] 720 A"
{
	ParentBody "[MT91] 720"
	Class      "B0-1V"
	MassSol    15.5
	Radius     3846583.498813133 // Calculated
	AbsMagn    -5.045803640540712
	LumBol     15848.931924611134852021013733915 // log(L) = 4.20
	Teff       27542.287033381664486312106594222 // log(T) = 4.44
	Age        0.00773

	Orbit
    {
		PeriodDays      4.3622
		Eccentricity    0.35
		ArgOfPericenter 297
		Epoch           2454585.80
		Inclination     70
		MeanAnomaly     0
    }
}

Star	"[MT91] 720 B"
{
	ParentBody     "[MT91] 720"
	Class          "B1-2V"
	MassSol        11.1

	Orbit
    {
		PeriodDays      4.3622
		Eccentricity    0.35
		ArgOfPericenter 117
		Epoch           2454585.80
		Inclination     70
		MeanAnomaly     0
    }
}

// [MT91] 292
Star	"[MT91] 292 A"
{
	ParentBody "[MT91] 292"
	Class      "B2V"
	MassSol    11
	Radius     4266533.541687457 // Calculated
	AbsMagn    -3.3302146949073395
	LumBol     12302.687708123815342415404364751 // log(L) = 4.09
	Teff       24547.089156850303560827217406745 // log(T) = 4.39
	Age        0

	Orbit
    {
		PeriodDays      14.8106
		Eccentricity    0.45
		ArgOfPericenter 191
		Epoch           2456058.94
		Inclination     12
		MeanAnomaly     0
    }
}

Star	"[MT91] 292 B"
{
	ParentBody     "[MT91] 292"
	Class          "F" // B-F
	MassSol        1.6

	Orbit
    {
		PeriodDays      14.8106
		Eccentricity    0.45
		ArgOfPericenter 11
		Epoch           2456058.94
		Inclination     12
		MeanAnomaly     0
    }
}

// [MT91] 103
Star	"[MT91] 103 A"
{
	ParentBody "[MT91] 103"
	Class      "B1V"
	MassSol    14.2
	Radius     4027867.394068744 // Calculated
	AbsMagn    -3.2
	LumBol     10964.781961431850131437136061411 // log(L) = 4.04
	Teff       24547.089156850303560827217406745 // log(T) = 4.39
	Age        0.01

	Orbit
    {
		PeriodDays      22.104
		Eccentricity    0.32
		ArgOfPericenter 26
		Epoch           2455757.2
		Inclination     50
		MeanAnomaly     0
    }
}

Star	"[MT91] 103 B"
{
	ParentBody     "[MT91] 103"
	Class          "B2V"
	MassSol        10.9
	AbsMagn       -2.45

	Orbit
    {
		PeriodDays      22.104
		Eccentricity    0.32
		ArgOfPericenter 206
		Epoch           2455757.2
		Inclination     50
		MeanAnomaly     0
    }
}

// [MT91] 403
Star	"[MT91] 403 A"
{
	ParentBody "[MT91] 403"
	Class      "O6V"
	MassSol    14
	Radius     5188898.364688451 // Calculated
	AbsMagn    -3.7789889778836354
	LumBol     13803.84264602884837842712489908 // log(L) = 4.14
	Teff       22908.676527677730457240849198746 // log(T) = 4.36
	Age        0.01

	Orbit
    {
		PeriodDays      16.6379
		Eccentricity    0.29
		ArgOfPericenter 260
		Epoch           2455973.13
		Inclination     23 // 90
		MeanAnomaly     0
    }
}

Star	"[MT91] 403 B"
{
	ParentBody     "[MT91] 403"
	Class          "B:"
	MassSol        4

	Orbit
    {
		PeriodDays      16.6379
		Eccentricity    0.29
		ArgOfPericenter 80
		Epoch           2455973.13
		Inclination     23 // 90
		MeanAnomaly     0
    }
}

// [MT91] 252
Star	"[MT91] 252 A"
{
	ParentBody "[MT91] 252"
	Class      "B1-2V"
	MassSol    12.8 // M1*(sin(i)^3) = 1.6 (11 - 14)
	Radius     2483562.903343621 // Calculated
	AbsMagn    -2.488604793882331
	LumBol     3162.2776601683793319988935444327 // log(L) = 3.50
	Teff       22908.676527677730457240849198746 // log(T) = 4.36
	Age        0.00465

	Orbit
    {
		PeriodDays      9.558
		Eccentricity    0.25
		ArgOfPericenter 326
		Epoch           2454704.7
		Inclination     30 // 40
		MeanAnomaly     0
    }
}

Star	"[MT91] 252 B"
{
	ParentBody     "[MT91] 252"
	Class          "B1-2V"
	MassSol        12 // M1*(sin(i)^3) = 1.4 (11 - 14)

	Orbit
    {
		PeriodDays      9.558
		Eccentricity    0.25
		ArgOfPericenter 146
		Epoch           2454704.7
		Inclination     30 // 40
		MeanAnomaly     0
    }
}

// [MT91] 202
Star	"[MT91] 202 A"
{
	ParentBody "[MT91] 202"
	Class      "B2V"
	MassSol    11 // Adopted
	Radius     1995607.668927753 // Calculated
	AbsMagn    -1.640241395329637
	LumBol     1698.2436524617443546253754515903 // log(L) = 3.23
	Teff       21877.616239495525622261149163842 // log(T) = 4.34
	Age        0

	Orbit
    {
		PeriodDays      43.05
		Eccentricity    0.24
		ArgOfPericenter 160
		Epoch           2456468.29
		Inclination     15 // 90
		MeanAnomaly     0
    }
}

Star	"[MT91] 202 B"
{
	ParentBody     "[MT91] 202"
	Class          "A" // B-A
	MassSol        2 // 11

	Orbit
    {
		PeriodDays      43.05
		Eccentricity    0.24
		ArgOfPericenter 340
		Epoch           2456468.29
		Inclination     15 // 90
		MeanAnomaly     0
    }
}

// [MT91] 234
Star	"[MT91] 234 A"
{
	ParentBody "[MT91] 234"
	Class      "B1.5V"
	MassSol    12 // Adopted
	Radius     2661185.596704649 // Calculated
	AbsMagn    -2.59616391378274
	LumBol     3019.9517204020161986311451785768 // log(L) = 3.48
	Teff       21877.616239495525622261149163842 // log(T) = 4.34
	Age        0.00863

	Orbit
    {
		PeriodDays      4996
		Eccentricity    0.12
		ArgOfPericenter 328
		Epoch           2455024
		Inclination     90
		MeanAnomaly     0
    }
}

Star	"[MT91] 234 B"
{
	ParentBody     "[MT91] 234"
	Class          "B"
	MassSol        17

	Orbit
    {
		PeriodDays      4996
		Eccentricity    0.12
		ArgOfPericenter 148
		Epoch           2455024
		Inclination     90
		MeanAnomaly     0
    }
}

// [MT91] 241
Star	"[MT91] 241 A"
{
	ParentBody "[MT91] 241"
	Class      "B1.5V"
	MassSol    12 // Adopted
	Radius     2213477.767519171 // Calculated
	AbsMagn    -1.7634263947218702
	LumBol     2089.2961308540394831222337357993 // log(L) = 3.32
	Teff       21877.616239495525622261149163842 // log(T) = 4.34
	Age        0

	Orbit
    {
		PeriodDays      671
		Eccentricity    0.45
		ArgOfPericenter 338
		Epoch           2525161
		Inclination     90
		MeanAnomaly     0
    }
}

Star	"[MT91] 241 B"
{
	ParentBody     "[MT91] 241"
	Class          "B" // Early B
	MassSol        4.6 // 11

	Orbit
    {
		PeriodDays      671
		Eccentricity    0.45
		ArgOfPericenter 158
		Epoch           2525161
		Inclination     90
		MeanAnomaly     0
    }
}

// [MT91] 295
Star	"[MT91] 295 A"
{
	ParentBody "[MT91] 295"
	Class      "B2V"
	MassSol    11 // Adopted
	Radius     1950182.092501061 // Calculated
	AbsMagn    -1.7390190941920487
	LumBol     1621.8100973589299728477914610505 // log(L) = 3.21
	Teff       21877.616239495525622261149163842 // log(T) = 4.34
	Age        0

	Orbit
    {
		PeriodDays      2.4628
		Eccentricity    0.30
		ArgOfPericenter 137
		Epoch           2456567.1
		Inclination     3 // 90
		MeanAnomaly     0
    }
}

Star	"[MT91] 295 B"
{
	ParentBody     "[MT91] 295"
	Class          "K" // B-K
	MassSol        0.3 // 11

	Orbit
    {
		PeriodDays      2.4628
		Eccentricity    0.30
		ArgOfPericenter 317
		Epoch           2456567.1
		Inclination     3 // 90
		MeanAnomaly     0
    }
}

// [MT91] 311
Star	"[MT91] 311 A"
{
	ParentBody "[MT91] 311"
	Class      "B2V"
	MassSol    3
	Radius     2138332.142936305 // Calculated
	AbsMagn    -2.382138725072811
	LumBol     1949.8445997580453235705348599877 // log(L) = 3.29
	Teff       21877.616239495525622261149163842 // log(T) = 4.34
	Age        0

	Orbit
    {
		PeriodDays      5.752
		Eccentricity    0 // Fixed
		ArgOfPericenter 341
		Epoch           2452149 // Fixed
		Inclination     42
		MeanAnomaly     0
    }
}

Star	"[MT91] 311 B"
{
	ParentBody     "[MT91] 311"
	Class          "B3V"
	MassSol        2.2

	Orbit
    {
		PeriodDays      5.752
		Eccentricity    0 // Fixed
		ArgOfPericenter 161
		Epoch           2452149 // Fixed
		Inclination     42
		MeanAnomaly     0
    }
}

// [MT91] 561
Star	"[MT91] 561 A"
{
	ParentBody "[MT91] 561"
	Class      "B2V"
	MassSol    11
	Radius     2371784.15961103 // Calculated
	AbsMagn    -2.2303043681490813
	LumBol     2398.8329190194904653173971349271 // log(L) = 3.38
	Teff       21877.616239495525622261149163842 // log(T) = 4.34
	Age        0.00213

	Orbit
    {
		PeriodDays      40.09
		Eccentricity    0.05
		ArgOfPericenter 325
		Epoch           2455977
		Inclination     24
		MeanAnomaly     0
    }
}

Star	"[MT91] 561 B"
{
	ParentBody     "[MT91] 561"
	Class          "A1" // O-A1
	MassSol        3.3

	Orbit
    {
		PeriodDays      40.09
		Eccentricity    0.05
		ArgOfPericenter 145
		Epoch           2455977
		Inclination     24
		MeanAnomaly     0
    }
}

// [MT91] 174
Star	"[MT91] 174 A"
{
	ParentBody "[MT91] 174"
	Class      "B2III"
	MassSol    11
	Radius     3631408.988596499 // Calculated (real value is 10 RSun)
	AbsMagn    -3.0610069552956807
	LumBol     5623.4132519034908039495103977648 // log(L) = 3.38
	Teff       21877.616239495525622261149163842 // log(T) = 4.34
	Age        0.01

	Orbit
    {
		PeriodDays      4.536
		Eccentricity    0.53
		ArgOfPericenter 282
		Epoch           2455749.8
		Inclination     87 // 3
		MeanAnomaly     0
    }
}

Star	"[MT91] 174 B"
{
	ParentBody     "[MT91] 174"
	Class          ""
	MassSol        1.4 // 0.35 - 11?

	Orbit
    {
		PeriodDays      4.536
		Eccentricity    0.53
		ArgOfPericenter 102
		Epoch           2455749.8
		Inclination     87 // 3
		MeanAnomaly     0
    }
}

// [MT91] 21
Barycenter "[MT91] 21 AB"
{
	ParentBody     "[MT91] 21"
	BinaryOrbit
    {
		Separation      50 // Unknown
    }
}

Star	"[MT91] 21 A"
{
	ParentBody     "[MT91] 21 AB"
	Class          "B1.5V"
	MassSol        12
	Radius         2213477.767519171 // Calculated
	AbsMagn        -1.8479360597582293
	LumBol         2089.2961308540394831222337357993 // log(L) = 3.32
	Teff           30902.954325135905195513065388439 // log(T) = 4.34
	Age            0

	Orbit
    {
		PeriodDays      9.70
		Eccentricity    0.29
		ArgOfPericenter 81
		Epoch           2456336.58
		Inclination     16 // 85
		MeanAnomaly     0
    }
}

Star	"[MT91] 21 B"
{
	ParentBody     "[MT91] 21 AB"
	Class          "B"
	MassSol        2 // 11

	Orbit
    {
		PeriodDays      9.70
		Eccentricity    0.29
		ArgOfPericenter 261
		Epoch           2456336.58
		Inclination     16 // 85
		MeanAnomaly     0
    }
}

Star	"[MT91] 21 C"
{
	ParentBody     "[MT91] 21"
	Class          ""
	MassSol        0.5
}

// [MT91] 268
// This system has a moderate eccentricity, short period and extreme mass ratio,
// maybe dynamically unstable. A candidate 4th composition is mentioned in the 
// priginal paper but nothing is known about this object.
Barycenter "[MT91] 268 AC"
{
	ParentBody     "[MT91] 268"
	BinaryOrbit
    {
		PeriodDays      33.327
		Eccentricity    0.41
		ArgOfPericenter 256
		Epoch           2456667.7
		Inclination     33 // 90
		MeanAnomaly     0
    }
}

Star	"[MT91] 268 A"
{
	ParentBody     "[MT91] 268 AC"
	Class          "B2V"
	MassSol        9
	Radius         2723172.572266344 // Calculated
	AbsMagn        -1.8940559409542983
	LumBol         1995.2623149688796013524553967395 // log(L) = 3.30
	Teff           19498.445997580453235705348599877 // log(T) = 4.29
	Age            0.01

	Orbit
    {
		PeriodDays      5.082
		Eccentricity    0.48
		ArgOfPericenter 294
		Epoch           2456528.8
		Inclination     33 // 90
		MeanAnomaly     0
    }
}

Star	"[MT91] 268 C"
{
	ParentBody     "[MT91] 268 AC"
	Class          "G" // B-G
	MassSol        0.7

	Orbit
    {
		PeriodDays      5.082
		Eccentricity    0.48
		ArgOfPericenter 114
		Epoch           2456528.8
		Inclination     33 // 90
		MeanAnomaly     0
    }
}

Star	"[MT91] 268 B"
{
	ParentBody     "[MT91] 268"
	Class          "A" // midB-A
	MassSol        2.9 // 3.9 - 9
}

// [MT91] 336
Star	"[MT91] 336 A"
{
	ParentBody "[MT91] 336"
	Class      "B2V"
	MassSol    11
	Radius     2239108.632083462 // Calculated
	AbsMagn    -1.1872788998078097
	LumBol     933.25430079699104353209661168365 // log(L) = 2.97
	Teff       17782.794100389228012254211951927 // log(T) = 4.25
	Age        0.01

	Orbit
    {
		PeriodDays      2.04087
		Eccentricity    0.21
		ArgOfPericenter 0
		Inclination     3
		MeanAnomaly     0
    }
}

Star	"[MT91] 336 B"
{
	ParentBody     "[MT91] 336"
	Class          "M" // B-M
	MassSol        0.3

	Orbit
    {
		PeriodDays      2.04087
		Eccentricity    0.21
		ArgOfPericenter 180
		Inclination     3
		MeanAnomaly     0
    }
}

// [CPR2002] A32
// Nothing is known about the companion star.
Star	"[CPR2002] A32 A"
{
	ParentBody "[CPR2002] A32"
	Class      "O9.5IV"
	MassSol    26.1
	Radius     12209951.19717667 // Calculated
	AbsMagn    -5.24
	LumBol     269153.48039269157173991724067257 // log(L) = 5.43
	Teff       31382 // 34673.7
	Age        0.0049

	BinaryOrbit
    {
		PeriodDays      10 // ?
    }
}

Star	"[CPR2002] A32 B"
{
	ParentBody     "[CPR2002] A32"
	Class          "B?"
}

// [CPR2002] A36 (eclipsing binary of the Algol type?)
Remove "A36 A" {ParentBody "A36"}
Remove "A36 B" {ParentBody "A36"}
Star	"[CPR2002] A36 A"
{
	ParentBody "[CPR2002] A36"
	Class      "B0Ib"
	MassSol    19.8
	Radius     15343886.48524118 // Calculated
	AbsMagn    -5.78
	LumBol     173780.08287493754669995995617157 // log(L) = 5.24
	Teff       25094 // log(T) = 4.49
	Age        0.01
	Oblateness 0

	Orbit
    {
		PeriodDays      4.674
		Eccentricity    0.10
		ArgOfPericenter 359.2
		Epoch           2454693.836
		MeanAnomaly     0
    }
}

Star	"[CPR2002] A36 B"
{
	ParentBody     "[CPR2002] A36"
	Class          "B0III"
	MassSol        13.8
	Radius         5046000 //unknown, typical

	Orbit
    {
		PeriodDays      4.674
		Eccentricity    0.10
		ArgOfPericenter 179.2
		Epoch           2454693.836
		MeanAnomaly     0
    }
}

// [CPR2002] A45
Star	"[CPR2002] A45 A"
{
	ParentBody "[CPR2002] A45"
	Class      "B0.5V"
	MassSol    12.42543064561693126135459595528 // M1 * sin(i)^3 = 3.3 MSun
	Radius     5429589.486515289 // Calculated
	AbsMagn    -3.61
	LumBol     33884.415613920254704827359050211 // log(L) = 4.53
	Teff       28032 // 28183.8
	Age        0.0079
	Oblateness 0

	Orbit
    {
		PeriodDays      1.50181
		Eccentricity    0.05
		ArgOfPericenter 181
		Epoch           2472825
		Inclination     40 // 45
		MeanAnomaly     0
    }
}

Star	"[CPR2002] A45 B"
{
	ParentBody     "[CPR2002] A45"
	Class          "B1-2V"
	MassSol        8.6601486317936187579138093021649 // M2 * sin(i)^3 = 2.3 MSun

	Orbit
    {
		PeriodDays      1.50181
		Eccentricity    0.05
		ArgOfPericenter 1
		Epoch           2472825
		Inclination     40 // 45
		MeanAnomaly     0
    }
}