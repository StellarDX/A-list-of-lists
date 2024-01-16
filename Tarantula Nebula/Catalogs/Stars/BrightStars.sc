// Other bright stars in Tarantula Nebula
// Distance generation using 2D normal distribution model

// Reference:
// 1. S. Bagnulo, G. A. Wade, Y. Naze, J. H. Grunhut, M. E. Shultz, 
// D. J. Asher, P. A. Crowther, C. J. Evans, A. David-Uraz, I. D. Howarth, 
// N. Morrell, M. S. Munoz, C. Neiner, J. Puls, M. K. Szymanski and J. S. Vink
// "A search for strong magnetic fields in massive and very massive stars in the Magellanic Clouds"
// https://www.aanda.org/articles/aa/full_html/2020/03/aa37098-19/aa37098-19.html
// 2. Sarah A. Brands, Alex de Koter, Joachim M. Bestenlehner, Joachim Puls, Saida M. Caballero-Nieves,
// Paul A. Crowther, Jon O. Sundqvist, Michael Abdul-Masih, Florian A. Driessen, Miriam Garcia,
// Sam Geen, Gotz Grafener, Calum Hawcroft, Lex Kaper, Zsolt Keszthelyi, Norbert Langer, Hugues Sana,
// Fabian R. N. Schneider, Tomer Shenar and Jorick S. Vink
// "The R136 star cluster dissected with Hubble Space Telescope/STIS III. The most massive stars and their clumped winds"
// https://www.aanda.org/articles/aa/full_html/2022/07/aa42742-21/aa42742-21.html
// 3. J. M. Bestenlehner, G. Grafener, J. S. Vink, F. Najarro, A. de Koter, H. Sana, C. J. Evans, 
// P. A. Crowther, V. Hénault-Brunet, A. Herrero, N. Langer, F. R. N. Schneider, S. Simon-Diaz9, 
// W. D. Taylor and N. R. Walborn
// "The VLT-FLAMES Tarantula Survey XVII. Physical and wind properties of massive stars at the top of the main sequence"
// https://www.aanda.org/articles/aa/full_html/2014/10/aa23643-14/aa23643-14.html

Star "Brey 79/LMC AB 12/UCAC3 42-32386/[P93] 691/BAT99 98/2MASS J05383914-6906211/UCAC4 105-014273/Gaia DR2 4657679654981424640/Cl* NGC 2070 MEL 49/SSTISAGEMC J053839.14-690621.2/[H2013] LMCe 1387/Gaia DR3 4657679654981424640/Cl* NGC 2070 MEL J/TIC 404768953/[M2002] LMC 171429"
{
	/*Observation data*/
	RA      05 38 39.1442162640
	Dec     -69 06 21.297619692
	AppMagn 13.5
	/*Characteristics*/
	Class   "WN6"
	/*Astrometry*/
	Dist    49974.42843833568 // random
	AbsMagn -8.11
	/*Details*/
	MassSol 226
	RadSol  37.5
	Luminosity 141000
	LumBol  5011853.566853108 // AbsMagnBol = -12.01
	Teff    44630
}

Star "Brey 77/Cl* NGC 2070 SMB 10/TIC 404768889/[HSH95] 2/BAT99 105/CXOU J053842.1-690555/UCAC4 105-014306/[P93] 922/Cl* NGC 2070 MEL G/Dor IRS 95/[CCE2018] 2102/[PPL2002] CX4/Cl* NGC 2070 MEL 42/GEN# +6.20136077/[CHH92] 6002/[TBF2006] 73/Cl* NGC 2070 MH 374/2MASS J05384212-6905552/[H2013] LMCe 1395/Gaia DR3 4657685534828234496"
{
	/*Observation data*/
	RA      05 38 42.1044150840
	Dec     -69 05 55.335965424
	AppMagn 12.86
	/*Characteristics*/
	Class   "O2If*"
	/*Astrometry*/
	Dist    49973.40006156982 // random
	AbsMagn -7.4
	/*Details*/
	MassSol 189
	RadSol  21.1
	LumBol  3630766.9504584973 // MBol = -11.66
	Teff    47300
	Age     0.001
}

Star "UCAC4 105-014417/Dor IRS 153/VFTS 682/Gaia DR2 4657685637907503744/AP J05385552-6904267/IRSF J05385552-6904267/[GC2009] J053855.56-690426.5/Gaia DR3 4657685637907503744/DENIS J053855.5-690426/2MASS J05385552-6904267/[H2013] LMCe 1415/DENIS J053855.4-690425/TIC 404768640/[P93] 1732"
{
	/*Observation data*/
	RA      05 38 55.5222410976
	Dec     -69 04 26.809579344
	AppMagn 16.08
	/*Characteristics*/
	Class   "WN5h"
	/*Astrometry*/
	Dist    49934.83574000403 // random
	AbsMagn -6.83
	/*Details*/
	MassSol 137.8
	RadSol  20.2
	LumBol  3235936.5692962826267867485075456 // log(L) = 6.51
	Teff    54450
	Age     0.001
}

StarBarycenter "Cl* NGC 2070 MH 493/Cl* NGC 2070 SMB 28/IRSF J05384238-6906151/[CCE2018] 1442/VFTS 1022/[P93] 949"
{
	/*Observation data*/
	RA      05 38 42.407
	Dec     -69 06 15.01
	AppMagn 13.44
	/*Characteristics*/
	Class   "WN?"
	/*Astrometry*/
	Dist    49964.34572940389 // random
	AbsMagn -7.05 // Calculated (Extinction +2)
	/*Details*/
	Radius  22617752.588087532669305801391602 // Calculated
	LumBol  3019940.410708304 // MBol = -11.46
	Teff    42200
}

