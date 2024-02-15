// 1.WOH G64
// https://en.wikipedia.org/wiki/List_of_largest_known_stars
Remove "WOH G64"
StarBarycenter "WOH G 64/MACHO 47.2368.9/OGLE LMC-LPV-6819/Gaia DR2 4661527262798576768/DCMC J045510.49-682030.2/2MASS J04551048-6820298/TIC 30186593/Gaia DR3 4661527262798576768/IRAS 04553-6825/2MASSI J0455105-682029/WISE J045510.51-682030.2/LI-LMC 181/MSX LMC 1182/[VOG2010] 6"
{
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

// 2.RSGC1-F01
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+1&submit=SIMBAD+search

// 3.VY Canis Majoris
// https://en.wikipedia.org/wiki/VY_Canis_Majoris
Remove "VY CMa"
Star "V* VY CMa/HD 58061/GSC 06541-02525/RAFGL 1111/WISE J072258.10-254603.5/** B 719/HIC 35793/SAO 173591/YZ 115 4839/ADS 6033 AB/HIP 35793/SKY# 13432/[LFO93] 0720-25/AN 60.1931/IRAS 07209-2540/SRS 7681/[PCC93] 116/CD-25 4441/IRC -30087/SV* P 468/[TCH91] 07209-2540/CPD-25 2286/JCMTSE J072258.5-254602/TIC 107149174/[TVH89] 21/GCRV 27408/JCMTSF J072258.5-254602/UCAC4 322-023976/[WCP90] 072054.739-254012.27/GCRV 27369/2MASS J07225830-2546030/AAVSO 0718-25/GCRV 4908/OH 239.3-05.1/WDS J07230-2546AB/GEN# +1.00058061/PPM 252258/WEB 7134"
{
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
	RA      22 30 10.7379122880
	Dec     +57 00 03.071154564
	AppMagn 9.70
	/*Characteristics*/
	Class   "M2Ia-Iab"
	/*Astrometry*/
	Parallax 0.2162
	AbsMagn -4.625721551913543 // Calculated (+1)
	/*Details*/
	// Gaia DR3 data
	MassSol 33.90110205646798 // log(g) = -0.203 cm/s^2
	RadSol  1218
	LumBol  256503.75667860673 // Calculated
	FeH     0.022
	Teff    3722
}

// 12.S Persei
// https://en.wikipedia.org/wiki/S_Persei
Remove "S Per"
Star "V* S Per/HD 14528/GSC 03698-03073/RAFGL 323/[KW97] 11-22/AG+58 255/HIC 11093/SAO 23261/[PCC93] 22/BD+57 552/HIP 11093/TIC 348619093/[RMB2014] G134.62-02.19/CCDM J02229+5836A/IDS 02156+5808 A/TYC 3698-3073-1/[TVH89] 5/CSI+57 552 2/IRAS 02192+5821/UBV 21545/AAVSO 0215+58/DO 25619/IRC +60088/UCAC3 298-47913/Gaia DR3 459101393719884800/GC 2843/JP11 633/Gaia DR2 459101393719884800/GCRV 27308/2MASS J02225173+5835112/WDS J02229+5835A/GEN# +1.00014528/PPM 27539/YZ 58 2170"
{
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
	RA      08 28 26.1852731304
	Dec     -44 08 01.828731984
	AppMagn 10.99
	/*Characteristics*/
	Class   "M1.7Iab"
	/*Astrometry*/
	Parallax 0.1304
	AbsMagn -5.433612043020492 // Calculated (+2)
	/*Details*/
	RadSol  1157
}

// 21.WY Velorum A
// https://simbad.cds.unistra.fr/simbad/sim-id?Ident=%403045938&Name=V*+WY+Vel&submit=display+all+measurements#lab_meas
StarBarycenter "V* WY Vel/HD 81137/IRAS 09203-5220/SS73 13/WISE J092158.85-523348.7/BM V 168/IRSV 0920-5220/SV* HV 3655/AAVSO 0918-52/CD-52 3010/2MASS J09215913-5233514/TIC 294974397/Gaia DR3 5313125719158014208/CPC 19 3419/PPM 337872/TYC 8584-2732-1/Gaia DR2 5313125719153410304/CPD-52 2262/SAO 236888/UCAC3 75-62841/GSC 08584-02732/SKY# 18085"
{
	RA      09 21 59.1346523400
	Dec     -52 33 51.642401004
	AppMagn 8.8
	/*Characteristics*/
	Class   "M2Ipe"
	/*Astrometry*/
	Parallax 0.5187
	AbsMagn -5.6254187600320744 // Calculated (+2)
	/*Details*/
	RadSol  1157
}

// 22.RSGC1-F08
// https://simbad.cds.unistra.fr/simbad/sim-basic?Ident=%5BFMR2006%5D+8&submit=SIMBAD+search

// 23.HD 143183 (V558 Normae)
// https://en.wikipedia.org/wiki/HD_143183
StarBarycenter "HD 143183/GSC 08710-01370/2MASS J16013621-5408356/WISE J160136.23-540835.7/** I 554A/Hbg 1045/TIC 423407817/[A72c] 135/ALS 14308/IDS 15538-5352 A/TYC 8710-1370-1/Gaia DR3 5932748487665645824/CCDM J16015-5408A/IRAS 15576-5400/UCAC3 72-323542/Gaia DR2 5932748487659963264/CD-53 6362/IRSV 1557-5400/uvby98 100143183/CPD-53 6947/LF 15 -54 25/WDS J16016-5409A"
{
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
	RA      18 08 04.0442790744
	Dec     -22 13 26.600899044
	AppMagn 6.5 // 6.5 - 14
	/*Characteristics*/
	Class   "L0I" // M4eIa - M10eIa, the most luminous and coolest AGB star, possibly TZO
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