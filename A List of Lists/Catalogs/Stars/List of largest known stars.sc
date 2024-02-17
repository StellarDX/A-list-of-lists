////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                                //
//                                  List of largest known stars                                   //
//                                                                                                //
//    This list includes 7 sub-lists, classified based on host galaxy includes the Milky Way,     //
//    Magellanic Clouds, Andromeda, Triangulum, and other galaxies.                               //                                          
//    This is a dynamic list and may never be able to satisfy particular standards for            //
//    completeness. You can help by adding missing items with reliable sources.                   //
//    Stars larger than 700 RSun are included.                                                    //
//    Original list: https://en.wikipedia.org/wiki/List_of_largest_known_stars                    //
//                                                                                                //
////////////////////////////////////////////////////////////////////////////////////////////////////

// 1.WOH G64 (For comparison, the largest known star)
// https://en.wikipedia.org/wiki/WOH_G64
Remove "WOH G64"
StarBarycenter "WOH G 64/MACHO 47.2368.9/OGLE LMC-LPV-6819/Gaia DR2 4661527262798576768/DCMC J045510.49-682030.2/2MASS J04551048-6820298/TIC 30186593/Gaia DR3 4661527262798576768/IRAS 04553-6825/2MASSI J0455105-682029/WISE J045510.51-682030.2/LI-LMC 181/MSX LMC 1182/[VOG2010] 6"
{
	/*Observation data*/
	RA      04 55 10.5236094912 
	Dec     -68 20 30.019011036
	AppMagn 17.7 // 18.8
	/*Characteristics*/
	Class   "M5I" // M7.5(I)e
	/*Astrometry*/
	Dist    50000
	AbsMagn -6
	/*Details*/
	MassSol 25 // VLT measurement
	RadSol  1540
	LumBol  282000
	Teff    3400
	Age     0.005
}

// --------------------------------Theoretical limit of star size-------------------------------- //

////////////////////////////////////////////////////////////////////////////////////////////////////
//                                 Theoretical limit of star size                                 //
////////////////////////////////////////////////////////////////////////////////////////////////////
// This value comes from the rough average radii of the 
// three largest stars studied in the paper. It is consistent 
// with the largest possible stellar radii predicted from the 
// current evolutionary theory, and it is believed that stars 
// above this radius would be too unstable and simply do 
// not form.

// ------------------------------------------Milky Way------------------------------------------- //

// Reference:
// Ramstedt, S.; Olofsson, H. (25 May 2014). "The
// 12CO/13CO ratio in AGB stars of different chemical
// type. Connection to the 12C/13C ratio and the 
// evolution along the AGB". Astronomy and 
// Astrophysics. 566: A145. 
// https://arxiv.org/abs/1405.6404
// Healy, Sarah; Horiuchu, Shunsaku; Colomer Moller, 
// Marta; Milisavljevic, Dan; Tseng, Jeff; Bergin, Faith; 
// Weil, Kathryn; Tanaka, Masaomi (17 July 2023). "Red 
// Supergiant Candidates for Multimessenger Monitoring 
// of the Next Galactic Supernova".
// https://github.com/SNEWS2/candidate_list
// De Beck, E.; Decin, L.; De Koter, A.; Justtanont, K.; 
// Verhoelst, T.; Kemper, F.; Menten, K. M. (2010). 
// "Probing the mass-loss history of AGB and red 
// supergiant stars from CO rotational line profiles. II. CO 
// line survey of evolved stars: Derivation of mass-loss 
// rate formulae". Astronomy and Astrophysics. 523: A18.
// https://arxiv.org/abs/1008.1083
// Bergeat, J.; Chevallier, L. (January 2005). "The 
// mass loss of C-rich giants". Astronomy and 
// Astrophysics. 429: 235–246.
// https://arxiv.org/abs/astro-ph/0601366
// The Gaia DR3
// https://gea.esac.esa.int/archive/

// 2.RSGC1-F01
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+1&submit=SIMBAD+search

// 3.VY Canis Majoris
// https://en.wikipedia.org/wiki/VY_Canis_Majoris
Remove "VY CMa"
Star "V* VY CMa/HD 58061/GSC 06541-02525/RAFGL 1111/WISE J072258.10-254603.5/** B 719/HIC 35793/SAO 173591/YZ 115 4839/ADS 6033 AB/HIP 35793/SKY# 13432/[LFO93] 0720-25/AN 60.1931/IRAS 07209-2540/SRS 7681/[PCC93] 116/CD-25 4441/IRC -30087/SV* P 468/[TCH91] 07209-2540/CPD-25 2286/JCMTSE J072258.5-254602/TIC 107149174/[TVH89] 21/GCRV 27408/JCMTSF J072258.5-254602/UCAC4 322-023976/[WCP90] 072054.739-254012.27/GCRV 27369/2MASS J07225830-2546030/AAVSO 0718-25/GCRV 4908/OH 239.3-05.1/WDS J07230-2546AB/GEN# +1.00058061/PPM 252258/WEB 7134"
{
	/*Observation data*/
	RA      07 22 58.3261352189
	Dec     -25 46 03.194390594
	AppMagn 8.691
	/*Characteristics*/
	Class   "M3Ia+" // M3–M4.5
	/*Astrometry*/
	Dist    1170
	AbsMagn -9.4 // guess, citation needed.
	/*Details*/
	MassSol 17
	RadSol  1420
	LumBol  178000 // 270000
	Teff    3490
    FeH     0
	Age     0.0082
}

// 4.AH Scorpii
// https://en.wikipedia.org/wiki/AH_Scorpii
Remove "AH Sco"
Star "V* AH Sco/HD 155161/GSC 07365-00527/PPM 296007/UCAC3 116-266853/AN 223.1907/HIC 84071/RAFGL 1927/CD-32 12429/HIP 84071/SAO 208506/AAVSO 1704-32/CPC 17 9041/IRAS 17080-3215/SV* HV 3059/Gaia DR3 5979926504430920192/CPD-32 4382/IRC -30282/TIC 45344564/Gaia DR2 5979926504430920192/GEN# +1.00155161/2MASS J17111702-3219308/TYC 7365-527-1"
{
	/*Observation data*/
	RA      17 11 17.0194487616
	Dec     -32 19 30.714035556
	AppMagn 8.10
	/*Characteristics*/
	Class   "M4Ia" // M4-5 Ia-Iab
	/*Astrometry*/
	Dist    2260
	AbsMagn -5.8
	/*Details*/
	MassSol 10
	RadSol  1411
	LumBol  330000
	Teff    3450 // 3682
}

// 5.RSGC1-F06
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+6&submit=SIMBAD+search

// 6.CD-33 12241
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=CD-33+12241&submit=SIMBAD+search

// 7.Stephenson 2 DFK 2
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=Cl*+Stephenson+2+DFK+2&submit=SIMBAD+search

// 8.Stephenson 2 DFK 49
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=Cl*+Stephenson+2+DFK+49&submit=SIMBAD+search

// 9.CD-26 5055
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=CD-26+5055&submit=SIMBAD+search
Star "CD-26 5055/IRAS 07477-2707/UCAC2 20577610/Gaia DR1 5601551529183084288/BM V 58/2MASS J07494962-2715203/YZ 117 4467/CPD-26 2645/TIC 127890978/Gaia DR2 5601551533492117632/GSC 06561-00662/TYC 6561-662-1/Gaia DR3 5601551533492117632"
{
	/*Observation data*/
	RA      07 49 49.6140135912
	Dec     -27 15 20.205556452
	AppMagn 8.88
	/*Characteristics*/
	Class   "M2.5Iab"
	/*Astrometry*/
	Parallax 0.2711
	AbsMagn -4.9543524120975704 // Calculated (+1)
	/*Details*/
	// Gaia DR3 data
	MassSol 24.90801847466499 // log(g) = -0.38 cm/s^2
	RadSol  1280
	LumBol  280552.02934171126 // Calculated
	FeH     0.016
	Teff    3713
}

// 10.RSGC1-F10
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+10&submit=SIMBAD+search

// 11.Westerlund 1 W237 (Westerlund 1 BKS B)
// https://en.wikipedia.org/wiki/Westerlund_1-237

// 12.ST Cephei
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=ST+Cephei&submit=SIMBAD+search
Star "V* ST Cep/HD 239978/IRAS 22282+5644/SAO 34529/AG+56 1586/IRC +60357/SV* HV 3228/YZ 56 13215/AN 25.1910/JP11 206/TIC 63963820/AAVSO 2226+56/BD+56 2793/2MASS J22301074+5700032/TYC 3991-213-1/Gaia DR3 2007597289039287680/GEN# +0.05602793/PPM 40757/UBV M 28063/Gaia DR1 2007597284728864768/GSC 03991-00213/RAFGL 2916/UCAC3 295-194897/Gaia DR2 2007597289039287680"
{
	/*Observation data*/
	RA      22 30 10.7379122880
	Dec     +57 00 03.071154564
	AppMagn 9.7
	/*Characteristics*/
	Class   "M2Ia-Iab"
	/*Astrometry*/
	Parallax 0.21615991475493607
	AbsMagn -4.966418359330728 // Calculated (+1.3402941613764043)
	/*Details*/
	// Gaia DR3 data
	MassSol 33.902618693243021 // log(g) = -0.203 cm/s^2
	RadSol  1218.0272445852804
	LumBol  224353.81302480385 // MBol = -8.63733770363448
	Teff    3605 // 3722
	FeH     0.022
}

// 12.S Persei
// https://en.wikipedia.org/wiki/S_Persei
Remove "S Per"
Star "V* S Per/HD 14528/GSC 03698-03073/RAFGL 323/[KW97] 11-22/AG+58 255/HIC 11093/SAO 23261/[PCC93] 22/BD+57 552/HIP 11093/TIC 348619093/[RMB2014] G134.62-02.19/CCDM J02229+5836A/IDS 02156+5808 A/TYC 3698-3073-1/[TVH89] 5/CSI+57 552 2/IRAS 02192+5821/UBV 21545/AAVSO 0215+58/DO 25619/IRC +60088/UCAC3 298-47913/Gaia DR3 459101393719884800/GC 2843/JP11 633/Gaia DR2 459101393719884800/GCRV 27308/2MASS J02225173+5835112/WDS J02229+5835A/GEN# +1.00014528/PPM 27539/YZ 58 2170"
{
	/*Observation data*/
	RA      02 22 51.7113133056
	Dec     +58 35 11.422774248
	AppMagn 9.7
	/*Characteristics*/
	Class   "M3Iae-M7"
	/*Astrometry*/
	Dist    2420
	AbsMagn -6.36 // at mV = 9.23
	/*Details*/
	MassSol 20
	RadSol  1212 // 1364
	LumBol  123000 // 186000
	Teff    3500 // 3000 - 3600
}

// 13.IRC -10414
// https://en.wikipedia.org/wiki/IRC_%E2%88%9210414
Star "IRC -10414/OH 017.551-00.126/2MASS J18231790-1342473/WISEA J182317.91-134246.9/[SVM2001b] 96/ATO J275.8245-13.7131/OH 017.55-00.13/WISE J182317.85-134245.9/[TVH89] 294/BAaDE ad3a-09606/RAFGL 2139/[LBR81] B182027.88-134422.5/Gaia DR2 4152386205830965120/IRAS 18204-1344/TIC 119319594/[PCC93] 260/Gaia DR3 4152386205830965120/UCAC4 382-103033/[RMB2014] G017.55-00.12"
{
	/*Observation data*/
	RA      18 23 17.9055962736
	Dec     -13 42 47.118241332
	AppMagn 12
	/*Characteristics*/
	Class   "M7I-M8"
	/*Astrometry*/
	Dist    2000
	AbsMagn -5.50514997831990627 // Calculated (+6)
	/*Details*/
	RadSol  1200
	LumBol  160000
	Teff    3110 // 3300
	Age     0.006 // 0.01
}