StarBarycenter "Brey 84/Cl* NGC 2070 MH 880/Dor IRS 107/[CCE2018] 1766/[TBF2006] 132/BAT99 116/2MASS J05384424-6906058/[CHH92] 6004/[W95c] 7/SSTISAGEMC J053844.22-690605.8/[H2013] LMCe 1407/Gaia DR3 4657685534828257792/Cl* NGC 2070 MEL 34/TIC 404768913/[HSH95] 8/Gaia DR2 4657685534828257792/Cl* NGC 2070 MEL C/UCAC4 105-014328/[P93] 1134/Cl* NGC 2070 SMB 17/W61 7-2/[PPL2002] CX5/CXOU J053844.2-690605/XMMU J053844.2-690608/[SG2005] LMC 29"
{
	/*Observation data*/
	RA      05 38 44.2508644296
	Dec     -69 06 06.004573020
	AppMagn 13.10
	/*Characteristics*/
	Class   "WN5h:a"
	/*Astrometry*/
	Dist    49968.44724667344 // random
	AbsMagn -7.42
}

Star "HD 269926/GSC 09163-00928/SSTISAGEMC J053847.50-690025.3/[BE74] 418/AL 380/IRSF J05384752-6900252/TIC 404768377/[H2013] LMCe 1409/BAT99 117/LI-LMC 1467/UBV M 28804/[M2002] LMC 171780/Brey 88/2MASS J05384751-6900252/UCAC2 1803458/[P93] 9033/CSI-69-05391 2/OGLE BRIGHT-LMC-MISC-305/UCAC4 105-014361/Gaia DR2 4657687733851287040/FD 69/RMC 146/VFTS 617/Gaia DR3 4657687733851287040/GEN# +1.00269926/SK -69 245/WS 45"
{
	/*Observation data*/
	RA      05 38 47.5179121824
	Dec     -69 00 25.287752196
	AppMagn 13.116
	/*Characteristics*/
	Class   "WN5ha" // + OB?
	/*Astrometry*/
	Dist    49901.13574507847 // random
	AbsMagn -6.3
	/*Details*/
	MassSol 90
	Radius  13033135.195871 // Calculated
	LumBol  2511877.0245160875 // MBol = -11.26
	Teff    53090 // 63000?
	Temperature 53700
}

Star "Cl* NGC 2070 MH 57/CXOU J053840.2-690559/[CCE2018] 2003/[PPL2002] CX8/Cl* NGC 2070 MEL 39/Dor IRS 81/[CHH92] 6003/[TBF2006] 36/Cl* NGC 2070 MEL H/IRSF J05384022-6905599/[HSH95] 7/Gaia DR3 4657679659312960256/Cl* NGC 2070 SMB 14/VFTS 482/[P93] 767"
{
	/*Observation data*/
	RA      05 38 40.2160044288
	Dec     -69 05 59.915264352
	AppMagn 13
	/*Characteristics*/
	Class   "O2.5If*/WN6"
	/*Astrometry*/
	Dist    49964.05568828036 // random
	AbsMagn -7.3
	/*Details*/
	MassSol 145
	Radius  20627674.14747499 // Calculated
	LumBol  2511886.4315095801110850320677993 // log(L) = 6.4
	Teff    42200
	Temperature 42300
}

StarBarycenter "HD 269928/GEN# +1.00269928/TYC 9163-960-1/[H2013] LMCe 1416/AL 376/GSC 09163-00960/TYC 9163-960-2/[M83] B/BAT99 119/IRSF J05385707-6906056/UBV M 28805/[P93] 1788/Brey 90/2MASS J05385706-6906055/UCAC2 1803486/[PPL2002] CX12/CPD-69 464/MH 27/UCAC4 105-014424/[TBF2006] 156/CXOU J053857.0-690605/RMC 145/VFTS 695/Gaia DR2 4657685500468567040/DENIS J053857.1-690605/SK -69 248/W61 7-25/Gaia DR3 4657685500468567040/Dor IRS 160/SSTISAGEMC J053857.05-690605.5/WS 47/FD 71/TIC 404768912/[BE74] 421"
{
	/*Observation data*/
	RA      05 38 57.0667692816
	Dec     -69 06 05.660419140
	AppMagn 11.94
	/*Characteristics*/
	Class   "WN6/7"
	/*Astrometry*/
	Dist    49945.01455648487 // random
	AbsMagn -7.8
}

Star "Cl* NGC 2070 SMB 25/IRSF J05384208-6906144/VFTS 1021/[CCE2018] 1349"
{
	/*Observation data*/
	RA      05 38 42.068
	Dec     -69 06 14.19
	AppMagn 13.31
	/*Characteristics*/
	Class   ""
	/*Astrometry*/
	Dist    49959.3187887147 // random
	AbsMagn -7.18 // Calculated (Extinction +2)
	/*Details*/
	Radius  21642538.9036748 // Calculated
	LumBol  2187753.430800727 // MBol = -11.11
	Teff    50030.6829262628
}

