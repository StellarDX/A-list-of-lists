// Bright Star catalog for Ara cluster
// Observation By Very Large Telescope, ESO.
// Reference: J. S. Clark, B. W. Ritchie, and I. Negueruela
// "A VLT/FLAMES survey for massive binaries in Westerlund 1 VII. Cluster census"
// https://www.aanda.org/articles/aa/full_html/2020/03/aa35903-19/aa35903-19.html
// Detailed data reference:
// 1.Danilo F. Rocha, Leonardo A. Almeida, Augusto Damineli, Felipe Navarete, 
// Michael Abdul-Masih, Gregory N. Mace
// "Distance and age of the massive stellar cluster Westerlund 1. II. The eclipsing binary W36"
// https://arxiv.org/abs/2210.04985
// 2.Emma R. Beasor6, Ben Davies, Nathan Smith, Robert D. Gehrz, and Donald F. Figer
// "The Age of Westerlund 1 Revisited"
// https://iopscience.iop.org/article/10.3847/1538-4357/abec44
// All calculated absolute magnitudes add +13 of extinction calculated from star W237's mag.
// Distanses are randomly generated using 2D-normal distribution model.

Star "Cl* Westerlund 1 W 1/TIC 237058049/Gaia DR2 5940106758709791232/2MASS J16465940-4550469/[CMN2008] J164659.3-455046/Gaia DR3 5940106758709791232"
{
	/*Observation data*/
	RA      16 46 59.4000262680
	Dec     -45 50 46.721009148
	AppMagn 18.37
	/*Characteristics*/
	Class   "O9.5Iab"
	/*Astrometry*/
	Dist    3779.138966806019
	AbsMagn -7.52 // Calculated
}

Star "Cl* Westerlund 1 W 2/Cl* Westerlund 1 W 2a/TIC 237054566/Gaia DR3 5940106758703247360/ALS 20148/2MASS J16465971-4550513/[B2007] J164659.71-455051.2/Gaia DR2 5940106758703247360"
{
	/*Observation data*/
	RA      16 46 59.7175806088
	Dec     -45 50 51.190946043
	AppMagn 16.69
	/*Characteristics*/
	Class   "B2Ia" // RV Binary?
	/*Astrometry*/
	Dist    3779.929914699911
	AbsMagn -9.20 // Calculated
	/*Details*/
	Radius  26611855.96704649 // Calculated
	LumBol  131825.67385564071020473747423042 // log(L) = 5.12
	Teff    17782.794100389228012254211951927 // log(T) = 4.25
}

Star "Cl* Westerlund 1 BKS H/2MASS J16470142-4550373/[B2007] J164701.42-455037.4/Gaia DR3 5940106763014985088/Cl* Westerlund 1 W 4/TIC 237063793/Gaia DR2 5940106763014985088"
{
	/*Observation data*/
	RA      16 47 01.4269856784
	Dec     -45 50 37.248841536
	AppMagn 14.47
	/*Characteristics*/
	Class   "F3Ia+"
	/*Astrometry*/
	Dist    3779.572284371144
	AbsMagn -11.42 // Calculated
	/*Details*/
	LumBol  112201.84543019634355910389464779 // log(L) = 5.05
}

StarBarycenter "WR 77f/Cl* Westerlund 1 W 5/2MASS J16470298-4550199/Gaia DR3 5940106797374726784/ALS 20149/Cl* Westerlund 1 CN S/[B2007] J164702.96-455019.7/Gaia DR2 5940106797374726784"
{
	/*Observation data*/
	RA      16 47 02.9772955944
	Dec     -45 50 19.713734556
	AppMagn 17.49
	/*Characteristics*/
	Class   "WN10-11h/B0.5Ia+"
	/*Astrometry*/
	Dist    3779.889248526548
	AbsMagn -8.40 // Calculated
}

Star "Cl* Westerlund 1 W 6a/Cl* Westerlund 1 W 6/[CMN2008] J164703.0-455023/Gaia DR2 5940106797374726144/ALS 20150/[B2007] J164703.06-455023.8/Gaia DR3 5940106797374726144"
{
	/*Observation data*/
	RA      16 47 03.0477797919
	Dec     -45 50 23.748131606
	AppMagn 18.41
	/*Characteristics*/
	Class   "B0.5Iab" // Hα variable
	/*Astrometry*/
	Dist    3779.614405026245
	AbsMagn -7.50 // Calculated
	/*Details*/
	Radius  12884725.30937194 // Calculated
	LumBol  64565.422903465551587821406812811 // log(L) = 4.81
	Teff    21379.620895022320975194110573905 // log(T) = 4.33
}

