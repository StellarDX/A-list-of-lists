// Stars with orbital determination in EG97 star Catalog for the Sgr A* cluster.

// Reference:
// 1.Gillessen, S.; et al. (February 2017). "An Update on Monitoring Stellar 
// Orbits in the Galactic Center". The Astrophysical Journal. 837 (1): 30.
// https://iopscience.iop.org/article/10.3847/1538-4357/aa5c41 (S1-S112, S145-S146, S175, R34, R44)
// 2. Abuter, R.; Amorim, A.; Bauböck, M.; Berger, J. P.; Bonnet, H.; Brandner, 
// W.; Clénet, Y.; Coudé Du Foresto, V.; De Zeeuw, P. T.; Dexter, J.; Duvert, G.;
// Eckart, A.; Eisenhauer, F.; Förster Schreiber, N. M.; Garcia, P.; Gao, F.; 
// Gendron, E.; Genzel, R.; Gerhard, O.; Gillessen, S.; Habibi, M.; Haubois, X.;
// Henning, T.; Hippler, S.; Horrobin, M.; Jiménez-Rosales, A.; Jocou, L.;
// Kervella, P.; Lacour, S.; et al. (April 2019). "A geometric distance measurement 
// to the Galactic center black hole with 0.3% uncertainty". Astronomy & Astrophysics. 625: L10.
// https://www.aanda.org/articles/aa/full_html/2019/05/aa35656-19/aa35656-19.html (S2)
// 3.Peißker, Florian; Eckart, Andreas; Parsa, Marzieh (January 2020). "S62 on 
// a 9.9 year orbit around SgrA*". The Astrophysical Journal. 889 (1): 61.
// https://iopscience.iop.org/article/10.3847/1538-4357/ab5afd (S62, S4711-S4715)

Star "[EG97] S1/[CRG2004] 14/[GKM98] S0-1/[PGM2006] E4/[SOG2003] 4/[GPE2000] 0.11/[SME2009] 3"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B0/2V"
    AppMagnK   14.74

	Orbit
	{
		Eccentricity    0.556
		Inclination     119.14
		AscendingNode   342.04
		ArgOfPericenter 122.3
		Epoch           2452201.969355905894190
        PericenterDist  2160.7
		MeanAnomaly     0
	}
}

Star "[EG97] S2/[CRG2004] 13/[FNS2015] 2314/[GPE2000] 0.15/[SME2009] 2/[GKM98] S0-2/[PGM2006] E1/[SOG2003] 1"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B0/2V"
    AppMagnK   14.15
	MassSol    14 // 10 - 15

	/*Orbit // Down-sampled data
	{
		Eccentricity    0.884282
		Inclination     133.911
		AscendingNode   228.067
		ArgOfPericenter 66.250
		Epoch           2458257.319769496098161
        PericenterDist  118.4
		MeanAnomaly     0
	}*/

	/*Orbit // Noise model fit
	{
		Eccentricity    0.884293
		Inclination     133.904
		AscendingNode   228.075
		ArgOfPericenter 66.253
		Epoch           2458257.319769496098161
        PericenterDist  118.4
		MeanAnomaly     0
	}*/

	Orbit // GRAVITY only
	{
		Eccentricity    0.884288
		Inclination     133.883
		AscendingNode   228.091
		ArgOfPericenter 66.257
		Epoch           2458257.283245276194066
        PericenterDist  118.4
		MeanAnomaly     0
	}
}

Star "[EG97] S4/[CRG2004] 8/[GKM98] S0-3/[PGM2006] E6/[SOG2003] 6/[GPE2000] 0.22/[SME2009] 5"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B0/2V"
    AppMagnK   14.54

	Orbit
	{
		Eccentricity    0.3905
		Inclination     80.33
		AscendingNode   258.84
		ArgOfPericenter 290.8
		Epoch           2435985.215730029623955
        PericenterDist  1779.7
		MeanAnomaly     0
	}
}