Star "BAT99 114/CXOU J053843.1-690614/VFTS 545/[HSH95] 12/Cl* NGC 2070 MH 742/IRSF J05384320-6906145/[CCE2018] 1474/[P93] 1029/Cl* NGC 2070 MEL 35/2MASS J05384320-6906146/[CHH92] 6006/[TBF2006] 114Cl* NGC 2070 SMB 23/TIC 404768936/[H2013] LMCe 1404"
{
	/*Observation data*/
	RA      05 38 43.20
	Dec     -69 06 14.6
	AppMagn 13.40
	/*Characteristics*/
	Class   "O2If*/WN5"
	/*Astrometry*/
	Dist    49973.93669811496 // random
	AbsMagn -6.7
	/*Details*/
	MassSol 133
	Radius  14633657.38443136 // Calculated
	LumBol  1995262.3149688796013524553967395 // log(L) = 6.3
	Teff    47300
	Temperature 47700
}

StarBarycenter "HD 38282/GEN# +1.00038282/TIC 404768475/[H2013] LMCe 1413/AL 375/GSC 09163-00992/TYC 9163-992-1/[P93] 9037/AP J05385338-6902007/LHA 120-S 133/UBV 5887/[PPL2002] CX17/BAT99 118/2MASS J05385338-6902007/UBV M 11460/[TBF2006] 154/Brey 89/PPM 354888/UCAC2 1803472/Gaia DR2 4657686222022977920/CPD-69 462/RMC 144/UCAC4 105-014407/Gaia DR3 4657686222022977920/CXOU J053853.3-690200/SK -69 246/WS 46/Gaia DR1 4657686217688662272/FD 70/SSTISAGEMC J053853.37-690200.7/[BE74] 420"
{
	/*Observation data*/
	RA      05 38 53.3783458680
	Dec     -69 02 00.895545204
	AppMagn 11.11
	/*Characteristics*/
	Class   "WN5/6h+WN6/7h"
	/*Astrometry*/
	Dist    49893.22623923752 // random
	AbsMagn -9.38 // Calculated (Extinction +2)
}

Star "Cl* NGC 2070 MH 608/[HSH95] 36"
{
	/*Observation data*/
	RA      05 38 42.68
	Dec     -69 06 02.1
	AppMagn 14.39
	/*Characteristics*/
	Class   ""
	/*Astrometry*/
	Dist    49966.18279686188 // random
	AbsMagn -6.1 // Calculated (Extinction +2)
	/*Details*/
	MassSol 162 // Spec, 115 -> 110 from evolution model
	Age     0.0009
	// Model of the optical+UV fits
	RadSol  18.6
	LumBol  1862087.1366628674486717789978037 // log(L) = 6.27
	Teff    49500
	// Model of the optical-only fits
	// RadSol  20.0
	// LumBol  1096478.1961431850131437136061411 // log(L) =  6.04
	// Teff    42000
}

StarBarycenter "Cl* NGC 2070 MEL 25/IRSF J05384155-6905194/VFTS 506/Gaia DR2 4657685534828092032/Cl* NGC 2070 SMB 19/2MASS J05384154-6905193/[CCE2018] 2395/Dor IRS 89/TIC 404768781/[P93] 871"
{
	/*Observation data*/
	RA      05 38 41.5495267078
	Dec     -69 05 19.506347564
	AppMagn 13.31
	/*Characteristics*/
	Class   "N2V((n))((f*))"
	/*Astrometry*/
	Dist    49972.51135232129 // random
	AbsMagn -6.5
}

Star "HD 38344/GEN# +1.00038344/RMC 147/WS 48/AL 383/GSC 09163-01005/SK -69 251/[BE74] 423/AP J05391131-6902014/HTR 21/SSTISAGEMC J053911.33-690201.3/[H2013] LMCe 1426/BAT99 122/IRSF J05391132-6902015/TIC 404768476/[M2002] LMC 172745/Brey 92/2MASS J05391131-6902014/UCAC2 1803520/Gaia DR2 4657685977170493568/CSI-69-05395/MH 21/UCAC4 105-014461/Gaia DR3 4657685977170493568/FD 72/OGLE BRIGHT-LMC-MISC-304/VFTS 758"
{
	/*Observation data*/
	RA      05 39 11.3190030600
	Dec     -69 02 01.571056044
	AppMagn 12.993
	/*Characteristics*/
	Class   "WN5h"
	/*Astrometry*/
	Dist    50057.15600789028 // random
	AbsMagn -7.0
	/*Details*/
	MassSol 84
	Radius  12081875.11576091 // Calculated
	LumBol  1698237.2925535946 // MBol = -10.835
	Teff    50000
}

Star "30 Dor 016/2MASS J05370888-6907203/[GC2009] J053708.79-690720.3/IRSF J05370888-6907203/TIC 277109100/Gaia DR2 4657690620070706432/MCPS 084.28742-69.12233/VFTS 16/Gaia DR3 4657690620070706432"
{
	/*Observation data*/
	RA      05 37 08.8778548584
	Dec     -69 07 20.375080464
	AppMagn 13.546
	/*Characteristics*/
	Class   "O2III-If*"
	/*Astrometry*/
	Dist    49963.90665461098 // random
	AbsMagn -6.1
	/*Details*/
	MassSol 120
	Radius  10712383.750842 // Calculated
	LumBol  1698243.6524617443546253754515903 // log(L) = 6.23
	Teff    53100
	Temperature 54100
}