// 14.V517 Monocerotis
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=%40925835&Name=V*+V517+Mon&submit=display+all+measurements#lab_meas
Star "V* V517 Mon/HD 292564/IRAS 06483-0000/SV* HBV 457/Gaia DR2 3113252541100516992/AG-00 876/IRC +00132/TIC 281810679/Gaia DR3 3113252541100516992/BD+00 1644/LF 9 -01 164/TYC 4800-457-1/Gaia DR1 3113252536799480448/EIC 158/2MASS J06505251-0004235/UCAC2 31648567/GSC 04800-00457/PPM 176473"
{
	/*Observation data*/
	RA      06 50 52.5046467456
	Dec     -00 04 23.498189940
	AppMagn 8.872
	/*Characteristics*/
	Class   "M2I"
	/*Astrometry*/
	Parallax 0.1456
	AbsMagn -5.3121931251149075 // Calculated
	/*Details*/
	// Gaia DR3 data
	MassSol 23.08774936510205 // log(g) = -0.354 cm/s^2
	RadSol  1196 // 1075 - 1275 from Gaia
	LumBol  236345.48611485437 // Calculated
	Teff    3680
	FeH     -0.013
}

// 15.PZ Cassiopeiae
// https://en.wikipedia.org/wiki/PZ_Cassiopeiae
Remove "PZ Cas"
Star "V* PZ Cas/BD+60 2613/HIC 117078/RAFGL 3138/[PCC93] 500/** STI 1204A/HIP 117078/TIC 272324954/[RMB2014] G115.05-00.04/AKARI-IRC-V1 J2344032+614722/IRAS 23416+6130/TYC 4281-114-1/[TVH89] 441/CSI+61-23416/IRC +60417/UBV M 4428/AAVSO 2339+61/GCRV 27264/JP11 220/UCAC3 304-161544/Gaia DR3 2012859963999694848/GEN# +0.06002613/2MASS J23440330+6147221/Gaia DR2 2012859963999694848/GPSR 115.058-0.048/MR 123/WDS J23441+6147A/GSC 04281-00114/OH 115.06-00.05/WISE J234403.19+614721.9"
{
	/*Observation data*/
	RA      23 44 03.2814215136
	Dec     +61 47 22.190200476
	AppMagn 8.9 // 8.2 - 10.2
	/*Characteristics*/
	Class   "M3Ia"
	/*Astrometry*/
	Dist    2810
	AbsMagn -7.89
	/*Details*/
	RadSol  1190 // 1940
	LumBol  229000
	Teff    3605
	Age     0.008 // 0.01
}

// 16.RSGC1-F05
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+5&submit=SIMBAD+search

// 17.GCIRS 7
// https://en.wikipedia.org/wiki/GCIRS_7

// 18.Westerlund 1 W26 (Westerlund 1 BKS AS)
// https://en.wikipedia.org/wiki/Westerlund_1_W26

// 19.EV Carinae
// https://en.wikipedia.org/wiki/EV_Carinae
Star "V* EV Car/HD 89845/GSC 08956-03486/SV* HV 1271/[A72c] 33/AN 159.1906/IRAS 10186-6012/TIC 378313764/AAVSO 1016-59/BM V 207/LLNS 857/TYC 8956-3486-1/Gaia DR3 5254903760987765248/CD-59 3024/2MASS J10202160-6027155/UCAC3 60-97573/Gaia DR1 5254903756654154496/CPD-59 2059/PPM 777922/Gaia DR2 5254903760987765248/GCRV 27247/RAFGL 4105/WISE J102021.66-602717.1"
{
	/*Observation data*/
	RA      10 20 21.6001332600
	Dec     -60 27 15.749335152
	AppMagn 9.2 // 7.4 - 9
	/*Characteristics*/
	Class   "M4.5Ia"
	/*Astrometry*/
	Dist    2960
	AbsMagn -5.24
	/*Details*/
	MassSol 5.36
	RadSol  1168
	LumBol  288000
	Teff    3535
	FeH     0.25
}

// 20.[A72c] 16
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=%402976383&Name=%5BA72c%5D++16&submit=display+all+measurements#lab_meas
Star "[A72c] 16/IRAS 08267-4357/TIC 139944916/WISE J082826.26-440802.2/Gaia DR2 5523056058350543360/2MASS J08282619-4408017/UCAC2 12857853/Gaia DR3 5523056058350543360"
{
	/*Observation data*/
	RA      08 28 26.1852731304
	Dec     -44 08 01.828731984
	AppMagn 10.99
	/*Characteristics*/
	Class   "M1.7Iab"
	/*Astrometry*/
	Parallax 0.13035754435965075
	AbsMagn -9.218187675212649 // Calculated (+5.783868528950423)
	/*Details*/
	RadSol  1157.0372523654978
	LumBol  204703.96926448646 // MBol = -8.53781972565511
	Teff    3615
}

// 21.WY Velorum A
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=%403045938&Name=V*+WY+Vel&submit=display+all+measurements#lab_meas
StarBarycenter "V* WY Vel/HD 81137/IRAS 09203-5220/SS73 13/WISE J092158.85-523348.7/BM V 168/IRSV 0920-5220/SV* HV 3655/AAVSO 0918-52/CD-52 3010/2MASS J09215913-5233514/TIC 294974397/Gaia DR3 5313125719158014208/CPC 19 3419/PPM 337872/TYC 8584-2732-1/Gaia DR2 5313125719153410304/CPD-52 2262/SAO 236888/UCAC3 75-62841/GSC 08584-02732/SKY# 18085"
{
	/*Observation data*/
	RA      09 21 59.1346523400
	Dec     -52 33 51.642401004
	AppMagn 8.8
	/*Characteristics*/
	Class   "M2Ipe"
	/*Astrometry*/
	Parallax 0.518675712196739
	AbsMagn -4.390633494965295 // Calculated (+1.7651130547144545)
}

// 22.RSGC1-F08
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+8&submit=SIMBAD+search

// 23.HD 143183 (V558 Normae)
// https://en.wikipedia.org/wiki/HD_143183
StarBarycenter "HD 143183/GSC 08710-01370/2MASS J16013621-5408356/WISE J160136.23-540835.7/** I 554A/Hbg 1045/TIC 423407817/[A72c] 135/ALS 14308/IDS 15538-5352 A/TYC 8710-1370-1/Gaia DR3 5932748487665645824/CCDM J16015-5408A/IRAS 15576-5400/UCAC3 72-323542/Gaia DR2 5932748487659963264/CD-53 6362/IRSV 1557-5400/uvby98 100143183/CPD-53 6947/LF 15 -54 25/WDS J16016-5409A"
{
	/*Observation data*/
	RA      16 01 36.2228206296
	Dec     -54 08 35.613436452
	AppMagn 7.3 // 8.6
	/*Characteristics*/
	Class   "M3Ia"
	/*Astrometry*/
	Dist    2100
	AbsMagn -7.5
	/*Details*/
	MassSol 20
	RadSol  1147.23
	LumBol  167000
	Teff    3443 // 3605
}

// 24.V354 Cephei
// https://en.wikipedia.org/wiki/V354_Cephei
Remove "V354 Cep"
Star "V* V354 Cep/DO 41575/IRCO 349/TIC 64470952/[NBM54] 75/GSC 03995-00449/2MASS J22333464+5853470/TYC 3995-449-1/Gaia DR2 2200195820289135104/IRAS 22317+5838/RAFGL 2922/UCAC3 298-170459/Gaia DR3 2200195820289135104/IRC +60361/SV* SVS 2486"
{
	/*Observation data*/
	RA      22 33 34.6356348888
	Dec     +58 53 47.124005640
	AppMagn 10.82 // 11.35
	/*Characteristics*/
	Class   "M2.5Iab" // M3.5Ib
	/*Astrometry*/
	Dist    4600
	AbsMagn -7.57 // variable
	/*Details*/
	MassSol 3.61
	RadSol  1139 // 1245
	LumBol  71000 // 76000
	Teff    3615
}

// 25.RSGC1-F02
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+2&submit=SIMBAD+search

// 26.VX Sagitarii
// https://en.wikipedia.org/wiki/VX_Sagittarii
Remove "VX Sgr"
Star "V* VX Sgr/HD 165674/HIP 88838/SCHB 299/[PCC93] 218/AN 271.1904/IRAS 18050-2213/SV* HV 1152/[RMB2014] G008.34-01.00/BAaDE ce3a-00110/IRC -20431/TIC 175117667/[SVM2001b] 32/BD-22 4575/JP11 2930/TYC 6276-721-1/[TVH89] 250/CD-22 12589/2MASS J18080404-2213266/UBV M 22627/[WCP90] 180502.959-221355.58/GEN# +1.00165674/OH 008.344-01.002/UCAC2 22972679/AAVSO 1802-22/GSC 06276-00721/OH 008.3-01.0/Gaia DR3 4069737050648231424/HIC 88838/RAFGL 2071/[LFO93] 1805-22/Gaia DR2 4069737050648231424"
{
	/*Observation data*/
	RA      18 08 04.0442790744
	Dec     -22 13 26.600899044
	AppMagn 6.5 // 6.5 - 14
	/*Characteristics*/
	Class   "L0I" // M4eIa - M10eIa, the most luminous AGB star, possibly TZO
	/*Astrometry*/
	Dist    1560
	AbsMagn -5.4656229917723085 // Calculated (+1)
	/*Details*/
	MassSol 12
	RadSol  1120 // between 1120 and 1550, 1350 - 1940 (pulsation)
	LumBol  195000
	Teff    2400 // 3300, 2900 (near min), 3200-3400 (near max)
}

// ---------------------------------------Orbit of Jupiter--------------------------------------- //

// 27.V582 Cassiopeiae
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V582+Cassiopeiae&submit=SIMBAD+search
Star "V* V582 Cas/DO 43188/IRCO 1372/TIC 279668184/Gaia DR2 2012303576751887488/GSC 04280-01858/2MASS J23301119+6016452/UCAC4 752-081235/Gaia DR3 2012303576751887488/IRAS 23278+6000/POVR 12/IRC +60409/RAFGL 3109/[NBM54] 87"
{
	/*Observation data*/
	RA      23 30 11.2241389920
	Dec     +60 16 45.407772264
	AppMagn 11.81
	/*Characteristics*/
	Class   "M5Ib"
	/*Astrometry*/
	Parallax 0.29058025966817896
	AbsMagn -5.353983310823517 // Calculated (+4.480313848445333)
	/*Details*/
	RadSol  1111.0190968110817
	LumBol  156573.33483632136 // MBol = -8.24679857022734
	Teff    3450
}

// 28.RW Cygni
Star "V* RW Cyg/BD+39 4208/HIP 101023/RAFGL 2590/AG+39 2148/IRAS 20270+3948/TIC 15888421/AAVSO 2025+39/GCRV 27289/IRC +40424/TYC 3156-747-1/Gaia DR3 2067323928874639872/GEN# +0.03904208/JP11 163/UBV 21462/Gaia DR2 2067323928874639872/GSC 03156-00747/2MASS J20285059+3958543/UBV M 2957/HIC 101023/PPM 85033/UCAC2 45716650"
{
	/*Observation data*/
	RA      20 28 50.5903286280
	Dec     +39 58 54.425527932
	AppMagn 8.05 // 9.70
	/*Characteristics*/
	Class   "M3Ia" // M3-4Ia-Iab
	/*Astrometry*/
	Dist    1620
	AbsMagn -6.41
	/*Details*/
	RadSol  1000
	LumBol  126000 // 160000
	Teff    3605
}

// 27.RSGC1-F04
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+4&submit=SIMBAD+search

