// Multiple star systems for 30 Dor
// Reference: 
// Joachim M Bestenlehner, Paul A Crowther, Patrick S Broos, Andrew M T Pollock, Leisa K Townsley
// "Melnick 33Na: a very massive colliding-wind binary system in 30 Doradus"
// https://academic.oup.com/mnras/article/510/4/6133/6448998

// VFTS 1022
Star	"VFTS 1022 A"
{
	ParentBody "VFTS 1022"
	Class      "WN?"
	AbsMagn    -7.05 // Calculated (Extinction +2)
	Radius     22617752.588087532669305801391602 // Calculated
	LumBol     3019940.410708304 // MBol = -11.46
	Teff       42200
	Oblateness 0
}

// Melnick 34, High Mass X-ray Binary
Star	"Melnick 34 A"
{
	ParentBody "Brey 84"
	Class      "WN5h"
	MassSol    148
	RadSol     19.3
	AbsMagn    -7.42
	LumBol     2691524.724151786 // MBol = -11.335
	Teff       53000
	Age        0.005

	Orbit
	{
		PeriodDays      154.55
		Eccentricity    0.68
		Inclination     50
		Epoch           2457671.2
		ArgOfPericenter 200.9
		MeanAnomaly     0
	}
}

Star	"Melnick 34 B"
{
	ParentBody "Brey 84"
	Class      "WN5h"
	MassSol    135
	RadSol     18.2
	LumBol     2344220.0362027865 // MBol = -11.185
	Teff       53000
	Age        0.006

	Orbit
	{
		PeriodDays      154.55
		Eccentricity    0.68
		Inclination     50
		Epoch           2457671.2
		ArgOfPericenter 20.9
		MeanAnomaly     0
	}
}