Star "Cl* NGC 2070 SMB 88/Cl* NGC 2070 MH 283/VFTS 1017/[CHH92] 6005/Cl* NGC 2070 MEL 37W/IRSF J05384185-6906144/[CCE2018] 1374"
{
	/*Observation data*/
	RA      05 38 41.88
	Dec     -69 06 14.4
	AppMagn 14.50
	/*Characteristics*/
	Class   ""
	/*Astrometry*/
	Dist    49967.27611684197 // random
	AbsMagn -5.99 // Calculated (Extinction +2)
	/*Details*/
	Radius  11759771.93523268 // Calculated
	LumBol  1621804.0236937976 // MBol = -10.785
	Teff    50100
}

Star "Cl* NGC 2070 MH 859/CXOU J053844.1-690556/[CHH92] 6013/[PPL2002] CX7/Cl* NGC 2070 MH 870/Dor IRS 109/[HSH95] 18/[RBW98] IRSW-247/Cl* NGC 2070 MEL 33S/[CCE2018] 2177/[P93] 1111/[TBF2006] 131/Cl* NGC 2070 SMB 44/[CHH92] 6009/[P93] 1120"
{
	/*Observation data*/
	RA      05 38 44.2218
	Dec     -69 05 56.973
	AppMagn 13.94
	/*Characteristics*/
	Class   "O3III(f+)"
	/*Astrometry*/
	Dist    49957.86659221122 // random
	AbsMagn -6.56 // Calculated (Extinction +2)
	/*Details*/
	Radius  13209264.4583816 // Calculated
	LumBol  1584887.2570494793 // MBol = -10.76
	Teff    47000
}

StarBarycenter "RMC 140a/BAT99 102/VFTS 507/[PPL2002] CX10/Cl* NGC 2070 SMB 6/[CCE2018] 3191/Gaia DR3 4657685569167442432/IRSF J05384160-6905134/[H2013] LMCe 1391"
{
	/*Observation data*/
	RA      05 38 41.5967462055
	Dec     -69 05 13.457120148
	AppMagn 12.12
	/*Characteristics*/
	Class   "WN4+WC5"
	/*Astrometry*/
	Dist    49976.37549081614 // random
	AbsMagn -8.37 // Calculated (Extinction +2)
}

Star "BAT99 97/IRSF J05383884-6906495/[H2013] LMCe 1386/Gaia DR2 4657679624951968640/Cl* NGC 2070 MEL 51/UCAC4 105-014270/[M2002] LMC 171412/Cl* NGC 2070 SMB 50/VFTS 457/[P93] 666/Dor IRS 73/[CCE2018] 603/Gaia DR3 4657679624951968640"
{
	/*Observation data*/
	RA      05 38 38.8401788208
	Dec     -69 06 49.549699584
	AppMagn 13.74
	/*Characteristics*/
	Class   "O3.5If*/WN7"
	/*Astrometry*/
	Dist    49969.61536145781 // random
	AbsMagn -7.0
	/*Details*/
	MassSol 100
	Radius  18420822.59713731 // Calculated
	LumBol  1584893.1924611134852021013733915 // log(L) = 6.2
	Teff    39800
	Temperature 39900
}

Star "SK -68 137/UCAC2 1934408/[M2002] LMC 170808/GEN# +8.58680137/SSTISAGEMC J053824.64-685232.8/Gaia DR2 4657783322622150784/2MASS J05382466-6852328/TIC 277300832/Gaia DR3 4657783322622150784"
{
	/*Observation data*/
	RA      05 38 24.6792593784
	Dec     -68 52 32.951140752
	AppMagn 13.346
	/*Characteristics*/
	Class   "OB"
	/*Astrometry*/
	Dist    49965 // Not in nebula
	AbsMagn -7.147329458734287 // Calculated (Extinction +2)
	/*Details*/
	Radius  9535620.794040116 // Calculated
	LumBol  1548810.8186073082 // MBol = -10.735
	Teff    55000
}

StarBarycenter "BAT99 113/CXOU J053843.1-690547/TIC 404768861/[H2013] LMCe 1403/Cl* NGC 2070 MH 728/Dor IRS 105/VFTS 542/[HSH95] 15/Cl* NGC 2070 MEL 30/IRSF J05384309-6905469/[CCE2018] 2999/[P93] 1018/Cl* NGC 2070 SMB 24/2MASS J05384311-6905467/[CHH92] 7005/[TBF2006] 115"
{
	/*Observation data*/
	RA      05 38 43.12
	Dec     -69 05 46.8
	AppMagn 13.47
	/*Characteristics*/
	Class   "O2If*/WN5"
	/*Astrometry*/
	Dist    49983.28934613113 // random
	AbsMagn -6.5
	/*Details*/
	MassSol 87
	Radius  13946335.80054605 // Calculated
	LumBol  1445439.7707459275119314815458354 // log(L) = 6.16
	Teff    44700
	Temperature 44900
}

StarBarycenter "Cl* NGC 2070 MH 887/[CCE2018] 1943/[PPL2002] CX9/Gaia DR3 4657685534828252672/Cl* NGC 2070 SMB 33/[HSH95] 16/[TBF2006] 133/CXOU J053844.3-690554/[P93] 1140"
{
	/*Observation data*/
	RA      05 38 44.3243216536
	Dec     -69 05 54.733739541
	AppMagn 13.79
	/*Characteristics*/
	Class   "OC2.5If*+O4V"
	/*Astrometry*/
	Dist    49969.16681030455 // random
	AbsMagn -6.701337099801698 // Calculated (Extinction +2)
}

