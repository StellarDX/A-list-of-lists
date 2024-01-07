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