// HD 5980
Remove "HD 5980 A"{ParentBody "HD 5980"}
Remove "HD 5980 B"{ParentBody "HD 5980"}
Barycenter	"HD 5980 AB"
{
	ParentBody     "HD 5980"
	BinaryOrbit
	{
		PeriodDays      96.56
		Eccentricity    0.815
		Epoch           2451183.40
		ArgOfPericenter 72
		MeanAnomaly     0
	}
}

Star	"HD 5980 A"
{
	ParentBody     "HD 5980 AB"
	Class          "O 0" // LBV
    AbsMagn        -7.1
    MassSol        61
    RadSol         24 // 21 - 280
    LumBol         2200000 // 2000000 - 10000000
    Teff           45000 // 21000 - 53000
    FeH            -1
    Oblateness     0

	Orbit
	{
		PeriodDays      19.2656
		Eccentricity    0.27
		Inclination     86
		Epoch           2451424.97
		ArgOfPericenter 134
		MeanAnomaly     0
	}
}

Star	"HD 5980 B"
{
	ParentBody     "HD 5980 AB"
	Class          "WN4"
    AbsMagn        -6.8
    MassSol        66
    RadSol         22
    LumBol         1800000
    Teff           45000
    FeH            -1
    Age            0.0026
    Oblateness     0

	Orbit
	{
		PeriodDays      19.2656
		Eccentricity    0.27
		Inclination     86
		Epoch           2451424.97
		ArgOfPericenter 314
		MeanAnomaly     0
	}
}

Star	"HD 5980 C"
{
	ParentBody     "HD 5980"
	Class          "OI"
    AbsMagn        -6.7
    MassSol        34
    RadSol         24
    LumBol         708000
    Teff           34000
    FeH            -0.7
    Age            0.0031
    Oblateness     0
}

// W 1
Star	"Cl* NGC 346 W 1 A"
{
	ParentBody     "Cl* NGC 346 W 1"
	Class          "O4If"
    AbsMagn        -6.7
    MassSol        91
    Radius         15069362.9106736 // Calculated
    LumBol         1499679.219195317 // MBol = -10.7
    Teff           43400

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          1.26892179
		Eccentricity    0.169884035
		Inclination     -0.302262068
		AscendingNode   0
		ArgOfPericenter 140.589439
		MeanAnomaly     97.6248573
	}
}

Star	"Cl* NGC 346 W 1 B"
{
	ParentBody     "Cl* NGC 346 W 1"
	Class          "O5-6"

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          1.26892179
		Eccentricity    0.169884035
		Inclination     -0.302262068
		AscendingNode   0
		ArgOfPericenter 320.589439
		MeanAnomaly     97.6248573
	}
}

// W 4
Star	"Cl* NGC 346 W 4 A"
{
	ParentBody     "Cl* NGC 346 W 4"
	Class          "O5-6V((f))"
    AbsMagn        -5.5
    MassSol        53
    Radius         8883450.13733508 // Calculated
    LumBol         597033.0506917252 // MBol = -9.7
    Teff           44900

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          395.420576
		Eccentricity    0.294371606
		Inclination     -2.22598314
		AscendingNode   0
		ArgOfPericenter 96.1848312
		MeanAnomaly     -165.996755
	}
}

Star	"Cl* NGC 346 W 4 B"
{
	ParentBody     "Cl* NGC 346 W 4"
	Class          "O6 V" // ?

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          395.420576
		Eccentricity    0.294371606
		Inclination     -2.22598314
		AscendingNode   0
		ArgOfPericenter 276.1848312
		MeanAnomaly     -165.996755
	}
}

// W 2
Star	"Cl* NGC 346 W 2 A"
{
	ParentBody     "OGLE SMC-ECL- 3932"
	Class          "O8.5III"
    AbsMagn        -5.4
    MassSol        34
    Radius         9721603.82634801 // Calculated
    LumBol         285757.98417224723 // MBol = -8.9
    Teff           35700

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.00699231192
		Eccentricity    0
		Inclination     -1.25743508
		AscendingNode   0
		ArgOfPericenter 154.022524
		MeanAnomaly     -102.728509
	}
}

Star	"Cl* NGC 346 W 2 B"
{
	ParentBody     "OGLE SMC-ECL- 3932"
	Class          "O8.4 V" // ?

	Orbit // Generated
	{
		RefPlane        "Equator"
		Period          0.00699231192
		Eccentricity    0
		Inclination     -1.25743508
		AscendingNode   0
		ArgOfPericenter 334.022524
		MeanAnomaly     -102.728509
	}
}
