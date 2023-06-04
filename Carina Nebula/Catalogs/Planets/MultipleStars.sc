// HD 93129
// Aa and Ab Orbit data is available at:
// http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=93128
Barycenter	"HD 93129 A"
{
	ParentBody     "HD 93129"
	BinaryOrbit
	{
		Separation      6852
		Period          76918
	}
}

// Orbit Aa,Ab. q=0.49. Aa might be a tight binary. Analoque of eta Car
Star	"HD 93129 Aa"
{
	ParentBody     "HD 93129 A"
	Class          "O2If"
	MassSol        110
	RadSol         22.5
	AbsMagn        -6.1
	LumBol         1479102.8489197718 // MBol = -10.685
	Teff           42500

	Orbit
	{
		PeriodDays      121
		Epoch           2457972.79609665
		//Eccentricity    0.967 // too big
		AscendingNode   192
		ArgOfPericenter 348
		Inclination     117
		MeanAnomaly     0
	}
}

Star	"HD 93129 Ab"
{
	ParentBody     "HD 93129 A"
	Class          "O3.5V"
	MassSol        70
	RadSol         13.1
	AbsMagn        -5.2
	Luminosity     575000
	Teff           44000

	Orbit
	{
		PeriodDays      121
		Epoch           2457972.79609665
		//Eccentricity    0.967
		AscendingNode   192
		ArgOfPericenter 168
		Inclination     117
		MeanAnomaly     0
	}
}

// DR2: plx(B)=0.382mas, PM=[-6.6,2.3]. Other CPM at 4.86", 6.35" - cluster!
Star	"HD 93129 B"
{
	ParentBody     "HD 93129"
	Class          "O3.5V((f))z"
	MassSol        52
	RadSol         13
	AbsMagn        -4.9
	Luminosity     575000
	Teff           44000
}

// HD 93128, Spectroscopic Binary
Star	"HD 93128 A"
{
	ParentBody     "HD 93128"
	Class          "O3.5V((fc))z"
	MassSol        75
	Radius         7813392.1305077970027923583984375 // Calculated
	AbsMagn        -5.4
	LumBol         787042.8422152558 // MBol = -10
	Teff           51300

	Orbit // Genenrated
	{
		RefPlane        "Equator"
		Period          0.909088969
		Eccentricity    0.678464592
		Inclination     -0.907129765
		AscendingNode   0
		ArgOfPericenter 7.59098084
		MeanAnomaly     112.445871
	}
}

Star	"HD 93128 B"
{
	ParentBody     "HD 93128"
	Class          "B5?"

	Orbit // Genenrated
	{
		RefPlane        "Equator"
		Period          0.909088969
		Eccentricity    0.678464592
		Inclination     -0.907129765
		AscendingNode   0
		ArgOfPericenter 187.59098084
		MeanAnomaly     112.445871
	}
}

// HD 93160, Spectroscopic Binary
Star	"HD 93160 A"
{
	ParentBody     "HD 93160"
	Class          "O7III((f))"
	MassSol        62
	Radius         10770071.858801307156682014465332 // Calculated
	AbsMagn        -5.9
	LumBol         717791.6031377971 // MBol = -9.9
	Teff           42700

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.053884245
		Eccentricity    0.277201861
		Inclination     2.47765249
		AscendingNode   0
		ArgOfPericenter 239.201987
		MeanAnomaly     -121.551557
	}
}

Star	"HD 93160 B"
{
	ParentBody     "HD 93160"
	Class          "O7?"

	Orbit // Genenrated
	{
		RefPlane        "Equator"
		Period          0.053884245
		Eccentricity    0.277201861
		Inclination     2.47765249
		AscendingNode   0
		ArgOfPericenter 59.201987
		MeanAnomaly     -121.551557
	}
}

// HD 303311, Spectroscopic Binary
Star	"HD 303311 A"
{
	ParentBody     "HD 303311"
	Class          "O6V((f))z"
	MassSol        51
	Radius         6693796.4246862027794122695922852 // Calculated
	AbsMagn        -5
	LumBol         376702.3882313594 // MBol = -9.2
	Teff           46100

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          1.63716873
		Eccentricity    0.109518588
		Inclination     -0.333409548
		AscendingNode   0
		ArgOfPericenter 252.6216
		MeanAnomaly     -165.559996
	}
}

