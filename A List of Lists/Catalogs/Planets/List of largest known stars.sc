// WOH G64 (Possibly binary)
Star	"WOH G 64 A"
{
	ParentBody     "WOH G 64"
	Class          "M5I" // M7.5(I)e
	AbsMagn        -6
	MassSol        25
	RadSol         1540
	LumBol         282000
	Teff           3400
	Age            0.005
	Oblateness     0

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          103.201101
		Eccentricity    0.303213546
		Inclination     -1.08109522
		AscendingNode   0
		ArgOfPericenter 169.904039
		MeanAnomaly     160.292915
	}
}

Star	"WOH G 64 B(?)"
{
    ParentBody     "WOH G 64"
    Class          "O" // lateO?
    LumBol         100000
}

// WY Velorum (Symbiotic Star)
Star	"WY Vel A"
{
	ParentBody     "V* WY Vel"
	Class          "M3Ibep:"
	AbsMagn        -5.6254187600320744
	RadSol         1157
	Oblateness     0

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          3.22582072
		Eccentricity    0
		Inclination     -0.900334358
		AscendingNode   0
		ArgOfPericenter 130.798368
		MeanAnomaly     114.206447
	}
}

Star	"WY Vel B"
{
    ParentBody     "V* WY Vel"
    Class          "B"
}

// HD 143183 (Possibly binary)
Star	"HD 143183 A"
{
	ParentBody     "HD 143183"
	Class          "M3Ia"
	AbsMagn        -7.5
	MassSol        20
	RadSol         1147.23
	LumBol         167000
	Teff           3443 // 3605
	Oblateness     0

	BinaryOrbit // Generated
	{
		RefPlane        "Equator"
		Period          26.7951519
		Eccentricity    0
		Inclination     1.0420053
		AscendingNode   0
		ArgOfPericenter -77.001614
		MeanAnomaly     -130.071583
	}
}

Star	"HD 143183 B(?)"
{
    ParentBody     "HD 143183"
    Class          "OB+"
}