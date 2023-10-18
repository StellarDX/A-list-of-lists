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

// 24.WR 24 (in Collinder 228 of Carina Nebula)
// https://en.wikipedia.org/wiki/WR_24

// 25.Peony Star (WR 102ka in Peony Nebula near Galactic Center)
// https://en.wikipedia.org/wiki/WR_102ka

// 26.CXOGC J174528.6-285605 (WR 101–6 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174528.6-285605

// 27.G0.059-0.068 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=MCD2010+G0.059-0.068

// 28.HD 97950 B (WR 43b in HD 97950 of NGC 3603)
// https://en.wikipedia.org/wiki/NGC_3603-B

// 29.Melnick 34 A (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/Melnick_34

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


// 33.VFTS 482 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+482

// 34.HD 97950 A1a (WR 43a A in HD 97950 of NGC 3603)
// https://en.wikipedia.org/wiki/NGC_3603-A1

// 35.WR 102ea (in Quintuplet Cluster)
// https://en.wikipedia.org/wiki/WR_102ea

// 36.CXOGC J174516.1-284909 (WR 101–2 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174516.1-284909

// 37.CXOGC J174711.4-283006 (WR 102–9 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174711.4-283006

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

// 44.Cl 1813-178 #16 (in Cl 1813-178 of W33 Complex)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=MFD2008+16

// 45.R136a7 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC136a7

// 46.VVV CL074-12 (in VVV CL074)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CBB2013+VVV+CL074+12

// 47.Arches-F6 (WR 102ah in Arches Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=FNG2002+6

// 48.Arches-F9 (WR 102ae in Arches Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=FNG2002+9

// 49.HD 5980 A (in NGC 346 of SMC)
// https://en.wikipedia.org/wiki/HD_5980

// 50.HD 97950 C1 (WR 43c A in HD 97950 of NGC 3603)
// https://en.wikipedia.org/wiki/NGC_3603-C

// 51.R136b (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/R136b

// 52.R145 A (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/R145

// 53.Var 83 (in Triangulum Galaxy)
// https://en.wikipedia.org/wiki/Var_83
Star "VHK 83/UCAC4 603-004294/IFM-B 1588/Pul -3 120253/Gaia DR3 303366738555504768/ATO J023.5454+30.5770/LGGS J013410.93+303437.6/TIC 61338877/Gaia DR2 303366738555504768/D33 J013410.9+303437.5/M33SSS J013410.82+303438.1/FSZ 394/2MASS J01341090+3034373/[SM2006] W21206"
{
	/*Observation data*/
	RA      01 34 10.9079108155
	Dec     +30 34 37.398838840
	AppMagn 16.07
	/*Characteristics*/
	Class   "B 0" // LBV
	/*Astrometry*/
	Dist    861500
	AbsMagn -8.4
	/*Details*/
	MassSol 60
	RadSol  150
	LumBol  2238712.7545765606 // MBol = -11.135, 2100000-4500000
	Teff    18000 // 18000-37100
}

// 54.CXOGC J174712.2-283121 (WR 102–10 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174712.2-283121

// 55.HD 269810 (in NGC 2032 of LMC)
// https://en.wikipedia.org/wiki/HD_269810
Star "HD 269810/GEN# +1.00269810/TYC 9162-101-1/[BE74] 374/ALS 18845/GSC 09162-00101/UBV 5767/[H2013] LMCe 1249/ARDB 317/2MASS J05351389-6733275/UBV M 28781/Gaia DR2 4660112221367295232/ARDB C54/RMC 122/UCAC2 2218036/Gaia DR3 4660112221367295232/CSI-67-05351/SK -67 211/UCAC4 113-009283/GALAH 181224003601210/SSTISAGEMC J053513.89-673327.3/uvby98 100269810/GCRV 24403/TIC 277099722/2XMM J053513.7-673327"
{
	/*Observation data*/
	RA      05 35 13.8977747136
	Dec     -67 33 27.542449260
	AppMagn 12.22
	/*Characteristics*/
	Class   "O3III(f*)"
	/*Astrometry*/
	Dist    50000
	AbsMagn -6.6
	/*Details*/
	MassSol 130
	RadSol  18
	LumBol  2187753.430800727 // MBol = -11.11
	Teff    52500
	FeH     0.1
	RotationPeriod 4152
}

// 56.VFTS 1021 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+1021

// 57.ST5-31 (in NGC 2074 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=ST92+5-31
Star "CPD-69 471/MCPS 084.79835-69.51035/UCAC2 1677378/[WHE2010] J053911.6-693037/AP J05391162-6930374/SSTISAGEMC J053911.63-693037.3/W61 3-19/Gaia DR1 4657647081937194368/GSC 09167-00436/TIC 404797479/[MNM2014] LMC174-3/2MASS J05391162-6930374/TYC 9167-436-1/[ST92] 5-31"
{
	/*Observation data*/
	RA      05 39 11.6284
	Dec     -69 30 37.417
	AppMagn 12.273
	/*Characteristics*/
	Class   "O2-3(n)fp" // Chemically Peculiar Star
	/*Astrometry*/
	Dist    49951
	AbsMagn -6.219720935295957 // Calculated
	/*Details*/
	Radius  13275730.6460768 // Calculated
	LumBol  2167695.9867861113 // MBol = -11.1
	Teff    50700
}

// 58.G0.058+0.014 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=MCD2010+G0.058%2B0.014

// 59.R145 B (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/R145

// 60.WR 89 (in HM 1)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+89

// 61.R136a5 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC136a5

// 62.AFGL 2298 (near Galactic plane)
// https://en.wikipedia.org/wiki/AFGL_2298
Star "IRAS 18576+0341/2MASS J19001089+0345471/TIC 228204295/WISE J190010.88+034547.3/AKARI-IRC-V1 J1900108+034548/MSX6C G037.2772-00.2258/UGPS J190010.89+034547.0/AKARI-FIS-V1 J1900111+034601/RAFGL 2298/V* V1672 Aql/GLMP 855/SSTGLMC G037.277-00.227/WISEA J190010.90+034547.2"
{
	/*Observation data*/
	RA      19 00 10.89456
	Dec     +03 45 47.1096
	//AppMagnK 7.007
	/*Characteristics*/
	Class   "B8I"
	/*Astrometry*/
	Dist    10000
	/*Details*/
	RadSol  158 // 158 - 385
	LumBol  2000775.5592367386 // MBol = -11.013
	Teff    11000 // 11000 - 15000 (26000)
}

// 63.Arches-F1 (WR 102ad in Arches Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=FNG2002+1

// 64.Arches-F4 (WR 102al in Arches Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=FNG2002+4

// 65.CXOGC J174656.3-283232 (WR 102–8 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174656.3-283232

// 66.LBV 1806-20 (in G10.0–0.3 of Galactic Center)
// https://en.wikipedia.org/wiki/LBV_1806-20

// 67.Mercer 81-2 (WR 76–7 in Mercer 81 of G338.4+0.2)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=DDN2012+2

// 68.VFTS 545 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+545

// 69.WR 147S (in Cygnus OB2)
// https://en.wikipedia.org/wiki/WR_147