Star	"HD 303311 B"
{
	ParentBody     "HD 303311"
	Class          "B0?"

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          1.63716873
		Eccentricity    0.109518588
		Inclination     -0.333409548
		AscendingNode   0
		ArgOfPericenter 72.6216
		MeanAnomaly     -165.559996
	}
}

// HD 305516, Spectroscopic Binary
Star	"HD 305516 A"
{
	ParentBody     "HD 305516"
	Class          "B0.5V"
	MassSol        33
	Radius         4509219.4588881954550743103027344 // Calculated
	LumBol         136772.37034629364 // MBol = -8.1
	Teff           43600

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.763774205
		Eccentricity    0.535475969
		Inclination     -0.21974206
		AscendingNode   0
		ArgOfPericenter 41.9346162
		MeanAnomaly     -121.135341
	}
}

Star	"HD 305516 B"
{
	ParentBody     "HD 305516"
	Class          "B8?"

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.763774205
		Eccentricity    0.535475969
		Inclination     -0.21974206
		AscendingNode   0
		ArgOfPericenter 221.9346162
		MeanAnomaly     -121.135341
	}
}

// CPD-59 2610, Spectroscopic Binary
Star	"CPD-59 2610 A"
{
	ParentBody     "CPD-59 2610"
	Class          "O8.5V"
	// MassSol        31
	// Radius         4369116.4112412100657820701599121 // Calculated
	// LumBol         113762.30254188432 // MBol = -7.9
	// Teff           42300
	MassSol         29
	Radius          6472534.1573675908148288726806641 // Calculated
	AbsMagn         -4.6
	LumBol          149967.92191953154 // MBol = -8.2
	Teff            37239.170625456851889681830448131 // Log(T) = 4.571
 	Age             0.00263026799189538191728979879677 // Log(A) = 6.42

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          4.06712139
		Eccentricity    0.852214694
		Inclination     1.1347034
		AscendingNode   0
		ArgOfPericenter 127.014672
		MeanAnomaly     47.3627263
	}
}

Star	"CPD-59 2610 B"
{
	ParentBody     "CPD-59 2610"
	Class          "B0?"

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          4.06712139
		Eccentricity    0.852214694
		Inclination     1.1347034
		AscendingNode   0
		ArgOfPericenter 307.014672
		MeanAnomaly     47.3627263
	}
}