Star "Brey 75/CPD-69 456H/CXOU J053840.5-690556/TIC 404768895/[H2013] LMCe 1389/BAT99 100/Dor IRS 82/UCAC4 105-014289/[HSH95] 4/FD 63/VFTS 1001/[P93] 786/Cl* NGC 2070 MH 71/IRSF J05384055-6905572/WDS J05387-6906H/[PPL2002] CX6/Cl* NGC 2070 SMB 13/2MASS J05384053-6905571/[CCE2018] 1978/[TBF2006] 40/CSI-69 456 45/RMC 134/[CHH92] 6001"
{
	/*Observation data*/
	RA      05 38 40.53
	Dec     -69 05 57.2
	AppMagn 12.75
	/*Characteristics*/
	Class   "WN6h"
	/*Astrometry*/
	Dist    49960.88127086182 // random
	AbsMagn -7.7427786370900975 // Calculated (Extinction +2)
	/*Details*/
	Radius  12470349.77967224 // Calculated
	LumBol  1412532.254681568 // MBol = -10.635
	Teff    47000
}

Star "Walborn 2/Dor IRS 131/RRG 30 Dor N IRS 4/[P93] 1429/IRSF J05384808-6904422/VFTS 621/[RBW98] IRSN-135/[BGB2001] 2a/[WB87] 2"
{
	/*Observation data*/
	RA      05 38 48.1018
	Dec     -69 04 42.239
	AppMagn 15.39
	/*Characteristics*/
	Class   "O2V((f*))z" // Multiple?
	/*Astrometry*/
	Dist    49980.51732468263 // random
	AbsMagn -6.1
	/*Details*/
	MassSol 80
	Radius  10849249.89249582 // Calculated
	LumBol  1380384.264602884837842712489908 // log(L) = 6.14
	Teff    50100
	Temperature 50700
}

StarBarycenter "Brey 81/Cl* NGC 2070 SMB 51/SSTISAGEMC J053836.36-690657.3/[CCE2018] 389/AP J05383641-6906573/IRSF J05383641-6906575/TIC 404769035/[H2013] LMCe 1385/BAT99 96/LMC AB 11/UCAC4 105-014249/Gaia DR3 4657680380866211200/Cl* NGC 2070 MEL 53/2MASS J05383641-6906573/VFTS 427/Gaia DR2 4657680380866211200"
{
	/*Observation data*/
	RA      05 38 36.4071127800
	Dec     -69 06 57.534295248
	AppMagn 13.76
	/*Characteristics*/
	Class   "WN8(h)"
	/*Astrometry*/
	Dist    49925.31112981095 // random
	AbsMagn -7.0
	/*Details*/
	MassSol 48
	Radius  16994524.59280568 // Calculated
	LumBol  1348962.8825916536092479477181649 // log(L) = 6.13
	Teff    39800
	Temperature 41600
}

Star "[HSH95] 49"
{
	/*Observation data*/
	RA      05 38 42.403 // Position is unknown in Simbad database, related from R136a7 and R136a8.
	Dec     -69 06 0.80
	AppMagn 14.74
	/*Characteristics*/
	Class   "O3V"
	/*Astrometry*/
	Dist    49950.42748353699 // random
	AbsMagn -5.748733548479562 // Calculated (Extinction +2)
	/*Details*/
	MassSol 48 // Spec, 57 -> 55 from evolution model
	Age     0.00184
	// Model of the optical+UV fits
	// RadSol  13.1
	// LumBol  575439.93733715693006203799395572 // log(L) = 5.76
	// Teff    44000
	// Model of the optical-only fits
	RadSol  11.5
	LumBol  1318256.7385564071020473747423042 // log(L) = 6.12
	Teff    58000
}

Star "[HSH95] 46"
{
	/*Observation data*/
	RA      05 38 42.765 // Position is unknown in Simbad database, related from R136a1 and HSH95-36.
	Dec     -69 06 1.56
	AppMagn 14.67
	/*Characteristics*/
	Class   "O2III(f*)" // O2-3III(f*)
	/*Astrometry*/
	Dist    49967.16883840319 // random
	AbsMagn -5.8234237141238925 // Calculated (Extinction +2)
	/*Details*/
	MassSol 84 // Spec, 84 -> 80 from evolution model
	Age     0.0013
	// Model of the optical+UV fits
	RadSol  16.7
	LumBol  1258925.4117941672104239541063958 // log(L) = 6.10
	Teff    47500
	// Model of the optical-only fits
	// RadSol  16.9
	// LumBol  1174897.5549395295417220677651268 // log(L) = 6.07
	// Teff    46500
}

StarBarycenter "RMC 139/CPD-69 456E/CSI-69 456 42/2MASS J05384235-6904580/WDS J05387-6906E/** I 1152E/CXOU J053842.3-690458/MH 16/[H2013] LMCe 1397/BAT99 107/Dor IRS 96/[P93] 952/Brey 86/FD 67/TIC 404768712/[PPL2002] CX11/CCDM J05387-6906E/HTR 16/UCAC4 105-014310/[TBF2006] 82/Cl* NGC 2070 SMB 2/IDS 05394-6909 E/VFTS 527/Gaia DR2 4657685564856502528/CPD-69 453/IRSF J05384235-6904581/W61 7-1/Gaia DR3 4657685564856502528"
{
	/*Observation data*/
	RA      05 38 42.3537501576
	Dec     -69 04 58.196699796
	AppMagn 11.94
	/*Characteristics*/
	Class   "O6.5Iafc+O6Iaf"
	/*Astrometry*/
	Dist    49979.33132029563 // random
	AbsMagn -6.553952206746429 // Calculated
}

