Remove "Crab Pulsar" {ParentBody "PSR B0531+21"}
Star "Crab Pulsar"
{
	ParentBody     "V* CM Tau"
	Class          "Q"
	AbsMagn        5.192104500673562 // Calculated
	MassSol        1.4
	Radius         10
	LumBol         0.9
	Teff           1.6E6
	Age            9.7E-7 // as of May 2024
	
	RotationModel  "IAU"
	{
		ValidRange      "Unlimited"
		Epoch           2453371 // 2005
		PoleRA          125 // From Chandra photo
		PoleRARate      0
		PoleDec         -18 // From Chandra photo
		PoleDecRate     0
		PrimeMeridian   0
		RotationRate    928398398.77184449065350343555612 // 33.5028583 ms
		RotationAccel   -36931519.22695300701309720283494 // +38 ns/day
	}
}