Star "Cl* Westerlund 1 W 6b/Gaia DR2 5940106797366417408/Gaia DR3 5940106797366417408"
{
	/*Observation data*/
	RA      16 47 02.9390384334
	Dec     -45 50 22.480676456
	AppMagn 20.20
	/*Characteristics*/
	Class   "O9.5III"
	/*Astrometry*/
	Dist    3780.383121921756
	AbsMagn -5.69 // Calculated
	/*Details*/
	Radius  4315937.67168175 // Calculated
	LumBol  26302.679918953819172897987967726 // log(L) = 4.42
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 7/Hen 3-1250/TIC 237049991/Gaia DR2 5940106793062992128/ALS 20151/2MASS J16470363-4550144/[B2007] J164703.63-455014.2/Gaia DR3 5940106793062992128"
{
	/*Observation data*/
	RA      16 47 03.6281794392
	Dec     -45 50 14.365482036
	AppMagn 15.57
	/*Characteristics*/
	Class   "B5Ia+" // Pulsator?
	/*Astrometry*/
	Dist    3780.304439647622
	AbsMagn -10.32 // Calculated
	/*Details*/
	Radius  110936679.8998404 // Calculated
	LumBol  630957.34448019324943436013662234 // log(L) = 5.80
	Teff    12882.495516931339628426531126081 // log(T) = 4.11
}

Star "Cl* Westerlund 1 W 8/2MASS J16470480-4550251/[B2007] J164704.77-455024.8/Gaia DR2 5940106041460479488/Cl* Westerlund 1 W 8a/TIC 237063795/Gaia DR3 5940106041460479488"
{
	/*Observation data*/
	RA      16 47 04.7959778348
	Dec     -45 50 25.013789709
	AppMagn 15.50
	/*Characteristics*/
	Class   "F8Ia+"
	/*Astrometry*/
	Dist    3780.203610471121
	AbsMagn -10.39 // Calculated
	/*Details*/
	LumBol  54954.087385762455209368443601081 // log(L) = 4.74
}

Star "Cl* Westerlund 1 W 8b"
{
	/*Observation data*/
	RA      16 47 04.95
	Dec     -45 50 26.7
	/*Characteristics*/
	Class   "B1.5Ia" // Pulsator?
	/*Astrometry*/
	Dist    3780.331934045881
    AbsMagn -8 // ?
	/*Details*/
	Radius  31266204.50808585 // Calculated
	LumBol  218776.16239495525622261149163842 // log(L) = 5.34
	Teff    18620.871366628674486717789978037 // log(T) = 4.27
}

StarBarycenter "Cl* Westerlund 1 W 9/CXOU J164704.1-455031/[B2007] J164704.17-455031.1/Gaia DR2 5940106797374722688/ALS 20152/2MASS J16470414-4550312/[CMN2008] J164704.1-455031/Gaia DR3 5940106797374722688/Cl* Westerlund 1 BKS C/TIC 237051323/[SSZ2006] 4"
{
	/*Observation data*/
	RA      16 47 04.1419806984
	Dec     -45 50 31.311670632
	AppMagn 17.47
	/*Characteristics*/
	Class   "BI[e]" // sgB[e], Interacting binary
	/*Astrometry*/
	Dist    3779.662358015232
	AbsMagn -8.42 // Calculated
}

StarBarycenter "Cl* Westerlund 1 W 10/2MASS J16470334-4550346/[B2007] J164703.35-455034.6/Gaia DR2 5940106797366404480/ALS 20153/TIC 237058380/[CMN2008] J164703.3-455034/Gaia DR3 5940106797366404480"
{
	/*Observation data*/
	RA      16 47 03.3405625992
	Dec     -45 50 34.603317456
	/*Characteristics*/
	Class   "B0.5I+OB" // SB2
	/*Astrometry*/
	Dist    3780.748107074335
	AbsMagn -8 // ?
}

Star "Cl* Westerlund 1 W 11/[B2007] J164702.25-455047.1/Gaia DR3 5940106758703254656/ALS 20154/Gaia DR2 5940106758703254656"
{
	/*Observation data*/
	RA      16 47 02.2390158456
	Dec     -45 50 47.186514564
	AppMagn 17.15
	/*Characteristics*/
	Class   "B2Ia"
	/*Astrometry*/
	Dist    3780.2595035758
    AbsMagn -8.74 // Calculated
	/*Details*/
	Radius  29179319.8267694 // Calculated
	LumBol  158489.31924611134852021013733915 // log(L) = 5.20
	Teff    17782.794100389228012254211951927 // log(T) = 4.25
}

Star "Cl* Westerlund 1 W 12/2MASS J16470222-4550590/[CMN2008] J164702.4-455100/Cl* Westerlund 1 W 12a/TIC 237049993/Gaia DR3 5940106763006638848/Cl* Westerlund 1 BKS K/[B2007] J164702.23-455059.0/Gaia DR2 5940106763006638848"
{
	/*Observation data*/
	RA      16 47 02.2214295629
	Dec     -45 50 58.987616665
	AppMagn 16.94
	/*Characteristics*/
	Class   "F1Ia+"
	/*Astrometry*/
	Dist    3779.773955153276
    AbsMagn -8.95 // Calculated
	/*Details*/
	LumBol  77624.711662869173389370097799424 // log(L) = 4.89
}

StarBarycenter "Cl* Westerlund 1 W 13/2MASS J16470646-4550261/[CMN2008] J164706.4-455026/Gaia DR3 5940106037157928064/ALS 20155/[B2007] J164706.46-455026.0/Gaia DR2 5940106037157928064"
{
	/*Observation data*/
	RA      16 47 06.4540771320
	Dec     -45 50 26.072579796
	AppMagn 17.19
	/*Characteristics*/
	Class   "B0.5Ia++OB" // E(9.27d)
	/*Astrometry*/
	Dist    3779.815752085933
	AbsMagn -8.70 // Calculated
}

Star "Cl* Westerlund 1 CN R/WR 77q/Cl* Westerlund 1 W 14/2MASS J16470601-4550234/[CMN2008] J164706.0-455022/ALS 20156/Cl* Westerlund 1 W 14c/TIC 237052635/[SSZ2006] 9/Cl* Westerlund 1 W 14a/[B2007] J164706.10-455022.4/Gaia DR3 5940106041452163840"
{
	/*Observation data*/
	RA      16 47 05.9726730842
	Dec     -45 50 23.072495547
	/*Characteristics*/
	Class   "WN5o"
	/*Astrometry*/
	Dist    3780.583841561759
    AbsMagn -8 // ?
}

Star "Cl* Westerlund 1 W 15/[B2007] J164706.61-455029.5/Gaia DR2 5940106041460476288/ALS 20157/[CMN2008] J164706.6-455029/Gaia DR3 5940106041460476288"
{
	/*Observation data*/
	RA      16 47 06.6306037464
	Dec     -45 50 29.723762580
	AppMagn 18.96
	/*Characteristics*/
	Class   "O9Ib"
	/*Astrometry*/
	Dist    3779.518905241325
    AbsMagn -6.93 // Calculated
	/*Details*/
	Radius  8914052.020806583 // Calculated
	LumBol  112201.84543019634355910389464779 // log(L) = 5.05
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 16/2MASS J16470661-4550422/[B2007] J164706.63-455042.1/Cl* Westerlund 1 W 16a/TIC 237059119/Gaia DR2 5940106041460473216/Cl* Westerlund 1 BKS L/UCAC2 12282112/Gaia DR3 5940106041460473216"
{
	/*Observation data*/
	RA      16 47 06.6158603112
	Dec     -45 50 42.186706944
	AppMagn 15.89
	/*Characteristics*/
	Class   "A5Ia+" // Hα variable
	/*Astrometry*/
	Dist    3780.066451795977
    AbsMagn -6.93 // Calculated
	/*Details*/
	LumBol  91201.083935590974212095940791872 // log(L) = 4.96
}

Star "Cl* Westerlund 1 W 17/[CMN2008] J164706.2-455048/Gaia DR2 5940106041460471040/Gaia DR3 5940106041460471040"
{
	/*Observation data*/
	RA      16 47 06.2490500592
	Dec     -45 50 49.292687328
	AppMagn 18.87
	/*Characteristics*/
	Class   "O9Iab"
	/*Astrometry*/
	Dist    3780.32288446298
    AbsMagn -7.02 // Calculated
	/*Details*/
	Radius  10473097.92384943 // Calculated
	LumBol  154881.66189124813446716178411231 // log(L) = 5.19
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 18/TIC 237049998/Gaia DR3 5940106041452130432/2MASS J16470570-4550506/[B2007] J164705.73-455050.4/Gaia DR2 5940106041452130432"
{
	/*Observation data*/
	RA      16 47 05.7082494087
	Dec     -45 50 50.480383849
	AppMagn 17.32
	/*Characteristics*/
	Class   "B0.5Ia"
	/*Astrometry*/
	Dist    3780.301556827317
    AbsMagn -8.57 // Calculated
	/*Details*/
	Radius  21630928.62177907 // Calculated
	LumBol  181970.08586099834401036808062981 // log(L) = 5.26
	Teff    21379.620895022320975194110573905 // log(T) = 4.33
}

Star "Cl* Westerlund 1 W 19/2MASS J16470485-4550593/Gaia DR2 5940106007100730368/ALS 20158/[B2007] J164704.87-455059.3/Gaia DR3 5940106007100730368"
{
	/*Observation data*/
	RA      16 47 04.8672458112
	Dec     -45 50 59.295902136
	AppMagn 18.22
	/*Characteristics*/
	Class   "B1Ia" // Hα variable
	/*Astrometry*/
	Dist    3780.704723719701
    AbsMagn -7.67 // Calculated
	/*Details*/
	Radius  26611855.96704649 // Calculated
	LumBol  229086.76527677730457240849198746 // log(L) = 5.36
	Teff    20417.379446695293314445675412367 // log(T) = 4.31
}

Star "Cl* Westerlund 1 W 20/2MASS J16470468-4551238/[B2007] J164704.68-455123.9/Gaia DR3 5940106007092341120/Cl* Westerlund 1 BKS D/TIC 237063175/Gaia DR2 5940106007092341120"
{
	/*Observation data*/
	RA      16 47 04.6967287296
	Dec     -45 51 23.953706496
	/*Characteristics*/
	Class   "M5Ia"
	/*Astrometry*/
	Dist    3779.738214526206
	AbsMagn -6 // ?
	/*Details*/
	RadSol  858
	LumBol  101000
	Teff    3284 // 3550
}

Star "Cl* Westerlund 1 W 21/[B2007] J164701.13-455113.4/Gaia DR3 5940106659935758976/Gaia DR2 5940106659935758976"
{
	/*Observation data*/
	RA      16 47 01.1124528826
	Dec     -45 51 13.583454380
	AppMagn 18.41
	/*Characteristics*/
	Class   "B0.5Ia" // Pulsator?
	/*Astrometry*/
	Dist    3779.348713908689
	AbsMagn -7.48 // ?
	/*Details*/
	Radius  19057905.28433524 // Calculated
	LumBol  141253.75446227543021556078639302 // log(L) = 5.15
	Teff    21379.620895022320975194110573905 // log(T) = 4.33
}

StarBarycenter "Cl* Westerlund 1 W 23a/Cl* Westerlund 1 W 23/TIC 237063522/Gaia DR3 5940106758703255168/ALS 20159/2MASS J16470256-4551088/[B2007] J164702.57-455108.9/Gaia DR2 5940106758703255168"
{
	/*Observation data*/
	RA      16 47 02.5776330614
	Dec     -45 51 08.902293204
	AppMagn 17.85
	/*Characteristics*/
	Class   "B2Ia+BI?" // Hα variable, Pulsator?
	/*Astrometry*/
	Dist    3780.353284636167
	AbsMagn -8.04 // Calculated
}

Star "Cl* Westerlund 1 W 24/2MASS J16470215-4551126/[CMN2008] J164702.1-455112/Gaia DR3 5940106758709795712/ALS 20160/TIC 237065717/Gaia DR2 5940106758709795712"
{
	/*Observation data*/
	RA      16 47 02.1561069816
	Dec     -45 51 12.581922276
	AppMagn 18.71
	/*Characteristics*/
	Class   "O9Iab" // Pulsator?
	/*Astrometry*/
	Dist    3779.369531924749
	AbsMagn -7.18 // Calculated
	/*Details*/
	Radius  12447300.21066106 // Calculated
	LumBol  218776.16239495525622261149163842 // log(L) = 5.34
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 25/[CMN2008] J164705.7-455033/Gaia DR3 5940106041452153088/[B2007] J164705.82-455033.2/Gaia DR2 5940106041452153088"
{
	/*Observation data*/
	RA      16 47 05.7882476736
	Dec     -45 50 33.368306136
	AppMagn 17.85
	/*Characteristics*/
	Class   "O9Iab"
	/*Astrometry*/
	Dist    3779.490689287948
	AbsMagn -8.04 // Calculated
	/*Details*/
	Radius  14964946.35028362 // Calculated
	LumBol  316227.76601683793319988935444327 // log(L) = 5.50
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Remove "W1-26"
Star "2MASS J16470540-4550367/Cl* Westerlund 1 W 26/TIC 237063796/Gaia DR3 5940106041452150272/Cl* Westerlund 1 BKS AS/Cl* Westerlund 1 BKS A/Gaia DR2 5940106041452150272"
{
	/*Observation data*/
	RA      16 47 05.4076906176
	Dec     -45 50 36.617071668
	AppMagn 16.79
	/*Characteristics*/
	Class   "M2Ia" // M2-5Ia, Spec. variable
	/*Astrometry*/
	Dist    3780.117607925091
	AbsMagn -9.10 // Calculated
	/*Details*/
	RadSol  1145 // 1240
	LumBol  276000
	Teff    3782
	Age     0.0079
}

Star "Cl* Westerlund 1 W 27/[CMN2008] J164705.1-455041/Gaia DR2 5940106041452146432/Gaia DR3 5940106041452146432"
{
	/*Observation data*/
	RA      16 47 05.1550269480
	Dec     -45 50 41.418677508
	AppMagn 17.94
	/*Characteristics*/
	Class   "O7Ia+" // O7-8Ia+, Merger remnant?
	/*Astrometry*/
	Dist    3779.304082547852
	AbsMagn -7.95 // Calculated
	/*Details*/
	Radius  23992481.25801598 // Calculated
	LumBol  1071519.3052376064174083022246945 // log(L) = 6.03
	Teff    31622.776601683793319988935444327 // log(T) = 4.50
}

Star "Cl* Westerlund 1 W 28/ALS 20161/[B2007] J164704.63-455038.4/Gaia DR3 5940106037148748416"
{
	/*Observation data*/
	RA      16 47 04.6646286552
	Dec     -45 50 38.503394520
	AppMagn 16.87
	/*Characteristics*/
	Class   "B2Ia" // Hα variable
	/*Astrometry*/
	Dist    3780.129183464293
	AbsMagn -9.02 // Calculated
	/*Details*/
	Radius  29858993.49825199 // Calculated
	LumBol  165958.69074375606343102318023784 // log(L) = 5.22
	Teff    17782.794100389228012254211951927 // log(T) = 4.25
}

Star "Cl* Westerlund 1 W 29/ALS 20162/Gaia DR3 5940106041460475776"
{
	/*Observation data*/
	RA      16 47 04.4118843432
	Dec     -45 50 39.933732768
	AppMagn 18.66
	/*Characteristics*/
	Class   "O9Ib"
	/*Astrometry*/
	Dist    3779.566428313096
	AbsMagn -7.23 // Calculated
	/*Details*/
	Radius  10966679.82259534 // Calculated
	LumBol  169824.36524617443546253754515903 // log(L) = 5.23
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 30/CXOU J164706.5-455039/[CMN2008] J164704.1-455039/Gaia DR2 5940106041452149632/ALS 20163/CXOU J164704.1-455039/Gaia DR3 5940106041452149632"
{
	/*Observation data*/
	RA      16 47 04.1126936513
	Dec     -45 50 39.164057275
	AppMagn 18.45
	/*Characteristics*/
	Class   "O4Ia+" // O4-5Ia+, Hα variable, RV binary?
	/*Astrometry*/
	Dist    3779.428481275271
	AbsMagn -7.44 // Calculated
	/*Details*/
	Radius  10234701.10990069 // Calculated
	LumBol  446683.59215096311855625052431938 // log(L) = 5.65
	Teff    38904.514499428060109370370285858 // log(T) = 4.59
}

StarBarycenter "Cl* Westerlund 1 W 31/Gaia DR2 5940106797366392320/Gaia DR3 5940106797376589568"
{
	/*Observation data*/
	RA      16 47 03.7862784096
	Dec     -45 50 40.366601376
	/*Characteristics*/
	Class   "B0I+OB"
	/*Astrometry*/
	Dist    3780.019651382795
	AbsMagn -7 // ?
}

Star "Cl* Westerlund 1 BKS F/2MASS J16470369-4550435/Gaia DR2 5940106763006654208/Cl* Westerlund 1 W 32/TIC 237054567/Gaia DR3 5940106763006654208"
{
	/*Observation data*/
	RA      16 47 03.6850109472
	Dec     -45 50 43.536110712
	AppMagn 15.05
	/*Characteristics*/
	Class   "F5Ia+"
	/*Astrometry*/
	Dist    3779.60658831264
	AbsMagn -10.84 // Calculated
	/*Details*/
	LumBol  165958.69074375606343102318023784 // log(L) = 5.22
}

Star "Cl* Westerlund 1 W 33/2MASS J16470413-4550485/[B2007] J164704.13-455048.4/Gaia DR3 5940106002789009536/ALS 20164/TIC 237054568/Gaia DR2 5940106002789009536"
{
	/*Observation data*/
	RA      16 47 04.1256274968
	Dec     -45 50 48.488202564
	AppMagn 15.61
	/*Characteristics*/
	Class   "B5Ia+"
	/*Astrometry*/
	Dist    3779.695727002798
	AbsMagn -10.28 // Calculated
	/*Details*/
	Radius  101175454.5508113 // Calculated
	LumBol  524807.46024977259736431215702241 // log(L) = 5.72
	Teff    12882.495516931339628426531126081 // log(T) = 4.11
}

Star "Cl* Westerlund 1 W 34/Gaia DR2 5940106041460473472/Gaia DR3 5940106041460473472"
{
	/*Observation data*/
	RA      16 47 04.3941837044
	Dec     -45 50 47.222852634
	AppMagn 18.15
	/*Characteristics*/
	Class   "B0Ia"
	/*Astrometry*/
	Dist    3779.960800394147
	AbsMagn -7.74 // Calculated
	/*Details*/
	Radius  17381016.19473201 // Calculated
	LumBol  186208.71366628674486717789978037 // log(L) = 5.27
	Teff    23988.329190194904653173971349271 // log(T) = 4.38
}

Star "Cl* Westerlund 1 W 35/2MASS J16470417-4550533/Gaia DR2 5940106007100789760/ALS 20165/TIC 237060501/Gaia DR3 5940106007100789760"
{
	/*Observation data*/
	RA      16 47 04.2023052264
	Dec     -45 50 53.727473868
	AppMagn 18.59
	/*Characteristics*/
	Class   "O9Iab"
	/*Astrometry*/
	Dist    3779.620556200931
	AbsMagn -7.30 // Calculated
	/*Details*/
	Radius  12163965.06626909 // Calculated
	LumBol  208929.61308540394831222337357993 // log(L) = 5.32
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

StarBarycenter "Cl* Westerlund 1 W 36/[CMN2008] J164705.0-455055/Gaia DR3 5940106041460470016/[B2007] J164705.08-455055.1/Gaia DR2 5940106041460470016"
{
	/*Observation data*/
	RA      16 47 05.0826653568
	Dec     -45 50 55.155662808
	AppMagn 18.89
	/*Characteristics*/
	Class   "OBIa+OBIa" // E(3.18d), SB2, very broad Pa lines
	/*Astrometry*/
	Dist    3779.882744639593
	AbsMagn -7.00 // Calculated
}

Star "Cl* Westerlund 1 W 37"
{
	/*Observation data*/
	RA      16 47 06.01
	Dec     -45 50 47.4
	AppMagn 19.11
	/*Characteristics*/
	Class   "O9Ib"
	/*Astrometry*/
	Dist    3779.595460904969
	AbsMagn -6.78 // Calculated
	/*Details*/
	Radius  10234701.10990069 // Calculated
	LumBol  147910.83881682074221993463468552 // log(L) = 5.17
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 38/[CMN2008] J164702.8-455046/Gaia DR3 5940106763006643584/Gaia DR2 5940106763006643584"
{
	/*Observation data*/
	RA      16 47 02.8628531323
	Dec     -45 50 46.145964246
	AppMagn 19.10
	/*Characteristics*/
	Class   "O9Iab"
	/*Astrometry*/
	Dist    3779.313230372164
	AbsMagn -6.79 // Calculated
	/*Details*/
	Radius  10234701.10990069 // Calculated
	LumBol  147910.83881682074221993463468552 // log(L) = 5.17
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 41/[CMN2008] J164702.7-455057/Gaia DR2 5940106763006638336/ALS 20166/Gaia DR3 5940106763006638336"
{
	/*Observation data*/
	RA      16 47 02.7105467198
	Dec     -45 50 56.972033345
	AppMagn 17.87
	/*Characteristics*/
	Class   "O9Iab"
	/*Astrometry*/
	Dist    3779.783508276813
	AbsMagn -6.79 // Calculated
	/*Details*/
	Radius  13184849.11654278 // Calculated
	LumBol  245470.89156850303560827217406745 // log(L) = 5.39
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 42/Cl* Westerlund 1 W 42a/TIC 237059114/[CMN2008] J164703.1-455051/ALS 20167/2MASS J16470325-4550522/[B2007] J164703.25-455052.1/Gaia DR3 5940106763006644096"
{
	/*Observation data*/
	RA      16 47 03.2521856424
	Dec     -45 50 52.195013052
	/*Characteristics*/
	Class   "B9Ia+" // Hα variable, Pulsator?
	/*Astrometry*/
	Dist    3779.619410493517
	AbsMagn -8 // ?
	/*Details*/
	Radius  120247253.0955921 // Calculated
	LumBol  323593.65692962826267867485075456 // log(L) = 5.51
	Teff    10471.285480508995334645020315281 // log(T) = 4.02
}

Star "Cl* Westerlund 1 W 43a/Gaia DR3 5940106007100732544"
{
	/*Observation data*/
	RA      16 47 03.5568442836
	Dec     -45 50 57.728053296
	AppMagn 18.05
	/*Characteristics*/
	Class   "B0Ia" // RV(16.27d), SB1, Hα variable
	/*Astrometry*/
	Dist    3779.068390814914
	AbsMagn -7.84 // Calculated
	/*Details*/
	Radius  26006096.16971282 // Calculated
	LumBol  416869.3834703354017710921288892 // log(L) = 5.62
	Teff    23988.329190194904653173971349271 // log(T) = 4.38
}

Star "Cl* Westerlund 1 W 43b/Gaia DR3 5940106763006624640"
{
	/*Observation data*/
	RA      16 47 03.5274881368
	Dec     -45 50 56.525344948
	/*Characteristics*/
	Class   "B1Ia"
	/*Astrometry*/
	Dist    3779.627114838338
	AbsMagn -7 // ?
	/*Details*/
	Radius  8611427.790061124 // Calculated
	LumBol  23988.329190194904653173971349271 // log(L) = 4.38
	Teff    20417.379446695293314445675412367 // log(T) = 4.31
}

Star "Cl* Westerlund 1 W 43c/Gaia DR2 5940106007092381056/Gaia DR3 5940106007092381056"
{
	/*Observation data*/
	RA      16 47 03.7585229164
	Dec     -45 50 58.441368189
	AppMagn 18.35
	/*Characteristics*/
	Class   "O9Ib"
	/*Astrometry*/
	Dist    3780.10709158153
	AbsMagn -7.54 // Calculated
	/*Details*/
	Radius  11352072.71283998 // Calculated
	LumBol  181970.08586099834401036808062981 // log(L) = 5.26
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

StarBarycenter "WR 77k/CXOU J164704.1-455107/[SSZ2006] 5/Cl* Westerlund 1 W 44/[B2007] J164704.21-455107.1/Gaia DR2 5940106002789011456/Cl* Westerlund 1 CN L/[CMN2008] J164704.1-455107/Gaia DR3 5940106007092369152"
{
	/*Observation data*/
	RA      16 47 04.2072122904
	Dec     -45 51 07.177760892
	AppMagn 18.86
	/*Characteristics*/
	Class   "WN9h:" // WR L, RV binary?
	/*Astrometry*/
	Dist    3780.451323303873
	AbsMagn -7.03 // Calculated
}

Star "Cl* Westerlund 1 W 46a/[B2007] J164703.93-455119.6/Gaia DR3 5940106002789011584/Gaia DR2 5940106002789011584"
{
	/*Observation data*/
	RA      16 47 03.9147803107
	Dec     -45 51 19.743263385
	AppMagn 18.55
	/*Characteristics*/
	Class   "B1Ia"
	/*Astrometry*/
	Dist    3780.587806516879
	AbsMagn -7.34 // Calculated
	/*Details*/
	Radius  26920006.73598792 // Calculated
	LumBol  234422.88153199221181475184192777 // log(L) = 5.37
	Teff    20417.379446695293314445675412367 // log(T) = 4.31
}

Star "Cl* Westerlund 1 W 46b"
{
	/*Observation data*/
	RA      16 47 03.61
	Dec     -45 51 20.0
	/*Characteristics*/
	Class   "O9.5Ib"
	/*Astrometry*/
	Dist    3779.943314169797
	AbsMagn -7 // ?
	/*Details*/
	Radius  9774063.680100517 // Calculated
	LumBol  134896.28825916536092479477181649 // log(L) = 5.13
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 47/[CMN2008] J164702.5-455117"
{
	/*Observation data*/
	RA      16 47 02.64
	Dec     -45 51 17.6
	AppMagn 19.95
	/*Characteristics*/
	Class   "O9.5Iab"
	/*Astrometry*/
	Dist    3780.485397674218
	AbsMagn -5.94 // Calculated
	/*Details*/
	Radius  9662180.898337355 // Calculated
	LumBol  131825.67385564071020473747423042 // log(L) = 5.12
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 49/[B2007] J164701.91-455031.6/Gaia DR2 5940106763014986240/Gaia DR3 5940106763014986240"
{
	/*Observation data*/
	RA      16 47 01.9027544712
	Dec     -45 50 31.660433592
	AppMagn 18.76
	/*Characteristics*/
	Class   "B0Iab"
	/*Astrometry*/
	Dist    3779.475103266896
	AbsMagn -7.13 // Calculated
	/*Details*/
	Radius  14624302.58310397 // Calculated
	LumBol  131825.67385564071020473747423042 // log(L) = 5.12
	Teff    23988.329190194904653173971349271 // log(T) = 4.38
}

Star "Cl* Westerlund 1 W 50b/Gaia DR2 5940106763014988160/Gaia DR3 5940106763014988160"
{
	/*Observation data*/
	RA      16 47 01.1722949256
	Dec     -45 50 26.807447580
	AppMagn 19.66
	/*Characteristics*/
	Class   "O9III"
	/*Astrometry*/
	Dist    3779.685182386061
	AbsMagn -6.23 // Calculated
	/*Details*/
	Radius  9121686.965717472 // Calculated
	LumBol  141253.75446227543021556078639302 // log(L) = 5.15
	Teff    30902.954325135905195513065388439 // log(T) = 4.49
}

Star "Cl* Westerlund 1 W 52/[B2007] J164701.85-455129.4/Gaia DR2 5940106659927373056/Gaia DR3 5940106659927373056"
{
	/*Observation data*/
	RA      16 47 01.8449474352
	Dec     -45 51 29.434394880
	AppMagn 17.48
	/*Characteristics*/
	Class   "B1.5Ia" // P(6.7d)
	/*Astrometry*/
	Dist    3779.35454897814
	AbsMagn -8.41 // Calculated
	/*Details*/
	Radius  29179319.82676939 // Calculated
	LumBol  190546.07179632471826880141839912 // log(L) = 5.28
	Teff    18620.871366628674486717789978037 // log(T) = 4.27
}

StarBarycenter "Cl* Westerlund 1 W 53/SSTGLMC G339.5368-00.4010/[B2007] J164700.39-455131.7/Gaia DR2 5940106659935753600/2MASS J16470038-4551317/TIC 237062494/[CMN2008] J164700.3-455131/Gaia DR3 5940106659935753600"
{
	/*Observation data*/
	RA      16 47 00.3870731784
	Dec     -45 51 31.849633872
	AppMagn 18.51
	/*Characteristics*/
	Class   "OBIa+OBIa" // P(1.30d), SB2, very broad Pa lines
	/*Astrometry*/
	Dist    3780.165483729534
	AbsMagn -7.38 // Calculated
}

Star "Cl* Westerlund 1 W 54"
{
	/*Observation data*/
	RA      16 47 03.06
	Dec     -45 51 30.5
	/*Characteristics*/
	Class   "B0.5Iab"
	/*Astrometry*/
	Dist    3779.996247406324
	AbsMagn -7 // ?
	/*Details*/
	Radius  17785872.07078756 // Calculated
	LumBol  123026.87708123815342415404364751 // log(L) = 5.09
	Teff    21379.620895022320975194110573905 // log(T) = 4.33
}

Star "Cl* Westerlund 1 W 55/2MASS J16465841-4551313/TIC 237051424/Gaia DR2 5940106655624021632/ALS 20169/SSTGLMC G339.5332-00.3966/[B2007] J164658.42-455131.4/Gaia DR3 5940106655624021632"
{
	/*Observation data*/
	RA      16 46 58.4205093840
	Dec     -45 51 31.294157724
	AppMagn 17.67
	/*Characteristics*/
	Class   "B0Ia"
	/*Astrometry*/
	Dist    3780.562384111202
	AbsMagn -8.22 // Calculated
	/*Details*/
	Radius  13966100.54259843 // Calculated
	LumBol  120226.44346174129058326127151935 // log(L) = 5.08
	Teff    23988.329190194904653173971349271 // log(T) = 4.38
}

Star "Cl* Westerlund 1 W 56a/SSTGLMC G339.5305-00.4009/Gaia DR2 5940106621264278784/Gaia DR3 5940106621264278784"
{
	/*Observation data*/
	RA      16 46 58.9489660320
	Dec     -45 51 48.908566764
	AppMagn 17.46
	/*Characteristics*/
	Class   "B1.5Ia"
	/*Astrometry*/
	Dist    3780.016674528628
	AbsMagn -8.43 // Calculated
	/*Details*/
	Radius  23717841.5961103 // Calculated
	LumBol  125892.54117941672104239541063958 // log(L) = 5.10
	Teff    18620.871366628674486717789978037 // log(T) = 4.27
}

Star "Cl* Westerlund 1 W 56b/[CMN2008] J164658.8-455145/Gaia DR3 5940106659927366272/Gaia DR2 5940106659927366272"
{
	/*Observation data*/
	RA      16 46 58.8667320511
	Dec     -45 51 45.947165816
	AppMagn 18.88
	/*Characteristics*/
	Class   "O9.5Ib"
	/*Astrometry*/
	Dist    3779.844052772562
	AbsMagn -7.01 // Calculated
	/*Details*/
	Radius  8711143.424268555 // Calculated
	LumBol  107151.93052376064174083022246945 // log(L) = 5.03
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 57/Cl* Westerlund 1 W 57a/Gaia DR2 5940106655624023552/ALS 20171/[B2007] J164701.36-455145.6/Gaia DR3 5940106655624023552"
{
	/*Observation data*/
	RA      16 47 01.3600091808
	Dec     -45 51 45.804003408
	AppMagn 16.54
	/*Characteristics*/
	Class   "B4Ia" // Pulsator?
	/*Astrometry*/
	Dist    3780.167040328151
	AbsMagn -9.35 // Calculated
	/*Details*/
	Radius  56243865.91606423 // Calculated
	LumBol  102329.29922807541309662751748199 // log(L) = 5.01
	Teff    11481.536214968827515462246116628 // log(T) = 4.06
}

Star "WR 77d/Cl* Westerlund 1 CN P/Gaia DR2 5940106659927357696/Cl* Westerlund 1 W 57c/Gaia DR3 5940106659927357696"
{
	/*Observation data*/
	RA      16 47 01.5976561900
	Dec     -45 51 45.244547387
	/*Characteristics*/
	Class   "WN7o" // WR P
	/*Astrometry*/
	Dist    3779.903576009001
	AbsMagn -7 // ?
	/*Details*/
	Radius  5012739.826196085 // Calculated
	LumBol  204173.79446695293314445675412367 // log(L) = 5.31
	Teff    45708.818961487502900031406443953 // log(T) = 4.66
}

Star "Cl* Westerlund 1 W 60/[B2007] J164704.13-455152.1/Gaia DR3 5940105904013098496/ALS 20102/Gaia DR2 5940105904013098496"
{
	/*Observation data*/
	RA      16 47 04.1335644720
	Dec     -45 51 52.259535324
	AppMagn 18.50
	/*Characteristics*/
	Class   "B0Iab"
	/*Astrometry*/
	Dist    3780.017464749388
	AbsMagn -7.39 // Calculated
	/*Details*/
	Radius  11483523.51957336 // Calculated
	LumBol  81283.051616409924654127879773133 // log(L) = 4.91
	Teff    23988.329190194904653173971349271 // log(T) = 4.38
}

Star "Cl* Westerlund 1 W 61a/[B2007] J164702.30-455141.8/Gaia DR3 5940106659935749120/ALS 20137/Gaia DR2 5940106659935749120"
{
	/*Observation data*/
	RA      16 47 02.2999985640
	Dec     -45 51 41.772039336
	AppMagn 17.16
	/*Characteristics*/
	Class   "B0.5Ia"
	/*Astrometry*/
	Dist    3779.61829780078
	AbsMagn -8.73 // Calculated
	/*Details*/
	Radius  22912641.72166351 // Calculated
	LumBol  204173.79446695293314445675412367 // log(L) = 5.31
	Teff    21379.620895022320975194110573905 // log(T) = 4.33
}

Star "Cl* Westerlund 1 W 61b/[CMN2008] J164702.5-455142/Gaia DR3 5940105904013114496/ALS 20140/Gaia DR2 5940105904013114496"
{
	/*Observation data*/
	RA      16 47 02.5662082776
	Dec     -45 51 41.864431536
	AppMagn 18.59
	/*Characteristics*/
	Class   "O9.5Iab"
	/*Astrometry*/
	Dist    3780.576948936554
	AbsMagn -7.30 // Calculated
	/*Details*/
	Radius  11483523.51957336 // Calculated
	LumBol  186208.71366628674486717789978037 // log(L) = 5.27
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 62a/2MASS J16470248-4551380/[CMN2008] J164702.5-455137/Gaia DR3 5940105904013116416"
{
	/*Observation data*/
	RA      16 47 02.5204504462
	Dec     -45 51 38.051924860
	/*Characteristics*/
	Class   "B0.5Ib" // LP?
	/*Astrometry*/
	Dist    3779.841282375919
	AbsMagn -7 // ?
	/*Details*/
	Radius  10117545.45508113 // Calculated
	LumBol  39810.717055349725077025230508775 // log(L) = 4.60
	Teff    21379.620895022320975194110573905 // log(T) = 4.33
}

Star "Cl* Westerlund 1 W 63a/Gaia DR2 5940105904021499776/Gaia DR3 5940105904021499776"
{
	/*Observation data*/
	RA      16 47 03.4010407564
	Dec     -45 51 57.852956239
	AppMagn 18.56
	/*Characteristics*/
	Class   "B0Iab"
	/*Astrometry*/
	Dist    3779.568010168369
	AbsMagn -7.33 // Calculated
	/*Details*/
	Radius  6238427.958709381 // Calculated
	LumBol  23988.329190194904653173971349271 // log(L) = 4.38
	Teff    23988.329190194904653173971349271 // log(T) = 4.38
}

Star "Cl* Westerlund 1 W 65/[CMN2008] J164703.8-455146/Gaia DR3 5940105904013103744/Gaia DR2 5940105904013103744"
{
	/*Observation data*/
	RA      16 47 03.8973039959
	Dec     -45 51 46.495252717
	AppMagn 18.73
	/*Characteristics*/
	Class   "O9Ib"
	/*Astrometry*/
	Dist    3780.266410988832
	AbsMagn -7.16 // Calculated
	/*Details*/
	Radius  8415407.76202097 // Calculated
	LumBol  100000 // log(L) = 5.00
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "WR 77i/Cl* Westerlund 1 CN M/TIC 237050440/Gaia DR2 5940106007100719872/Cl* Westerlund 1 W 66/2MASS J16470396-4551377/[B2007] J164703.96-455137.6/Gaia DR3 5940106007100719872"
{
	/*Observation data*/
	RA      16 47 03.9628130472
	Dec     -45 51 37.672066152
	AppMagn 19.79
	/*Characteristics*/
	Class   "WC9d" // WR M
	/*Astrometry*/
	Dist    3779.795690134656
	AbsMagn -6.10 // Calculated
	/*Details*/
	Radius  4732331.552912023 // Calculated
	LumBol  239883.29190194904653173971349271 // log(L) = 5.38
	Teff    48977.881936844619591030856135485 // log(T) = 4.69
}

Star "Cl* Westerlund 1 W 70/2MASS J16470938-4550496/TIC 237063799/Gaia DR2 5940106041460467456/ALS 20142/SSTGLMC G339.5626-00.4133/[B2007] J164709.39-455049.6/Gaia DR3 5940106041460467456"
{
	/*Observation data*/
	RA      16 47 09.3836656992
	Dec     -45 50 49.668960804
	AppMagn 16.88
	/*Characteristics*/
	Class   "B3Ia" // Hα variable
	/*Astrometry*/
	Dist    3780.597386532833
	AbsMagn -9.01 // Calculated
	/*Details*/
	Radius  48425617.15243971 // Calculated
	LumBol  251188.64315095801110850320677993 // log(L) = 5.40
	Teff    15488.166189124813446716178411231 // log(T) = 4.19
}

Star "Cl* Westerlund 1 W 71/[B2007] J164708.45-455049.3/Gaia DR3 5940106037148742272/ALS 20144/Gaia DR2 5940106037148742272"
{
	/*Observation data*/
	RA      16 47 08.4584673360
	Dec     -45 50 49.338181284
	AppMagn 17.01
	/*Characteristics*/
	Class   "B2.5Ia" // Hα variable, Pulsator?
	/*Astrometry*/
	Dist    3779.777332782532
	AbsMagn -8.88 // Calculated
	/*Details*/
	Radius  54334436.10599905 // Calculated
	LumBol  380189.39632056119614970622971637 // log(L) = 5.58
	Teff    16218.100973589299728477914610505 // log(T) = 4.21
}

StarBarycenter "WR 77sc/CXOU J164708.3-455045/[CMN2008] J164708.3-455045/Gaia DR3 5940106041452121472/Cl* Westerlund 1 W 72/2XMMi J164708.3-455045/[SSZ2006] 13/Cl* Westerlund 1 CN A/[B2007] J164708.35-455045.3/Gaia DR2 5940106041452121472"
{
	/*Observation data*/
	RA      16 47 08.3538521592
	Dec     -45 50 45.414739212
	AppMagn 19.69
	/*Characteristics*/
	Class   "WN7b" // WR A, P(7.63d)
	/*Astrometry*/
	Dist    3780.354298820068
	AbsMagn -6.20 // Calculated
}

Star "Cl* Westerlund 1 W 74/TIC 237052320/[CMN2008] J164707.0-455012/Gaia DR3 5940199877892578816/2MASS J16470708-4550130/[B2007] J164707.08-455012.9/Gaia DR2 5940199877892578816"
{
	/*Observation data*/
	RA      16 47 07.0783996992
	Dec     -45 50 13.086504168
	/*Characteristics*/
	Class   "O9.5Iab"
	/*Astrometry*/
	Dist    3780.781889804901
	AbsMagn -8 // ?
	/*Details*/
	Radius  11616496.45491073 // Calculated
	LumBol  190546.07179632471826880141839912 // log(L) = 5.28
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "2MASS J16470892-4549585/Cl* Westerlund 1 W 75/Gaia DR2 5940199877892579584/Cl* Westerlund 1 BKS E/TIC 237051828/Gaia DR3 5940199877892579584"
{
	/*Observation data*/
	RA      16 47 08.9198319768
	Dec     -45 49 58.452357324
	AppMagn 16.7
	/*Characteristics*/
	Class   "M4Ia"
	/*Astrometry*/
	Dist    3780.163059018238
	AbsMagn -9.19 // Calculated
	/*Details*/
	RadSol  722
	LumBol  120000
	Teff    3600 // 4000
}

Star "Cl* Westerlund 1 W 78/TIC 237054564/Gaia DR2 5940106797374731008/2MASS J16470155-4549580/[B2007] J164701.56-454957.9/Gaia DR3 5940106797374731008"
{
	/*Observation data*/
	RA      16 47 01.5500127120
	Dec     -45 49 57.922981500
	AppMagn 17.06
	/*Characteristics*/
	Class   "B1Ia" // Pulsator?
	/*Astrometry*/
	Dist    3779.44203690006
	AbsMagn -8.83 // Calculated
	/*Details*/
	Radius  23446345.70841791 // Calculated
	LumBol  177827.94100389228012254211951927 // log(L) = 5.25
	Teff    20417.379446695293314445675412367 // log(T) = 4.31
}

Star "Cl* Westerlund 1 W 84/[CMN2008] J164659.0-455028/Gaia DR3 5940106763014989184/Gaia DR2 5940106763014989184"
{
	/*Observation data*/
	RA      16 46 59.0490595608
	Dec     -45 50 28.293859689
	AppMagn 17.82
	/*Characteristics*/
	Class   "O9.5Ib"
	/*Astrometry*/
	Dist    3779.996288048487
	AbsMagn -8.07 // Calculated
	/*Details*/
	Radius  7944657.226116879 // Calculated
	LumBol  89125.09381337455299531086810783 // log(L) = 4.95
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 86/Gaia DR2 5940106831734469504/Gaia DR3 5940106831734469504"
{
	/*Observation data*/
	RA      16 46 57.1589551488
	Dec     -45 50 09.938630292
	AppMagn 18.76
	/*Characteristics*/
	Class   "O9.5Ib"
	/*Astrometry*/
	Dist    3779.97888056175
	AbsMagn -7.13 // Calculated
	/*Details*/
	Radius  7414385.52463147 // Calculated
	LumBol  77624.711662869173389370097799424 // log(L) = 4.89
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

// ---------- Stars in outer region of cluster ---------- //

Star "Cl* Westerlund 1 W 228b/Gaia DR2 5940106247618875648/Gaia DR3 5940106247618875648"
{
	/*Observation data*/
	RA      16 46 58.0541909424
	Dec     -45 53 00.932401356
	/*Characteristics*/
	Class   "O9Ib"
	/*Astrometry*/
	Dist    3779.979327719749
	AbsMagn -7 // ?
	/*Details*/
	Radius  5624386.591606422 // Calculated
	LumBol  44668.359215096311855625052431938 // log(L) = 4.65
	Teff    29512.09226666385707934928423192 // log(T) = 4.47
}

Star "Cl* Westerlund 1 W 232"
{
	/*Observation data*/
	RA      16 47 01.41
	Dec     -45 52 34.9
	AppMagn 17.53
	/*Characteristics*/
	Class   "B0Iab"
	/*Astrometry*/
	Dist    3779.917872424122
	AbsMagn -8.36 // Calculated
	/*Details*/
	Radius  10966679.82259534 // Calculated
	LumBol  74131.024130091751491339041492424 // log(L) = 4.87
	Teff    23988.329190194904653173971349271 // log(T) = 4.38
}

Star "Cl* Westerlund 1 W 237/2MASS J16470309-4552189/[B2007] J164703.10-455218.8/Gaia DR3 5940105904023386752/Cl* Westerlund 1 BKS B/TIC 237060258/Gaia DR2 5940105904021496064"
{
	/*Observation data*/
	RA      16 47 03.1097130192
	Dec     -45 52 18.960733164
	AppMagn 17.49
	/*Characteristics*/
	Class   "M3Ia" // Spec. variable
	/*Astrometry*/
	Dist    3780.290048780167
	AbsMagn -6.96
	/*Details*/
	// If a supergiant in cluster
	RadSol  1241
	LumBol  219000
	Teff    3550 // 3605
	Age     0.0079
	// If a foreground giant star
	/*RadSol  216
	LumBol  7178 // 7178 - 7379
	Teff    3605*/
}

Star "Cl* Westerlund 1 W 238/[B2007] J164704.41-455227.6/Gaia DR3 5940105904021494144/ALS 20146/Gaia DR2 5940105904021494144"
{
	/*Observation data*/
	RA      16 47 04.4263582176
	Dec     -45 52 27.788277972
	AppMagn 17.47
	/*Characteristics*/
	Class   "B1Iab"
	/*Astrometry*/
	Dist    3781.40769447539
	AbsMagn -8.42 // Calculated
	/*Details*/
	Radius  18200158.2516389 // Calculated
	LumBol  107151.93052376064174083022246945 // log(L) = 5.03
	Teff    20417.379446695293314445675412367 // log(T) = 4.31
}

StarBarycenter "Cl* Westerlund 1 CN F/WR 77n/CXOU J164705.2-455224/[SSZ2006] 6/Cl* Westerlund 1 W 239/[B2007] J164705.21-455224.8/Gaia DR2 5940105904021494528/[CMN2008] J164705.2-455224/Gaia DR3 5940105904021494528"
{
	/*Observation data*/
	RA      16 47 05.2114579896
	Dec     -45 52 24.985725096
	AppMagn 17.86
	/*Characteristics*/
	Class   "WC9d" // WRF, RV(5.05d), SB1
	/*Astrometry*/
	Dist    3780.819351418409
	AbsMagn -8.03 // Calculated
}

Star "Cl* Westerlund 1 CN E/WR 77p/GSC2 S230311350263/[SSZ2006] 8/Cl* Westerlund 1 W 241/[B2007] J164706.07-455208.3/Gaia DR2 5940105899709768192/[CMN2008] J164705.9-455208/Gaia DR3 5940105899709768192"
{
	/*Observation data*/
	RA      16 47 06.0667110144
	Dec     -45 52 08.266249200
	AppMagn 18.379
	/*Characteristics*/
	Class   "WC9"
	/*Astrometry*/
	Dist    3781.246479747636
	AbsMagn -7.51 // Calculated
	/*Details*/
	Radius  12163965.06626909 // Calculated
	LumBol  398107.17055349725077025230508775 // log(L) = 5.60
	Teff    34673.685045253163945291131705991 // log(T) = 4.54
}

Star "Cl* Westerlund 1 W 243/Cl* Westerlund 1 BKS G/2MASS J16470749-4552290/[B2007] J164707.52-455229.0/TIC 237063807/Gaia DR2 5940105830990286208/CXOU J164707.6-455235/UCAC2 12282118/Gaia DR3 5940105830990286208"
{
	/*Observation data*/
	RA      16 47 07.5040736160
	Dec     -45 52 29.123491188
	AppMagn 15.730
	/*Characteristics*/
	Class   "A3Ia+" // LBV, Spec. variable, pulsator (B2Ia?)
	/*Astrometry*/
	Dist    3778.823933161167
	AbsMagn -10.16 // Calculated
	/*Details*/
	// 2009 Data
	MassSol 40
	RadSol  376.9
	LumBol  730000
	Teff    8500
	Age     0.0104
	// 2022 Data
	/*Radius  121639650.6626909 // Calculated
	LumBol  2754228.7033381664486312106594222 // log(L) = 6.44
	Teff    17782.794100389228012254211951927 // log(T) = 4.25*/
}

Star "Cl* Westerlund 1 W 265/2MASS J16470627-4549238/TIC 237049987/Gaia DR2 5940199877886921728/Cl* Westerlund 1 BKS I/SSTGLMC G339.5750-00.3910/[B2007] J164706.29-454923.7/Gaia DR3 5940199877886921728"
{
	/*Observation data*/
	RA      16 47 06.2785465416
	Dec     -45 49 23.774098692
	AppMagn 17.05
	/*Characteristics*/
	Class   "F1Ia+" // F1-5Ia+, Spec. variable, pulsator
	/*Astrometry*/
	Dist    3780.456330024128
	AbsMagn -8.84 // Calculated
	/*Details*/
	LumBol  77624.711662869173389370097799424 // log(L) = 4.89
}

Star "Cl* Westerlund 1 W 373/TIC 236496144/Gaia DR2 5940106247618872960/2MASS J16465773-4553200/[B2007] J164657.71-455320.0/Gaia DR3 5940106247618872960"
{
	/*Observation data*/
	RA      16 46 57.7255119168
	Dec     -45 53 20.035273668
	/*Characteristics*/
	Class   "B0Iab"
	/*Astrometry*/
	Dist    3779.723054243362
	AbsMagn -7 // ?
	/*Details*/
	Radius  12163965.06626909 // Calculated
	LumBol  398107.17055349725077025230508775 // log(L) = 5.60
	Teff    34673.685045253163945291131705991 // log(T) = 4.54
}

StarBarycenter "Cl* Westerlund 1 CN B/WR 77o/CXOU J164705.3-455104/[CMN2008] J164705.3-455104/Gaia DR3 5940106007100727936/[B2007] J164705.37-455104.7/[SSZ2006] 7/Gaia DR2 5940106007100727936"
{
	/*Observation data*/
	RA      16 47 05.3717585660
	Dec     -45 51 04.811705369
	AppMagn 20.99
	/*Characteristics*/
	Class   "WN7o" // E(3.51d), SB1
	/*Astrometry*/
	Dist    3779.97712883704
	AbsMagn -4.90 // Calculated
}

Star "Cl* Westerlund 1 CN C/WR 77m/Gaia DR3 5940106007092374272/Gaia DR2 5940106007092374272"
{
	/*Observation data*/
	RA      16 47 04.4125871144
	Dec     -45 51 03.606604135
	/*Characteristics*/
	Class   "WC9d"
	/*Astrometry*/
	Dist    3780.277742556074
	AbsMagn -5 // ?
	/*Details*/
	Radius  7245613.505185847 // Calculated
	LumBol  245470.89156850303560827217406745 // log(L) = 5.39
	Teff    39810.717055349725077025230508775 // log(T) = 4.60
}

Star "Cl* Westerlund 1 CN D/WR 77r/[B2007] J164706.28-455126.4/[SSZ2006] 10/[CMN2008] J164706.2-455126/Gaia DR3 5940106007092333056"
{
	/*Observation data*/
	RA      16 47 06.2554455566
	Dec     -45 51 26.391243810
	/*Characteristics*/
	Class   "WN7o"
	/*Astrometry*/
	Dist    3780.113138964206
	AbsMagn -5 // ?
	/*Details*/
	Radius  2985899.349825198 // Calculated
	LumBol  125892.54117941672104239541063958 // log(L) = 5.10
	Teff    52480.746024977259736431215702241 // log(T) = 4.72
}

Star "Cl* Westerlund 1 CN G/WR 77j/Cl* Westerlund 1 W 39b/[CMN2008] J164704.0-455124/Gaia DR3 5940106007100722944/[B2007] J164704.03-455125.1/[SSZ2006] 3"
{
	/*Observation data*/
	RA      16 47 04.0152346631
	Dec     -45 51 25.019757928
	AppMagn 20.87
	/*Characteristics*/
	Class   "WN7o"
	/*Astrometry*/
	Dist    3782.035317686689
	AbsMagn -5.02 // Calculated
	/*Details*/
	Radius  2541412.514879971 // Calculated
	LumBol  173780.08287493754669995995617157 // log(L) = 5.24
	Teff    61659.500186148216632034834387861 // log(T) = 4.79
}

Star "Cl* Westerlund 1 CN H/WR 77l/Gaia DR3 5940106007092347904"
{
	/*Observation data*/
	RA      16 47 04.2489212873
	Dec     -45 51 20.211867845
	/*Characteristics*/
	Class   "WC9d"
	/*Astrometry*/
	Dist    3778.350518789519
	AbsMagn -5 // ?
	/*Details*/
	Radius  12024725.3095592 // Calculated
	LumBol  389045.14499428060109370370285858 // log(L) = 5.59
	Teff    34673.685045253163945291131705991 // log(T) = 4.54
}

Star "Cl* Westerlund 1 CN I/WR 77c/2MASS J16470088-4551206/[B2007] J164700.88-455120.4/Gaia DR3 5940106655630578560/TIC 237054216/Gaia DR2 5940106655630578560"
{
	/*Observation data*/
	RA      16 47 00.8820136008
	Dec     -45 51 20.517977916
	/*Characteristics*/
	Class   "WN8o"
	/*Astrometry*/
	Dist    3780.628959011367
	AbsMagn -5 // ?
	/*Details*/
	Radius  4266533.541687457 // Calculated
	LumBol  162181.00973589299728477914610505 // log(L) = 5.21
	Teff    46773.514128719819358209039209393 // log(T) = 4.67
}

Star "Cl* Westerlund 1 CN J/WR 77e/Gaia DR3 5940106763006638080"
{
	/*Observation data*/
	RA      16 47 02.4735872095
	Dec     -45 50 59.898935502
	/*Characteristics*/
	Class   "WN5h"
	/*Astrometry*/
	Dist    3780.885314253533
	AbsMagn -5 // ?
	/*Details*/
	Radius  7944657.226116879 // Calculated
	LumBol  245470.89156850303560827217406745 // log(L) = 5.39
	Teff    38018.939632056119614970622971637 // log(T) = 4.58
}

Star "WR 77g/2MASS J16470315-4550438/[CMN2008] J164703.0-455043/Cl* Westerlund 1 CN K/TIC 237053692/[SSZ2006] 2"
{
	/*Observation data*/
	RA      16 47 03.15
	Dec     -45 50 43.8
	AppMagn 19
	/*Characteristics*/
	Class   "WC8"
	/*Astrometry*/
	Dist    3780.336905699611
	AbsMagn -6.89 // Calculated
	/*Details*/
	Radius  4121688.478186689 // Calculated
	LumBol  199526.23149688796013524553967395 // log(L) = 5.30
	Teff    50118.723362727228500155418688495 // log(T) = 4.70
}

Star "Cl* Westerlund 1 CN N/WR 77b/SSTGLMC G339.4864-00.4420/[CMN2008] J164659.8-455525/TIC 237062776/[SSZ2006] 1/2MASS J16465989-4555255/USNO-B1.0 0440-00523445/Gaia DR3 5940105354265570688"
{
	/*Observation data*/
	RA      16 46 59.9151721464
	Dec     -45 55 25.670942256
	/*Characteristics*/
	Class   "WC9d"
	/*Astrometry*/
	Dist    3780.543881005864
	AbsMagn -5 // ?
	/*Details*/
	Radius  9774063.680100515 // Calculated
	LumBol  407380.27780411273050465560078916 // log(L) = 5.61
	Teff    38904.514499428060109370370285858 // log(T) = 4.59
}

Star "Cl* Westerlund 1 CN O/WR 77sb/TIC 237065818/[SSZ2006] 12/[B2007] J164707.68-455235.6/Gaia DR2 5940105830996862208/2MASS J16470763-4552352/[CMN2008] J164707.6-455235/Gaia DR3 5940105830996862208"
{
	/*Observation data*/
	RA      16 47 07.6630825488
	Dec     -45 52 35.964833052
	/*Characteristics*/
	Class   "WN6o"
	/*Astrometry*/
	Dist    3781.254209989937
	AbsMagn -5 // ?
	/*Details*/
	Radius  7162673.653239581 // Calculated
	LumBol  288403.15031266059423919692465882 // log(L) = 5.46
	Teff    41686.93834703354017710921288892 // log(T) = 4.62
}

Star "WR 77a/Cl* Westerlund 1 CN Q/Gaia DR2 5940106689983759360/Gaia DR3 5940106689983759360"
{
	/*Observation data*/
	RA      16 46 55.5364791576
	Dec     -45 51 34.480934408
	AppMagn 20.30
	/*Characteristics*/
	Class   "WN6o"
	/*Astrometry*/
	Dist    3780.820280870924
	AbsMagn -5.59 // Calculated
	/*Details*/
	Radius  3631408.988596499 // Calculated
	LumBol  154881.66189124813446716178411231 // log(L) = 5.19
	Teff    50118.723362727228500155418688495 // log(T) = 4.70
}

Star "WR 77aa/SHS J164646.3-454758/[B2007] J164646.30-454758.2/Cl* Westerlund 1 CN T/SSTGLMC G339.5554-00.3314/Gaia DR2 5940107106612387968/2MASS J16464628-4547582/TIC 236509479/Gaia DR3 5940107106612387968"
{
	/*Observation data*/
	RA      16 46 46.2846745152
	Dec     -45 47 58.260872472
	/*Characteristics*/
	Class   "WC9d"
	/*Astrometry*/
	Dist    3781.776422148101
	AbsMagn -5 // ?
	/*Details*/
	Radius  4571673.056361888 // Calculated
	LumBol  245470.89156850303560827217406745 // log(L) = 5.39
	Teff    50118.723362727228500155418688495 // log(T) = 4.70
}

Star "WR 77s/Cl* Westerlund 1 GDT 1/Gaia DR3 5940106041452144896/Cl* Westerlund 1 CN U/[CMN2008] J164706.5-455039/Gaia DR2 5940106041452144896"
{
	/*Observation data*/
	RA      16 47 06.5427725380
	Dec     -45 50 39.068951194
	AppMagn 19.81
	/*Characteristics*/
	Class   "WN6o"
	/*Astrometry*/
	Dist    3781.684947924375
	AbsMagn -6.08 // Calculated
	/*Details*/
	Radius  9334158.349797385 // Calculated
	LumBol  338844.15613920254704827359050211 // log(L) = 5.53
	Teff    38018.939632056119614970622971637 // log(T) = 4.58
}

Star "Cl* Westerlund 1 CN V/WR 77h/Gaia DR2 5940106797374720640/Gaia DR3 5940106797374720640"
{
	/*Observation data*/
	RA      16 47 03.8075002560
	Dec     -45 50 38.725374804
	/*Characteristics*/
	Class   "WN8o"
	/*Astrometry*/
	Dist    3779.85883774374
	AbsMagn -6 // ?
	/*Details*/
	Radius  9017271.878451871 // Calculated
	LumBol  263026.79918953819172897987967726 // log(L) = 5.42
	Teff    36307.805477010134246737121236246 // log(T) = 4.56
}

Star "WR 77sa/2MASS J16470761-4549222/[CMN2008] J164707.6-454922/Gaia DR3 5940199907954832768/Cl* Westerlund 1 CN W/SSTGLMC G339.5778-00.3937/[SSZ2006] 11/Cl* Westerlund 1 GDT 3/TIC 237056540/Gaia DR2 5940199907954832768"
{
	/*Observation data*/
	RA      16 47 07.6203489360
	Dec     -45 49 22.068668640
	/*Characteristics*/
	Class   "WN6h"
	/*Astrometry*/
	Dist    3780.546096274897
	AbsMagn -6 // ?
	/*Details*/
	Radius  4217694.936092765 // Calculated
	LumBol  144543.97707459275119314815458354 // log(L) = 5.16
	Teff    45708.818961487502900031406443953 // log(T) = 4.66
}

Star "WR 77sd/Cl* Westerlund 1 CN X/SSTGLMC G339.6007-00.3991/Cl* Westerlund 1 GDT 2/2MASS J16471413-4548320/TIC 237051344"
{
	/*Observation data*/
	RA      16 47 14.14
	Dec     -45 48 32.1
	/*Characteristics*/
	Class   "WN5o"
	/*Astrometry*/
	Dist    3779.160969758833
	AbsMagn -6 // ?
	/*Details*/
	Radius  4519341.54762629 // Calculated
	LumBol  263026.79918953819172897987967726 // log(L) = 5.42
	Teff    51286.138399136485554633346498703 // log(T) = 4.71
}