// 28.RT Carinae
// https://en.wikipedia.org/wiki/RT_Carinae
Remove "RT Car"
Star "V* RT Car/HD 303310/GES J10444715-5924482/PPM 339402/[T81] Tr 15 IRS 2/BM VI 10/GSC 08626-02596/SAO 238424/AAVSO 1040-58/CD-58 3538/HIC 52562/SV* HV 107/Gaia DR3 5350389095946525568/Cl* Trumpler 15 MMU 16/HIP 52562/TIC 458861722/Gaia DR1 5350389091619357696/Cl Trumpler 15 16/IRAS 10428-5909/TYC 8626-2596-1/Gaia DR2 5350389095946525568/CPC 20 3141/IRSV 1042-5909/UCAC3 62-116988/CPD-58 2663/LLNS 2728/GCRV 20427/2MASS J10444716-5924478/[A72c] 49"
{
	/*Observation data*/
	RA      10 44 47.1481707768
	Dec     -59 24 48.122847360
	AppMagn 8.2 // 9.9
	/*Characteristics*/
	Class   "M2Iab"
	/*Astrometry*/
	Dist    2285 // Match Trumpler 15
	AbsMagn -6.74
	/*Details*/
	/*RadSol  861 // Gaia DR2
	LumBol  119000 // 129000
	Teff    3660*/
	// Gaia DR3 data
	MassSol 15.89184834887696 // log(g) = -0.06075 cm/s^2
	RadSol  707.95
	LumBol  86238.81082018404 // Calculated
	Teff    3717.5
	FeH     -0.0700045
}

// 29.V384 Persei
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V384+Persei&submit=SIMBAD+search
Star "LEE 259/DO 27089/IRC +50096/RAFGL 489/[LFO93] 0322+47/ATO J051.6230+47.5302/JP11 5554/SV* SVS 1809/[WWV2004] J0326300+473150/C* 142/JP11 5553/TIC 456137248/AAVSO 0319+47/CGCS 496/Kiso C5-86/V* V384 Per/Gaia DR3 243120098423921664/CIT 5/WISEA J032629.46+473148.1/Gaia DR2 243120098423921664/IRAS 03229+4721/2MASS J03262951+4731486/WISE J032629.53+473148.4"
{
	/*Observation data*/
	RA      03 26 29.5037418864
	Dec     +47 31 48.551540844
	//AppMagnK 1.15
	/*Characteristics*/
	Class   "C:" // N
	/*Astrometry*/
	Parallax 0.1563
	/*Details*/
	// Gaia DR3 data
	//MassSol  // log(g) = 1.501 cm/s^2
	RadSol  1088 // Gaia DR3 provides an only 52 RSun radius, why???
	LumBol  11694.950112545182 // MBol = -5.43
	Teff    1820 // 3990
	FeH     0.62
}

// 30.UU Persei
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=UU+Persei&submit=SIMBAD+search
Star "V* UU Per/IRC +50105/2MASS J03470763+5240415/TYC 3717-275-1/Gaia DR3 443775988331111936/AN 23.1912/RAFGL 6292S/IRAS 03433+5231/TIC 428688715/Gaia DR2 443775988331111936"
{
	/*Observation data*/
	RA      03 47 07.6286840736
	Dec     +52 40 41.644449048
	AppMagn 10.11
	/*Characteristics*/
	Class   "M3.5Ib"
	/*Astrometry*/
	Parallax 0.4275
	AbsMagn -5.7353194046790428 // Calculated (+4)
	/*Details*/
	// Gaia DR3 data
	MassSol 20.27505911996196 // log(g) = -0.321 cm/s^2
	RadSol  1079
	LumBol  200866.87690036747 // Calculated
	Teff    3720
	FeH     -0.198
}

// 30.R Fornacis
// https://en.wikipedia.org/wiki/R_Fornacis
Star "V* R For/CD-26 892/GEN# -0.02600892/RAFGL 337/[LFO93] 0227-26/AKARI-IRC-V1 J0229153-260555/GSC 06433-00295/TIC 120917196/AAVSO 0224-26/ASAS J022915-2605.9/HIC 11582/TYC 6433-295-1/Gaia DR3 5118511817421484544/ASASSN-V J022915.29-260554.0/HIP 11582/Gaia DR2 5118511817421484544/C* 103/IRAS 02270-2619/WEB 2414/CGCS 361/IRC -30021/WISEA J022915.29-260555.7/GCRV 1406/2MASS J02291531-2605559/YC Red 26"
{
	/*Observation data*/
	RA      02 29 15.3077617632
	Dec     -26 05 55.646585700
	AppMagn 7.5 // 13
	/*Characteristics*/
	Class   "C4.3e" // Mira variable
	/*Astrometry*/
	Dist    550
	AbsMagn -5.2018134474712188 // Calculated (+4)
	/*Details*/
	MassSol 1.05
	RadSol  1078
	LumBol  16904
	Teff    2060 // 3130
	FeH     0.21
}

// 31.LL Pegasi
// https://en.wikipedia.org/wiki/LL_Pegasi
StarBarycenter "RAFGL 3068/IRAS 23166+1655/PN G093.5-40.3/WISE J231912.77+171134.7/AKARI-IRC-V1 J2319126+171133/JCMTSE J231912.5+171133/TIC 435189436/[LFO93] 2316+16/AKARI-FIS-V1 J2319120+171143/JCMTSF J231912.5+171133/V* LL Peg/CGCS 6913/2MASS J23191260+1711331/WISEA J231912.60+171133.4"
{
	/*Observation data*/
	RA      23 19 12.60744
	Dec     +17 11 33.1332
	//AppMagnK 10.379
	/*Characteristics*/
	Class   "C" // Mira variable
	/*Astrometry*/
	Dist    1300
}

// 32.V396 Centauri
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V396+Centauri&submit=SIMBAD+search
Star "V* V396 Cen/HD 115283/2MASS J13172505-6135020/TIC 443405175/Gaia DR3 5869330546712828928/CD-60 4589/PPM 360000/TYC 8990-3239-1/Gaia DR1 5869330542383000192/CPC 20.1 3873/SAO 252241/UCAC3 57-259284/Gaia DR2 5869330546704089088/CPD-60 4568/SKY# 24550/GSC 08990-03239/SV* HV 6436/WISE J131725.16-613503.1/IRAS 13141-6119/SV* P 3602/AAVSO 1311-61"
{
	/*Observation data*/
	RA      13 17 25.0405257912
	Dec     -61 35 02.342241960
	AppMagn 7.92
	/*Characteristics*/
	Class   "M4Ia-Iab"
	/*Astrometry*/
	Parallax 0.4452
	AbsMagn -5.837224221686647 // Calculated (+2)
	/*Details*/
	RadSol  1070 // 1145.31
}

// 33.HD 126577
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=HD+126577&submit=SIMBAD+search
Star "HD 126577/GSC 08691-02191/PPM 771335/WISE J142833.08-594028.1/CD-59 5267/IRAS 14248-5927/TIC 264142427/Gaia DR2 5890755802084623744/Cl* NGC 5606 VF 5/IRSV 1424-5927/TYC 8691-2191-1/Gaia DR3 5890755802084623744/CPD-59 5591/2MASS J14283302-5940264/UCAC3 61-313310"
{
	/*Observation data*/
	RA      14 28 33.0213619776
	Dec     -59 40 26.686073748
	AppMagn 8.39
	/*Characteristics*/
	Class   "M2I"
	/*Astrometry*/
	Parallax 0.3862
	AbsMagn -5.6759386527831204 // Calculated (+2)
	/*Details*/
	// Gaia DR3 data
	MassSol 18.04818979018405 // log(g) = -0.361 cm/s^2
	RadSol  1066
	LumBol  179727.12295665874 // Calculated
	Teff    3640
	FeH     0.531
}

// 34.V766 Centauri Aa
// https://en.wikipedia.org/wiki/HR_5171
StarBarycenter "HD 119796/CSV 7083/IRAS 13436-6220/UBV 12287/** HDS 1938/GC 18610/JP11 2421/UCAC3 55-229666/** COO 157A/GEN# +1.00119796/2MASS J13471085-6235227/UCAC4 138-110854/CCDM J13472-6235AC/GSC 09008-03647/PPM 360320/V* V766 Cen/CD-61 3988A/HD 119796A/RAFGL 4177/WDS J13472-6235Aa,Ab/CD-61 3988/HIC 67261/SAO 252448/WDS J13472-6235A/CPC 20.1 4044/HIP 67261/SKY# 25293/AAVSO 1340-62/CPD-61 4003/HR 5171/TIC 380480505/Gaia DR3 5865517646532509568/CSI-61 4003 41/IDS 13402-6205 A/TYC 9008-3647-1/Gaia DR2 5865517646532509568"
{
	/*Observation data*/
	RA      13 47 10.8637122288
	Dec     -62 35 22.949098944
	AppMagn 6.1 // 7.5
	/*Characteristics*/
	Class   "K0Ia+"
	/*Astrometry*/
	Dist    1500 // 3900
	AbsMagn -5.780456295278407 // Calculated (+1)
}

// 35.V1300 Aquilae (IRC -10529)
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V1300+Aquilae&submit=SIMBAD+search
Star "IRC -10529/IRAS 20077-0625/WISE J201027.88-061613.5/[TCH91] 20077-0625/AKARI-IRC-V1 J2010278-061613/2MASS J20102787-0616135/[DLS93] 20077-0625/[TVH89] 426/AKARI-FIS-V1 J2010280-061620/RAFGL 2514/[LFO93] 2007-06/Gaia DR2 4217035565393937920/DENIS J201027.8-061613/TIC 178297564/[LMW2001] 428/Gaia DR3 4217035565393937920/EIC 814/V* V1300 Aql/[LTY2003] NIRS 20077-0624"
{
	/*Observation data*/
	RA      20 10 27.8731455576
	Dec     -06 16 13.758742596
	//AppMagnK 2.06
	/*Characteristics*/
	Class   "MI" // OH/IR star
	/*Astrometry*/
	Redshift -0.000107
	Dist    620
	/*Details*/
	// Reference: 
	// Ramstedt, S.; Olofsson, H. (25 May 2014). "The 
	// 12CO/13CO ratio in AGB stars of different chemical 
	// type. Connection to the 12C/13C ratio and the 
	// evolution along the AGB"
	// https://arxiv.org/abs/1405.6404
	MassSol 22 // Guess, Citation needed
	RadSol  1059
	LumBol  10600
	Teff    1800
}

// 36.HaroChavira 1
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=HaroChavira+1&submit=SIMBAD+search
Star "HaroChavira 1/DO 38592/IRC +40434/TIC 188515312/Gaia DR2 2067993909412977152/CSI+41-20255/2MASS J20340143+4225266/UBV 17752/Gaia DR3 2067993909412977152/MSX6C G081.2011+01.3332/UCAC4 663-091837/IRAS 20322+4215/RAFGL 2609/WISE J203401.78+422525.8"
{
	/*Observation data*/
	RA      20 34 01.4380235400
	Dec     +42 25 26.521734720
	//AppMagnK 1.013
	/*Characteristics*/
	Class   "M3.5I"
	/*Astrometry*/
	Parallax 0.6538
	/*Details*/
	// Gaia DR3 data
	MassSol 50.45341592515142 // log(g) = 0.092 cm/s^2, out of limit? (Upper limit of red supergiant is 45 MSun)
	RadSol  1058
	LumBol  179727.12295665874 // Calculated
	Teff    3476
	FeH     0.547
}

