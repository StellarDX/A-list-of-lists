// 1.Godzilla (in Sunburst galaxy)
// https://en.wikipedia.org/wiki/Godzilla_Star

// 1.5 NGC 2363-V1 (in NGC 2366)
// https://en.wikipedia.org/wiki/NGC_2363-V1
Star "[DRR96] NGC 2363 V1"
{
	/*Observation data*/
	RA      07 28 43.37
	Dec     +69 11 23.9
	AppMagn 17.88
	/*Characteristics*/
	Class   "B 0"
	/*Astrometry*/
	Dist    956279 // Match galaxy
	AbsMagn -10.25
	/*Details*/
	MassSol 20
	RadSol  194 // 356
	LumBol  6309549.81550261 // AbsMagnBol = -12.26
	Teff    13500 // 26000
	FeH     -1 // -0.6
	Age     0.004 // 0.005
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

// 4.R136a1 (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/R136a1

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

// 7.Westerhout 49-2 (in Westerhout 49)
// https://en.wikipedia.org/wiki/Westerhout_49-2
Star "OH 43.165 -0.028/2MASS J19102185+0905025/MSX6C G043.1650-00.0285/SSTOERC G043.1651-00.0285/[TVH89] 387/CORNISH G043.1651-00.0283/TIC 202340617/[WBB2016] 2/GPSR 043.166-0.029/OH 43.2 +0.0/[SVM2001b] 280"
{
	/*Observation data*/
	RA      19 10 21.819
	Dec     +09 05 02.83
	//AppMagnJ 18.246
	/*Characteristics*/
	Class   "O2If*" // O2-3.5If*
	/*Astrometry*/
	Dist    11100
	/*Details*/
	MassSol 250
	RadSol  55.29
	LumBol  4365141.974920565 // MBol = -11.86
	Teff    35500
}

// 8.Sk -69° 249 A (in NGC 2074 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Sk+-69+249
StarBarycenter "HD 269927/CCDM J05390-6929A/CPD-69 468/LMC AB 13/UCAC4 103-017179/** I 742AB/GSC 09167-00759/2MASS J05385885-6929228/uvby98 100269927/** TDS 3273/SK -69 249/WDS J05390-6929AB"
{
	/*Observation data*/
	RA      05 38 58.856976
	Dec     -69 29 22.47504
	AppMagn 10.68 // Combined
	/*Characteristics*/
	Class   "B0I"
	/*Astrometry*/
	Dist    49950
}

// 9.V4998 Sagittarii (near Quintuplet Cluster)
// https://en.wikipedia.org/wiki/V4998_Sagittarii

// 10.R136c (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/R136c

// 11.Arches-F7 (WR 102aj in Arches Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=FNG2002+7

// 12.V1429 Aquilae
// https://en.wikipedia.org/wiki/V1429_Aquilae
StarBarycenter "BD+14 3887/HBHA 1203-09/MSX6C G049.5714+00.2502/V* V1429 Aql/AKARI-IRC-V1 J1921339+145257/Hen 3-1745/PLX 4531/WISEA J192133.97+145257.1/ALS 10258/Hilt 801/PLX 4531.00/WISE J192133.96+145257.0/AP J19213397+1452570/IRAS 19192+1447/TIC 338189559/[KW97] 37-7/EM* MWC 314/JP11 50/TYC 1054-441-1/Gaia DR2 4319930096909297664/GCRV 69340/LS II +14 11/UBV 16391/Gaia DR3 4319930096909297664/GEN# +0.01403887/2MASS J19213397+1452570/UBV M 670/Gaia DR1 4319930092602316800/GSC 01054-00441/MCW 730/UCAC2 37057820"
{
	/*Observation data*/
	RA      19 21 33.9771479376
	Dec     +14 52 56.910478296
	AppMagn 9.89
	/*Characteristics*/
	Class   "B3Ibe"
	/*Astrometry*/
	Dist    4496.4028776978417266187050359712 // Plx. = 0.2224 mas
	AbsMagn 8.2
}

// 13.R136a3 (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/R136a3

// 14.Melnick 42 (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/Melnick_42
Star "Brey 77/Cl* NGC 2070 SMB 10/TIC 404768889/[HSH95] 2/BAT99 105/CXOU J053842.1-690555/UCAC4 105-014306/[P93] 922/Cl* NGC 2070 MEL G/Dor IRS 95/[CCE2018] 2102/[PPL2002] CX4/Cl* NGC 2070 MEL 42/GEN# +6.20136077/[CHH92] 6002/[TBF2006] 73/Cl* NGC 2070 MH 374/2MASS J05384212-6905552/[H2013] LMCe 1395/Gaia DR3 4657685534828234496"
{
	/*Observation data*/
	RA      05 38 42.1044150840
	Dec     -69 05 55.335965424
	AppMagn 12.86
	/*Characteristics*/
	Class   "O2If*"
	/*Astrometry*/
	Dist    49970
	AbsMagn -7.4
	/*Details*/
	MassSol 189
	RadSol  21.1
	LumBol  3630766.9504584973 // MBol = -11.66
	Teff    47300
	Age     0.001
}

// 15.Mercer 23-2 (WR 125–3 in Mercer 23 near Galactic plane)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HKB2010b+Obj2

// 16.R136a2 (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/R136a2

// 17.NGC 2403 V14 (in NGC 2403)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=%5BHSG2019%5D%2010182-pr-2
Star "EV* N2403 V0014/TS V14/[HSG2019] 10182-pr-2/Gaia DR3 1089775697125470080"
{
	/*Observation data*/
	RA      07 36 56.2338311016
	Dec     +65 36 42.114663756
	AppMagn 19.30
	/*Characteristics*/
	Class   "F5Ie"
	/*Astrometry*/
	Dist    3250800
	/*Details*/
	Radius  876755039.7739582061767578125 // Calculated
	LumBol  3435566.612782578 // MBol = -11.6
	Teff    7000
}

// 18.G0.070+0.025 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=MCD2010+G0.070%2B0.025

// 19.Pistol Star (V4647 Sagittarii in Quintuplet cluster)
// https://en.wikipedia.org/wiki/Pistol_Star

// 20.Mercer 30-1 A (WR 46-3 A in Mercer 30 of Dragonfish Nebula)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=DNB2016+Mc30-1

// 21.VFTS 682 (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/VFTS_682
Star "UCAC4 105-014417/Dor IRS 153/VFTS 682/Gaia DR2 4657685637907503744/AP J05385552-6904267/IRSF J05385552-6904267/[GC2009] J053855.56-690426.5/Gaia DR3 4657685637907503744/DENIS J053855.5-690426/2MASS J05385552-6904267/[H2013] LMCe 1415/DENIS J053855.4-690425/TIC 404768640/[P93] 1732"
{
	/*Observation data*/
	RA      05 38 55.5222410976
	Dec     -69 04 26.809579344
	AppMagn 16.08
	/*Characteristics*/
	Class   "WN5h"
	/*Astrometry*/
	Dist    49955
	AbsMagn -6.83
	/*Details*/
	MassSol 137.8
	RadSol  20.2
	LumBol  3235924.4507411285 // MBol = -11.535
	Teff    54450
	Age     0.001
}

// 21.WR 42e (in HD 97950 of NGC 3603)
// https://en.wikipedia.org/wiki/WR_42e

// 22.R99 (in N44 of LMC)
// https://en.wikipedia.org/wiki/R99_(star)
Star "HD 269445/JP11 3742/SSTISAGEMC J052259.76-680146.6/[BE74] 261/AL 158/LHA 120-S 30/TIC 179637167/[H2013] LMCe 716/BAT99 33/2MASS J05225978-6801466/TYC 9162-453-1/AAVSO 0523-68/CSI-68-05230 1/OGLE BRIGHT-LMC-MISC-429/UBV 5229/Gaia DR3 4658737591314866688GCRV 56199/RAVE J052259.7-680146/UBV M 28686/Gaia DR1 4658737591314866688/GEN# +1.00269445/RMC 99/UCAC2 2072017/Gaia DR2 4658737591314866688/GSC 09162-00453/SK -68 73/UCAC4 110-008015"
{
	/*Observation data*/
	RA      05 22 59.7855849168
	Dec     -68 01 46.635948408
	AppMagn 11.520
	/*Characteristics*/
	Class   "OI" // Ofpe/WN9 (LBV)
	/*Astrometry*/
	Dist    49955
	AbsMagn -8.48
	/*Details*/
	MassSol 103
	RadSol  74.8
	LumBol  3162265.81746522 // MBol = -11.51
	Teff    28000
}

// 23. VFTS 1022 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-basic?Ident=VFTS+1022&submit=SIMBAD+search
StarBarycenter "Cl* NGC 2070 MH 493/Cl* NGC 2070 SMB 28/IRSF J05384238-6906151/[CCE2018] 1442/VFTS 1022/[P93] 949"
{
	/*Observation data*/
	RA      05 38 42.407
	Dec     -69 06 15.01
	AppMagn 13.44
	/*Characteristics*/
	Class   "WN?"
	/*Astrometry*/
	Dist    49975
	/*Details*/
	Radius  22617752.588087532669305801391602 // Calculated
	LumBol  3019940.410708304 // MBol = -11.46
	Teff    42200
}