Star "VFTS 259/2MASS J05381202-6906342/TIC 277300028/Gaia DR2 4657680518305213184/IRSF J05381202-6906342/Gaia DR3 4657680518305213184"
{
	/*Observation data*/
	RA      05 38 12.0226241304
	Dec     -69 06 34.169386572
	AppMagn 13.65
	/*Characteristics*/
	Class   "O6Iaf"
	/*Astrometry*/
	Dist    50056.56843981675 // random
	AbsMagn -7.0
	/*Details*/
	MassSol 94
	Radius  18394986.53923779 // Calculated
	LumBol  1258925.4117941672104239541063958 // log(L) = 6.1
	Teff    37600
	Temperature 37700
}

Star "Cl* NGC 2070 MH 815/IRSF J05384368-6905479/[CHH92] 7010/Cl* NGC 2070 SMB 39/VFTS 1031/[P93] 1080/CXOU J053843.6-690547/[CCE2018] 2186/[TBF2006] 125"
{
	/*Observation data*/
	RA      05 38 43.6890
	Dec     -69 05 47.855
	AppMagn 13.89
	/*Characteristics*/
	Class   "O3.5"
	/*Astrometry*/
	Dist    49962.0672388051 // random
	AbsMagn -6.603201997572938 // Calculated (+2)
	/*Details*/
	Radius  11287346.99364663 // Calculated
	LumBol  1258920.6971291197 // Mbol = -10.51
	Teff    48000
}

Star "Cl* NGC 2070 MH 980/Cl* NGC 2070 SMB 136/[CHH92] 7029/Cl* NGC 2070 MH 983/[CCE2018] 2053/[P93] 1304/Cl* NGC 2070 MEL 15S/[CHH92] 7021/[P93] 1306"
{
	/*Observation data*/
	RA      05 38 46.1298
	Dec     -69 05 54.529
	AppMagn 14.44
	/*Characteristics*/
	Class   "O4V"
	/*Astrometry*/
	Dist    49967.33334392875 // random
	AbsMagn -6.053430863190579 // Calculated (+2)
	/*Details*/
	Radius  14263253.49964177 // Calculated
	LumBol  1258920.6971291197 // Mbol = -10.51
	Teff    42700
}

Star "Cl* NGC 2070 MH 749/Dor IRS 104/[CCE2018] 1423/[P93] 1036/Cl* NGC 2070 MEL 35S/IRSF J05384327-6906166/[CHH92] 6010/Cl* NGC 2070 SMB 37/VFTS 1028/[HSH95] 23"
{
	/*Observation data*/
	RA      05 38 43.2715
	Dec     -69 06 16.529
	AppMagn 13.82
	/*Characteristics*/
	Class   "O3.5-4.5"
	/*Astrometry*/
	Dist    49968.35603349464 // random
	AbsMagn -6.673475306615934 // Calculated (+2)
	/*Details*/
	Radius  11490847.72630599 // Calculated
	LumBol  1230264.1634662135 // Mbol = -10.485
	Teff    47300
}

Star "BI 253/UCAC2 1803215/IRSF J05373446-6901102/TIC 277300368/[M2002] LMC 168644/2MASS J05373446-6901102/UBV M 44134/Gaia DR2 4657698454092124416/GEN# +6.20052253/MCPS 084.39354-69.01944/VFTS 72/Gaia DR3 4657698454092124416"
{
	/*Observation data*/
	RA      05 37 34.4595697440 // Runaway star
	Dec     -69 01 10.178659452
	AppMagn 13.669
	/*Characteristics*/
	Class   "O2V-III(n)((f*))"
	/*Astrometry*/
	Dist    49976.46174322298 // random
	AbsMagn -5.7
	/*Details*/
	MassSol 97.6
	RadSol  13.9
	LumBol  1174893.1549580991 // Mbol = -10.435
	Teff    54000
	Age     0.0004
}

Star "Brey 76/SSTISAGEMC J053841.78-690614.0/[HSH95] 44/BAT99 104/[CHH92] 6018/[P93] 897/Cl* NGC 2070 MEL A/[H2013] LMCe 1394/[RBW98] IRSW-190"
{
	/*Observation data*/
	RA      05 38 41.8800 
	Dec     -69 06 13.680
	AppMagn 12.5
	/*Characteristics*/
	Class   "O2If*/WN5"
	/*Astrometry*/
	Dist    49962.86024234846 // Random
	AbsMagn -6.052056174066305 // Calculated (+2)
	/*Details*/
	Radius  6257390.407856408 // Calculated
	LumBol  1148149.321671258 // MBol = -10.41
	Teff    63000
}

Star "CXOU J053842.7-690601/Cl* NGC 2070 MH 602/[HSH95] 47/[TBF2006] 96"
{
	/*Observation data*/
	RA      05 38 42.720
	Dec     -69 06 01.99
	AppMagn 14.63
	/*Characteristics*/
	Class   "O2V((f*))"
	/*Astrometry*/
	Dist    49953.79088483562 // Random
	AbsMagn -5.8628422573940586 // Calculated (+2)
	/*Details*/
	MassSol 68 // Spec, 72 -> 68 from evolution model (308 from spectral model)
	Age     0.00174
	// Model of the optical+UV fits
	// RadSol  17.3
	// LumBol  954992.58602143594972395937950148 // log(L) = 5.98
	// Teff    43500
	// Model of the optical-only fits
	RadSol  16.7
	LumBol  1148153.6214968827515462246116628 // log(L) = 6.06
	Teff    46500
}