// 37.VV Cephei A
// https://en.wikipedia.org/wiki/VV_Cephei
Remove "VV Cep"
StarBarycenter "V* VV Cep/HD 208816/GSC 04266-03252/PLX 5308.00/UBV M 26033/** WRH 36/HIC 108317/PMC 90-93 1458/uvby98 100208816/AG+63 1207/HIP 108317/PPM 23328/BD+62 2007/HR 8383/RAFGL 2821/WDS J21567+6338AB/CCDM J21567+6338AB/IDS 21538+6309 AB/SAO 19753/WEB 19512/CSI+62 2007 1/IRAS 21552+6323/SBC7 883/WISE J215638.90+633731.1/DO 40453/IRC +60333/SBC9 1340/[B10] 5650/FK5 3756/JP11 3418/SKY# 41813/[KW97] 60-38/GC 30731/2MASS J21563917+6337319/TIC 412120154/AAVSO 2153+63/GCRV 13794/N30 4842/TYC 4266-3252-1/Gaia DR3 2216536246703152256/GEN# +1.00208816/PLX 5308/UBV 18792/Gaia DR2 2216536246703152256"
{
	/*Observation data*/
	RA      21 56 39.1414963149
	Dec     +63 37 31.981636440
	AppMagn 4.91 // 4.8 - 5.36
	/*Characteristics*/
	Class   "M2Ibep+B2?ep_sh"
	/*Astrometry*/
	Dist    1500 // 3900
	AbsMagn -6.93
}

// 38.CM Velorum
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=CM+Velorum&submit=SIMBAD+search
Star "V* CM Vel/HD 88028/GSC 08599-00361/PPM 338693/UCAC3 74-100175/AN 37.1909/HIC 49611/SAO 237711/CD-52 3595/HIP 49611/SRS 9485/WISE J100732.88-531533.7/CPC 19 3795/IRAS 10056-5300/SV* HV 3203/AAVSO 1003-52/CPD-52 3245/IRSV 1005-5301/TIC 140176216/Gaia DR3 5356397274150705920/GCRV 27235/2MASS J10073282-5315366/TYC 8599-361-1/Gaia DR2 5356397274150705920"
{
	/*Observation data*/
	RA      10 07 32.8239079488
	Dec     -53 15 36.544547592
	AppMagn 7.29
	/*Characteristics*/
	Class   "M5II"
	/*Astrometry*/
	Parallax 0.5090917628723376
	AbsMagn -5.441706399466833 // Calculated (+1.2656867504163294)
	/*Details*/
	// Gaia DR3 data
	MassSol 12.675296243251079 // log(g) = -0.5 cm/s^2
	RadSol  1048.381718587305 // 1416.24
	LumBol  176588.16497716177 // MBol = -8.37740805006569
	Teff    3660 // 3614
	FeH     -0.19
}

// 39.AG Camelopardalis
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=AG+Camelopardalis&submit=SIMBAD+search
Star "V* AG Cam/IRC +60136/IRAS 03572+5509/TIC 72786228/Gaia DR2 468485210066296064/AN 635.1936/LF 6 +55 126/TYC 3722-735-1/Gaia DR3 468485210066296064/CSV 370/2MASS J04011164+5517435/UCAC3 291-64849/GSC 03722-00735/RAFGL 4307S"
{
	/*Observation data*/
	RA      04 01 11.6530793760
	Dec     +55 17 43.266598224
	AppMagn 11.43
	/*Characteristics*/
	Class   "M4I"
	/*Astrometry*/
	Parallax 0.185740782431607
	AbsMagn -4.71922755513924 // Calculated (+2.4937639085292806)
	/*Details*/
	RadSol  1047.7894968416447
	LumBol  153498.49705306033 // MBol = -8.22526438491717
	Teff    3535
}

// 40.WX Piscium
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=WX+Piscium&submit=SIMBAD+search
Star "IRC +10011/OH 128.6-50.1/TIC 384885674/[PCC93] 12/CIT 3/JP11 5528/USNO-B1.0 1025-00012780/[TVH89] 3/CRTS J010625.9+123553/2MASS J01062598+1235530/V* WX Psc/Gaia DR2 2584587108278762752/GEN# +8.07100011/PN G128.6-50.1/WISEA J010626.02+123553.2/Gaia DR3 2584587112574459264/GSC2 N32330101881/RAFGL 157/WISE J010626.31+123555.1/IRAS 01037+1219/SDSS J010625.97+123553.1/[LFO93] 0103+12"
{
	/*Observation data*/
	RA      01 06 25.9879717848
	Dec     +12 35 52.896392052
	//AppMagnK 2.22
	/*Characteristics*/
	Class   "M8I"
	/*Astrometry*/
	Redshift 0.000037
	Dist    700
	/*Details*/
	// Reference: https://arxiv.org/abs/1405.6404
	RadSol  1044
	LumBol  10300
	Teff    1800
}

// 41.KU Andromedae
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=KU+Andromedae&submit=SIMBAD+search
Star "V* KU And/IRC +40004/2MASS J00065274+4305021/[WWV2004] J0006526+430459/CIT 1/RAFGL 14/WISEA J000652.77+430502.2/Gaia DR2 384627244915398144/IRAS 00042+4248/TIC 439961782/WISE J000652.76+430501.7/Gaia DR3 384627240623604864/JP11 5537/UCAC4 666-000519/[LFO93] 0004+42"
{
	/*Observation data*/
	RA      00 06 52.7571912336
	Dec     +43 05 02.363566416
	//AppMagnK 1.115
	/*Characteristics*/
	Class   "L0I" // M10
	/*Astrometry*/
	Parallax 1.8649
	/*Details*/
	// Reference: https://arxiv.org/abs/1405.6404
	RadSol  1044
	LumBol  10300
	Teff    1800
}

// 42.RSGC1-F11
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+11&submit=SIMBAD+search

// 43.BC Cygni
// https://en.wikipedia.org/wiki/BC_Cygni
Remove "BC Cyg"
Star "V* BC Cyg/BD+37 3903/GSC 03152-01032/PPM 84789/AG+37 1969/HIC 100404/RAFGL 2560/WEB 18123/AN 75.1911/HIP 100404/SV* HV 3339/AAVSO 2017+37A/Cl Berkeley 87 78/IRAS 20197+3722/TIC 13325866/Gaia DR3 2060971294293250944/DO 18917/IRC +40409/TYC 3152-1032-1/Gaia DR2 2060971294293250944/GCRV 12716/JP11 159/UBV M 2807	/GEN# +0.03703903/2MASS J20213855+3731589/UCAC2 45060141"
{
	/*Observation data*/
	RA      20 21 38.5478957040
	Dec     +37 31 58.925226936
	AppMagn 9 // 10.8
	/*Characteristics*/
	Class   "M3.5Ia" // M2 - M5
	/*Astrometry*/
	Dist    1706.993409993745 // match Cl Berkeley 87
	AbsMagn -7.71
	/*Details*/
	// Minimum (1900)
	/*RadSol  1553
	LumBol  145000
	Teff    2858*/
	// Maximum (2000)
	/*RadSol  856
	LumBol  112000
	Teff    3614*/
	// 2020 Data
	/*MassSol 19
	RadSol  1031
	LumBol  204000
	Teff    3605*/
	// Gaia DR3 in 2022
	MassSol 27.59438236060875 // log(g) = -0.27 cm/s^2
	RadSol  1187
	LumBol  363623.7703427542 // Calculated
	Teff    4114
	FeH     0.14
}

// 44.KY Cygni
// https://en.wikipedia.org/wiki/KY_Cygni
Remove "KY Cyg"
Star "V* KY Cyg/DO 18999/LEE 220/UCAC2 45230193/[PCC93] 415/AN 339.1929/2MASS J20255805+3821076/Gaia DR3 2058131491974019968/GSC 03152-01140/RAFGL 2575/WISE J202558.21+382106.6/Gaia DR2 2058131491974019968/IRAS 20241+3811/TIC 15065085/[A70] 78-0-46/IRC +40415/TYC 3152-1140-1/[NBM54] 66"
{
	/*Observation data*/
	RA      20 25 58.0435428576
	Dec     +38 21 07.671813480
	AppMagn 10.6 // 11.74
	/*Characteristics*/
	Class   "M3.5Ia" // M3Ia
	/*Astrometry*/
	Dist    1500
	AbsMagn -8.18
	/*Details*/
	// Reference: https://arxiv.org/abs/1405.6404
	RadSol  1033 // 1420
	LumBol  138000 // 270000
	Teff    3550
}

// 45.RW Leonis Minoris
// https://en.wikipedia.org/wiki/CIT_6
StarBarycenter "V* RW LMi/DO 14136/IRAS F10131+3049/RAFGL 1403/[LFO93] 1013+30/C* 1641/IRC +30219/TIC 139416838/[WWV2004] J1016023+303423/CGCS 2724/JCMTSE J101602.3+303420/UCAC4 603-048114/AAVSO 1010+31/CIT 6/JCMTSF J101602.3+303420/Gaia DR3 742247555080914432/CSI+30-10133/2MASS J10160228+3034190/WISEA J101602.33+303418.9/Gaia DR2 742247555080914432/IRAS 10131+3049/PN G197.7+55.9/WISE J101602.00+303417.6"
{
	/*Observation data*/
	RA      10 16 02.2777043904
	Dec     +30 34 19.045098516
	AppMagn 12.8 // 16.5
	/*Characteristics*/
	Class   "C4.3"
	/*Astrometry*/
	Dist    310
	AbsMagn -6.656808469171363 // Calculated (+12)
}

// 46.V346 Puppis
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V346+Puppis&submit=SIMBAD+search
Star "[W71b] 021-06/C* 1081/2MASS J08104890-3252055/TIC 145406689/[LFO93] 0808-32/ATO J122.7038-32.8681/MSX5C G250.7406+00.3597/USNO-B1.0 0571-00197667/CGCS 2101/OGLE GD-LPV-338/V* V346 Pup/Gaia DR2 5547528232254715776/DENIS J081048.8-325205/OGLE GD1548.29.00069/WISEA J081048.90-325205.4/Gaia DR3 5547528232254715776/IRAS 08088-3243/RAFGL 1235/WISE J081048.88-325204.9"
{
	/*Observation data*/
	RA      08 10 48.8849951112
	Dec     -32 52 05.635358940
	AppMagn 19.946
	/*Characteristics*/
	Class   "C"
	/*Astrometry*/
	Parallax 1.0819
	AbsMagn -3.883064396032735 // Calculated (+14)
	/*Details*/
	//MassSol  // log(g) = 1.563 cm/s^2
	RadSol  1025
	LumBol  11694.950112545182 // Mb0l = -5.43
	Teff    1875
	FeH     0.048 // Gaia DR3
}

// 47.V530 Cassiopeiae
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V530+Cassiopeiae&submit=SIMBAD+search
Star "V* V530 Cas/SV* P 5762/IRAS 23284+5958/POVR 13/AN 406.1934/IRC +60411/RAFGL 4299/[NBM54] 88/CSV 5744/IRCO 1378/TIC 270548468/Gaia DR2 2012302958276620160/GSC 04280-01989/2MASS J23304411+6015205/TYC 4280-1989-1/Gaia DR3 2012302958276620160"
{
	/*Observation data*/
	RA      23 30 44.1075128136
	Dec     +60 15 20.765082204
	AppMagn 10.97
	/*Characteristics*/
	Class   "M4Ib"
	/*Astrometry*/
	Parallax 0.3450861308096763
	AbsMagn -5.752406513591367 // Calculated (+4.412044039201737)
	/*Details*/
	// Gaia DR3 Data
	//MassSol  // log(g) = 0.381 cm/s^2
	RadSol  1017.2536049885432
	LumBol  144682.00590788122 // MBol = -8.16104036932988
	Teff    3535 // 4888
	FeH     0.08
}

// 48.RSGC1-F13
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+13&submit=SIMBAD+search