Star "[EG97] S5/[GPE2000] 0.33/[SME2009] 11/[GKM98] S0-26/[PGM2006] E8/[SOG2003] 12"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B4/9V"
	AppMagnK   15.15

	Orbit // citation needed
	{
		SemiMajorAxis   2082.5
		Eccentricity    0.842
		Inclination     143.7
		AscendingNode   109
		ArgOfPericenter 236.3
		Epoch           2445554.9
		MeanAnomaly     0
	}
}

Star "[EG97] S6/[GPE2000] 0.46/[SME2009] 13/[GKM98] S0-7/[PGM2006] E11/[SOG2003] 18"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B:V"
	AppMagnK   15.36

	Orbit
	{
		Eccentricity    0.8400
		Inclination     87.24
		AscendingNode   85.07
		ArgOfPericenter 116.23
		Epoch           2491213.488607704639435
		PericenterDist  860.3
		MeanAnomaly     0
	}
}

Star "[EG97] S8/[CRG2004] 6/[GKM98] S0-4/[PGM2006] E10/[SOG2003] 17/[GPE2000] 0.34/[SME2009] 12"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B0/2V"
	AppMagnK   14.39

	Orbit
	{
		Eccentricity    0.8031
		Inclination     74.37
		AscendingNode   315.43
		ArgOfPericenter 346.70
		Epoch           2445569.171026042662561
		PericenterDist  651.7
		MeanAnomaly     0
	}
}

Star "[EG97] S9/[CRG2004] 9/[GKM98] S0-5/[PGM2006] E9/[SOG2003] 13/[GPE2000] 0.35/[SME2009] 9"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B0/2V"
	AppMagnK   15.13

	Orbit
	{
		Eccentricity    0.644
		Inclination     82.41
		AscendingNode   156.60
		ArgOfPericenter 150.6
		Epoch           2443038.042588490527123
		PericenterDist  793.2
		MeanAnomaly     0
	}
}

Star "[EG97] S12/[CRG2004] 15/[GKM98] S0-19/[SME2009] 6/[PGM2006] E5/[SOG2003] 5"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B4/9V"
	AppMagnK   15.49

	Orbit
	{
		Eccentricity    0.8883
		Inclination     33.56
		AscendingNode   230.1
		ArgOfPericenter 317.9
		Epoch           2449933.815301475580782
		PericenterDist  272.9
		MeanAnomaly     0
	}
}

Star "[EG97] S13/[GKM98] S0-20/[PGM2006] E3/[SOG2003] 3"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B4/9V"
	AppMagnK   15.86

	Orbit
	{
		Eccentricity    0.4250
		Inclination     24.70
		AscendingNode   74.5
		ArgOfPericenter 245.2
		Epoch           2453319.610484175849706
		PericenterDist  1242.0
		MeanAnomaly     0
	}
}

Star "[EG97] S14/[GKM98] S0-16/[PGM2006] E2/[SOG2003] 2"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B4/9V"
	AppMagnK   15.68

	Orbit
	{
		Eccentricity    0.9761
		Inclination     100.59
		AscendingNode   226.38
		ArgOfPericenter 334.59
		Epoch           2451588.362461953889579
		PericenterDist  56.0
		MeanAnomaly     0
	}
}

Star "[EG97] S17"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "K0III" // Itself multiple?
	AppMagnK   15.3

	Orbit
	{
		Eccentricity    0.397
		Inclination     96.83
		AscendingNode   191.62
		ArgOfPericenter 326.0
		Epoch           2448326.749626839533448
		PericenterDist  1755.3
		MeanAnomaly     0
	}
}

Star "[EG97] S18/[GKM98] S0-18/[GPE2000] 0.45/[SME2009] 10"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B2?"
	AppMagnK   15.23

	Orbit
	{
		Eccentricity    0.471
		Inclination     110.67
		AscendingNode   49.11
		ArgOfPericenter 349.46
		Epoch           2449301.946297584567219
		PericenterDist  1029.3
		MeanAnomaly     0
	}
}