// WR 25
Star	"WR 25 A"
{
	ParentBody     "WR 25"
	Class          "O2.5If*/WN6"
	MassSol        98
	RadSol         20.24
	AbsMagn        -6.98
	LumBol         2398823.9354104507 // MBol = -11.21
	Teff           50100

	Orbit
	{
		PeriodDays      207.85
		Eccentricity    0.5
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"WR 25 B"
{
	ParentBody     "WR 25"
	Class          "OB"

	Orbit
	{
		PeriodDays      207.85
		Eccentricity    0.5
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// HD 93250
Star	"HD 93250 A"
{
	ParentBody     "HD 93250"
	Class          "O4III(fc)"
	MassSol        49
	RadSol         15.9
	AbsMagn        -6.98
	LumBol         1023289.1600571304 // MBol = -10.285
	Teff           46000
	Age            0.0013

	Orbit
	{
		PeriodDays      194.31
		Eccentricity    0.217
		Inclination     22
		AscendingNode   59
		ArgOfPericenter 351
		MeanAnomaly     0
	}
}

Star	"HD 93250 B"
{
	ParentBody     "HD 93250"
	Class          "O4?"
	MassSol        44.1 // 10% difference

	Orbit
	{
		PeriodDays      194.31
		Eccentricity    0.217
		Inclination     22
		AscendingNode   59
		ArgOfPericenter 171
		MeanAnomaly     0
	}
}

// V560 Car
Star	"V560 Car A"
{
	ParentBody     "V* V560 Car"
	Class          "O3.5Vf"
	MassSol        40 // 60
	RadSol         9.2
	AbsMagn        -5.87
	LumBol         1137623.0254188431 // MBol = -10.4
	Teff           51300

	Orbit
	{
		PeriodDays      6.0803
		Eccentricity    0.370
		Inclination     60
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"V560 Car B"
{
	ParentBody     "V* V560 Car"
	Class          "O8V"
	MassSol        17 // 25.3
	RadSol         7.0
	AbsMagn        -4.32
	LumBol         113762.30254188432 // MBol = -10.4
	Teff           38000
	Age            0.002

	Orbit
	{
		PeriodDays      6.0803
		Eccentricity    0.370
		Inclination     60
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// HD 303308
Star	"HD 303308 A"
{
	ParentBody     "HD 303308"
	Class          "O4.5V((fc))"
	MassSol        93
	Radius         9393763.4722291026264429092407227 // Calculated
	AbsMagn        -5.9
	LumBol         1137623.0254188431 // MBol = -10.4
	Teff           51300

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.122948305
		Eccentricity    0.616228044
		Inclination     1.37054813
		AscendingNode   0
		ArgOfPericenter 298.4802631
		MeanAnomaly     -109.493379
	}
}

Star	"HD 303308 B"
{
	ParentBody     "HD 303308"
	Class          "O6?"

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.122948305
		Eccentricity    0.616228044
		Inclination     1.37054813
		AscendingNode   0
		ArgOfPericenter 118.4802631
		MeanAnomaly     -109.493379
	}
}

// HD 93204, Eclipsing Binary
Star	"HD 93204 A"
{
	ParentBody     "HD 93204"
	Class          "O5.5V((f))"
	MassSol        59
	Radius         8047713.3739694198593497276306152 // Calculated
	AbsMagn        -5.4
	LumBol         544500.6136845797 // MBol = -9.6
	Teff           46100

	Orbit
	{
		PeriodDays      6.08399
		Inclination     90
		ArgOfPericenter 00
		MeanAnomaly     0
	}
}

Star	"HD 93204 B"
{
	ParentBody     "HD 93204"
	Class          "O7?"
	Orbit
	{
		PeriodDays      6.08399
		Inclination     90
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// CPD-59 2641
Star	"CPD-59 2641 A"
{
	ParentBody     "CPD-59 2641"
	Class          "O6V((fc))"
	MassSol        49
	Radius         7836125.3126687193289399147033691 // Calculated
	AbsMagn        -5.2
	LumBol         413045.95513075154 // MBol = -9.3
	Teff           43600

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          11.0579563
		Eccentricity    0.415032834
		Inclination     1.73102885
		AscendingNode   0
		ArgOfPericenter 160.109472
		MeanAnomaly     23.9492559
	}
}

Star	"CPD-59 2641 B"
{
	ParentBody     "CPD-59 2641"
	Class          "O7?"

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          11.0579563
		Eccentricity    0.415032834
		Inclination     1.73102885
		AscendingNode   0
		ArgOfPericenter 340.109472
		MeanAnomaly     23.9492559
	}
}

// CPD-59 2603 is a hierarchical triple system (Rauw et al. 2001MNRAS.326.1149R),
// made up of an O-type eclipsing binary (O7V+O9.5 V) and a B0.2IV type star.
// Reference: https://academic.oup.com/mnras/article/326/3/1149/956061?login=false
Barycenter "CPD-59 2603 AB"
{
	ParentBody     "CPD-59 2603"
	BinaryOrbit
	{
		PeriodDays      285.1
		Eccentricity    0.25
		ArgOfPericenter 107.0
		Epoch           2450174.6
		MeanAnomaly     0
	}

	/* BinaryOrbit
	{
		PeriodDays      1340.5
		Eccentricity    0.37
		ArgOfPericenter 58.3
		Epoch           2451264.8
		MeanAnomaly     0
	} */
}

Star	"CPD-59 2603 A"
{
	ParentBody     "CPD-59 2603 AB"
	Class          "O7V"
	MassSol        22.7
	RadSol         7.11
	AbsMagn        -5.2
	LumBol         91201.0839355909742120959407918728 // Log(LBol) = 4.96
	Teff           37500

	Orbit
	{
		Inclination     82.5
		PeriodDays      2.15287
		Epoch           2451621.973
		Eccentricity    0.02
		ArgOfPericenter 00
		MeanAnomaly     0
	}
}

Star	"CPD-59 2603 B"
{
	ParentBody     "CPD-59 2603 AB"
	Class          "O9.5V"
	MassSol        14.5
	RadSol         4.93
	AbsMagn        -3.7
	LumBol         25703.957827688638007003450825619 // Log(LBol) = 4.41
	Teff           32750

	Orbit
	{
		Inclination     82.5
		PeriodDays      2.15287
		Epoch           2451621.973
		Eccentricity    0.02
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"CPD-59 2603 B"
{
	ParentBody     "CPD-59 2603"
	Class          "B0.2IV"
	AbsMagn        -4.4
}

// CPD-59 2636
Star	"CPD-59 2636 A"
{
	ParentBody     "CPD-59 2636"
	Class          "O8V"
	MassSol        	37
	Radius          8358972.4139937805011868476867676
	AbsMagn         -5.2
	LumBol          285757.98417224723 // MBol = -8.9
	Teff            38500

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0498841304
		Eccentricity    0
		Inclination     1.32326746
		AscendingNode   0
		ArgOfPericenter 349.3665984
		MeanAnomaly     143.180249
	}
}

Star	"CPD-59 2636 B"
{
	ParentBody     "CPD-59 2636"
	Class          "O8V"

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0498841304
		Eccentricity    0
		Inclination     1.32326746
		AscendingNode   0
		ArgOfPericenter 169.3665984
		MeanAnomaly     143.180249
	}
}

// V731 Car, Eclipsing Binary
Star	"V731 Car A"
{
	ParentBody     "V* V731 Car"
	Class          "O8V(n)"
	MassSol        33
	Radius         7798094.0947021758183836936950684 // Calculated
	AbsMagn        -5
	LumBol         216769.59867861096 // MBol = -8.6
	Teff           37200

	Orbit
	{
		PeriodDays      6 // ?
		Inclination     90
		ArgOfPericenter 00
		MeanAnomaly     0
	}
}

Star	"V731 Car B"
{
	ParentBody     "V* V731 Car"
	Class          "O9.5V"
	Orbit
	{
		PeriodDays      6 // ?
		Inclination     90
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// CPD-59 2591
Star	"CPD-59 2591 A"
{
	ParentBody     "CPD-59 2591"
	Class          "O8.5V"
	MassSol        33
	Radius         4810086.5621116021648049354553223 // Calculated
	AbsMagn        -4
	LumBol         94623.36177156067 // MBol = -7.7
	Teff           38500

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.323441271
		Eccentricity    0.763718545
		Inclination     -2.1442194
		AscendingNode   0
		ArgOfPericenter 260.3095512
		MeanAnomaly     -74.6257249
	}
}

Star	"CPD-59 2591 B"
{
	ParentBody     "CPD-59 2591"
	Class          "B0.5:V:"

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.323441271
		Eccentricity    0.763718545
		Inclination     -2.1442194
		AscendingNode   0
		ArgOfPericenter 80.3095512
		MeanAnomaly     -74.6257249
	}
}

// QZ Car
Barycenter "HD 93206 A/TYC 8626-2523-1/** SNA 15/WDS J10444-6000Aa,Av/** HDS 1534A/CCDM J10444-6000A/SBC9 1948"
{
	ParentBody     "HD 93206"
	BinaryOrbit
	{
		Period          25.4
		//Separation      35
		Eccentricity    0
		Inclination     60
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 93206 A1"
{
	ParentBody     "HD 93206 A"
	Class          "O9.7I"
	MassSol        69.8
	RadSol         22.1
	AbsMagn        -9.2
	LumBol         400000
	Teff           29564

	Orbit
	{
		PeriodDays      20.72
		//Separation      116RSun
		Eccentricity    0.34
		Inclination     60
		ArgOfPericenter 321
		MeanAnomaly     0
	}
}

Star "HD 93206 A2"
{
	ParentBody     "HD 93206 A"
	Class          "B2V"
	MassSol        8.85
	RadSol         3.0
	AbsMagn        -3
	LumBol         1260
	Teff           23446

	Orbit
	{
		PeriodDays      20.72
		//Separation      116RSun
		Eccentricity    0.34
		Inclination     60
		ArgOfPericenter 141
		MeanAnomaly     0
	}
}

Barycenter "HD 93206 B/TYC 8626-2523-2/CCDM J10444-6000D/SBC9 635/** HDS 1534B/WDS J10444-6000Ab"
{
	ParentBody     "HD 93206"
}

Star "HD 93206 B1"
{
	ParentBody     "HD 93206 B"
	Class          "O8III"
	MassSol        25.5
	RadSol         13.7
	AbsMagn        -8.5
	LumBol         200000
	Teff           29687

	Orbit
	{
		PeriodDays      5.999
		//Separation      49RSun
		Eccentricity    0.1
		Inclination     86
		ArgOfPericenter 200
		MeanAnomaly     0
	}
}

Star "HD 93206 B2"
{
	ParentBody     "HD 93206 B"
	Class          "O9V"
	MassSol        33.2
	RadSol         7.53
	AbsMagn        -7
	LumBol         50100
	Teff           32979

	Orbit
	{
		PeriodDays      5.999
		//Separation      49RSun
		Eccentricity    0.1
		Inclination     86
		ArgOfPericenter 20
		MeanAnomaly     0
	}
}

// V661 Car
Star	"HD 93130 A"
{
	ParentBody     "HD 93130"
	Class          "O7II(f)"
	MassSol        68
	Radius         13523040.571808718144893646240234 // Calculated
	AbsMagn        -6.3
	LumBol         862975.3159195893 // MBol = -10.1
	Teff           39902.490236214207163891099410669 // Log(T) = 4.601

	Orbit // Generate
	{
		RefPlane        "Equator"
		Period          0.0433029185
		Eccentricity    0.408285928
		Inclination     -1.79056931
		AscendingNode   0
		ArgOfPericenter -155.325968
		MeanAnomaly     101.181586
	}
}

Star	"HD 93130 B"
{
	ParentBody     "HD 93130"
	Class          "O?"

	Orbit // Generate
	{
		RefPlane        "Equator"
		Period          0.0433029185
		Eccentricity    0.408285928
		Inclination     -1.79056931
		AscendingNode   0
		ArgOfPericenter 24.674032
		MeanAnomaly     101.181586
	}
}

// CPD-59 2673
Star	"CPD-59 2673 A"
{
	ParentBody     "CPD-59 2673"
	Class          "O5V"
	MassSol        47
	Radius         6096412.5859632715582847595214844 // Calculated
	AbsMagn        -4.8
	LumBol         313327.3990186982 // MBol = -9.0
	Teff           46131.757456037939056205060112337 // Log(T) = 4.664

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0557283821
		Eccentricity    0.603686564
		Inclination     0.178480387
		AscendingNode   0
		ArgOfPericenter 40.5039003
		MeanAnomaly     24.9465496
	}
}

Star	"CPD-59 2673 B"
{
	ParentBody     "CPD-59 2673"
	Class          "O9.6 V" // ?

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0557283821
		Eccentricity    0.603686564
		Inclination     0.178480387
		AscendingNode   0
		ArgOfPericenter 220.5039003
		MeanAnomaly     24.9465496
	}
}

// HD 305438

Star	"HD 305438 A"
{
	ParentBody     "HD 305438"
	Class          "O8V"
	MassSol        32
	Radius         6653870.6039541894569993019104004 // Calculated
	AbsMagn        -4.6
	LumBol         180301.09885733417 // MBol = -8.4
	Teff           38459.178204535356688650940629848 // Log(T) = 4.585
	Age            0.00218776162394955256222611491638 // Log(A) = 6.34

	Orbit // Generate
	{
		RefPlane        "Equator"
		Period          16.9580331
		Eccentricity    0.175493851
		Inclination     -0.143057346
		AscendingNode   0
		ArgOfPericenter 104.313276
		MeanAnomaly     20.5602555
	}
}

Star	"HD 305438 B"
{
	ParentBody     "HD 305438"
	Class          "O9?"

	Orbit // Generate
	{
		RefPlane        "Equator"
		Period          16.9580331
		Eccentricity    0.175493851
		Inclination     -0.143057346
		AscendingNode   0
		ArgOfPericenter 284.313276
		MeanAnomaly     20.5602555
	}
}

// HD 93028
Star	"HD 93028 A"
{
	ParentBody     "HD 93028"
	Class          "O8.5III"
	MassSol        30
	Radius         7710354.586648346856236457824707 // Calculated
	AbsMagn        -4.9
	LumBol         180301.09885733417 // MBol = -8.4
	Teff           35727.283815192890246006095951693 // Log(T) = 4.553
	Age            0.0034673685045253163945291131706 // Log(A) = 6.54

	Orbit // Generate
	{
		RefPlane        "Equator"
		Period          36.1700666
		Eccentricity    0.351208911
		Inclination     0.54185617
		AscendingNode   0
		ArgOfPericenter -121.535448
		MeanAnomaly     -25.3221589
	}
}

Star	"HD 93028 B"
{
	ParentBody     "HD 93028"
	Class          "O9?"

	Orbit // Generate
	{
		RefPlane        "Equator"
		Period          36.1700666
		Eccentricity    0.351208911
		Inclination     0.54185617
		AscendingNode   0
		ArgOfPericenter 58.4645518
		MeanAnomaly     -25.3221589
	}
}