// 49.V602 Carinae
// https://en.wikipedia.org/wiki/V602_Carinae
Star "V* V602 Car/HD 97671/GSC 08959-00707/TIC 467450857/[A72c] 57/BM V 260/IRAS 11113-5949/TYC 8959-707-1/Gaia DR2 5337759383848553984/CD-59 3623/LLNS 4467/UCAC3 60-159611/Gaia DR3 5337759383861931904/CPD-59 3213/2MASS J11132996-6005288/GCRV 26025/PPM 778373/WISE J111330.01-600525.5"
{
	/*Observation data*/
	RA      11 13 29.9741868816
	Dec     -60 05 28.849300980
	AppMagn 8.39 // 7.6 - 9.1
	/*Characteristics*/
	Class   "M3Ia-Iab"
	/*Astrometry*/
	Dist    1190
	AbsMagn -4.83
	/*Details*/
	MassSol 17.7
	RadSol  1015
	LumBol  125000
	Teff    3550
}

// 50.CK Carinae
// https://en.wikipedia.org/wiki/CK_Carinae
Star "V* CK Car/HD 90382/IRAS 10226-5956/SV* HV 3576/AAVSO 1020-59/CD-59 3058/LLNS 1082/TIC 338012707/Gaia DR3 5254827443673628288/CPC 20 2972/2MASS J10242536-6011289/TYC 8956-1865-1/Gaia DR1 5254827443673628288/CPD-59 2101/PPM 357970/UCAC3 60-102032/Gaia DR2 5254827443673628288/GC 14303/SAO 238038/GCRV 27232/SKY# 19990/WISE J102425.23-601125.9/GSC 08956-01865/SRS 9670/[A72c] 35"
{
	/*Observation data*/
	RA      10 24 25.3598323512
	Dec     -60 11 29.042707056
	AppMagn 7.2 // 8.5
	/*Characteristics*/
	Class   "M3.5Iab"
	/*Astrometry*/
	Dist    2920
	AbsMagn -6.31
	/*Details*/
	MassSol 6
	RadSol  761 // 1060
	LumBol  86000 // 158000
	Teff    3550
	FeH     0.05
}

// 51.U Lacertae A
// https://en.wikipedia.org/wiki/U_Lacertae
StarBarycenter "V* U Lac/HD 215924/GEN# +1.00215924/JP11 3536/UCAC3 291-208392/AG+54 1592/GSC 03988-01641/2MASS J22474341+5509303/AN 2.1902/HIC 112545/PPM 41110/AAVSO 2243+54/BD+54 2863/HIP 112545/RAFGL 2957/Gaia DR3 2003598056004201600/DO 41988/IRAS 22456+5453/TIC 343778934/Gaia DR1 2003598051698663808/GCRV 73542/IRC +50446/TYC 3988-1641-1/Gaia DR2 2003598056004201600"
{
	/*Observation data*/
	RA      22 47 43.4268347928
	Dec     +55 09 30.312281736
	AppMagn 9.4
	/*Characteristics*/
	Class   "M4epIab+B"
	/*Astrometry*/
	Dist    2750
	AbsMagn -5.6
}

// 52.KW Sagittarii
// https://en.wikipedia.org/wiki/KW_Sagittarii
Star "V* KW Sgr/HD 316496/IRAS 17488-2800/SV* HV 4477/WISE J175200.80-280120.0/CD-27 12032/IRC -30326/TIC 131024903/[A72c] 164/GSC 06849-00057/JP11 309/TYC 6849-57-1/AAVSO 1745-28/HIC 87433/2MASS J17520073-2801205/UCAC2 20225293/Gaia DR3 4063462206570029312/HIP 87433/RAFGL 2017/Gaia DR2 4063462206570029312"
{
	/*Observation data*/
	RA      17 52 00.7269495408
	Dec     -28 01 20.555654448
	AppMagn 11
	/*Characteristics*/
	Class   "M1.5Iab"
	/*Astrometry*/
	Dist    2420
	AbsMagn -7.7
	/*Details*/
	MassSol 4.89
	RadSol  1009
	LumBol  176000
	Teff    3720
}

// 53.Ve 4-64
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=Ve+4-64&submit=SIMBAD+search
Star "Ve 4-64/IRC -20418/2MASS J18022364-2328350/TIC 111191806/Gaia DR2 4069175062767314048/Hen 3-1560/RAFGL 2049/UCAC2 22532197/Gaia DR3 4069175062767314048/IRAS 17593-2328/SS73 118"
{
	/*Observation data*/
	RA      18 02 23.6381199600
	Dec     -23 28 34.942157472
	AppMagn 13.5
	/*Characteristics*/
	Class   "M2I" // M2/3e
	/*Astrometry*/
	Parallax 0.3262588238559788
	AbsMagn -3.8293205456941806 // Calculated (+4.897131876929912)
	/*Details*/
	RadSol  1007.0546547790062
	LumBol  155073.52622982516 // MBol = -8.23634822222559
	Teff    3615
}

// 54.RSGC1-F07
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+7&submit=SIMBAD+search

// 55.V349 Carinae
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V349+Carinae&submit=SIMBAD+search
Star "V* V349 Car/HD 91093/GSC 08609-00231/TIC 457427613/Gaia DR2 5351502695063499392/BM VI 6/IRAS 10277-5742/TYC 8609-231-1/Gaia DR3 5351502695063499392/CD-57 3259/IRSV 1027-5742/UCAC3 65-103537/Gaia DR1 5351502690738253952/CPD-57 3334/2MASS J10293537-5757590/GCRV 25924/PPM 769270/[A72c] 38"
{
	/*Observation data*/
	RA      10 29 35.3737356552
	Dec     -57 57 58.972794156
	AppMagn 7.89
	/*Characteristics*/
	Class   "M3Iab"
	/*Astrometry*/
	Parallax 0.3654
	AbsMagn -6.296157284917405 // Calculated (+2)
	/*Details*/
	// Gaia DR3 Data
	MassSol 21.3134955648396 // log(g) = -0.235 cm/s^2
	RadSol  1002
	LumBol  159668.50242770702 // Calculated
	Teff    3645
	FeH     0.037
}

// 56.IRAS 18111-2257
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=IRAS+18111-2257&submit=SIMBAD+search
Star "IRAS 18111-2257/2MASS J18141475-2256195/WISEA J181414.74-225619.4/Gaia DR2 4066460746608630912/AKARI-IRC-V1 J1814147-225619/TIC 118624294/WISE J181414.74-225619.3/Gaia DR3 4066460746608630912"
{
	/*Observation data*/
	RA      18 14 14.7521975808
	Dec     -22 56 19.441214016
	//AppMagnK 6.154
	/*Characteristics*/
	Class   "M I"
	/*Astrometry*/
	Parallax 0.3236 // ?
	/*Details*/
	// Gaia DR3 Data
	//MassSol  // log(g) = 1.115 cm/s^2
	RadSol  1000
	LumBol  14414.96727968576 // Calculated
	Teff    2000 // 3898
	FeH     0.411
}

// 57.V674 Cephei
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V674+Cephei&submit=SIMBAD+search
Star "V* V674 Cep/DO 41440/IRCO 292/Tmz V676/Gaia DR2 2200441762994058880/GSC 03995-00224/2MASS J22281741+5914041/TYC 3995-224-1/Gaia DR3 2200441762994058880/IRAS 22264+5858/RAFGL 2910/IRC +60355/TIC 414863240/[NBM54] 74"
{
	/*Observation data*/
	RA      22 28 17.4247298904
	Dec     +59 14 04.059071592
	AppMagn 10.78
	/*Characteristics*/
	Class   "M3Iab"
	/*Astrometry*/
	Parallax 0.2632170297432106
	AbsMagn -6.009797962163795 // Calculated (+3.8913678823947913)
	/*Details*/
	RadSol  998.6543935132656
	LumBol  150816.8562584348 // MBol = -8.20612877553348
	Teff    3605
}

// 58.RSGC1-F09
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+9&submit=SIMBAD+search

// 59.CIT 11
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=CIT+11&submit=SIMBAD+search
Star "CIT 11/NSV 13211/IRC +40439/S1* 657/UCAC4 647-089535/ATO J309.9022+39.2027/JP11 5539/TIC 65019267/Gaia DR2 2063624553284345728/2MASS J20393652+3912097/UCAC2 45559943/Gaia DR3 2063624553284345728/IRAS 20377+3901/RAFGL 2626/UCAC3 259-204238"
{
	/*Observation data*/
	RA      20 39 36.5223205248
	Dec     +39 12 09.688510872
	AppMagn 12
	AppMagnK 1.867
	/*Characteristics*/
	Class   "M2I" // M2/4I, Not an S star
	/*Astrometry*/
	Parallax 0.418961833865644
	AbsMagn -11.189170973475466 // Calculated (+11.300043282859392) (???)
	/*Details*/
	RadSol  981.9341224283747
	LumBol  145808.94043090066 // MBol = -8.16946445115143
	Teff    3605
}

// 60.V381 Cephei
// https://en.wikipedia.org/wiki/V381_Cephei
Remove "HD 203338"
StarBarycenter "CCDM J21193+5838"
{
	/*Observation data*/
	RA      21 19 15.6852148728
	Dec     +58 37 24.624258456
	AppMagn 5.51 // 5.71
	/*Characteristics*/
	Class   "M1epIb+B"
	/*Astrometry*/
	Dist    630
	AbsMagn -5.2
}

// 61.MSX6C G086.5890-00.7718
// https://simbad.u-strasbg.fr/simbad/sim-basic?Ident=MSX6C+G086.5890-00.7718&submit=SIMBAD+search
Star "MSX6C G086.5890-00.7718/2MASS J21015501+4517205/TYC 3588-11066-1/Gaia DR2 2162696838801402624/GSC 03588-11066/TIC 357459977/UCAC2 47205779/Gaia DR3 2162696838801402624"
{
	/*Observation data*/
	RA      21 01 55.0257771216
	Dec     +45 17 20.758647552
	AppMagn 10.87
	/*Characteristics*/
	Class   "M3I"
	/*Astrometry*/
	Parallax 0.1376
	AbsMagn -6.4369078305025393 // Calculated (+3)
	/*Details*/
	// Gaia DR3 Data
	MassSol 22.184121276971339 // log(g) = -0.372 cm/s^2
	RadSol  1196.91 // 975 - 1035
	LumBol  243466.00477099177 // Calculated
	Teff    3706
	FeH     -0.193
}

// 62.μ Cephei (Herschel's Garnet Star)
// https://en.wikipedia.org/wiki/Mu_Cephei
Remove "MU Cep"
StarBarycenter "造父四/MU Cep/HD 206936/GCRV 13658/Erakis/V* MU Cep/GSC 03979-01616/PLX 5252/WDS J21435+5847A/ADS 15271 A/HIC 107259/PLX 5252.00/WEB 19372/AG+58 1378/HIP 107259/PPM 39787/YZ 58 12465/BD+58 2316/HR 8316/RAFGL 2802/[KW97] 59-21/CCDM J21435+5847A/IDS 21404+5819 A/SAO 33693/[LFO93] 2141+58/Cl* Trumpler 37 MMU 1319/IRAS 21419+5832/SKY# 41413/AAVSO 2140+58/Cl Trumpler 37 1319/IRC +60325/SV* VV 469/Gaia DR3 2202630001603369856/CSI+58 2316 1/JP11 3398/TIC 260614141/Gaia DR2 2202630001591176064/DO 40029/2MASS J21433045+5846480/TYC 3979-1616-1/GC 30440/Herschel's Garnet Star/UBV 21553"
{
	DateUpdated "2020-03-16"
	/*Observation data*/
	RA      21 43 30.27
	Dec     58 46 28.6
	AppMagn 4.2
	/*Characteristics*/
	Class   "M2Ia"
	/*Astrometry*/
	Dist    940
	AbsMagn -7.1
}

