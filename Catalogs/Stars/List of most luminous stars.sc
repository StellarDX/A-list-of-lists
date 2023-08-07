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
	AbsMagn -8.2
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
	AbsMagn -8.259951255403966 // Calculated
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

// 24.WR 24 (in Collinder 228 of Carina Nebula)
// https://en.wikipedia.org/wiki/WR_24

// 25.Peony Star (WR 102ka in Peony Nebula near Galactic Center)
// https://en.wikipedia.org/wiki/WR_102ka

// 26.CXOGC J174528.6-285605 (WR 101–6 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174528.6-285605
StarBarycenter "CXOGC J174528.6-285605/CXOU J174528.6-285605/[DWC2011] 35"
{
	/*Observation data*/
	RA      17 45 28.62
	Dec     -28 56 05.0
	//AppMagnK 9.72
	/*Characteristics*/
	Class   "WN8h" // WN8-9h
	/*Astrometry*/
	Dist    8583.02179310265 // random
	/*Details*/
	Radius  43735272.9785254 // Calculated
	LumBol  2884020.7024529576 // MBol = -11.41
	Teff    30000
}

// 27.G0.059-0.068 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=MCD2010+G0.059-0.068

// 28.HD 97950 B (WR 43b in HD 97950 of NGC 3603)
// https://en.wikipedia.org/wiki/NGC_3603-B

// 29.Melnick 34 A (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/Melnick_34
StarBarycenter "Brey 84/Cl* NGC 2070 MH 880/Dor IRS 107/[CCE2018] 1766/[TBF2006] 132/BAT99 116/2MASS J05384424-6906058/[CHH92] 6004/[W95c] 7/SSTISAGEMC J053844.22-690605.8/[H2013] LMCe 1407/Gaia DR3 4657685534828257792/Cl* NGC 2070 MEL 34/TIC 404768913/[HSH95] 8/Gaia DR2 4657685534828257792/Cl* NGC 2070 MEL C/UCAC4 105-014328/[P93] 1134/Cl* NGC 2070 SMB 17/W61 7-2/[PPL2002] CX5/CXOU J053844.2-690605/XMMU J053844.2-690608/[SG2005] LMC 29"
{
	/*Observation data*/
	RA      05 38 44.2508644296
	Dec     -69 06 06.004573020
	AppMagn 13.10
	/*Characteristics*/
	Class   "WN5h:a"
	/*Astrometry*/
	Dist    49970
	AbsMagn -7.42
}

// 30.WR 102hb (in Quintuplet Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+102hb

// 31.BAT99-80 A (in NGC 2044 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=BAT99+80
StarBarycenter "BAT99 80/Brey 65c/2MASS J05355991-6911507/[H2013] LMCe 1290/[M2002] LMC 164167/TIC 277025288/[HGM93] 9Ab/[ST92] 2-43/HD 269828E/TSWR 2/[HGM93] 9/[TSL93] bet 13"
{
	/*Observation data*/
	RA      05 35 59.913
	Dec     -69 11 50.70
	AppMagn 13
	/*Characteristics*/
	Class   "O4If"
	/*Astrometry*/
	Dist    49950
}

// 32.R146 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC146
Star "HD 269926/GSC 09163-00928/SSTISAGEMC J053847.50-690025.3/[BE74] 418/AL 380/IRSF J05384752-6900252/TIC 404768377/[H2013] LMCe 1409/BAT99 117/LI-LMC 1467/UBV M 28804/[M2002] LMC 171780/Brey 88/2MASS J05384751-6900252/UCAC2 1803458/[P93] 9033/CSI-69-05391 2/OGLE BRIGHT-LMC-MISC-305/UCAC4 105-014361/Gaia DR2 4657687733851287040/FD 69/RMC 146/VFTS 617/Gaia DR3 4657687733851287040/GEN# +1.00269926/SK -69 245/WS 45"
{
	/*Observation data*/
	RA      05 38 47.5179121824
	Dec     -69 00 25.287752196
	AppMagn 13.116
	/*Characteristics*/
	Class   "WN5ha" // + OB?
	/*Astrometry*/
	Dist    49965
	AbsMagn -5.3773294587342875 // Calculated
	/*Details*/
	Radius  13033135.195871 // Calculated
	LumBol  2511877.0245160875 // MBol = -11.26
	Teff    53090 // 63000?
}

