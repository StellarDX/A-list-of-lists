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

// 6.Eta Car
// https://en.wikipedia.org/wiki/Eta_Carinae
Remove "ETA Car"
StarBarycenter	"海山二/ETA Car/2E 1043.1-5925/H 1044-59/4U 1053-58/EM* MWC 214/HR 4210/4U 1037-60/1ES 1043-59.4/IRAS 10431-5925/UCAC4 152-053215/1A 1044-59/0FGL J1045.6-5937/JCMTSE J104503.7-594102/V* Eta Car/3A 1042-595/1FGL J1045.2-5942/JCMTSF J104503.7-594102/WDS J10451-5941/1AGL J1043-5936/2FGL J1045.0-5941/JP11 1994/WEB 9578/1AGL J1044-5937/3FGL J1045.1-5941/LLNS 2725/WRAY 15-640/1AGLR J1044-5944/4FGL J1045.1-5940/LS 1868/2XMM J104503.4-594103/ALS 1868/1FHL J1045.0-5943/2MASS J10450360-5941040/XMMU J104503.8-594105/CD-59 3306/2FHL J1045.2-5942/MOST 1042-594/[AMM2003] 50/CEL 3689/3FHL J1045.1-5941/NOVA Car 1843/[ARV2008] 173/Cl Trumpler 16 183/GC 14799/PBC J1044.8-5942/[KRL2007b] 93/CPC 20 3145/GCRV 6693/PPM 339408/[S87b] IRS 23/CPD-59 2620/GCRV 6692/RAFGL 4114/AAVSO 1041-59/CSI-59 2620 41/GPS 1043-595/SAO 238429/Gaia DR3 5350358584482202880/CSI-59-10431/1H 1045-597/SKY# 20584/Gaia DR2 5350358580171706624/CXOCyg J104503.58-594103.7/HD 93308/SWIFT J1044.8-5941/1E 104306-5925.2/TIC 458859916/2E 2318/Hen 3-481/TYC 8626-2809-1"
{
	CenterOf "Eta Carinae Nebula"
    //Constellation	"Carina"
	RA       10 45 03.5455050
	Dec      -59 41 03.951060 // Mathc nebula
	AppMagn  -1 //7.6(Minor) //4.8(2011) //4.6(2013) //4.3(2018)

	Class   "OBepec"
  AppMagnU 6.37
  AppMagnB 6.82
  AppMagnR 4.9
  AppMagnJ 3.39
  AppMagnH 2.51
  AppMagnK 0.94

	Dist     2285 // 2300
  AbsMagn  -8.6 //(2012)
	//ForceSystemLum true // use provided AppMagn despite on actual components luminosity
}