// 63.V3953 Sagittarii
// http://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V3953+Sagittarii&submit=SIMBAD+search
Star "IRC -30398/SV* ZI 1562/IRAS 18560-2954/TIC 107655088/WISE J185913.65-295021.0/AKARI-IRC-V1 J1859138-295019/UCAC4 301-253813/[LFO93] 1856-29/ASASSN-V J185913.79-295020.3/2MASS J18591385-2950203/V* V3953 Sgr/Gaia DR2 6760856424654973312/CSV 4465/RAFGL 2289/WISEA J185913.86-295020.5/Gaia DR3 6760856424654973184"
{
	/*Observation data*/
	RA      18 59 13.8469390704
	Dec     -29 50 20.513684796
	AppMagn 14.19
	/*Characteristics*/
	Class   "M9I"
	/*Astrometry*/
	Parallax 1.0798
	AbsMagn -5.643283384323881 // Calculated (+10)
	/*Details*/
	//MassSol // log(g) = 1.769 cm/s^2
	RadSol  970
	LumBol  8900
	Teff    1800
	FeH     -0.511 // Gaia DR3
}

// 64.UW Aquilae
// http://simbad.cds.unistra.fr/simbad/sim-basic?Ident=UW+Aquilae&submit=SIMBAD+search
Star "V* UW Aql/BD+00 4064/IRAS 18550+0023/RAFGL 5327S/UCAC3 181-185174/AG+00 2275/IRC +00398/SV* HV 3333/AN 69.1911/JP11 4/TIC 227537962/AAVSO 1852+00/GEN# +0.00004064/2MASS J18573356+0027199/TYC 449-508-1/Gaia DR3 4266638069673095936/GSC 00449-00508/PPM 166875/UBV M 108/Gaia DR2 4266638069673095936"
{
	/*Observation data*/
	RA      18 57 33.5567317752
	Dec     +00 27 19.890439128
	AppMagn 8.8
	/*Characteristics*/
	Class   "M2Iab"
	/*Astrometry*/
	Parallax 0.3078121658361184
	AbsMagn -9.338085116940139 // Calculated (+5.579514020458376)
	/*Details*/
	//MassSol // log(g) = 1.769 cm/s^2
	RadSol  963.6612092364586
	LumBol  149200.90933730805 // MBol = -8.19443274119716
	Teff    3660
}

// 65.S Aurigae
// http://simbad.cds.unistra.fr/simbad/sim-basic?Ident=S+Aurigae&submit=SIMBAD+search
Star "V* S Aur/HD 35556/GCRV 3266/SKY# 8675/[LMW2001] 623/BD+34 1044/GSC 02411-00222/TIC 128018331/[LTY2003] NIRS 05237+3405/C* 336/IDS 05205+3405 A/TYC 2411-222-1/AAVSO 0520+34/Case 10/IRAS 05238+3406/UCAC2 43760126/Gaia DR3 182625449700126336/CCDM J05270+3409A/IRC +30114/Gaia DR2 182625449700126336/CGCS 941/2MASS J05270744+3408586/WDS J05271+3410A/CSI+34 1044 1/MSX5C G173.4867-00.5118/WEB 4941/Fuen C 49/RAFGL 748/[LFO93] 0523+34"
{
	/*Observation data*/
	RA      05 27 07.4585545416
	Dec     +34 08 58.849073880
	AppMagn 8.2
	/*Characteristics*/
	Class   "N5+"
	/*Astrometry*/
	Parallax 0.9146
	AbsMagn -4.9938440147766858 // Calculated (+3)
	/*Details*/
	MassSol 72.902616475537613 // log(g) = 0.339 cm/s^2 (???)
	RadSol  957
	LumBol  11694.950112545182 // MBol = -5.43
	Teff    1940
	FeH     -0.168
	CtoO    1.014
}

// 66.RSGC1-F12
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+12&submit=SIMBAD+search

// 67.RSGC1-F03
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+3&submit=SIMBAD+search

// 68.V398 Cassiopeiae
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V398+Cassiopeiae&submit=SIMBAD+search
Star "HD 240275/IRAS 23202+5901/SV* WR 158/YZ 59 13997/AG+59 1607/IRC +60402/TIC 319408823/Gaia DR2 2010561709812955264/BD+58 2583/IRCO 1205/TYC 4011-708-1/Gaia DR3 2010561709812955264/BSD 19-108/2MASS J23223076+5918260/UBV M 28104/GEN# +1.00240275/PPM 41740/UCAC3 299-185439/GSC 04011-00708/RAFGL 3085/V* V398 Cas"
{
	/*Observation data*/
	RA      23 22 30.7653603528
	Dec     +59 18 26.092572660
	AppMagn 8.9
	/*Characteristics*/
	Class   "M1Ia"
	/*Astrometry*/
	Parallax 0.34056053213823473
	AbsMagn -7.185380516047164 // Calculated (+3.74635209489994)
	/*Details*/
	RadSol  940.9159848081582
	LumBol  155921.98498119114 // MBol = -8.24227245352112
	Teff    3745
}

// 69.IRC +60342
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=IRC+%2B60342&submit=SIMBAD+search
Star "IRC +60342/DO 40745/2MASS J22062959+5929281/UCAC4 748-074951/Gaia DR2 2199861809274178048/IRAS 22048+5914/NSV 25835/WISEA J220629.59+592927.6/Gaia DR3 2199861809274178048/RAFGL 4286/WISE J220629.56+592929.4/IRCO 95/TIC 328260621/[WWV2004] J2206298+592927"
{
	/*Observation data*/
	RA      22 06 29.5895674032
	Dec     +59 29 28.034978460
	AppMagn 10.67
	/*Characteristics*/
	Class   "M4I"
	/*Astrometry*/
	Parallax 0.15644709900138867
	AbsMagn -6.055362452121509 // Calculated (+2.6972000242922416)
	/*Details*/
	MassSol 58.561365820652881 // log(g) = 0.259 cm/s^2 (???)
	RadSol  940.47223497688
	LumBol  123665.3421453289 // MBol = -7.99062407457125
	Teff    3535
	FeH     -0.319 // Gaia DR3
}

// 70.V384 Persei
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V384+Persei&submit=SIMBAD+search
Star "LEE 259/DO 27089/IRC +50096/RAFGL 489/[LFO93] 0322+47/ATO J051.6230+47.5302/JP11 5554/SV* SVS 1809/[WWV2004] J0326300+473150/C* 142/JP11 5553/TIC 456137248/AAVSO 0319+47/CGCS 496/Kiso C5-86/V* V384 Per/Gaia DR3 243120098423921664/CIT 5/WISEA J032629.46+473148.1/Gaia DR2 243120098423921664/IRAS 03229+4721/2MASS J03262951+4731486/WISE J032629.53+473148.4"
{
	/*Observation data*/
	RA      03 26 29.5037418864
	Dec     +47 31 48.551540844
	//AppMagnK 1.15
	/*Characteristics*/
	Class   "N"
	/*Astrometry*/
	Parallax 0.1563
	/*Details*/
	//MassSol  // log(g) = 1.501 cm/s^2
	RadSol  937
	LumBol  8300
	Teff    1800
	FeH     0.62 // Gaia DR3
}

// 71.ψ1 Aurigae
// https://en.wikipedia.org/wiki/Psi1_Aurigae
Remove "PSI1 Aur"
Star "座旗增一/PSI1 Aur/46 Aur/GSC 03384-01194/N30 1379/UBV 21528/HD 44537/PLX 1476/uvby98 100044537/AG+49 672/HIC 30520/PLX 1476.00/V* PSI1 Aur/BD+49 1488/HIP 30520/PMC 90-93 174/WEB 6077/DO 30344/HR 2289/PPM 49029/AAVSO 0617+49/FK5 242/IRAS 06210+4918/SAO 41076/Gaia DR3 970675154497903616/GC 8235/IRC +50164/SKY# 10981/Gaia DR2 970675154497903616/GCRV 4058/JP11 1373/TIC 258622975/GEN# +1.00044537/2MASS J06245390+4917163/TYC 3384-1194-1"
{
	DateUpdated "2019-05-25"
	/*Observation data*/
	RA      06 24 53.9015502096
	Dec     +49 17 16.411221960
	AppMagn 4.75
	/*Characteristics*/
	Class   "K5Iab" // K5-M1Iab-Ib
	/*Astrometry*/
	Dist    2300
	AbsMagn -5.53
	/*Details*/
	MassSol 14.4
	RadSol  726
	LumBol  63579
	Teff    3750
	FeH     0.08
	Age     0.0123
}

// 72.GX Monocerotis
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=GX+Monocerotis&submit=SIMBAD+search
Star "V* GX Mon/SV* SON 4010/IRAS 06500+0829/TIC 235289427/[LFO93] 0650+08/AKARI-IRC-V1 J0652470+082518/IRC +10143/UCAC4 493-034787/[PCC93] 113/ASASSN-V J065246.97+082519.4/2MASS J06524704+0825191/[TVH89] 19/CSI+08-06500/OH 205.6+04.1/WISEA J065247.04+082518.7/Gaia DR2 3157390786124423168/GCRV 58112/RAFGL 1028/WISE J065246.91+082520.1/Gaia DR3 3157390786124423168"
{
	/*Observation data*/
	RA      06 52 47.0423680104
	Dec     +08 25 19.097958468
	AppMagn 15.46
	/*Characteristics*/
	Class   "M9I"
	/*Astrometry*/
	Parallax 1.7586
	AbsMagn -3.314164655889604 // Calculated (+10)
	/*Details*/
	RadSol  931
	LumBol  8200
	Teff    1800
}

// 73.V645 Cephei
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V645+Cephei&submit=SIMBAD+search
Star "V* V645 Cep/IRAS 22049+5926/2MASS J22063776+5941202/[WWV2004] J2206377+594119/GSC 03981-00064/TIC 328261395/WISEA J220637.82+594120.4/Gaia DR3 2199960902761593472/IRCO 103/Tmz V663/WISE J220637.75+594120.6/Gaia DR2 2199960902761593472"
{
	/*Observation data*/
	RA      22 06 37.8081533208
	Dec     +59 41 20.377732740
	AppMagn 11.5
	AppMagnK 3.68
	/*Characteristics*/
	Class   "M4Ib"
	/*Astrometry*/
	Parallax 0.0966757811539574
	AbsMagn -6.041211485025654 // Calculated (+2.4677999346256256)
	/*Details*/
	RadSol  920.499461466307
	LumBol  118468.56382738224 // MBol = -7.94401187512045
	Teff    3535
}

// 74.S Cassiopeiae
// https://en.wikipedia.org/wiki/S_Cassiopeiae
Star "V* S Cas/HD 7769/IRAS 01159+7220/[LFO93] 0115+72/BD+71 66/IRC +70024/WEB 1393/[LMW2001] 793/CSS 28/2MASS J01194198+7236407/WISEA J011942.00+723640.8/[WWV2004] J0119415+723646/DIRBE D01194198P7236407/RAFGL 194/WISE J011941.77+723642.8/AAVSO 0112+72/GC 1579/S1* 21/[C97] 5/Gaia DR3 535066514639376896/GCRV 751/SAO 4374/[FT96] 125.1+9.9/Gaia DR2 535066514639376896/GSC 04305-01322/TIC 468717173/[KW97] 5-28"
{
	/*Observation data*/
	RA      01 19 41.9796588720
	Dec     +72 36 40.850697240
	AppMagn 11.5
	/*Characteristics*/
	Class   "S3.4" // S5.8
	/*Astrometry*/
	Dist    950
	AbsMagn -3.388618026444238 // Calculated (+5)
	/*Details*/
	RadSol  930
	LumBol  5210
	Teff    1800
}