// R145
Star	"RMC 145 A"
{
	ParentBody     "RMC 145"
	Class          "WN6h"
    AbsMagn        -7.21
	MassSol        53
	RadSol         20
    LumBol         2240000
	Teff           50000

	Orbit
	{
		PeriodDays      158.760
		Eccentricity    0.788
		Inclination     39
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"RMC 145 B"
{
	ParentBody     "RMC 145"
	Class          "O3.5If*/WN7"
    AbsMagn        -7.43
	MassSol        54
	RadSol         26
    LumBol         2140000
	Teff           43000
	Age            0.0022

	Orbit
	{
		PeriodDays      158.760
		Eccentricity    0.788
		Inclination     39
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// HD 38282
// Reference: 
// Shenar, T.; Sana, H.; Marchant, P.; Pablo, B.; Richardson, N.; Moffat, A. 
// F. J.; Reeth, T. Van; Barbá, R. H.; Bowman, D. M.; Broos, P.; Crowther, P. A.; 
// Clark, J. S.; Koter, A. de; Mink, S. E. de; Dsilva, K. (2021-06-01). "The 
// Tarantula Massive Binary Monitoring - V. R 144: a wind-eclipsing binary with 
// a total mass ≳140 M⊙". Astronomy & Astrophysics. 650: A147. 
// arXiv:2104.03323. doi:10.1051/0004-6361/202140693. ISSN 0004-6361.
// https://www.aanda.org/articles/aa/full_html/2021/06/aa40693-21/aa40693-21.html
Star	"HD 38282 A"
{
	ParentBody     "HD 38282"
	Class          "WN5/6h"
    AbsMagn        -7.96
	MassSol        74
	RadSol         22
    LumBol         2754228.7033381664486312106594222 // log(L) = 6.44
	Teff           50000
	Age            0.00196

	Orbit
	{
		PeriodDays      74.2074
		Epoch           2458269.48
		Eccentricity    0.506
		Inclination     60.4
		AscendingNode   114
		ArgOfPericenter 304.6
		MeanAnomaly     0
	}
}

Star	"HD 38282 B"
{
	ParentBody     "HD 38282"
	Class          "WN6/7h"
	MassSol        69
	RadSol         26
	LumBol         2454708.9156850303560827217406745 // log(L) = 6.39
	Teff           45000
	Age            0.0021

	Orbit
	{
		PeriodDays      74.2074
		Epoch           2458269.48
		Eccentricity    0.506
		Inclination     60.4
		AscendingNode   114
		ArgOfPericenter 124.6
		MeanAnomaly     0
	}
}

// VFTS 506
// Reference:
// J. M.Bestenlehner, G.Grafener, J. S.Vink, F. Najarro, A. de Koter, H. Sana, C. J.Evans, P. A.Crowther,
// V. Henault-Brunet, A. Herrero, N. Langer, F. R. N. Schneider, S. Simon-Diaz,
// W. D.Taylor, and N. R. Walborn
// "The VLT-FLAMES Tarantula Survey XVII. Physical and wind properties of massive stars at the top of the main sequence"
// https://www.aanda.org/articles/aa/olm/2014/10/aa23643-14/aa23643-14.html
Star	"VFTS 506 A"
{
	ParentBody     "VFTS 506"
	Class          "N2V((n))((f*))" // ON2V((n))((f*))
	AbsMagn         -6.5
	MassSol         122
	Radius          13656923.69041021 // Calculated
	LumBol          1737800.8287493754669995995617157 // log(L) = 6.24
	Teff            47300 // TStar = 47700

	BinaryOrbit // orbit data is still unknown
	{
		RefPlane        "Equator"
		Period          4.10224559
		Eccentricity    0
		Inclination     0.012137413
		AscendingNode   0
		ArgOfPericenter -20.5442411
		MeanAnomaly     71.4032258
	}
}

Star	"VFTS 506 B"
{
	ParentBody     "VFTS 506"
	Class          "O"
}

// R140a
Star	"RMC 140a1"
{
	ParentBody     "RMC 140a"
	Class          "WN4"
	AbsMagn         -8.37
	Radius          25241578.88284165 // Calculated
	LumBol          1584887.2570494793 // MBol = -10.76
	Teff            34000

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0381957724
		Eccentricity    0
		Inclination     -1.41023111
		AscendingNode   0
		ArgOfPericenter 41.2644887
		MeanAnomaly     124.063908
	}
}

Star	"RMC 140a2"
{
	ParentBody     "RMC 140a"
	Class          "WC5"
}

// VFTS 542
Star	"Melnick 30 A"
{
	ParentBody      "VFTS 542"
	Class           "O2If*/WN5"
	AbsMagn         -6.5
	MassSol         53 // evol
	Radius          13946335.80054605 // Calculated
	LumBol          1445439.7707459275119314815458354 // log(L) = 6.16
	Teff            44700
	Oblateness      0

	Orbit
	{
		PeriodDays      4.6965
		Eccentricity    0
		Inclination     52
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"Melnick 30 B"
{
	ParentBody      "VFTS 542"
	Class           "B0V"

	Orbit
	{
		PeriodDays      4.6965
		Eccentricity    0
		Inclination     52
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// Melnick 33Na
Star	"Melnick 33Na A"
{
	ParentBody      "Cl* NGC 2070 SMB 33"
	Class           "C2.5If*" // OC2.5If*
	AbsMagn         -7.701337099801698 // Calculated (Extinction +3)
	// Spectroscopic analysis
	MassSol         90 // sp, Mbom = 106
	RadSol          15.8
	LumBol          1412537.5446227543021556078639302 // log(L) = 6.15
	Teff            50000
	// Recovered stellar parameters by BONNSAI
	// MassSol         83 // evo, Mini = 84
	// RadSol          13.9
	// LumBol          1202264.4346174129058326127151935 // log(L) = 6.08
	// Teff            50700
	Age             0.0009
	Oblateness      0

	Orbit
	{
		PeriodDays      18.319
		Epoch           2459146.03
		Eccentricity    0.334
		Inclination     52
		ArgOfPericenter 131.19
		MeanAnomaly     0
	}
}

Star	"Melnick 33Na B"
{
	ParentBody      "Cl* NGC 2070 SMB 33"
	Class           "O4V"
	// Spectroscopic analysis
	MassSol         66
	RadSol          12.8
	LumBol          602559.58607435774697130296573509 // log(L) = 5.78
	Teff            45000
	// Recovered stellar parameters by BONNSAI
	// MassSol         48 // evo, Mini = 47
	// RadSol          10.1
	// LumBol          457088.18961487502900031406443953 // log(L) = 5.66
	// Teff            45800
	Age             1.6

	Orbit
	{
		PeriodDays      18.319
		Epoch           2459146.03
		Eccentricity    0.334
		Inclination     52
		ArgOfPericenter 311.19
		MeanAnomaly     0
	}
}

// VFTS 427
Star	"VFTS 427 A"
{
	ParentBody "VFTS 427"
	Class      "WN8(h)"
	AbsMagn    -7.0
	MassSol    48
	Radius     16994524.59280568 // Calculated
	LumBol     1348962.8825916536092479477181649 // log(L) = 6.13
	Teff       39800
	Temperature 41600
	Oblateness 0
}

// RMC 139
Star	"RMC 139 A"
{
	ParentBody      "RMC 139"
	Class           "O6.5Iafc"
	AbsMagn         -6.553952206746429 // Calculated
	MassSol         89.7 // Spec, Mevol = 81.6
	Radius          22496580.85930955 // Calculated
	LumBol          1258920.6971291197 // MBol = -10.51
	Teff            34000

	Orbit
	{
		PeriodDays      153.94
		Eccentricity    0.38
		Inclination     71
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"RMC 139 B"
{
	ParentBody      "RMC 139"
	Class           "O6Iaf"

	Orbit
	{
		PeriodDays      153.94
		Eccentricity    0.38
		Inclination     71
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// VFTS 512
Star	"VFTS 512 A"
{
	ParentBody     "VFTS 512"
	Class          "O2V-III((f*))"
	AbsMagn        -6.1
	MassSol        93
	Radius         10848080.08676776 // Calculated
	LumBol         1096478.1961431850131437136061411 // log(L) = 6.04
	Teff           47300
	Temperature    47700

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0122987598
		Eccentricity    0.238310984
		Inclination     -1.28989196
		AscendingNode   0
		ArgOfPericenter 43.9499944
		MeanAnomaly     9.30987457
	}
}

Star	"VFTS 512 B"
{
	ParentBody     "VFTS 512"
	Class          "O?"
}

// VFTS 151
Star	"VFTS 151 A"
{
	ParentBody     "VFTS 151"
	Class          "O6.5II(f)p"
	AbsMagn        -6.36719869077446 // Calculated (+2)
	Radius         13472538.98842904 // Calculated
	LumBol         1071515.2924068486 // MBol = -10.335
	Teff           42200

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0570735815
		Eccentricity    0.173487167
		Inclination     2.45230789
		AscendingNode   0
		ArgOfPericenter 81.0715221
		MeanAnomaly     60.3056344
	}
}

Star	"VFTS 151 B"
{
	ParentBody     "VFTS 151"
	Class          "O?"
}

// VFTS 603
Star	"VFTS 603 A"
{
	ParentBody     "VFTS 603"
	Class          "O4III(fc)"
	AbsMagn        -6.3
	MassSol        85
	Radius         12718920.77936039 // Calculated
	LumBol         954992.58602143594972395937950148 // log(L) = 5.98
	Teff           42200
	Temperature    42300

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0260535654
		Eccentricity    0.0410109713
		Inclination     1.29925132
		AscendingNode   0
		ArgOfPericenter 75.8481017
		MeanAnomaly     37.3148561
	}
}

Star	"VFTS 603 B"
{
	ParentBody     "VFTS 603"
	Class          "O?"
}

// RMC 133
Star	"RMC 133 A"
{
	ParentBody     "RMC 133"
	Class          "O8II-III((f))"
	AbsMagn        -6.8
	MassSol        90
	Radius         16776427.11359092 // Calculated
	LumBol         1047128.5480508995334645020315281 // log(L) = 6.02
	Teff           37600
	Temperature    37700

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          10.2971215
		Eccentricity    0.32301902
		Inclination     -0.308959961
		AscendingNode   0
		ArgOfPericenter -51.8173256
		MeanAnomaly     135.850998
	}
}

Star	"RMC 133 B"
{
	ParentBody     "RMC 133"
	Class          "O?"
}

// VFTS 267
Star	"VFTS 267 A"
{
	ParentBody     "VFTS 267"
	Class          "O3III-I(n)f*"
	AbsMagn        -6.2
	MassSol        89
	Radius         11734379.1863319 // Calculated
	LumBol         1023292.9922807541309662751748199 // log(L) = 6.01
	Teff           44700
	Temperature    44900

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.124392896
		Eccentricity    0.738863677
		Inclination     0.210999489
		AscendingNode   0
		ArgOfPericenter 141.843688
		MeanAnomaly     -122.391855
	}
}

Star	"VFTS 267 B"
{
	ParentBody     "VFTS 267"
	Class          "O?"
}

// VFTS 599
Star	"VFTS 599 A"
{
	ParentBody     "VFTS 599"
	Class          "O3III(f*)"
	AbsMagn        -6.2
	MassSol        87
	Radius         11467272.10569269 // Calculated
	LumBol         977237.22095581068269707600696156 // log(L) = 5.99
	Teff           44700
	Temperature    44900
	Oblateness     0

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.00669506232
		Eccentricity    0
		Inclination     0.292358875
		AscendingNode   0
		ArgOfPericenter -118.778609
		MeanAnomaly     73.8395375
	}
}

Star	"VFTS 599 B"
{
	ParentBody     "VFTS 599"
	Class          "O?"
}

// RMC 135
Star	"RMC 135 A"
{
	ParentBody     "RMC 135"
	Class          "WN7h"
	AbsMagn        -5.013591665859398
	Radius         9271165.683113789 // Calculated
	LumBol         999996.2550084365 // MBol = -10.26
	Teff           50000

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          0.0138034707
		Eccentricity    0
		Inclination     -0.0696406364
		AscendingNode   0
		ArgOfPericenter 349.660113
		MeanAnomaly     -66.7815955
	}
}

Star	"RMC 135 B"
{
	ParentBody     "RMC 135"
	Class          "OB"
}

// VFTS 64
Star	"VFTS 64 A"
{
	ParentBody     "VFTS 64"
	Class          "O7.5II(f)"
	AbsMagn        -6.5
	MassSol        88
	Radius         14632179.49575324 // Calculated
	LumBol         1000000 // log(L) = 6.0
	Teff           39800
	Temperature    39900

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          10.1044392
		Eccentricity    0.803644728
		Inclination     1.0111146
		AscendingNode   0
		ArgOfPericenter -56.3078229
		MeanAnomaly     108.517793
	}
}

Star	"VFTS 64 B"
{
	ParentBody     "VFTS 64"
	Class          "O?"
}