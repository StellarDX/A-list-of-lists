// List of most luminous stars
// This is a list of stars arranged by their absolute magnitude – their intrinsic stellar luminosity. This cannot 
// be observed directly, so instead must be calculated from the apparent magnitude (the brightness as 
// seen from Earth), the distance to each star, and a correction for interstellar extinction. The entries in the 
// list below are further corrected to provide the bolometric magnitude, i.e. integrated over all wavelengths; 
// this relies upon measurements in multiple photometric filters and extrapolation of the stellar spectrum 
// based on the stellar spectral type and/or effective temperature.
// Stars with bolometric luminosity higher than 1,000,000 LSun are included.
// Reference: https://en.wikipedia.org/wiki/List_of_most_luminous_stars

// #.Godzilla (in Sunburst galaxy)
// https://en.wikipedia.org/wiki/Godzilla_Star

// 1.V4650 Sagittarii (in Quintuplet cluster)
// https://en.wikipedia.org/wiki/V4650_Sagittarii

// #.NGC 2363-V1 (in NGC 2366)
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
	LumBol  6309549.81550261 // MBol = -12.26
	Teff    13500 // 26000
	FeH     -1 // -0.6
	Age     0.004 // 0.005
}

// 2.BAT99-98 (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/BAT99-98

// 3.G0.238-0.071 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=MCD2010+G0.238-0.071

// 3.5 [BMS2003] 867 A (in NGC 604 of Triangulum Galaxy)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=%5BBMS2003%5D+867A&NbIdent=1&Radius=2&Radius.unit=arcmin&submit=submit+id
StarBarycenter "DMS NGC 604 2/[FBB2012] 1168/[WM95] NGC 604 3"
{
	/*Observation data*/
	RA      01 34 32.50
	Dec     +30 47 00.3
	AppMagn 16.29
	/*Characteristics*/
	Class   "WN"
	/*Astrometry*/
	Dist    860625 // Match Disc Plane
	AbsMagn -8.382366004151784 // Calculated
}

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

// 5.5 [BMS2003] 867 B (in NGC 604 of Triangulum Galaxy)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=%5BBMS2003%5D+867B&NbIdent=1&Radius=2&Radius.unit=arcmin&submit=submit+id

// 6.Westerhout 49-2 (in Westerhout 49)
// https://en.wikipedia.org/wiki/Westerhout_49-2

// 6.5 HD 37836 (in LMC)
// https://en.wikipedia.org/wiki/HD_37836
Star "HD 37836/GV 398/SK -69 201/[BE74] 601/AP J05351663-6940384/HIC 26222/SSTISAGEMC J053516.62-694038.4/[FD82] 609/ARDB 320/HIP 26222/TIC 277022967/[H2013] LMCe 1252/CCDM J05353-6941A/JP11 1233/TYC 9166-86-1/[L63] 291/CD-69 320/LHA 120-S 124/UBV 5809/AAVSO 0536-69/CPD-69 401/2MASS J05351663-6940384/UBV M 11386/Gaia DR3 4657280639705552768/EM* MWC 121/NSV 2499/UCAC4 102-014451/Gaia DR1 4657280635327480832/GCRV 25338/OGLE BRIGHT-LMC-MISC-463/uvby98 100037836/Gaia DR2 4657280639705552768/GEN# +1.00037836/PPM 776035/W61 28-39/GSC 09166-00086/RMC 123/WDS J05353-6941A"
{
	/*Observation data*/
	RA      05 35 16.6328054594
	Dec     -69 40 38.439367763
	AppMagn 10.55
	/*Characteristics*/
	Class   "B0Iae"
	/*Astrometry*/
	Dist    49970
	AbsMagn -8.5
	/*Details*/
	RadSol  85
	LumBol  4168678.2229801137 // MBol = -11.81
	Teff    28200
}

// 7.Sk -69° 249 A (in NGC 2074 of LMC)
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