Star "Cl* NGC 2070 MEL 26/Dor IRS 111/VFTS 562/[CHH92] 7006/Cl* NGC 2070 SMB 32/IRSF J05384441-6905362/[CCE2018] 2819/[P93] 1150"
{
	/*Observation data*/
	RA      05 38 44.4177
	Dec     -69 05 36.154
	AppMagn 13.66
	/*Characteristics*/
	Class   "O4III(f)"
	/*Astrometry*/
	Dist    49991.59148784263 // Random
	AbsMagn -6.834484813927599 // Calculated (+2)
	/*Details*/
	Radius  13786354.73508867 // Calculated
	LumBol  1122014.2523523173 // MBol = -10.385
	Teff    42200
}

StarBarycenter "Cl* NGC 2070 SMB 68/IRSF J05384174-6906250/[CCE2018] 1199/[TBF2006] 53/CXOU J053841.6-690624/VFTS 512/[P93] 885"
{
	/*Observation data*/
	RA      05 38 41.750
	Dec     -69 06 24.94
	AppMagn 14.28
	/*Characteristics*/
	Class   "O2V-III((f*))"
	/*Astrometry*/
	Dist    49974.70503088618 // random
	AbsMagn -6.1
}

Star "HD 38029B/** HEI 45A/IRSF J05365519-6911376/SK -69 224/WDS J05370-6912A/Brey 67b/WS 40 B/SSTISAGEMC J053655.17-691137.4/Gaia DR3 4657667216778066560/BAT99 85b/VFTS 3"
{
	/*Observation data*/
	RA      05 36 55.1865323232
	Dec     -69 11 37.582606608
	//AppMagnG 11.842647
	/*Characteristics*/
	Class   "B1Ia+"
	/*Astrometry*/
	Dist    49968.51248379998 // Random
	/*Details*/
	Radius  54404617.53322896 // Calculated
	LumBol  1071515.2924068486 // MBol = -10.335
	Teff    21000
}

StarBarycenter "VFTS 151"
{
	/*Observation data*/
	RA      05 37 46.520
	Dec     -69 09 08.79
	/*Characteristics*/
	Class   "O6.5II(f)p"
	/*Astrometry*/
	Dist    50054.10936157484 // random
}

StarBarycenter "Cl* NGC 2070 MEL 10/2MASS J05384654-6904279/[P93] 1341/Dor IRS 121/TIC 404768643/Gaia DR2 4657685672267222144/IRSF J05384653-6904280/VFTS 603/Gaia DR3 4657685672267222144"
{
	/*Observation data*/
	RA      05 38 46.5347000352
	Dec     -69 04 28.044565608
	AppMagn 13.99
	/*Characteristics*/
	Class   "O4III(fc)"
	/*Astrometry*/
	Dist    49983.0277799522 // random
	AbsMagn -6.3
}

StarBarycenter "RMC 133/2MASS J05382371-6905036/TIC 277300147/Gaia DR2 4657680479615199616/Dor IRS 21/SHV 0538441-690639/VFTS 333/Gaia DR3 4657680479615199616/IRSF J05382371-6905036/SSTISAGEMC J053823.70-690503.4/[P93] 42"
{
	/*Observation data*/
	RA      05 38 23.7090122184
	Dec     -69 05 03.562237032
	AppMagn 12.49
	/*Characteristics*/
	Class   "O8II-III((f))"
	/*Astrometry*/
	Dist    49986.10330330587 // random
	AbsMagn -6.8
}

StarBarycenter "2MASS J05381396-6907477/IRSF J05381396-6907478/VFTS 267/Gaia DR2 4657679934189673088/CXOU J053813.9-690747/SSTISAGEMC J053813.94-690747.7/[PPL2002] CX14/Gaia DR3 4657679934189673088/Dor IRS 2/TIC 277299939/[TBF2006] 23"
{
	/*Observation data*/
	RA      05 38 13.9613816664
	Dec     -69 07 47.728274376
	AppMagn 13.49
	/*Characteristics*/
	Class   "O3III-I(n)f*"
	/*Astrometry*/
	Dist    50011.24846722744 // random
	AbsMagn -6.2
}

StarBarycenter "W61 7-7/Cl* NGC 2070 MEL 13/IRSF J05384618-6906174/[CHH92] 5104/Cl* NGC 2070 SMB 40/VFTS 599/[CCE2018] 1433/[P93] 1311"
{
	/*Observation data*/
	RA      05 38 46.1994 
	Dec     -69 06 16.007
	AppMagn 13.80
	/*Characteristics*/
	Class   "O3III(f*)"
	/*Astrometry*/
	Dist    49968.6959190749 // random
	AbsMagn -6.1
}

// Star "[HSH95] 28"
// {
// 	/*Observation data*/
// 	RA      // No Coord.
// 	Dec     
// 	/*Characteristics*/
// 	Class   "O3V"
// 	/*Astrometry*/
// 	Dist    
// 	/*Details*/
// 	Radius  10059858.59712868 // Calculated
// 	LumBol  999996.2550084365 // MBol = -10.26
// 	Teff    48000
// }