Star "[EG97] S19/[GKM98] S0-28/[GPE2000] 0.56/[SME2009] 15"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "K III" // K-M
	AppMagnK   15.68

	Orbit
	{
		Eccentricity    0.606
		Inclination     69.67
		AscendingNode   335.64
		ArgOfPericenter 139.00
		Epoch           2453180.818448639009148
		PericenterDist  1063.3
		MeanAnomaly     0
	}
}

Star "[EG97] S21"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "K2III"
	AppMagnK   16.9

	Orbit
	{
		Eccentricity    0.764
		Inclination     58.8
		AscendingNode   259.64
		ArgOfPericenter 166.4
		Epoch           2461552.169644699431956
		PericenterDist  422.7
		MeanAnomaly     0
	}
}

Star "[EG97] S22"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B2?"
	AppMagnK   16.6

	Orbit
	{
		Eccentricity    0.449
		Inclination     105.76
		AscendingNode   291.7
		ArgOfPericenter 95
		Epoch           2450412.282581878826022
		PericenterDist  5903.7
		MeanAnomaly     0
	}
}

Star "[EG97] S23"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B?"
	AppMagnK   16.6

	Orbit
	{
		Eccentricity    0.56
		Inclination     48.0
		AscendingNode   249
		ArgOfPericenter 39.0
		Epoch           2460566.015707990620285
		PericenterDist  910.5
		MeanAnomaly     0
	}
}

Star "[EG97] S24"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "K3III"
	AppMagnK   15.6

	Orbit
	{
		Eccentricity    0.8970
		Inclination     103.67
		AscendingNode   7.93
		ArgOfPericenter 290
		Epoch           2460492.967268234584481
		PericenterDist  795.3
		MeanAnomaly     0
	}
}

Star "[EG97] S29"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B?"
	AppMagnK   16.7

	Orbit
	{
		Eccentricity    0.476
		Inclination     101.64
		AscendingNode   170.00
		ArgOfPericenter 350.70
		Epoch           2468703.611896831542253
		PericenterDist  952.2
		MeanAnomaly     0
	}
}

Star "[EG97] S31/[PGM2006] E7/[SOG2003] 14/[GKM98] S0-8/[SME2009] 8"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B4/9V"
	AppMagnK   15.66

	Orbit
	{
		Eccentricity    0.5497
		Inclination     109.03
		AscendingNode   137.16
		ArgOfPericenter 308.0
		Epoch           2458144.459930072538555
		PericenterDist  1653.7
		MeanAnomaly     0
	}
}

Star "[EG97] S33"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B2?"
	AppMagnK   16.0

	Orbit
	{
		Eccentricity    0.608
		Inclination     60.5
		AscendingNode   100.1
		ArgOfPericenter 303.7
		Epoch           2425247.095085868146271
		PericenterDist  2106.5
		MeanAnomaly     0
	}
}

Star "[EG97] S38/[GKM98] S0-38"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "G7.5III"
	AppMagnK   17.0

	Orbit
	{
		Eccentricity    0.804
		Inclination     159.86
		AscendingNode   98.43
		ArgOfPericenter 15.70
		Epoch           2452760.789920040871948
		PericenterDist  208.4
		MeanAnomaly     0
	}
}

Star "[EG97] S39"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "A?"
	AppMagnK   16.8

	Orbit
	{
		Eccentricity    0.9236
		Inclination     89.36
		AscendingNode   159.03
		ArgOfPericenter 23.3
		Epoch           2451566.447930026799440
		PericenterDist  231.2
		MeanAnomaly     0
	}
}

Star "[EG97] S42"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B5?"
	AppMagnK   17.5

	Orbit
	{
		Eccentricity    0.649
		Inclination     65.43
		AscendingNode   206.32
		ArgOfPericenter 39.89
		Epoch           2456033.360021118540317
		PericenterDist  3364.4
		MeanAnomaly     0
	}
}

Star "[EG97] S54"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B?"
	AppMagnK   17.5

	Orbit
	{
		Eccentricity    0.893
		Inclination     62.2
		AscendingNode   288.35
		ArgOfPericenter 140.8
		Epoch           2453173.513604663312435
		PericenterDist  1050.2
		MeanAnomaly     0
	}
}

