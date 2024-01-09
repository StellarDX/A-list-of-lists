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