Star "[HSH95] 31"
{
	/*Observation data*/
	RA      05 38 42.496 // Approx.
	Dec     -69 06 3.67
	AppMagn 14.35
	/*Characteristics*/
	Class   "O2V((f*))"
	/*Astrometry*/
	Dist    49968.8915722854 // random
	AbsMagn -4.143498579374318 // Calculated
	/*Details*/
	MassSol 79 // Spec, 76 -> 73 from evolution model
	Age     0.00126
	// Model of the optical+UV fits
	// RadSol  14.6
	// LumBol  954992.58602143594972395937950148 // log(L) = 5.98
	// Teff    47500
	// Model of the optical-only fits
	RadSol  14.6
	LumBol  1000000 // log(L) = 6.00
	Teff    48000
}

// Star "[HSH95] 57"
// {
// 	/*Observation data*/
// 	RA      // No Coord.
// 	Dec     
// 	/*Characteristics*/
// 	Class   "O3III"
// 	/*Astrometry*/
// 	Dist    
// 	/*Details*/
// 	Radius  10492491.71923245 // Calculated
// 	LumBol  999996.2550084365 // MBol = -10.26
// 	Teff    47000
// }

StarBarycenter "RMC 135/Brey 80/FD 64/[H2013] LMCe 1384/BAT99 95/GEN# +6.20136080/SSTISAGEMC J053833.63-690450.5/[M2002] LMC 171177/Cl* NGC 2070 SMB 12/IRSF J05383362-6904505/TIC 404768694/[P93] 355/CSI-69-05390 1/2MASS J05383362-6904503/UCAC4 105-014229/Gaia DR3 4657686290742293888/Dor IRS 48/MH 30/VFTS 402"
{
	/*Observation data*/
	RA      05 38 33.6193296576
	Dec     -69 04 50.510501688
	AppMagn 13.48
	/*Characteristics*/
	Class   "WN7h+OB"
	/*Astrometry*/
	Dist    49971.03368017462 // random
	AbsMagn -5.013591665859398 // Calculated
}

Star "RMC 142/Cl* NGC 2070 SMB 3/IDS 05394-6909 K/TIC 404768847/[HSH95] 1/** HJ 3796K/IRSF J05384274-6905426/UCAC4 105-014317/[M83] E/CCDM J05387-6906K/2MASS J05384274-6905424/VFTS 533/[P93] 987/CSI-69 456 47/MH 28/WDS J05387-6906K/Gaia DR3 4657685534828270976/Dor IRS 101/[CCE2018] 2912/Gaia DR2 4657685534828270976"
{
	/*Observation data*/
	RA      05 38 42.7360833048
	Dec     -69 05 42.617961852
	AppMagn 11.82
	/*Characteristics*/
	Class   "B0Ia"
	/*Astrometry*/
	Dist    49970.34170583786 // Random
	AbsMagn -6.673561596167545 // Calculated
	/*Details*/
	Radius  52557628.58908044 // Calculated
	LumBol  999996.2550084365 // MBol = -10.26
	Teff    21000
}

StarBarycenter "[ST92] 1-12/OGLE BRIGHT-LMC-ECL-14/SSTISAGEMC J053730.90-691106.9/VFTS 64/Gaia DR2 4657689829796780416/IRSF J05373092-6911070/TIC 277299665/[M2002] LMC 168492/Gaia DR3 4657689829796780416/2MASS J05373092-6911070/UCAC2 1803201"
{
	/*Observation data*/
	RA      05 37 30.9164613960
	Dec     -69 11 06.996589512
	AppMagn 14.621
	/*Characteristics*/
	Class   "O7.5II(f)"
	/*Astrometry*/
	Dist    50040.79479738844 // random
	AbsMagn -6.5
}

Star "CPD-69 457/IRSF J05384569-6906225/UCAC4 105-014348/WISE J053845.75-690621.3/Cl* NGC 2070 MEL 12/2MASS J05384570-6906222/VFTS 591/[CHH92] 5001/CXOU J053845.6-690622/SSTISAGEMC J053845.72-690622.2/W61 7-6/[TBF2006] 148/Dor IRS 116/TIC 404768956/WISEA J053845.71-690621.8"
{
	/*Observation data*/
	RA      05 38 45.706536
	Dec     -69 06 22.48020
	AppMagn 11.996
	/*Characteristics*/
	Class   "B0.5Ia" // Optical double?
	/*Astrometry*/
	Dist    49980.17927949801 // random
	AbsMagn -6.497989048063504 // Calculated
	/*Details*/
	Radius  31794120.99833261 // Calculated
	LumBol  999996.2550084365 // MBol = -10.26
	Teff    27000
}

Star "Cl* NGC 2070 MH 878/IRSF J05384421-6905471/[CHH92] 7003/[P93] 1130/Cl* NGC 2070 MEL 32/VFTS 1034/[CHH92] 7019/Cl* NGC 2070 SMB 21/[CCE2018] 3043/[HSH95] 13"
{
	/*Observation data*/
	RA      05 38 44.2200
	Dec     -69 05 46.976
	AppMagn 13.36
	/*Characteristics*/
	Class   "O8II"
	/*Astrometry*/
	Dist    49958.89157143309 // random
	AbsMagn -5.13306397099344 // Calculated
	/*Details*/
	Radius  20050098.79566131 // Calculated
	LumBol  999996.2550084365 // MBol = -10.26
	Teff    34000
}