// 75.NV Aurigae (IRC +50137)
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=NV+Aurigae&submit=SIMBAD+search
Star "IRC +50137/RAFGL 700/[DLS93] 05073+5248/[TVH89] 10/AKARI-IRC-V1 J0511194+525233/TIC 328003589/[LFO93] 0507+52/Gaia DR2 265951045055816192/IRAS 05073+5248/V* NV Aur/[PCC93] 67/Gaia DR3 265951045055816192/2MASS J05111944+5252332/WISE J051119.49+525233.5/[TCH91] 05073+5248"
{
	/*Observation data*/
	RA      05 11 19.4506093584
	Dec     +52 52 33.235824324
	//AppMagnK 3.861
	/*Characteristics*/
	Class   "L0I" // M10
	/*Astrometry*/
	Redshift 0.000007
	Dist    1500
	/*Details*/
	RadSol  918
	LumBol  9900
	Teff    1900
}

// 76.Stephenson 2 DFK 5
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=Cl*+Stephenson+2+DFK+5&submit=SIMBAD+search

// 77.UY Scuti
// https://en.wikipedia.org/wiki/UY_Scuti
Remove "UY Sct"
Star "V* UY Sct/BD-12 5055/JP11 293/TIC 177198220/WISE J182736.57-122800.7/GEN# -0.01205055/2MASS J18273652-1227589/TYC 5698-5176-1/Gaia DR2 4152993273702130432/GSC 05698-05176/PPM 234561/UBV M 5387/Gaia DR3 4152993273702130432/IRAS 18248-1229/RAFGL 2162/UCAC3 156-208543/IRC -10422/SV* HV 3805"
{
	/*Observation data*/
	RA      18 27 36.5281722864
	Dec     -12 27 58.898573712
	AppMagn 8.29 // 10.56
	/*Characteristics*/
	Class   "M2Ia" // M2-M4Ia-Iab
	/*Astrometry*/
	Dist    1800
	AbsMagn -6.2
	/*Details*/
	RadSol  909
	LumBol  124000
	Teff    3550
}

// 78.NR Vulpeculae
// https://en.wikipedia.org/wiki/NR_Vulpeculae
Star "V* NR Vul/HD 339034/IRAS 19480+2447/SV* ZI 1806/BD+24 3902/IRC +20438/TIC 435670188/AAVSO 1946+24/CSV 101897/JP11 68/TYC 2144-1244-1/Gaia DR3 2020687421645374720/DO 18219/2MASS J19501193+2455240/UBV M 1395/Gaia DR1 2020687417329221248/GSC 02144-01244/RAFGL 2462/UCAC2 40577951/Gaia DR2 2020687421645374720"
{
	/*Observation data*/
	RA      19 50 11.9276355408
	Dec     +24 55 24.180686508
	AppMagn 9.13 // 9.61
	/*Characteristics*/
	Class   "M1Ia"
	/*Astrometry*/
	Dist    1800
	AbsMagn -6.1463625255165297 // Calculated (+4)
	/*Details*/
	MassSol 4.92
	RadSol  553
	LumBol  111000 // 223000
	Teff    3986
	FeH     0.09
}

// 79.V1111 Ophiuchi (IRC +10365)
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V1111+Ophiuchi&submit=SIMBAD+search
Star "IRC +10365/SV* SON 9911/TIC 321755798/[PCC93] 284/AKARI-IRC-V1 J1837192+102542/2MASS J18371926+1025422/V* V1111 Oph/[TVH89] 330/ATO J279.3303+10.4285/OH 040.6+07.8/WISE J183719.29+102542.5/Gaia DR2 4480669110511665536/IRAS 18349+1023/RAFGL 2206/[LFO93] 1834+10/Gaia DR3 4480669110511665536"
{
	/*Observation data*/
	RA      18 37 19.2583829328
	Dec     +10 25 42.492195300
	//AppMagnK 1.114
	/*Characteristics*/
	Class   "M9I"
	/*Astrometry*/
	Parallax 1.9918
	/*Details*/
	RadSol  902
	LumBol  7700
	Teff    1800
}

// 80.RW Cephei
// https://en.wikipedia.org/wiki/RW_Cephei
Star "V* RW Cep/HD 212466/GEN# +1.00212466/2MASS J22230701+5557477/UBV M 26377/AG+55 1572/GSC 03986-00365/PPM 40586/UCAC3 292-186925/AGKR 20037/HIC 110504/RAFGL 2896/AN 128.1907/HIP 110504/SAO 34387/YZ 55 13111/BD+55 2737/IRAS 22212+5542/SKY# 42615/AAVSO 2219+55A/DO 41257/IRC +60353/SV* HV 2982/Gaia DR3 2005992002061917312/GC 31299/JP11 3481/TIC 422108142/Gaia DR1 2005991997748954112/GCRV 73164/LF 4 +55 299/TYC 3986-365-1/Gaia DR2 2005992002061917312"
{
	/*Observation data*/
	RA      22 23 07.0152061200
	Dec     +55 57 47.624368284
	AppMagn 6.0 // 7.6
	/*Characteristics*/
	Class   "K2Ia+"
	/*Astrometry*/
	Dist    3400
	AbsMagn -8.0 // -9.4
	/*Details*/
	RadSol  900 // 1760
	LumBol  300000
	Teff    4200 // 4400
	FeH     0.17
}

// 81.NSV 25875
// http://simbad.cds.unistra.fr/simbad/sim-basic?Ident=NSV+25875&submit=SIMBAD+search
Star "RAFGL 2885/NSV 25875/2MASS J22192747+5951217/[LFO93] 2217+59/AKARI-IRC-V1 J2219274+595121/OH 104.91+02.41/TIC 421848694/[PCC93] 463/IRAS 22177+5936/OH 104.9+02.5/WISE J221927.50+595121.7/[TCH91] 22177+5936/IRCO 243/OH 104.9+02.4/[DLS93] 22177+5936/[TVH89] 438"
{
	/*Observation data*/
	RA      22 19 27.47784
	Dec     +59 51 21.7080
	//AppMagnK 6.857
	/*Characteristics*/
	Class   "" // O-rich
	/*Astrometry*/
	Dist    2300
	/*Details*/
	RadSol  891
	LumBol  40871
	Teff    2750
}

// 82.V774 Sagittarii
// http://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V774+Sagittarii&submit=SIMBAD+search
Star "V* V774 Sgr/CD-23 13645/IRAS 17513-2313/SV* HV 10303/BAaDE ad3a-06634/IRC -20397/TIC 102711334/WISE J175426.05-231413.4/GSC 06841-01586/2MASS J17542613-2314097/TYC 6841-1586-1/Gaia DR2 4070129060958537728/HIC 87668/PPM 733545/UCAC2 22529663/Gaia DR3 4070129060958537728/HIP 87668/RAFGL 2024/UCAC4 334-127413"
{
	/*Observation data*/
	RA      17 54 26.1329090544
	Dec     -23 14 09.662935344
	AppMagn 9.576
	/*Characteristics*/
	Class   "M4I"
	/*Astrometry*/
	Parallax 0.4627212746182686
	AbsMagn -4.7822506547210875 // Calculated (+2.684847992688624)
	/*Details*/
	RadSol  889.3309710890579
	LumBol  110581.60269091501 // MBol = -7.86921126608789
	Teff    3535
}

// 83.V923 Centauri
// http://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V923+Centauri&submit=SIMBAD+search
Star "V* V923 Cen/HD 103052/HIC 57843/SAO 251615/WISE J115142.93-610930.6/BM V 281/HIP 57843/SKY# 22385/[A72c] 75/CD-60 3809/IRAS 11492-6052/SRS 10622/Gaia DR2 5335171374005762560/CPC 20.1 3368/IRSV 1149-6052/TIC 304164760/Gaia DR3 5335171374005762560/CPD-60 3442/LLNS 6429/TYC 8973-1012-1/Gaia DR1 5335171369658042496/GCRV 22545/2MASS J11514295-6109303/UCAC3 58-212034/GSC 08973-01012/PPM 359019"
{
	/*Observation data*/
	RA      11 51 42.9366511944
	Dec     -61 09 30.386262060
	AppMagn 7.9
	/*Characteristics*/
	Class   "M3Ia-Iab"
	/*Astrometry*/
	Parallax 0.3050872433398319
	AbsMagn -5.978991606459859 // Calculated (+1.3011118504578254)
	/*Details*/
	RadSol  881.3133113544452
	LumBol  117457.32591986467 // MBol = -7.93470433932757
	Teff    3605
}

// 84.IRAS 20341+4047
// http://simbad.cds.unistra.fr/simbad/sim-basic?Ident=IRAS+20341%2B4047&submit=SIMBAD+search
Star "IRAS 20341+4047/ATO J308.9779+40.9611/StRS 376/Gaia DR2 2064838276679949184/AKARI-IRC-V1 J2035548+405739/2MASS J20355472+4057401/TIC 64147737/Gaia DR3 2064838276679949184"
{
	/*Observation data*/
	RA      20 35 54.7289567808
	Dec     +40 57 40.055181084
	AppMagn 14 // Guess, citation needed
	//AppMagnK 3.518
	/*Characteristics*/
	Class   "M6I" // M6/8
	/*Astrometry*/
	Parallax 0.19727918098582284
	AbsMagn -12.954400144048709 // Calculated (+13.429806425351698)
	/*Details*/
	MassSol 34.44660065199362 // log(g) = 0.086 cm/s^2
	RadSol  880.2652651873075
	LumBol  117178.13461801448 // MBol = -7.93212051634669
	Teff    3605
	FeH     -0.203
}

// 85.V540 Sagittarii
// http://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V540+Sagittarii&submit=SIMBAD+search
Star "V* V540 Sgr/HD 163869/GSC 07403-06301/SAO 209570/WISE J180004.33-355540.0/CD-35 12140/IRAS 17566-3555/SV* HV 7077/Gaia DR2 4037470061000962048/CPC 18 9151/2MASS J18000429-3555392/TIC 263431099/Gaia DR3 4037470061000962048/CPD-35 7616/PPM 297105/TYC 7403-6301-1/GEN# +1.00163869/RAFGL 5424"
{
	/*Observation data*/
	RA      18 00 04.2981475296
	Dec     -35 55 39.377427240
	AppMagn 8.99
	/*Characteristics*/
	Class   "M5Iab"
	/*Astrometry*/
	Parallax 0.2796159773515795
	AbsMagn -4.912021543092457 // Calculated (+1.1348314606741572)
	/*Details*/
	RadSol  879.7157691002323
	LumBol  98165.64118425024 // MBol = -7.73990283505996
	Teff    3450
}

// 86.V386 Cephei
// http://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V386+Cephei&submit=SIMBAD+search
Star "V* V386 Cep/DO 42141/IRC +60374/RAFGL 2982/AAVSO 2249+60/CSS 1314/IRCO 723/TIC 12954390/Gaia DR3 2206826700034196480/GSC 04278-00479/2MASS J22531232+6117003/Gaia DR2 2206826700034196480/IRAS 22512+6100/MSX6C G109.2152+01.6007/[NBM54] 79"
{
	/*Observation data*/
	RA      22 53 12.3313692888
	Dec     +61 17 00.548668032
	AppMagn 10.79
	/*Characteristics*/
	Class   "M3Ib"
	/*Astrometry*/
	Parallax 0.30132617270305795
	AbsMagn -5.322527644463475 // Calculated (+3.5077119215965284)
	/*Details*/
	RadSol  879.4627850008333
	LumBol  116964.58474137461 // MBol = -7.93014002429882
	Teff    3605
}

