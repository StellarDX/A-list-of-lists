// 1.Godzilla (in Sunburst galaxy)
// https://en.wikipedia.org/wiki/Godzilla_Star
StarBarycenter "Godzilla Star in PSZ1 G311.65-18.48"
{
	RA      15 50 00.66
	Dec     -78 11 09.96
	Dist    3422792915
  AppMagn 22
  ForceAppMagn true
}

// 2.BAT99-98 (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/BAT99-98
Star "Brey 79/LMC AB 12/UCAC3 42-32386/[P93] 691/BAT99 98/2MASS J05383914-6906211/UCAC4 105-014273/Gaia DR2 4657679654981424640/Cl* NGC 2070 MEL 49/SSTISAGEMC J053839.14-690621.2/[H2013] LMCe 1387/Gaia DR3 4657679654981424640/Cl* NGC 2070 MEL J/TIC 404768953/[M2002] LMC 171429"
{
	/*Observation data*/
	RA      05 38 39.1442162640
	Dec     -69 06 21.297619692
	AppMagn 13.5
	/*Characteristics*/
	Class   "WN6"
	/*Astrometry*/
	Dist    49969.240927061175170820206403732 // random
	AbsMagn -8.11
	/*Details*/
	MassSol 226
	RadSol  37.5
	Luminosity 141000
	LumBol  5011853.566853108 // AbsMagnBol = -12.01
	Teff    44630
}

// 3.G0.238-0.071 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=MCD2010+G0.238-0.071
Star "[MCD2010] 18/[DWC2011] 56/[MCD2010] G0.238-0.071"
{
	/*Observation data*/
	RA      17 46 27.60
	Dec     -28 46 11.8
	AppMagnJ 14.370
	/*Characteristics*/
	Class   "OI"
	/*Astrometry*/
	Dist    8584
	/*Details*/
	Radius  33256777.109367445111274719238281 // Calculated, Value is 26802110.787650082260370254516602 when Teff = 44000
	LumBol  5011853.566853108 // AbsMagnBol = -12.01
	Teff    39500 // 44000
}

// 4.R136a1 (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/R136a1
Remove "R136a1 system"
Star "BAT99 108/RMC 136a1/[H2013] LMCe 1398/[P93] 954/Cl* NGC 2070 MH 498/[CHH92] 1/[HSH95] 3/[WO84] 1b"
{
	/*Observation data*/
	RA      05 38 42.39
	Dec     -69 06 02.91
	AppMagn 12.77
	/*Characteristics*/
	Class   "WN5h"
	/*Astrometry*/
	Dist    49970
	AbsMagn -8.18
	/*Details*/
	MassSol 196
	RadSol  34.1
	LumBol  4698923.488557426 // MBol = -11.94
	Teff    46000
	Age     0.00114
}

// 5.M33-013406.63 (in Triangulum Galaxy)
// https://en.wikipedia.org/wiki/M33-013406.63
StarBarycenter "[HS80] B416/LGGS J013406.63+304147.8/[S92b] S145/Gaia DR2 303380207572866176/[CKF95] Em 24/[MBH96] 301/[SM2006] W11324/Gaia DR3 303380207572866176"
{
	/*Observation data*/
	RA      01 34 06.5997126912
	Dec     +30 41 47.600148480
	AppMagn 16.084 // Combined
	/*Characteristics*/
	Class   "O9.5Ia"
	/*Astrometry*/
	Dist    862500
	AbsMagn -9.1 // Combined
}