Star "[EG97] S55/[GKM98] S0-102"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "A?"
	AppMagnK   17.5

	Orbit
	{
		Eccentricity    0.7209
		Inclination     150.1
		AscendingNode   325.5
		ArgOfPericenter 331.5
		Epoch           2454955.895534714683890
		PericenterDist  246.1
		MeanAnomaly     0
	}
}

Star "[EG97] S60"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B5?"
	AppMagnK   16.3

	Orbit
	{
		Eccentricity    0.833
		Inclination     132.43
		AscendingNode   206.40
		ArgOfPericenter 50.31
		Epoch           2459397.240671891719103
		PericenterDist  894.5
		MeanAnomaly     0
	}
}

Star "[EG97] S62"
{
	ParentBody "Milky Way Central Black Hole"
	Class      ""
	AppMagnK   16.1
	MassSol    6.1 // New data published in 2020.08
	//MassSol    2.2 // Assume a = 3.5 (2020.01)
	//RadSol     2.06

	Orbit
	{
		Eccentricity    0.976
		Inclination     72.76
		AscendingNode   122.61
		ArgOfPericenter 42.62
		Epoch           2452760.789920040871948
		PericenterDist  16.4
		MeanAnomaly     0
	}
}

Star "[EG97] S64"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B?"

	Orbit
	{
		SemiMajorAxis   3279.6104193288264 // 15.90 mpc
		Eccentricity    0.354
		Inclination     114.21
		AscendingNode   167.11
		ArgOfPericenter 155.11
		Epoch           2453575.280023322440684
		MeanAnomaly     0
	}
}

Star "[RGH2007] GEN-0.06-1.01/[EG97] S66/[PGM2006] E17/[SME2009] 28/[GKM98] S1-2/[SOG2003] 37"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "O-B"
	AppMagnK   16.1

	Orbit
	{
		Eccentricity    0.128
		Inclination     128.5
		AscendingNode   92.3
		ArgOfPericenter 134
		Epoch           2367904.069877251051366
		PericenterDist  10712.4
		MeanAnomaly     0
	}
}

Star "[EG97] S67/[GKM98] S1-3/[RGH2007] GEN+0.57+0.84/[SOG2003] 32/[FNS2015] 562/[PGM2006] E15/[SME2009] 30"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "O-B"
	AppMagnK   12.10

	Orbit
	{
		Eccentricity    0.293
		Inclination     136.0
		AscendingNode   96.5
		ArgOfPericenter 213.5
		Epoch           2343798.084757705219090
		PericenterDist  6511.2
		MeanAnomaly     0
	}
}

Star "[EG97] S71"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "B2?"
	AppMagnK   16.1

	Orbit
	{
		Eccentricity    0.899
		Inclination     74.0
		AscendingNode   35.16
		ArgOfPericenter 337.8
		Epoch           2340145.662769895046949
		PericenterDist  803.8
		MeanAnomaly     0
	}
}

Star "[GEO97] W5/[EG97] S83/[GKM98] S0-15/[PGM2006] E16/[SOG2003] 33/[GPE2000] 0.91/[SME2009] 27"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "O9/9.5V"
	AppMagnK   13.70

	Orbit
	{
		Eccentricity    0.365
		Inclination     127.2
		AscendingNode   87.7
		ArgOfPericenter 203.6
		Epoch           2468637.868301050737500
		PericenterDist  7738.6
		MeanAnomaly     0
	}
}

Star "[EG97] S85"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "M0III?"
	AppMagnK   15.6

	Orbit
	{
		Eccentricity    0.78
		Inclination     84.78
		AscendingNode   107.36
		ArgOfPericenter 156.3
		Epoch           2426050.627923186402768
		PericenterDist  8277.1
		MeanAnomaly     0
	}
}

Star "[GEO97] W13/[EG97] S87/[GKM98] S1-12/[PGM2006] E21/[GPE2000] 1.32/[SME2009] 43"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "OI" // OBI?
	AppMagnK   13.56

	Orbit
	{
		Eccentricity    0.224
		Inclination     119.54
		AscendingNode   106.32
		ArgOfPericenter 336.1
		Epoch           1944223.119291291106492
		PericenterDist  17390.5
		MeanAnomaly     0
	}
}