// 87.T Lyrae
// http://simbad.cds.unistra.fr/simbad/sim-basic?Ident=T+Lyrae&submit=SIMBAD+search
Remove "T Lyr"
Star "V* T Lyr/BD+36 3168/HIP 90883/SKY# 33922/[LMW2001] 637/C* 2608/IRAS 18306+3657/TIC 289321783/[LTY2003] NIRS 18306+3657/CGCS 4038/IRC +40321/TYC 2636-1142-1/[V58] 73/DO 16869/JP11 157/UBV 15790/AAVSO 1828+36/GC 25326/LAMOST J183218.24+365906.9/UBV M 2708/Gaia DR3 2096185937305282048/GCRV 11009/LEE 206/UCAC3 254-132727/Gaia DR2 2096185937305282048/GEN# +0.03603168/2MASS J18322009+3659555/GSC 02636-01142/RAFGL 2187/WEB 15585/HIC 90883/SAO 67087/[LFO93] 1830+36"
{
	/*Observation data*/
	RA      18 32 20.0767626264
	Dec     +36 59 55.635218376
	AppMagn 7.84
	/*Characteristics*/
	Class   "C-J4"
	/*Astrometry*/
	Parallax 2.321
	AbsMagn -5.33162429772041335 // Calculated (+5)
	/*Details*/
	RadSol  876
	LumBol  9000
	Teff    1900
}

// 88.Trumpler 27 MMU 1
// https://en.wikipedia.org/wiki/Trumpler_27-1

// 89.V437 Scuti
// https://simbad.u-strasbg.fr/simbad/sim-basic?Ident=V437+Scuti&submit=SIMBAD+search
Star "OH 026.5+00.6/OH 026.543+00.618/WISE J183732.34-052358.5/[SVM2001b] 167/AKARI-FIS-V1 J1837328-052405/RAFGL 2205/[DLS93] 18348-0526/[TCH91] 18348-0526/IRAS 18348-0526/TIC 173901184/[DLS93b] 18348-0526/[TVH89] 329/2MASS J18373250-0523591/V* V437 Sct/[LFO93] 1834-05/MSX5C G026.5439+00.6178/WISEA J183732.50-052359.1/[PCC93] 283"
{
	/*Observation data*/
	RA      18 37 32.50920
	Dec     -05 23 59.1936
	//AppMagnK 7.984
	/*Characteristics*/
	Class   "" // O-rich
	/*Astrometry*/
	Dist    1370
	/*Details*/
	RadSol  874
	LumBol  39362
	Teff    2750
}

// 90.TYC 3996-552-2
// https://simbad.u-strasbg.fr/simbad/sim-basic?Ident=TYC+3996-552-2&submit=SIMBAD+search
StarBarycenter "DO 41868/IRC +60364/UCAC3 300-172054/[NBM54] 77/** TDT 3675/2MASS J22431380+5945085/UCAC4 749-076101/Gaia DR3 2008562591517782016/AN 394.1933/NSV 14295/WDS J22432+5945AB/Gaia DR2 2008562591517782016/GSC 03996-00552/RAFGL 2941/WISEA J224313.77+594508.5/IRAS 22413+5929/TIC 428240861/WISE J224313.73+594507.7"
{
	/*Observation data*/
	RA      22 43 13.800408
	Dec     +59 45 09.29700
	AppMagn 11.33
	/*Characteristics*/
	Class   "M5Ib"
	/*Astrometry*/
	Parallax 0.2966206574604339
	AbsMagn -3.962664774482631 // Calculated (+2.6536717403900383)
}

// 91.V1417 Aquilae
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V1417+Aquilae&submit=SIMBAD+search
Star "V* V1417 Aql/C* 2642/IRAS 18398-0220/OGLE DG1008.31.13087/WISE J184224.52-021723.1/AKARI-IRC-V1 J1842249-021726/IRC +00365/RAFGL 2233/[LFO93] 1839-02/AKARI-FIS-V1 J1842249-021706/2MASS J18422486-0217271/TIC 183433259/Gaia DR2 4259526638970008192/Case 176/MSX5C G029.8653+00.9615/UCAC4 439-081050/Gaia DR3 4259526638970008192/CGCS 4077/NSV 11233/DENIS J184224.8-021727/OGLE GD-LPV-20207/WISEA J184224.86-021726.9"
{
	/*Observation data*/
	RA      18 42 24.8730446016
	Dec     -02 17 27.088299816
	AppMagn 13.49
	/*Characteristics*/
	Class   "C"
	/*Astrometry*/
	Dist    1370
	/*Details*/
	RadSol  874
	LumBol  39362
	Teff    2750
}

// 92.V669 Cassiopeiae
// https://en.wikipedia.org/wiki/V669_Cassiopeiae
Star "OH 127.8-00.0/OH 127.82-00.02/2MASS J01335121+6226532/TIC 389839857/[LFO93] 0130+62/AKARI-IRC-V1 J0133511+622653/OH 127.8-00.02/V* V669 Cas/[PCC93] 19/AKARI-FIS-V1 J0133502+622702/WISEA J013351.20+622653.3/[TCH91] 01304+6211/IRAS 01304+6211/OH 127.8+00.0/WISE J013351.19+622653.2/[TVH89] 4/IRCO 3035/RAFGL 230/[FT96] 127.8+0.0"
{
	/*Observation data*/
	RA      01 33 51.21048
	Dec     +62 26 53.2032
	AppMagn 17.48
	/*Characteristics*/
	Class   "M9III"
	/*Astrometry*/
	Dist    2100
	AbsMagn -4.131096473669595 // Calculated (+10)
	/*Details*/
	RadSol  859
	LumBol  10000 // 36000
	Teff    2750
}

// 93.FX Serpentis
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=FX+Serpentis&submit=SIMBAD+search
Star "V* FX Ser/IRC -10396/DENIS J180650.2-094116/UCAC2 28407889/[LFO93] 1804-09/AKARI-IRC-V1 J1806502-094115/IRAS 18040-0941/UCAC4 402-074909/Gaia DR2 4158167231822032640/ASASSN-V J180650.10-094117.2/2MASS J18065022-0941162/Gaia DR3 4158167231822032640/ATO J271.7092-09.6879/RAFGL 2067/WISEA J180650.21-094116.7/CGCS 6711/TIC 204955592/WISE J180650.17-094120.6"
{
	/*Observation data*/
	RA      18 06 50.2066800624
	Dec     -09 41 16.576025784
	AppMagn 14.8
	/*Characteristics*/
	Class   "C"
	/*Astrometry*/
	Parallax 1.1091
	AbsMagn -4.975146473536153 // Calculated (+10)
	/*Details*/
	RadSol  857
	LumBol  11694.950112545182 // MBol = -5.43
	Teff    2050
}

// 94.Westerlund 1 W20 (Westerlund 1 BKS D)
// https://en.wikipedia.org/wiki/Westerlund_1-20

// 95.V348 Velorum
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=V348+Velorum&submit=SIMBAD+search
Star "V* V348 Vel/HD 90586/GC 14341/2MASS J10261563-5353293/UCAC3 73-119294/** HJ 4319/GCRV 25906/NSV 4860/CCDM J10263-5354A/GSC 08600-03573/PPM 339037/WDS J10263-5353A/CD-53 3516/HIC 51087/SAO 238059/WISE J102615.62-535329.0/CPC 19 3926/HIP 51087/SKY# 20046/Gaia DR2 5355604835516835712/CPD-53 3793/IDS 10223-5323 A/TIC 464509446/Gaia DR3 5355604835516835712/CSI-53 3793 42/IRAS 10243-5338/TYC 8600-3573-1"
{
	/*Observation data*/
	RA      10 26 15.6388518336
	Dec     -53 53 29.268044124
	AppMagn 6.93
	/*Characteristics*/
	Class   "M3Iab"
	/*Astrometry*/
	Parallax 0.35838080927784466
	AbsMagn -6.48222796108638 // Calculated (+1.1839516902572491)
	/*Details*/
	RadSol  855.1155051492299
	LumBol  117482.25599063459 // MBol = -7.93493476010472
	Teff    3660
}

// 96.Stephenson 2 DFK 3
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=Cl*+Stephenson+2+DFK+3&submit=SIMBAD+search

// 97.BI Cygni
// https://en.wikipedia.org/wiki/List_of_largest_known_stars
Star "V* BI Cyg/BD+36 4025/IDS 20176+3637 A/RAFGL 2559/WDS J20214+3656A/AN 23.1919/IRAS 20194+3646/TIC 13249363/AAVSO 2017+36B/CCDM J20215+3656A/IRC +40408/TYC 2684-522-1/Gaia DR3 2057564148278709760/GEN# +0.03604025/JP11 158/UBV M 2712/Gaia DR2 2057564148278709760/GSC 02684-00522/2MASS J20212192+3655555"
{
	/*Observation data*/
	RA      20 21 21.8869298736
	Dec     +36 55 55.728708060
	AppMagn 8.4 // 9.9
	/*Characteristics*/
	Class   "M4Iab"
	/*Astrometry*/
	Dist    2579
	AbsMagn -6.78
	/*Details*/
	MassSol 6.3
	RadSol  797 // 852 - 908
	LumBol  64000 // 67000
	Teff    3550
	FeH     0.4
}

// 98.MY Cephei
// https://en.wikipedia.org/wiki/MY_Cephei
Star "V* MY Cep/IRC +60375/CSV 8802/TIC 12961551/[MO2001] 23/AKARI-IRC-V1 J2254316+604938/IRAS 22525+6033/UCAC4 755-075760/[PCC93] 474/Cl* NGC 7419 BMD 950/2MASS J22543171+6049388/Gaia DR2 2014636804844397824/Cl* NGC 7419 BNSW b/RAFGL 2987/WISE J225431.85+604938.2/Gaia DR3 2014636804844397824"
{
	/*Observation data*/
	RA      22 54 31.6975387464
	Dec     +60 49 38.973030780
	AppMagn 14.4 // 15.5
	/*Characteristics*/
	Class   "M7I" // M7-7.5I, Extreme OH/IR red supergiant
	/*Astrometry*/
	Dist    3000
	AbsMagn -5.9856062735983127 // Calculated (+8)
	/*Details*/
	MassSol 14.5
	RadSol  1134 // 2061
	LumBol  155000 // 310000
	Teff    3000 // 3595
	Age     0.009
}

// 99.V509 Cassiopeiae
// https://en.wikipedia.org/wiki/V509_Cassiopeiae
StarBarycenter "V* V509 Cas/HD 217476/HIC 113561/PMC 90-93 1469/uvby98 100217476/AG+56 1666/HIP 113561/PPM 41360/BD+56 2923/HR 8752/RAFGL 3006/WEB 20188/FK5 3839/IRAS 22579+5640/ROT 3349/YZ 56 13633/GC 32063/IRC +60379/SAO 35039/[KW97] 66-50/GCRV 14433/JP11 3566/SKY# 43664/AAVSO 2255+56/GEN# +1.00217476/2MASS J23000509+5656433/TIC 313555973/Gaia DR3 2009856132592845568/GSC 03993-02269/PLX 5576/TYC 3993-2269-1/Gaia DR2 2009856132592845568/HBHA 5706-41/PLX 5576.00/UBV 19726"
{
	/*Observation data*/
	RA      23 00 05.1012218544
	Dec     +56 56 43.350876312
	AppMagn 4.6 // 6.1
	/*Characteristics*/
	Class   "G0Ia+" // K5Ia+ - A6Ia+
	/*Astrometry*/
	Dist    4810
	AbsMagn -8.6
}

// 100.TW Carinae
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=TW+Carinae&submit=SIMBAD+search
Star "V* TW Car/SV* HV 1231/BM VIII 19/TIC 459847143/Gaia DR2 5338815361690749824/AKARI-IRC-V1 J1055040-590324/IRAS 10530-5847/Gaia DR3 5338815361690749824/AN 72.1906/2MASS J10550409-5903250/WISE J105504.07-590325.2"
{
	/*Observation data*/
	RA      10 55 04.0867947336
	Dec     -59 03 24.906135888
	AppMagn 11.85
	/*Characteristics*/
	Class   "M1Iab"
	/*Astrometry*/
	Parallax 0.0911105132234447
	AbsMagn -7.661223263026374 // Calculated (+4.309065728105061)
	/*Details*/
	RadSol  835.4109393798946
	LumBol  122915.30905719077 // MBol = -7.98401900976944
	Teff    3745
}