// 8.Eta Car
// https://en.wikipedia.org/wiki/Eta_Carinae
Remove "ETA Car"
StarBarycenter	"海山二/ETA Car/2E 1043.1-5925/H 1044-59/4U 1053-58/EM* MWC 214/HR 4210/4U 1037-60/1ES 1043-59.4/IRAS 10431-5925/UCAC4 152-053215/1A 1044-59/0FGL J1045.6-5937/JCMTSE J104503.7-594102/V* ETA Car/3A 1042-595/1FGL J1045.2-5942/JCMTSF J104503.7-594102/WDS J10451-5941/1AGL J1043-5936/2FGL J1045.0-5941/JP11 1994/WEB 9578/1AGL J1044-5937/3FGL J1045.1-5941/LLNS 2725/WRAY 15-640/1AGLR J1044-5944/4FGL J1045.1-5940/LS 1868/2XMM J104503.4-594103/ALS 1868/1FHL J1045.0-5943/2MASS J10450360-5941040/XMMU J104503.8-594105/CD-59 3306/2FHL J1045.2-5942/MOST 1042-594/[AMM2003] 50/CEL 3689/3FHL J1045.1-5941/NOVA Car 1843/[ARV2008] 173/Cl Trumpler 16 183/GC 14799/PBC J1044.8-5942/[KRL2007b] 93/CPC 20 3145/GCRV 6693/PPM 339408/[S87b] IRS 23/CPD-59 2620/GCRV 6692/RAFGL 4114/AAVSO 1041-59/CSI-59 2620 41/GPS 1043-595/SAO 238429/Gaia DR3 5350358584482202880/CSI-59-10431/1H 1045-597/SKY# 20584/Gaia DR2 5350358580171706624/CXOCyg J104503.58-594103.7/HD 93308/SWIFT J1044.8-5941/1E 104306-5925.2/TIC 458859916/2E 2318/Hen 3-481/TYC 8626-2809-1"
{
	CenterOf "Eta Carinae Nebula"
	DateUpdated "2019-08-24"
	/*Observation data*/
    //Constellation	"Carina"
	RA       10 45 03.5455050
	Dec      -59 41 03.951060 // Mathc nebula
	AppMagn  -1 //7.6(Minor) //4.8(2011) //4.6(2013) //4.3(2018)
	/*Characteristics*/
	Class   "OBepec"
	AppMagnU 6.37
	AppMagnB 6.82
	AppMagnR 4.9
	AppMagnJ 3.39
	AppMagnH 2.51
	AppMagnK 0.94
	/*Astrometry*/
	Dist     2285 // 2300
	AbsMagn  -8.6 //(2012)
	//ForceSystemLum true // use provided AppMagn despite on actual components luminosity
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

// 28.5 HD 38282 A (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/HD_38282

// 29.Melnick 34 A (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/Melnick_34

// 30.WR 102hb (in Quintuplet Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+102hb

// 30.5 [BMS2003] 578 C (in NGC 604 of Triangulum Galaxy)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=%5BBMS2003%5D+578C&NbIdent=1&Radius=2&Radius.unit=arcmin&submit=submit+id
StarBarycenter "DMS NGC 604 4/[FBB2012] 3795/[LJ2009] Shell-2 1/[WM95] NGC 604 1"
{
	/*Observation data*/
	RA      01 34 32.65
	Dec     +30 47 07.1
	AppMagn 15.97
	/*Characteristics*/
	Class   ""
	/*Astrometry*/
	Dist    860600 // Match Disc Plane
}

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

// 35.5 HD 38282 B (in Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/HD_38282

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

// 39.5 HD 269327 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=hd+269327
Star "HD 269327/HIC 24694/SSTISAGEMC J051746.36-695057.2/uvby98 100269327/AP J05174636-6950571/HIP 24694/TIC 179203855/[BE74] 553/CD-69 292/LHA 120-S 95/TYC 9166-553-1/[H2013] LMCe 571/CPD-69 353/2MASS J05174636-6950571/UBV M 28661/Gaia DR2 4658137739001073280/GEN# +1.00269327/PPM 354664/UCAC2 1673061/Gaia DR3 4658137739001073280/GSC 09166-00553/SK -69 91/UCAC4 101-008002/Gaia DR1 4658137739001073280"
{
	/*Observation data*/
	RA      05 17 46.3768759632
	Dec     -69 50 57.232972680
	AppMagn 10.74
	/*Characteristics*/
	Class   "O I" // OB
	/*Astrometry*/
	Dist    49965
	AbsMagn -7.753329458734287 // Calculated
	/*Details*/
	Radius  44934108.98919486 // Calculated
	LumBol  2376831.385378052 // MBol = -11.2
	Teff    28200
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
	Dist    49952
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

// 70.10584-9-1 (in Messier 81)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=%5BHSG2019%5D%2010584-9.1
Star "[HSG2019] 10584-9.1/Gaia DR3 1070474766932993664"
{
	/*Observation data*/
	RA      09 55 18.8147842440
	Dec     +69 08 27.176788356
	AppMagnG 19.735256
	/*Characteristics*/
	Class   "BI" // sgB[e]
	/*Astrometry*/
	Dist    3683500
	/*Details*/
	Radius  100584101.5010831
	LumBol  1976962.2363772385 // MBol = -11
	Teff    18000
}

// 70.5 2MASS J04542610-6911022 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=2MASS+J04542610-6911022
Star "2MASS J04542610-6911022/TIC 30189255/[GC2009] J045426.06-691102.3/[HVL90] N83 B-1"
{
	/*Observation data*/
	RA      04 54 26.101
	Dec     -69 11 02.23
	//AppMagnJ 12.831
	/*Characteristics*/
	Class   "O7V"
	/*Astrometry*/
	Dist    49960
	/*Details*/
	Radius  23441665.86374936
	LumBol  1958837.3376492122 // MBol = -10.99
	Teff    37200
}

// 71.DBSB 179-15 (WR 84–6 in DBSB 179 of G347.6+0.2)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=BIH2008+obj15

// 72.G0.114+0.021 (WR 102–12 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=MCD2010+G0.114%2B0.021

// 73.AB6 A (in NGC 371 of SMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=SMC+AB+6

// 74.R136a4 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC136a4

// 75.Westerhout 49-1 (in Westerhout 49)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WBB2016+1

// 76.WR 22 A (in Bochum 10 of Carina Nebula)
// https://en.wikipedia.org/wiki/WR_22

// 76.5 HD 269219 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=hd+269219
Star "HD 269219/LHA 120-S 90/TYC 9162-759-1/[H2013] LMCe 491/AP J05134191-6920057/2MASS J05134191-6920057/UBV M 28646/Gaia DR2 4658236385811756160/CPD-69 344/SK -69 78/UCAC2 1798602/Gaia DR3 4658236385811756160/GEN# +1.00269219/SSTISAGEMC J051341.89-692005.7/UCAC4 104-008908/GSC 09162-00759/TIC 40795992/[BE74] 228"
{
	/*Observation data*/
	RA      05 13 41.9250569592
	Dec     -69 20 05.693736444
	AppMagn 10.87
	/*Characteristics*/
	Class   "O I" // OB
	/*Astrometry*/
	Dist    49980
	AbsMagn -7.6239812589521545 // Calculated
	/*Details*/
	Radius  40047566.79082391 // Calaculated
	LumBol  1887984.2785846181 // MBol = -10.95
	Teff    28200
}

// 77.HSH95-36 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HSH95+36

// 78.Hen 3-519 (WR 31a in Blue Bubble Nebula)
// https://en.wikipedia.org/wiki/WR_31a
StarBarycenter "WRAY 15-682/WR 31a/IRAS 10520-6010/PN Hf 39/[H53] 39/ALS 2015/LLNS 3256/SS73 25/AAVSO 1050-59/CSI-60-10520/LS 2015/TIC 465539899/Gaia DR3 5338229115839425664/ESO 128-18/2MASS J10535958-6026444/TYC 8958-1166-1/Gaia DR1 5338229111491506304/GSC2 S1113013697/MSX5C G288.9347-00.8046/UCAC2 5308747/Gaia DR2 5338229115839425664/GSC 08958-01166/PK 288-00 1/UCAC4 148-066854/Hen 3-519/PN G288.9-00.8"
{
	/*Observation data*/
	RA      10 53 59.5777329720
	Dec     -60 26 44.361095316
	AppMagn 10.85
	/*Characteristics*/
	Class   "WN11h"
	/*Astrometry*/
	Dist    8700
	AbsMagn -6.71
	/*Details*/
	MassSol 17
	RadSol  29.8
	LumBol  1819694.0438456186 // MBol = -10.91
	Teff    30200 // 27500
}

// 78.5 W61 3-20 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=w61+3-20
Star "W61 3-20/GSC 09167-00320/TIC 404797410/[ST92] 5-25/2MASS J05391389-6929498/Gaia DR2 4657647185028496384/MCPS 084.80784-69.49714/[M2002] LMC 172876/Gaia DR3 4657647185028496384"
{
	/*Observation data*/
	RA      05 39 13.8934957416
	Dec     -69 29 49.852299732
	AppMagn 13.551
	/*Characteristics*/
	Class   "O5-6V((f))z"
	/*Astrometry*/
	Dist    49948
	AbsMagn -6.9415905152270785 // Calculated (+2)
	/*Details*/
	Radius  19738230.07133341 // Calculated
	LumBol  1819694.0438456186 // MBol = -10.91
	Teff    39800
}

// 79.LGGS J004051.59+403303.0 (in Andromeda Galaxy)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=LGGS+J004051.59%2B403303.0
Star "LAMOST J004051.59+403303.0/LGGS J004051.59+403303.0/Gaia DR3 369118835268460544"
{
	/*Observation data*/
	RA      00 40 51.5742503712
	Dec     +40 33 02.849588100
	AppMagn 16.989
	/*Characteristics*/
	Class   "BI" // LBV
	/*Astrometry*/
	Dist    795000
	AbsMagn -7.512835643282351 // Calculated
	/*Details*/
	Radius  96057071.20516194 // Calculated
	LumBol  1803010.9885733414 // MBol = -10.9
	Teff    18000 // 24000
}

// 80.MSX5C G358.5391+00.1305 (in Wray 17-96)
// https://en.wikipedia.org/wiki/Wray_17-96
Star "[B61] 2/UCAC2 19224418/MSX5C G358.5391+00.1305/USNO-A2.0 0525-28939154/[CWP2007] CS 14/DENIS J174135.4-300638/MSX6C G358.5394+00.1305/WISEA J174135.45-300638.3/[SPK2012] MWP1G358541+001299/Hen 3-1453/TIC 192821454/WISE J174135.44-300639.2/EQ J1741-3006/2MASS J17413543-3006389/UCAC3 120-292053/WRAY 17-96/Gaia DR3 4056941758956836224/MGE G358.5405+00.1299/UCAC4 300-137664/Gaia DR2 4056941758956836224"
{
	/*Observation data*/
	RA      17 41 35.4358256400
	Dec     -30 06 38.782127520
	AppMagn 15
	/*Characteristics*/
	Class   "BI" // LBV_B[e]:
	/*Astrometry*/
	Dist    7000
	AbsMagn -5.2254902000712846 // Calculated (-6)
	/*Details*/
	RadSol  260
	LumBol  1799692.776717852 // MBol = -10.898
	Teff    13000
}

// 81.HD 5980 B (in NGC 346 of SMC)
// https://en.wikipedia.org/wiki/HD_5980

// 82.WR 130 (in Cygnus OB3)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+130
StarBarycenter "EM* AS 374/WR 130/GSC 02670-01448/MHA 376-29/[KW97] 41-30/CSI+31-19571/HBHA 3203-12/TIC 328366341/Gaia DR2 2030934212864924032/EM* VES 96/Hen 3-1810/UBV M 44533/Gaia DR3 2030934212864924032/JP11 5255/UCAC4 608-100816/GEN# +6.20055096/LSWR 16/V* V2180 Cyg/GEN# +6.20059050/2MASS J19591258+3127090/[IC56] 50"
{
	/*Observation data*/
	RA      19 59 12.5931809928
	Dec     +31 27 09.025581132
	AppMagn 12.13
	/*Characteristics*/
	Class   "WN8(h)"
	/*Astrometry*/
	Dist    6653.250245146447 // 21700
	AbsMagn -7.22
	/*Details*/
	MassSol 47
	RadSol  22.1
	LumBol  1778272.7503975346 // MBol = -10.885
	Teff    44700
}

// 83.WR 21a A (Runaway star from Westerlund 2)
// https://en.wikipedia.org/wiki/WR_21a

// 84.CXOGC J174536.1-285638 (WR 101–1 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174536.1-285638

// 85.Mercer 30-7 A (WR 46-5 A in Mercer 30 of Dragonfish Nebula)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=DNB2016+Mc30-7

// 86.R136a6 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC136a6

// 87.VFTS 506 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+506

// 88.HD 35342 B (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=HD+35342B
Star "HD 35342B/CPD-69 355B/SSTISAGEMC J051811.92-691303.4/[L72] LH 41-1006/** MLO 16B/IDS 05189-6920 B/TIC 179209305/CSI-69 355 42/2MASS J05181190-6913033/WDS J05182-6914B"
{
	/*Observation data*/
	RA      05 18 11.906
	Dec     -69 13 03.35
	AppMagn 11.281
	/*Characteristics*/
	Class   "B0.5I"
	/*Astrometry*/
	Dist    49952
	AbsMagn -7.211764406911618 // Calculated
	/*Details*/
	Radius  52802181.74119884
	LumBol  1721862.126602719 // MBol = -10.85
	Teff    24000
}

// 89.CPD -69 471 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=cpd+-69+471

// This star and ST5-31 are the same star.

// 90.DBSB 179-20 (WR 84–1 in DBSB 179 of G347.6+0.2)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=BIH2008+obj20

// 91.R147 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC147

// 92.VFTS 16 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+16

// 93.Cygnus OB2 #12 A (in Cygnus OB2)
// https://en.wikipedia.org/wiki/Cygnus_OB2-12

// 94.PGMW 3120 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=pgmw+3120
Star "2MASS J04564681-6624467/CXOU J045646.7-662446/IRSF J04564681-6624467/SSTISAGEMC J045646.82-662446.3/BRRG 140/DCMC J045646.77-662446.8/PGMW 3120/TIC 30312734"
{
	/*Observation data*/
	RA      04 56 46.7984540280
	Dec     -66 24 46.862515368
	AppMagn 12.466
	/*Characteristics*/
	Class   "O5.5V((f*))"
	/*Astrometry*/
	Dist    50100
	AbsMagn -6.027546747212936 // Calculated
	/*Details*/
	Radius  18763256.12410012
	LumBol  1644365.5650567017 // MBol = -10.8
	Teff    39800
}

// 95.Sher 18 (in HD 97950 of NGC 3603)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Cl*+NGC+3603+Sher+18

// 96.Sher 47 (in HD 97950 of NGC 3603)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Cl*+NGC+3603+Sher+47

// 97.Mercer 23-1 (in Mercer 23 near Galactic plane)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HKB2010b+Obj1

// 98.VFTS 1017 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+1017

// 99.WR 87 (in HM 1)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+87

// 100.HD 269896 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=hd+269896
Star "HD 269896/GV 414/TIC 277300709/[FD82] 625/AP J05374913-6855016/JP11 3766/TYC 9163-806-1/[H2013] LMCe 1360/ARDB 336/LHA 120-S 130/UBV M 28799/Gaia DR2 4657700790554314752/CPD-68 406/2MASS J05374913-6855016/UCAC2 1934352/Gaia DR3 4657700790554314752/GCRV 24463/RMC 129/UCAC4 106-014058/GEN# +1.00269896/SK -68 135/uvby98 100269896/GSC 09163-00806/SSTISAGEMC J053749.12-685501.6/[BE74] 407"
{
	/*Observation data*/
	RA      05 37 49.1356176384
	Dec     -68 55 01.639049016
	AppMagn 11.449
	/*Characteristics*/
	Class   "N9.7Ia+" // ON9.7Ia+
	/*Astrometry*/
	Dist    49945
	AbsMagn -7.043460087324613 // Calculated
	/*Details*/
	Radius  33684516.58391615
	LumBol  1599552.0382833453 // MBol = -10.77
	Teff    29500
}

// 101.AF Andromedae (in Andromeda Galaxy)
// https://en.wikipedia.org/wiki/AF_Andromedae
Star "BASW 19/2MASS J00433308+4112103/SV* HV 4013/WISE J004332.95+411208.6/Gaia DR2 369256308582621312/AP J00433309+4112104/TIC 438258285/[AMB2011] HII 2250/Gaia DR3 369256308582621312/BA 1-7/USNO-B1.0 1312-00012753/[JPN2003] V223/V* AF And/[NTK96] 30/LGGS J004333.09+411210.4/WISEA J004332.95+411208.6/[PAV78] 434"
{
	/*Observation data*/
	RA      00 43 33.0861943080
	Dec     +41 12 10.311568308
	AppMagn 17.325
	/*Characteristics*/
	Class   "O I" // LBV
	/*Astrometry*/
	Dist    797110
	AbsMagn -8.2
	/*Details*/
	MassSol 50 // 120
	RadSol  63
	LumBol  1584887.2570494793 // MBol = -10.76
	Teff    33000
}

// 102.Arches-F12 (WR 102af in Arches Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=FNG2002+12

// 103.HSH95-18 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HSH95+18

// 104.LHO 110 (WR 102df in Quintuplet cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=LHO+110

// 105.R140a1 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC140a1

// 106.BI 265 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=bi+265
Star "BI 265/GSC 09167-00653/2MASS J05400462-6939507/TIC 404850288/[WHE2010] J054004.6-693951/MCPS 085.01918-69.66406/UCAC2 1677493/Gaia DR2 4657639320947542528/GEN# +6.20052265/SSTISAGEMC J054004.64-693950.6/[FBM2009] 82/Gaia DR3 4657639320947542528"
{
	/*Observation data*/
	RA      05 40 04.6246737456
	Dec     -69 39 50.684597640
	AppMagn 12.375
	/*Characteristics*/
	Class   "O5III(fc)"
	/*Astrometry*/
	Dist    49960
	AbsMagn -6.118112148510491 // Calculated
	/*Details*/
	Radius  17615117.01764873 // Calculated
	LumBol  1584887.2570494793 // MBol = -10.76
	Teff    40700
}

// 107.VFTS 457 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+457

// 108.WR 107 (in Sagittarius OB1)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+107
Star "SS73 123/WR 107/NSV 10142/UCAC2 23195176/WISE J180446.10-215127.2/DENIS J180446.0-215127/UCAC4 341-121715/Gaia DR2 4069911426323829888/2MASS J18044609-2151271/TIC 104694202/WISEA J180446.09-215127.1/Gaia DR3 4069911426323829888"
{
	/*Observation data*/
	RA      18 04 46.0978039968
	Dec     -21 51 27.175412880
	AppMagn 13.51
	/*Characteristics*/
	Class   "WN8"
	/*Astrometry*/
	Dist    1850.4811250925240562546262028127 // Plx = 0.5404 mas
	AbsMagn -7.22
	/*Details*/
	MassSol 44
	RadSol  16.7
	LumBol  1584887.2570494793 // MBol = -10.76
	Teff    50100
}

// 109.WR 140 B (in Cygnus OB1)
// https://en.wikipedia.org/wiki/WR_140
//Remove "V1687 Cyg"
//Remove "HD 193793"
StarBarycenter "HD 193793/1ES 2018+43.6/MR 107/UCAC3 268-193927/** BU 1207A/GC 28303/NSV 13030/V* V1687 Cyg/ADS 13736 A/GCRV 12706/PLX 4850/WDS J20205+4351A/AG+43 1809/GOS G080.93+04.18 01/PPM 59749/WEB 18089/AKARI-IRC-V1 J2020280+435114/GSC 03164-01678/1RXS J202028.5+435111/WR 140/ALS 11192/HIC 100287/SAO 49491/[KW97] 45-31/BD+43 3571/HIP 100287/SBC9 1232/[SKV93] 4-61/CCDM J20205+4351A/IDS 20171+4332 A/SKY# 38412/Gaia DR2 2081261372633822592/CEL 5033/IRAS 20187+4341/TD1 26580/Gaia DR3 2081261372633822592/CMC 413912/JP11 3234/TIC 193109650/Gaia DR1 2081261368330789632/CSI+43 3571 1/LS III +43 7/TYC 3164-1678-1/DO 38301/2MASS J20202798+4351164/UBV 17647/EM* CDS 1159/MCW 874/UBV M 24766"
{
	/*Observation data*/
	RA      20 20 27.9757908696
	Dec     +43 51 16.286840244
	AppMagn 6.85
	/*Characteristics*/
	Class   "WC7pd+O5.5fc"
	/*Astrometry*/
	Dist    1720
	AbsMagn -6.6
}

// 110.WR 148 A (Runaway star from Galactic plane)
// https://en.wikipedia.org/wiki/WR_148
StarBarycenter "HD 197406/HIC 102088/NSV 13240/WR 148/ALS 11490/Hilt 1005/SBC9 1257/2XMM J204121.5+523514/BD+52 2777/HIP 102088/TIC 286298962/[KW97] 48-31/EM* AS 438/JP11 3266/TYC 3951-353-1/Gaia DR2 2182307453299864064/GCRV 12973/LS III +52 2/UBV 17957/Gaia DR3 2182307453299864064/GEN# +1.00197406/2MASS J20412154+5235151/V* V1696 Cyg/Gaia DR1 2182307448995333120/GSC 03951-00353/MR 113/WEB 18467"
{
	/*Observation data*/
	RA      20 41 21.5485520640
	Dec     +52 35 15.142636896
	AppMagn 10.30
	/*Characteristics*/
	Class   "WN8h+B3IV/BH"
	/*Astrometry*/
	Dist    8280
	AbsMagn -7.22
}

// 111.CXOGC J174617.0-285131 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174617.0-285131

// 112.CXOGC J174725.3-282709 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174725.3-282709

// 113.Sk -68° 137 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Sk+-68+137

// 114.WR 102i (in Quintuplet cluster)	
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+102i

// 115.HD 97950 A1b (WR 43a B in HD 97950 of NGC 3603)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Cl*+NGC+3603+BLW+A1

// 116.Westerhout 49-3 (in Westerhout 49)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WBB2016+3

// 117.Brey 21 A (in NGC 1910 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Brey+21

// 118.HD 97950 A2 (in HD 97950 of NGC 3603)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Cl*+NGC+3603+BLW+A2

// 119.HM 1-6 (in HM 1)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Cl+HM+1+6

// 120.LGGS J013245.41+303858.3 (in Triangulum Galaxy)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=LGGS+J013245.41%2B303858.3
Star "[HS80] B7/LGGS J013245.41+303858.3/[MBH96] 8/[NM2011] J013245.41+303858.3/Gaia DR3 303289051184125696/[MJ98] WR 5/Gaia DR2 303289051184125696"
{
	/*Observation data*/
	RA      01 32 45.3729299808
	Dec     +30 38 58.247750688
	AppMagn 17.612
	/*Characteristics*/
	Class   "O I" // Ofpe
	/*Astrometry*/
	Dist    867900
	AbsMagn -7.080348441838229 // Calculated
	/*Details*/
	Radius  24553675.78203149 // Calculated
	LumBol  1499679.219195317 // MBol = -10.7
	Teff    34000
}

// 121.NGC 346-W1 (in NGC 346 of SMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Cl*+NGC+346+W+1

// 122.Sk -65° 47 (in NGC 1923 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Sk+-65+47
Star "SK -65 47/TYC 8886-1643-1/UCAC2 3033495/Gaia DR3 4660631710575777664/GEN# +8.58650047/SSTISAGEMC J052054.72-652717.8/[L72] LH 43-18/GSC 08886-01643/TIC 309760401/[WHE2010] J052054.7-652718/2MASS J05205472-6527178/UBV M 51139/Gaia DR2 4660631710575777664"
{
	/*Observation data*/
	RA      05 20 54.7193542416
	Dec     -65 27 17.880205176
	AppMagn 12.466
	/*Characteristics*/
	Class   "O4If"
	/*Astrometry*/
	Dist    50100
	AbsMagn -6.027112148510492 // Calculated
	/*Details*/
	Radius  12422773.23752578 // Calculated
	LumBol  1499679.219195317 // MBol = -10.7
	Teff    47800
}

// 123.Sk 80 (in NGC 346 of SMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Sk+80

// 124.10584-4-1 (in Messier 81)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=%5BHSG2019%5D%2010584-4.1
Star "[HSG2019] 10584-4.1/Gaia DR3 1070521942854229504"
{
	/*Observation data*/
	RA      09 54 53.9913628056
	Dec     +69 10 22.897661520
	//AppMagnG 19.946220
	/*Characteristics*/
	Class   "B I" // sgB[e]
	/*Astrometry*/
	Dist    3682241.84
	/*Details*/
	Radius  73353607.01130155 // Calculated
	LumBol  1499679.219195317 // MBol = -10.7
	Teff    19671
}

// 125.HD 93129 Aa (in Trumpler 14 of Carina Nebula)
// https://en.wikipedia.org/wiki/HD_93129

// 126.R136a8 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC136a8

// 127.SK -67 150 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=sk+-67+150
Star "SK -67 150/TYC 8891-3247-1/2MASS J05303171-6700532/TIC 391745653/uvby98 858670150/GEN# +8.58670150/UBV M 51254/Gaia DR2 4660207986305238272/GSC 08891-03247/SSTISAGEMC J053031.69-670053.3/UCAC2 2365806/Gaia DR3 4660207986305238272"
{
	/*Observation data*/
	RA      05 30 31.7098838016
	Dec     -67 00 53.369450748
	AppMagn 12.24
	/*Characteristics*/
	Class   "OB"
	/*Astrometry*/
	Dist    49970
	AbsMagn -6.253546747212935 // Calculated
	/*Details*/
	Radius  16173434.01638946 // Calculated
	LumBol  1472306.988634819 // MBol = -10.68
	Teff    41700
}

// 128.[HCD2002] 107 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=%5Bhcd2002%5D+107
Star "[HCD2002] 107/[FBM2009] 48"
{
	/*Observation data*/
	RA      05 39 46.14
	Dec     -69 38 52.9
	AppMagn 13.8
	/*Characteristics*/
	Class   "O4-6Vz"
	/*Astrometry*/
	Dist    49972
	AbsMagn -6.693633656516724 // Calculated (+2)
	/*Details*/
	Radius  16822306.15375457 // Calculated
	LumBol  1445434.357586181 // MBol = -10.66
	Teff    40700
}

// 129.VFTS 542 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+542

// 130.AB8 A (in NGC 602 of SMC)
// https://en.wikipedia.org/wiki/AB8_(star)

// 131.Arches-F15 (in Arches Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=FNG2002+15

// 132.CXOGC J174550.2-284911 (WR 102–4 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174550.2-284911

// This star and Arches-F9 are the same star.

// 133.DBSB 179-4 (WR 84–7 in DBSB 179 of G347.6+0.2)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=BIH2008+obj4

// 134.LGGS J013235.25+303017.6 (in Triangulum Galaxy)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=LGGS+J013235.25%2B303017.6
Star "LGGS J013235.25+303017.7/LGGS J013235.25+303017.6/Gaia DR2 303285507836207360/Gaia DR3 303285507836207360"
{
	/*Observation data*/
	RA      01 32 35.2086666408
	Dec     +30 30 17.383584600
	AppMagn 18.007
	/*Characteristics*/
	Class   "O I" // LBV
	/*Astrometry*/
	Dist    868260
	AbsMagn -6.686248969529945 // Calculated
	/*Details*/
	Radius  25295686.55950044 // Calculated
	LumBol  1412532.254681568 // MBol = -10.635
	Teff    33000
}

// 135.Melnick 33Na A (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Cl*+NGC+2070+MH+887

// 136.R134 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC134

// 136.S Doradus (in NGC 1910 of LMC)
// https://en.wikipedia.org/wiki/S_Doradus

// 137.WR 66 (in Circinus OB1)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+66
Star "HD 134877/GEN# +1.00134877/LS 3322/V* CC Cir/** HDS 2142/GEN# +6.42301004/2MASS J15145771-5950301/WDS J15150-5951AB/ALS 3322/GSC 08706-00757/MR 54/WRAY 15-1300/ALS 18464/Hen 3-1058/TIC 42618788/WR 66/CCDM J15150-5951AB/HIC 74634/TYC 8706-757-3/[M51] 87/CSI-59-15110/HIP 74634/UBV M 45972/Gaia DR2 5876711018534578176/GCRV 22425/HPD Cir 4/UCAC4 151-157567/Gaia DR3 5876711014185935232"
{
	/*Observation data*/
	RA      15 14 57.7186057272
	Dec     -59 50 30.215432688
	AppMagn 11.34
	/*Characteristics*/
	Class   "WN8(h)"
	/*Astrometry*/
	Dist    2555.583950932788142090467671863 // Plx = 0.3913 mas
	AbsMagn -7.22
	/*Details*/
	MassSol 41
	RadSol  19.9
	LumBol  1412532.254681568 // MBol = -10.635
	Teff    44700
}

// 138.HD 37974 (in N135 of LMC)
// https://en.wikipedia.org/wiki/HD_37974
Star "HD 37974/GV 408/SK -69 216/[FD82] 619/AL 361/IRAS 05368-6924/SSTISAGEMC J053625.84-692255.7/H2013] LMCe 1314/AP J05362586-6922558/JP11 1238/TIC 277172980/[VOG2010] 36/ARDB 330/LHA 120-S 127/TYC 9167-518-1/AAVSO 0537-69B/CPD-69 420/LI-LMC 1413/UBV 5835/Gaia DR3 4657658356271368064/EM* MWC 123/2MASS J05362586-6922558/UBV M 11402/Gaia DR1 4657658351931371136/GCRV 25341/2MASSI J0536258-692255/UCAC2 1802906/Gaia DR2 4657658356271368064/GEN# +1.00037974/MSX LMC 890/UCAC4 104-014822/GSC 09167-00518/RMC 126/[BE74] 396"
{
	/*Observation data*/
	RA      05 36 25.8534763728
	Dec     -69 22 55.789571064
	AppMagn 10.99
	/*Characteristics*/
	Class   "B0.5Ia+"
	/*Astrometry*/
	Dist    49977
	AbsMagn -8.4
	/*Details*/
	MassSol 70
	Radius  54163823.57104541 // Calculated
	LumBol  1399582.0811299023 // MBol = -10.625
	Teff    22500
}

// 139.HD 269846 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=hd+269846
Star "HD 269846/SK -69 215/UCAC2 1802882/Gaia DR2 4657691199850726528/CPD-69 417/SSTISAGEMC J053621.47-690647.8/UCAC4 105-013808/Gaia DR3 4657691199850726528/GEN# +1.00269846/TIC 277109064/uvby98 100269846/Gaia DR1 4657691199850726528/GSC 09163-00498/TYC 9163-498-1/[BE74] 395/2MASS J05362147-6906478/UBV M 28789/[H2013] LMCe 1313"
{
	/*Observation data*/
	RA      05 36 21.4902468504
	Dec     -69 06 47.871373752
	AppMagn 11.63
	/*Characteristics*/
	Class   "O I" // OB
	/*Astrometry*/
	Dist    49957
	AbsMagn -6.86298175193672
	/*Details*/
	Radius  34560191.030746 // Calculated
	LumBol  1406042.2584938 // MBol = -10.63
	Teff    28200
}

// 140.W61 3-24 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=w61+3-24
Star "W61 3-24/GSC 09167-00449/TIC 404797438/[M2002] LMC 172859/Gaia DR2 4657647189354677376/2MASS J05391354-6930050/[ST92] 5-27/Gaia DR3 4657647189354677376"
{
	/*Observation data*/
	RA      05 39 13.5533958720
	Dec     -69 30 05.012730900
	AppMagn 14.6
	/*Characteristics*/
	Class   "O3.5V(f+)"
	/*Astrometry*/
	Dist    49955
	AbsMagn -6.892894816537181 // Calculated (+3)
	/*Details*/
	Radius  14325555.68223818 // Calculated
	LumBol  1393151.5855848298 // MBol = -10.62
	Teff    43700
}

// 141.VFTS 621 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+621

// 142.WR 131 (in Cygnus OB3)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+131
Star "MR 97/HIP 98466/HBHA 3203-22/TIC 103727946/Gaia DR2 2034210349533480192/ALS 10699/HIC 98466/TYC 2674-3432-1/Gaia DR3 2034210349533480192/CSI+33-19583/LS II +33 14/UBV 17080/CSI+33-19584 2/2MASS J20001912+3315511/WR 131/EM* CDS 1116/[KW97] 41-39"
{
	/*Observation data*/
	RA      20 00 19.1223016752
	Dec     +33 15 51.099973956
	AppMagn 12.080
	/*Characteristics*/
	Class   "WN7h"
	/*Astrometry*/
	Dist    13123.359580052493438320209973753 // Plx = 0.0762 mas
	AbsMagn -6.82
	/*Details*/
	MassSol 39 // 44 (binary?)
	RadSol  19.12
	LumBol  1380379.0950754583 // MBol = -10.61
	Teff    44700
}

// 143.Sk -69° 104 (in NGC 1910 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Sk+-69+104

// 144.Var A-1 (in Andromeda Galaxy)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RB73+A-1
Star "[RB73] A-1/2MASS J00445054+4130372/LGGS J004450.54+413037.7/[BHG88] 41 3230/Gaia DR3 369287683320155264/AP J00445054+4130377/TIC 115781411/[NTK96] 33/D31 J004450.6+413037.7/[AMB2011] HII 3193"
{
	/*Observation data*/
	RA      00 44 50.5392360936
	Dec     +41 30 37.539481608
	AppMagn 17.143
	/*Characteristics*/
	Class   "B I" // LBV
	/*Astrometry*/
	Dist    796700
	AbsMagn -7.363474085827836 // Calculated (+3)
	/*Details*/
	Radius  57564519.42303885 // Calculated
	LumBol  1367723.7034629364 // MBol = -10.6
	Teff    21700
}

// 145.Mercer 30-6a A (WR 46-4 A in Mercer 30 of Dragonfish Nebula)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=DNB2016+Mc30-6a

// 146.VFTS 427 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+427

// 147.Westerhout 51-3 (in Westerhout 51)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=2MASS+J19234283%2B1430277

// 148.HD 269722 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=hd+269722
Star "HD 269722/KMHK 1036/TIC 425086260/[H2013] LMCe 1116/AL 291/LHA 120-S 45/TYC 8891-3334-1/Gaia DR1 4660299378865252096/CPD-66 429/2MASS J05321882-6624120/UBV M 28755/Gaia DR3 4660299383207361280/GEN# +1.00269722/SK -66 132/UCAC2 2673927/GSC 08891-03334/SSTISAGEMC J053218.81-662412.1/UCAC4 118-008511"
{
	/*Observation data*/
	RA      05 32 18.8342030640
	Dec     -66 24 12.041141832
	AppMagn 11.43
	/*Characteristics*/
	Class   "B I e?" // OBe
	/*Astrometry*/
	Dist    50000
	AbsMagn -7.064850021680094 // Calculated
	/*Details*/
	Radius  33773505.03858813 // Calculated
	LumBol  1342759.9324944126 // MBol = -10.58
	Teff    28200
}

// 149.CXOGC J174502.8-290859 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174502.8-290859

// 150.HSH95-49 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HSH95+49

// 151.HD 269810 (in NGC 2032 of LMC)
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
	LumBol  1318251.801696043 // MBol = -10.56
	Teff    52500
	FeH     0.1
	RotationPeriod 4152
}

// 152.HD 270145 (in LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HD+270145
Star "HD 270145/2MASS J05484964-7003579/TIC 389749953/[L72] LH 117-43/CPD-70 454/MGSD LH 117 118/TYC 9167-300-1/Gaia DR2 4657383027347819392/GEN# +1.00270145/SK -70 115/UBV M 28839/Gaia DR3 4657383027347819392/GSC 09167-00300/SSTISAGEMC J054849.62-700357.9/UCAC2 1559292"
{
	/*Observation data*/
	RA      05 48 49.6513961040
	Dec     -70 03 57.837376476
	AppMagn 12.166
	/*Characteristics*/
	Class   "O6.5Iaf"
	/*Astrometry*/
	Dist    49953
	AbsMagn -6.326807877657018 // Calculated
	/*Details*/
	Radius  13871118.34574875 // Calculated
	LumBol  1306165.9965328865 // MBol = -10.55
	Teff    43700
}

// 153.Westerhout 49-15 (in Westerhout 49)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WBB2016+15

// 154.Westerhout 51d (in Westerhout 51)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=2MASS+J19233978%2B1431074

// 155.WR 18 (in Carina OB1 of Carina Nebula)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+18

// 156.[BMS2003] 578 B (in NGC 604 of Triangulum Galaxy)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=%5BBMS2003%5D+578B&NbIdent=1&Radius=2&Radius.unit=arcmin&submit=submit+id

// 157.AB7 A (in NGC 371 of SMC)
// https://en.wikipedia.org/wiki/AB7

// 158.Arches-F3 (WR 102bb in Arches Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=FNG2002+3

// 159.Arches-F8 (WR 102ag in Arches Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=FNG2002+8

// 160.HD 50064 (in NGC 2301, background star)
// https://en.wikipedia.org/wiki/HD_50064
Star "HD 50064/EM* MWC 536/LS VI +00 35/UBV M 32111/AG+00 786/GCRV 4472/2MASS J06513410+0017503/WEB 6627/AKARI-IRC-V1 J0651341+001749/GEN# +2.23010143/MCW 480/YZ 0 1864/ALS 9183/GSC 00148-02328/PPM 151398/[JHC84] 160/BD+00 1651/Hilt 604/SAO 114524/[KW97] 33-48/BSD 98-3208/IRAS 06490+0021/TIC 237530974/Gaia DR2 3113547759973829120/Cl* NGC 2301 HOAG 3/JP11 4016/TYC 148-2328-1/Gaia DR3 3113547759973829120/CoRoT 14/LF 9 +00 138/UBV 6789/Gaia DR1 3113547755671556864"
{
	/*Observation data*/
	RA      06 51 34.1059967736
	Dec     +00 17 50.466003216
	AppMagn 8.21
	/*Characteristics*/
	Class   "B5Ia+"
	/*Astrometry*/
	Dist    5400
	AbsMagn -5.451968799114843 // Calculated
	/*Details*/
	MassSol 45
	RadSol  200
	LumBol  1258920.6971291197 // MBol = -10.51
	Teff    13500
}

// 161.HSH95-16 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HSH95+16

// This star and Melnick 33Na are the same star.

// 162.HSH95-20 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HSH95+20

// This star and R136a5 are the same star.

// 163.HSH95-46 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HSH95+46

// 164.R139 A (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC139

// 165.VFTS 259 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+259

// 166.VFTS 1031 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+1031

// 167.NGC 2070 MH 980 (in NGC 2070 of LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=cl*+ngc+2070+mh+980

// 168.Sk -69° 194 (in NGC 2033 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Sk+-69+194
StarBarycenter "CPD-69 394/OGLE BRIGHT-LMC-ECL-55/UBV M 51414/[L63] 289/AP J05343609-6945365/SK -69 194/UCAC2 1676656/[L72] LH 81-31/GEN# +8.58690194/SSTISAGEMC J053436.08-694536.4/UCAC4 102-014303/Gaia DR2 4657273557221379072/GSC 09166-00330/TIC 276936320/W61 28-10/Gaia DR3 4657273557221379072/2MASS J05343609-6945365/TYC 9166-330-1/[H2013] LMCe 1223/Gaia DR1 4657273557221379072"
{
	/*Observation data*/
	RA      05 34 36.0879084840
	Dec     -69 45 36.503591616
	AppMagn 12.131
	/*Characteristics*/
	Class   "B0I+WN"
	/*Astrometry*/
	Dist    49960
	AbsMagn -6.36211214851049 // Calculated
}

// 169.ST2-22 (in NGC 2044 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=ST92+2-22
Star "[M2002] LMC 163521/[ST92] 2-22"
{
	/*Observation data*/
	RA      05 35 45.2600
	Dec     -69 11 35.105
	AppMagn 14.3
	/*Characteristics*/
	Class   "O3.5III(f+)"
	/*Astrometry*/
	Dist    49947
	AbsMagn -6.192547040130034 // Calculated (+2)
	/*Details*/
	Radius  9836477.905408837 // Calculated
	LumBol  1247378.842802206 // MBol = -10.5
	Teff    51300
}

// 170.HD 269215 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=hd+269215
StarBarycenter "HD 269215/2MASS J05133787-6918012/TYC 9162-106-1/WISEA J051337.99-691801.0/CPD-69 342/SK -69 76/UBV M 28642/WISE J051337.99-691801.0/GEN# +1.00269215/SSTISAGEMC J051337.88-691801.1/UCAC2 1798595/GSC 09162-00106/TIC 40795719/UCAC4 104-008894"
{
	/*Observation data*/
	RA      05 13 37.922976
	Dec     -69 18 00.94932
	AppMagn 11.838
	/*Characteristics*/
	Class   "OB" // Wide Binary?
	/*Astrometry*/
	Dist    49970
	AbsMagn -6.655546747212936 // Calculated
}

// 171.Trumpler 27-27 (in Trumpler 27)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Cl+Trumpler+27+27

// 172.VFTS 1028 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+1028

// 173.LH 10-3601 (in NGC 1763 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=L72+LH+10-3061
Star "[L72] LH 10-3061/2MASS J04564246-6625180/DCMC J045642.50-662518.4/SSTISAGEMC J045642.43-662517.9/[HKN2006] OB 278/BRRG 56/IRSF J04564251-6625181/TIC 30275857/CXOU J045642.5-662518/PGMW 3061/[ELS2006] N11 031/Gaia DR3 4662155839859944064"
{
	/*Observation data*/
	RA      04 56 42.5074945536
	Dec     -66 25 18.217550208
	AppMagn 13.491
	/*Characteristics*/
	Class   "N2III(f*)" // ON2III(f*)
	/*Astrometry*/
	Dist    50105
	AbsMagn -7.00840533233621 // Calculated (+2)
	/*Details*/
	Radius  8401347.954020832 // Calculated
	LumBol  1202259.9321472482 // MBol = -10.46
	Teff    55000
}

// 174.AB1 (in DEM S10 of SMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=SMC+AB+1
StarBarycenter "SMC AB 1/GSC 09141-05631/2MASS J00434231-7328552/SSTISAGE1C J004342.27-732855.2/[MA93] 57/AzV 2a/OGLE SMC-SC3 63387/TIC 180212727/Gaia DR2 4685840248028024960/MACHO 213.15560.24/[M2002] SMC 3304/Gaia DR3 4685840248028024960"
{
	/*Observation data*/
	RA      00 43 42.3082596960
	Dec     -73 28 55.259220360
	AppMagn 15.24
	/*Characteristics*/
	Class   "WN3+O4:"
	/*Astrometry*/
	Dist    64350
	AbsMagn -6.8027427562020275 // Calculated (+3)
}

// 175.BI 253 (Runaway star from Tarantula Nebula of LMC)
// https://en.wikipedia.org/wiki/BI_253

// 176.LGGS J013248.26+303950.4 (in Triangulum Galaxy)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=LGGS+J013248.26%2B303950.4
Star "LGGS J013248.26+303950.4"
{
	/*Observation data*/
	RA      01 32 48.26
	Dec     +30 39 50.4
	AppMagn 17.25
	/*Characteristics*/
	Class   "B I" // LBV:
	/*Astrometry*/
	Dist    867600
	AbsMagn -7.441597716710781 // Calculated
	/*Details*/
	Radius  47491805.33212107 // Calculated
	LumBol  1174893.1549580991 // MBol = -10.435
	Teff    23000
}

// 177.Mercer 30-8 (WR 46–6 in Mercer 30 of Dragonfish Nebula)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=DNB2016+Mc30-8

// 178.NGC 346-W3 (in NGC 346 of SMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Cl*+NGC+346+W+3

// 179.WR 102d (in Quintuplet cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+102d

// 180.WR 126 (in Vulpecula OB2)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+126
Star "WR 126/2MASS J19395620+2634424/[S66] 2/GSC 02146-02748/TIC 215367717/Gaia DR2 2022054350800575488/HBHA 2702-05/[KW97] 38-41/Gaia DR3 2022054350800575488"
{
	/*Observation data*/
	RA      19 39 56.1963949728
	Dec     +26 34 42.481553196
	AppMagn 13.29
	/*Characteristics*/
	Class   "WC5"
	/*Astrometry*/
	Dist    18552.875695732838589981447124304 // Plx = 0.0539 mas
	AbsMagn -6.052056174066305 // Calculated (+3)
	/*Details*/
	Radius  6329847.573870507 // Calculated
	LumBol  1174893.1549580991 // MBol = -10.435
	Teff    63000
}

// 181.WR 20a A (in Westerlund 2)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+20a

// 182.WR 20a B (in Westerlund 2)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+20a

// 183.GCIRS 16SW A (WR 101k A in Galactic Center)
// https://en.wikipedia.org/wiki/GCIRS_16SW

// 184.GCIRS 16SW B (WR 101k B in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=GCIRS+16SW

// 185.BAT99-104 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=BAT99+104

// 186.CXOGC J174516.7-285824 (WR 101–3 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174516.7-285824

// 187.G0.121-0.099 (WR 102–16 in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=MCD2010+G0.121-0.099

// 188.G359.797+0.037 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=MCD2010+G329.797%2B0.037

// 189.HD 93205 A (in Trumpler 16 of Carina Nebula)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HD+93205

// 190.HSH95-47 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HSH95+47

// 191.WR 158 (in Cassiopeia OB1)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+158
StarBarycenter "EM* AS 513/HIP 117034/HBHA 6207-41/MR 122/WR 158/ALS 13110/HIC 117034/TIC 272325493/[B53] 210/CSI+61-23411/JP11 5259/TYC 4285-2973-1/[KW97] 69-25/LS I +61 27/UBV 20400/Gaia DR2 2012912500041834752/GEN# +8.01610027/2MASS J23433059+6155484/UBV M 50586/Gaia DR3 2012912500041834752/GSC 04285-02973/MHA 217-9/UCAC3 304-161380/Gaia DR1 2012912495735383040"
{
	/*Observation data*/
	RA      23 43 30.5960809392
	Dec     +61 55 48.139591872
	AppMagn 11.282
	/*Characteristics*/
	Class   "WN7h+Be?"
	/*Astrometry*/
	Dist    5109.862
	AbsMagn -6.49
}

// 192.WR 28 (in FSR 1555)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+28
Star "WR 28/SPH 95/UCAC2 5807850/Gaia DR3 5350458670093520640/GSC 08626-01709/THA 35-II-112/[MS70] 2/2MASS J10485872-5903373/TIC 459327075/Gaia DR2 5350458670093520640"
{
	/*Observation data*/
	RA      10 48 58.7233875624
	Dec     -59 03 37.305467496
	AppMagn 12.98
	/*Characteristics*/
	Class   "WN6(h)-w"
	/*Astrometry*/
	Dist    7267.442
	AbsMagn -6.08
	/*Details*/
	MassSol 35
	RadSol  14.06
	LumBol  1148149.321671258 // MBol = -10.41
	Teff    50100
}

// 193.HD 303308 (in Trumpler 16 of Carina Nebula)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HD+303308

// 194.M33C-15235 (in Triangulum Galaxy)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=LGGS+J013351.46%2B304057.0
StarBarycenter "LGGS J013351.45+304057.0/IFM-B 1079/LGGS J013351.46+304057.0/[NM2011] J013351.46+304057.0"
{
	/*Observation data*/
	RA      01 33 51.46
	Dec     +30 40 57.0
	AppMagn 17.73
	/*Characteristics*/
	Class   "WN/Of"
	/*Astrometry*/
	Dist    862800
	AbsMagn -6.9495506821525375 // Calculated
	/*Details*/
	Radius  28994034.28437629 // Calculated
	LumBol  1137623.0254188431 // MBol = -10.4
	Teff    29200
}

// 195.ZH 364 (in Messier 81)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=%5BZH91%5D%20M%2081%20364
Star "[S84b] M 81 12/[ZH91] M 81 364"
{
	/*Observation data*/
	RA      09 55 20.310
	Dec     +69 01 55.97
	AppMagn 19.72
	/*Characteristics*/
	Class   "B I" // LBV?e
	/*Astrometry*/
	Dist    3680000
	AbsMagn -8.109239093367592 // Calculated
	/*Details*/
	Radius  98280642.06284261 // Calculated
	LumBol  1137623.0254188431 // MBol = -10.4
	Teff    15860
}

// 196.HD 269700 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=hd+269700
Star "HD 269700/GSC 09162-00256/SK -68 114/uvby98 100269700/AP J05315227-6832388/GV 361/SSTISAGEMC J053152.26-683238.9/[BE74] 341/ARDB 289/JP11 3754/TIC 425081475/[FD82] 571/CD-68 318/LHA 120-S 172/TYC 9162-256-1/[H2013] LMCe 1090/CPC 21.1 826/2MASS J05315227-6832388/UBV 5630/AAVSO 0532-68/CPD-68 386/PPM 354818/UBV M 28746/Gaia DR3 4658474743652257664/GCRV 24313/PV 1138/UCAC2 1933657/Gaia DR1 4658474739315016960/GEN# +1.00269700/RMC 116/UCAC4 108-010208/Gaia DR2 4658474743652257664"
{
	/*Observation data*/
	RA      05 31 52.2818122296
	Dec     -68 32 38.857949016
	AppMagn 10.54
	/*Characteristics*/
	Class   "B1.5Iaeq"
	/*Astrometry*/
	Dist    49990
	AbsMagn -7.954415683762953 // Calculated
	/*Details*/
	Radius  64715025.74500456 // Calculated
	LumBol  1127193.2348305478 // MBol = -10.39
	Teff    19500
}

// 197.AB9 (in DEM S80 of SMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=SMC+AB+9
Star "SMC AB 9/MVD 1 in SMC/SMC MVDWR/[PHC98] 1801/2dFS 999/OGLE SMC-SC7 47183/SSTISAGE1C J005432.12-724435.5/Gaia DR3 4685983940501730944/2MASS J00543215-7244356/OGLE SMC-SC7 47126/TIC 181446199/MCPS 0.908943-72.74313/OGLE SMC-SC6 311199/[M2002] SMC 30420"
{
	/*Observation data*/
	RA      00 54 32.1559137576
	Dec     -72 44 35.666609568
	AppMagn 15.43
	/*Characteristics*/
	Class   "WN3ha"
	/*Astrometry*/
	Dist    64385.6
	AbsMagn -3.61392350015209 // Calculated
	/*Details*/
	Radius  2455129.196643531 // Calculated
	LumBol  1122014.2523523173 // MBol = -10.385
	Teff    100000
}

// 198.Arches-F18 (in Arches Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=FNG2002+18

// 199.BAT99-64 A (in NGC 2033 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=BAT99+64
StarBarycenter "HD 269784/MACHO 81.8881.26/OGLE LMC-SC16 70654/TIC 277022612/BAT99 64/2MASS J05345938-6944063/OGLE J053459.53-694406.2/UCAC4 102-014405/Brey 53/OGLE LMC169.3 108878/OGLE LMC-SC1 340163/W61 28-30/FD 48/OGLE LMC516.20.021092/SK -69 198/[H2013] LMCe 1240GEN# +8.58690198/OGLE LMC-ECL-19740/SSTISAGEMC J053459.38-694406.1/Gaia DR3 4657274386230566656"
{
	/*Observation data*/
	RA      05 34 59.3904949944
	Dec     -69 44 06.296661528
	AppMagn 14.073
	/*Characteristics*/
	Class   "WN4o+O9:"
	/*Astrometry*/
	Dist    49962
	AbsMagn -6.420199075209709 // Calculated (+2)
}

// 200.Var B (in Triangulum Galaxy)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VHK+B
Star "[HS53] B/2MASS J01334919+3038091/IFM-B 1004/VHK B/Gaia DR3 303379516081697024/D33 J013349.2+303809.1/LGGS J013349.23+303809.1/EV* M33 V0330/H-S B/[SM2006] W21445/FSZ 246/TIC 61290432/Gaia DR2 303379516081697024"
{
	/*Observation data*/
	RA      01 33 49.1985770352
	Dec     +30 38 09.097655172
	AppMagn 16.208
	/*Characteristics*/
	Class   "A I" // LBV
	/*Astrometry*/
	Dist    863200
	//AbsMagn -3.61392350015209 // Calculated
	/*Details*/
	Radius  303102369.9559914 // Calculated
	LumBol  1122014.2523523173 // MBol = -10.385
	Teff    9000
}

// 201.VFTS 562 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+562

// 202.WR 37 (in SFC 27 of G291.27-0.71)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+37
Star "WR 37/TIC 466527248/Gaia DR2 5337185679290680320/2MASS J11051390-6120411/[MS70] 7/Gaia DR3 5337185679290680320"
{
	/*Observation data*/
	RA      11 05 13.9026194544
	Dec     -61 20 41.185677192
	AppMagn 16.0
	/*Characteristics*/
	Class   "WN4-s"
	/*Astrometry*/
	Dist    9633.9113680154142581888246628131 // Plx = 0.1038 mas
	AbsMagn -5.20
	/*Details*/
	MassSol 34
	RadSol  3.37
	LumBol  1122014.2523523173 // MBol = -10.385
	Teff    100000
}

// 203.SK -69 98 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=sk+-69+98
Star "SK -69 98/TYC 9166-707-1/2MASS J05182739-6937015/TIC 179308589/Gaia DR2 4658170208955675904/GEN# +8.58690098/UBV M 51390/Gaia DR3 4658170208955675904/GSC 09166-00707/SSTISAGEMC J051827.37-693701.6/UCAC2 1673152"
{
	/*Observation data*/
	RA      05 18 27.4077305856
	Dec     -69 37 01.648061292
	AppMagn 12.29
	/*Characteristics*/
	Class   "B I" // OB
	/*Astrometry*/
	Dist    49963
	AbsMagn -6.203242537254432 // Calculated
	/*Details*/
	Radius  30519410.05387766 // Calculated
	LumBol  1096474.089841591 // MBol = -10.36
	Teff    28200
}

// 204.VFTS 512 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+512

// 205.Mercer 30-6b (in Mercer 30 of Dragonfish Nebula)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=DNB2016+Mc30-6b

// 206.VFTS 3 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+3

// 207.VFTS 151 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+151

// 208.VFTS 603 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+603

// 209.VFTS 603 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+603

// 210.HD 268605 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=hd+268605
Star "HD 268605/GV 22/TIC 294985147/[FD82] 35/ARDB 16/JP11 3715/TYC 9161-6-1/[M2002] LMC 7406/CPD-67 355/2MASS J04501891-6739380/UBV 4741/Gaia DR2 4661611169272089216/GALAH 171230002101197/PPM 354360/UBV M 28545/Gaia DR3 4661611169272089216/GCRV 23672/RMC 53/UCAC2 2214830/GEN# +1.00268605/SK -67 5/uvby98 100268605/GSC 09161-00006/SSTISAGEMC J045018.91-673938.1/uvby98 600003390"
{
	/*Observation data*/
	RA      04 50 18.9258130824
	Dec     -67 39 38.036838240
	AppMagn 11.377
	/*Characteristics*/
	Class   "O9.5Ia" // O9.5/B0Ia
	/*Astrometry*/
	Dist    49988
	AbsMagn -7.117328805753393 // Calculated
	/*Details*/
	Radius  30519410.05387766 // Calculated
	LumBol  1056813.5514410022 // MBol = -10.32
	Teff    28200
}

// 211.CXOGC J174532.7-285126 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174532.7-285126

// 212.HD 93403 A (in Trumpler 16 of Carina Nebula)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HD+93403

// 213.Mercer 30-2 (in Mercer 30 of Dragonfish Nebula)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=DNB2016+Mc30-2

// 214.R133 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC133

// 215.HD 269786 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=hd+269786
Star "HD 269786/GSC 09166-00560/TYC 9166-560-1/[L72] LH 81-3/AP J05350360-6945020/2MASS J05350360-6945020/UBV M 28773/Gaia DR2 4657274283151403520/CPD-69 399/SK -69 200/UCAC2 1676728/Gaia DR3 4657274283151403520/GALAH 170108002201046/SSTISAGEMC J053503.60-694501.8/uvby98 100269786/Gaia DR1 4657274278775884672/GEN# +1.00269786/TIC 277022505/W61 28-34"
{
	/*Observation data*/
	RA      05 35 03.6024655848
	Dec     -69 45 02.031899796
	AppMagn 11.18
	/*Characteristics*/
	Class   "B1I"
	/*Astrometry*/
	Dist    49963
	AbsMagn -7.313242537254432 // Calculated
	/*Details*/
	Radius  34132087.79237292 // Calculated
	LumBol  1037524.5302828484 // MBol = -10.3
	Teff    26300
}

// 216.HD 97950 E (in HD 97950 of NGC 3603)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HD+97950E

// 217.HD 229059 (in Berkeley 87)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=HD+229059

// 218.M33C-10788 (in Triangulum Galaxy)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=LGGS+J013416.07%2B303642.1
StarBarycenter "[HS80] B517/D33 J013416.1+303641.8/IFM-B 1731/[NM2011] J013416.07+303642.1/FSZ 422/LGGS J013416.07+303642.1/[MBH96] 339/[S92b] H108"
{
	/*Observation data*/
	RA      01 34 16.07
	Dec     +30 36 42.1
	AppMagn 17.95
	/*Characteristics*/
	Class   "Ofpe/WN9"
	/*Astrometry*/
	Dist    861500
	AbsMagn -6.7262764089202385 // Calculated
	/*Details*/
	Radius  23055491.99717424 // Calculated
	LumBol  1037524.5302828484 // MBol = -10.3
	Teff    32000
}

// 219.Sk -69° 200 (in NGC 2033 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Sk+-69+200
Star "HD 269786/GSC 09166-00560/TYC 9166-560-1/[L72] LH 81-3/AP J05350360-6945020/2MASS J05350360-6945020/UBV M 28773/Gaia DR2 4657274283151403520/CPD-69 399/SK -69 200/UCAC2 1676728/Gaia DR3 4657274283151403520/GALAH 170108002201046/SSTISAGEMC J053503.60-694501.8/uvby98 100269786/Gaia DR1 4657274278775884672/GEN# +1.00269786/TIC 277022505/W61 28-34"
{
	/*Observation data*/
	RA      05 35 03.6024655848
	Dec     -69 45 02.031899796
	AppMagn 11.18
	/*Characteristics*/
	Class   "B1I"
	/*Astrometry*/
	Dist    49959
	AbsMagn -7.313068683855928 // Calculated
	/*Details*/
	Radius  34132087.79237292 // Calculated
	LumBol  1037524.5302828484 // MBol = -10.3
	Teff    26300
}

// 220.Sk -69° 259 (in NGC 2081 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=Sk+-69+259
Star "HD 38489/IRAS 05406-6924/SSTISAGEMC J054013.35-692246.4/[H2013] LMCe 1462/ARDB 344/IRSF J05401334-6922465/TIC 404851658/[L63] 311/CPD-69 478/LHA 120-S 134/UBV M 11477/[MNM2014] LMC174-5/EM* MWC 126/LI-LMC 1522/UCAC2 1803671/[ST92] 4-73/GCRV 25352/2MASS J05401333-6922464/UCAC4 104-015600/[V2000] J054013.1-692250/GEN# +1.00038489/2MASSI J0540133-692246/W61 4-26/Gaia DR2 4657672306328206208/GSC 09167-00596/MSX LMC 887/[BE74] 436/Gaia DR3 4657672306328206208/GV 422/SK -69 259/[FD82] 634"
{
	/*Observation data*/
	RA      05 40 13.3208083008
	Dec     -69 22 46.485962112
	AppMagn 11.93
	/*Characteristics*/
	Class   "B I[e]" // B[e]
	/*Astrometry*/
	Dist    49948
	AbsMagn -6.562590515227079 // Calculated
	/*Details*/
	Radius  26232026.45011825 // Calculated
	LumBol  1037524.5302828484 // MBol = -10.3
	Teff    30000
}

// 221.WR 77k (in Westerlund 1)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=WR+77k

// 222.10182-pr-6 (in NGC 2403)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=%5BHSG2019%5D%2010182-pr-6
Star "[HSG2019] 10182-pr-6"
{
	/*Observation data*/
	RA      07 36 59.120
	Dec     +65 35 09.95
	AppMagn 18.79
	/*Characteristics*/
	Class   "A8Ie" // A8-F0Ie
	/*Astrometry*/
	Dist    3250200
	AbsMagn -8.769550429854235 // Calculated
	/*Details*/
	Radius  368887871.9547879 // Calculated
	LumBol  1037524.5302828484 // MBol = -10.3
	Teff    8000
}

// 223.[RP2006] 542 (in LMC)
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=%5Brp2006%5D+542
Star "[RP2006] 542/2MASS J05265335-7122085/[GC2009] J052653.40-712209.2/[L63] 235/TIC 373985885/[H2013] LMCe 844"
{
	/*Observation data*/
	RA      05 26 53.358
	Dec     -71 22 08.55
	AppMagn 16.75
	/*Characteristics*/
	Class   "B0IV[e]"
	/*Astrometry*/
	Dist    49945
	AbsMagn -4.7424600873246128 // Calculated
	/*Details*/
	Radius  27004138.02114405 // Calculated
	LumBol  1028012.4482141087 // MBol = -10.29
	Teff    29500
}

// 224.HD 93250 A (in Trumpler 16 of Carina Nebula)
// https://en.wikipedia.org/wiki/HD_93250

// 225.VFTS 267 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+267

// 226.VFTS 599 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+599

// 227.VVV CL074-9 (WR 75–29 in VVV CL074)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CBB2013+VVV+CL074+9

// 228.WR 156 (in Cepheus OB1)
// https://en.wikipedia.org/wiki/WR_156
StarBarycenter "MR 119/HIP 113569/EM* GGR 124/WR 156/AC +60 38562-0/GCRV 73711/SSTSMOGA G109.8240+00.9194/[B53] 35/ALS 12730/GSC 04278-00506/TIC 434333256/[KW97] 66-51/AP J23001010+6055385/HBHA 6206-19/TYC 4278-506-1/[MO2001] 43/CSI+60-22581/HIC 113569/UCAC3 302-170388/Gaia DR2 2014674226896884864/EM* CDS 1431/LS III +60 30/UCAC4 755-076188/Gaia DR3 2014674226896884864/EM* CDS 5181/2MASS J23001010+6055385/WISE J230010.12+605538.4/Gaia DR1 2014674222596498176"
{
	/*Observation data*/
	RA      23 00 10.1253892224
	Dec     +60 55 38.410870260
	AppMagn 10.844
	/*Characteristics*/
	Class   "WN8h"
	/*Astrometry*/
	Dist    3600
	AbsMagn -7.00
	/*Details*/
	MassSol 32
	RadSol  20.81
	LumBol  1023289.1600571304 // MBol = -10.285
	Teff    39800
}

// 229.HD 269050 (in LMC)
// http://simbad.cds.unistra.fr/simbad/sim-id?Ident=hd+269050
Star "HD 269050/JP11 3733/TYC 9161-749-1/[H2013] LMCe 385/ARDB 140/LB 3422/UBV 4989/AAVSO 0507-68/CPD-68 318/2MASS J05072041-6832085/UBV M 28616/Gaia DR3 4661289630893455488/GCRV 23877/RMC 78/UCAC2 1930654/Gaia DR1 4661289626521994368/GEN# +1.00269050/SK -68 52/UCAC4 108-007111/Gaia DR2 4661289630893455488/GSC 09161-00749/SSTISAGEMC J050720.40-683208.6/[BE74] 212/GV 209/TIC 31181554/[FD82] 373"
{
	/*Observation data*/
	RA      05 07 20.4218668824
	Dec     -68 32 08.569322196
	AppMagn 11.54
	/*Characteristics*/
	Class   "B0Ia(e?)"
	/*Astrometry*/
	Dist    49957
	AbsMagn -6.952981751936722 // Calculated
	/*Details*/
	Radius  29415493.1938085 // Calculated
	LumBol  1018587.5734379619 // MBol = -10.28
	Teff    28200
}

// 230.Arches-F2 (WR 102aa in Arches Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=FNG2002+2

// 231.Arches-F14 (WR 102ba in Arches Cluster)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=FNG2002+14

// 232.BAT99-68 (in BSDL 2505 of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=BAT99+68
Star "Brey 58/LI-LMC 1383/[M2002] LMC 163386/BAT99 68/LMC AB 4/[ST92] 2-12/GEN# +6.20136058/[H2013] LMCe 1266/[TSL93] alf 4"
{
	/*Observation data*/
	RA      05 35 42.2160
	Dec     -69 11 54.240
	AppMagn 14.13
	/*Characteristics*/
	Class   "O3If*/WN6"
	/*Astrometry*/
	Dist    49974
	AbsMagn -4.363720562342261 // Calculated
	/*Details*/
	Radius  11445883.55939974 // Calculated
	LumBol  999996.2550084365 // MBol = -10.26
	Teff    45000
}

// 233.CXOGC J174628.2-283920 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174628.2-283920

// 234.CXOGC J174703.1-283119 (in Galactic Center)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CXOGC+J174703.1-283119

// 235.R135 A (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC135

// 236.R140a2 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC140a2

// 237.R142 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=RMC142

// 238.VFTS 64 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+64

// 239.VFTS 591 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+591

// 240.VFTS 1034 (in Tarantula Nebula of LMC)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=VFTS+1034

// 241.VVV CL074-3 (WR 75–28 in VVV CL074)
// https://simbad.u-strasbg.fr/simbad/sim-id?Ident=CBB2013+VVV+CL074+3