// 33.VFTS 482 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+482
Star "Cl* NGC 2070 MH 57/CXOU J053840.2-690559/[CCE2018] 2003/[PPL2002] CX8/Cl* NGC 2070 MEL 39/Dor IRS 81/[CHH92] 6003/[TBF2006] 36/Cl* NGC 2070 MEL H/IRSF J05384022-6905599/[HSH95] 7/Gaia DR3 4657679659312960256/Cl* NGC 2070 SMB 14/VFTS 482/[P93] 767"
{
	/*Observation data*/
	RA      05 38 40.2160044288
	Dec     -69 05 59.915264352
	AppMagn 13
	/*Characteristics*/
	Class   "O3If*/WN6-A"
	/*Astrometry*/
	Dist    49955
	AbsMagn -5.492894816537181 // Calculated
	/*Details*/
	Radius  20656995.2179654 // Calculated
	LumBol  2511877.0245160875 // MBol = -11.26
	Teff    42170
}

// 34.HD 97950 A1a (WR 43a A in HD 97950 of NGC 3603)
// https://en.wikipedia.org/wiki/NGC_3603-A1

// 35.WR 102ea (in Quintuplet Cluster)
// https://en.wikipedia.org/wiki/WR_102ea

// 36.CXOGC J174516.1-284909 (WR 101–2 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174516.1-284909
StarBarycenter "CXOGC J174516.1-284909"
{
	/*Observation data*/
	RA      17 45 16.1
	Dec     -28 49 09
	/*Characteristics*/
	Class   "Ofpe/WN9"
	/*Astrometry*/
	Dist    8580.1720429148 // random
	/*Details*/
	Radius  89745846.7918608 // Calculated
	LumBol  2398823.9354104507 // MBol = -11.21
	Teff    20000
}

// 37.CXOGC J174711.4-283006 (WR 102–9 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174711.4-283006
StarBarycenter "2MASS J17471147-2830069/CXOGCS J174711.4-283006/TIC 126155297/CXOGC J174711.4-283006/SSTGLMC G000.5500-00.0686"
{
	/*Observation data*/
	RA      17 47 11.47
	Dec     -28 30 07.0
	//AppMagnK 10.467
	/*Characteristics*/
	Class   "WN8-9h"
	/*Astrometry*/
	Dist    8585
	/*Details*/
	Radius  39887043.0186048 // Calculated
	LumBol  2398823.9354104507 // MBol = -11.21
	Teff    30000
}

// 38.WR 25 A (in Trumpler 16 of Carina Nebula)
// https://en.wikipedia.org/wiki/WR_25

// 39.LGGS J004444.52+412804.0 (in Andromeda Galaxy)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=LGGS+J004444.52%2B412804.0
Star "D31 J004444.5+412803.9/2MASS J00444451+4128038/LGGS J004444.52+412804.0/[VRJ2006] M31V-J00444451+4128037/TIC 115781325/Gaia DR2 369281666068607872/DIRECT V13833 M31C/[AMB2011] HII 3135/Gaia DR3 369281666068607872"
{
	/*Observation data*/
	RA      00 44 44.5169774016
	Dec     +41 28 03.854799696
	AppMagn 18.1
	/*Characteristics*/
	Class   "F0Ia"
	/*Astrometry*/
	Dist    798000
	AbsMagn -6.410014456753647 // Calculated
	/*Details*/
	Radius  729253078.21566 // Calculated
	LumBol  2376831.385378052 // MBol = -11.2
	Teff    7000 // 18000
}

// 40.Sk -69° 212 (in NGC 2044 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Sk+-69+212
Star "SK -69 212/CPD-69 413/OGLE BRIGHT-LMC-ECL-28/TYC 9163-428-1/[WHE2010] J053606.4-691148/GEN# +8.58690212/UBV M 51423/Gaia DR2 4657669965532416512/GSC 09163-00428/SSTISAGEMC J053606.36-691147.4/UCAC2 1802803/Gaia DR3 4657669965532416512/2MASS J05360638-6911474/TIC 277025295/[ST92] 2-53/Gaia DR1 4657669965532416512"
{
	/*Observation data*/
	RA      05 36 06.3756336288
	Dec     -69 11 47.539993668
	AppMagn 12.416
	/*Characteristics*/
	Class   "O6If"
	/*Astrometry*/
	Dist    49960
	AbsMagn -6.077112148510491 // Calculated
	/*Details*/
	Radius  17336548.7553452 // Calculated
	LumBol  2376831.385378052 // MBol = -11.2
	Teff    45400
}

// 41.WR 93 (in Pismis 24 of NGC 6357)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+93

// 42.Melnick 34 B (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/Melnick_34

// 43.VVV CL041-8 (WR 62–2 in VVV CL041)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CRB2015+VVV+CL041-8