Star "[EG97] S89"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "M0III?"
	AppMagnK   15.3

	Orbit
	{
		Eccentricity    0.639
		Inclination     87.61
		AscendingNode   238.99
		ArgOfPericenter 126.4
		Epoch           2372286.976262622978538
		PericenterDist  3191.8
		MeanAnomaly     0
	}
}

Star "[EG97] S91"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "O5?"
	AppMagnK   12.2

	Orbit
	{
		Eccentricity    0.303
		Inclination     114.49
		AscendingNode   105.35
		ArgOfPericenter 356.4
		Epoch           2125748.492085448000580
		PericenterDist  10928.4
		MeanAnomaly     0
	}
}

Star "GCIRS 16C/Sgr A IRS 16C/[BSE2009] 7/[GKM98] S1-11/[PMM2001] N2/[CRG2001b] 18/[GPE2000] 1.29/[SSR2003] 1/Gal Center IRS 16C/[DWC2011] 129/[NS2013] 2/[YRB2014] 1/WR 101l/[EG97] S96/[OEG99] 8/[BSD96] 74/[FNS2015] 260/[PGM2006] E20"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "WN9" // Ofpe/WN9
	AppMagnK   9.83

	Orbit
	{
		Eccentricity    0.174
		Inclination     126.36
		AscendingNode   115.66
		ArgOfPericenter 233.6
		Epoch           2322248.795029626227915
		PericenterDist  10127.0
		MeanAnomaly     0
	}
}

Barycenter "GCIRS 16SW/Sgr A IRS 16SW/[CRG2001b] 21/[GPE2000] 1.44/[SME2009] 48/[DWC2011] 156/[NS2013] 3/[SSR2003] 3/Gal Center IRS 16SW/[EG97] S97/[OEG99] 9/[YRB2014] 3/[BSD96] 71/[FNS2015] 97/[PGM2006] E23/[BSE2009] 15/[GKM98] S1-16/[PMM2001] N3"
{
	ParentBody "Milky Way Central Black Hole"
	AppMagnK   9.34
	Orbit
	{
		Eccentricity    0.35
		Inclination     113.0
		AscendingNode   113.2
		ArgOfPericenter 28
		Epoch           2499756.503637191839516
		PericenterDist  12333.9
		MeanAnomaly     0
	}
}

Star "GCIRS 16SW A"
{
	ParentBody "GCIRS 16SW"
	Class      "WN9" // Ofpe/WN9
	MassSol    50
	DimensionsSol (109, 116.4, 125.4)
	LumBol     1149207.2934155033 // MBol = -10.411
	Teff       24400

	Orbit
	{
		PeriodDays      19.4513
		Inclination     70.85
		Epoch           2451775.102
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "GCIRS 16SW B"
{
	ParentBody "GCIRS 16SW"
	Class      "WN9" // Ofpe/WN9
	MassSol    50
	DimensionsSol (109, 116.4, 125.4)
	LumBol     1149207.2934155033 // MBol = -10.411
	Teff       23500

	Orbit
	{
		PeriodDays      19.4513
		Inclination     70.85
		Epoch           2451775.102
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "[EG97] S102" // citation needed
{
	ParentBody	"Milky Way Central Black Hole"
	Class		"A5?"
	Luminosity  26  // 1/16 of S2 star

	Orbit
	{
		Epoch			2454983.5
		Period			11.5
		Eccentricity	0.68
		Inclination		151.1
		AscendingNode	175
		ArgOfPericen	185
		MeanAnomaly     0
	}
}

Star "[EG97] S111"
{
	ParentBody "Milky Way Central Black Hole"
	Class      "M0III?"
	AppMagnK   13.8

	Orbit
	{
		SemiMajorAxis   -100213 // -12.3'
		Eccentricity    1.092
		Inclination     102.68
		AscendingNode   52.34
		ArgOfPericenter 132.4
		Epoch           2432442.366401853505522
		MeanAnomaly     0
	}
}
