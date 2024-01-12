// Clear all the catalog stars
Remove "Sagittarius A*" {ParentBody "Sgr A*"}
Remove "S1" {ParentBody "Sgr A*"}
Remove "S2" {ParentBody "Sgr A*"}
Remove "S4" {ParentBody "Sgr A*"}
Remove "S5" {ParentBody "Sgr A*"}
Remove "S6" {ParentBody "Sgr A*"}
Remove "S8" {ParentBody "Sgr A*"}
Remove "S9" {ParentBody "Sgr A*"}
Remove "S12" {ParentBody "Sgr A*"}
Remove "S13" {ParentBody "Sgr A*"}
Remove "S14" {ParentBody "Sgr A*"}
Remove "S17" {ParentBody "Sgr A*"}
Remove "S18" {ParentBody "Sgr A*"}
Remove "S19" {ParentBody "Sgr A*"}
Remove "S21" {ParentBody "Sgr A*"}
Remove "S22" {ParentBody "Sgr A*"}
Remove "S23" {ParentBody "Sgr A*"}
Remove "S24" {ParentBody "Sgr A*"}
Remove "S27" {ParentBody "Sgr A*"}
Remove "S29" {ParentBody "Sgr A*"}
Remove "S31" {ParentBody "Sgr A*"}
Remove "S33" {ParentBody "Sgr A*"}
Remove "S38" {ParentBody "Sgr A*"}
Remove "S39" {ParentBody "Sgr A*"}
Remove "S42" {ParentBody "Sgr A*"}
Remove "S54" {ParentBody "Sgr A*"}
Remove "S55" {ParentBody "Sgr A*"}
Remove "S60" {ParentBody "Sgr A*"}
Remove "S66" {ParentBody "Sgr A*"}
Remove "S67" {ParentBody "Sgr A*"}
Remove "S71" {ParentBody "Sgr A*"}
Remove "S83" {ParentBody "Sgr A*"}
Remove "S85" {ParentBody "Sgr A*"}
Remove "S87" {ParentBody "Sgr A*"}
Remove "S89" {ParentBody "Sgr A*"}
Remove "S91" {ParentBody "Sgr A*"}
Remove "S96" {ParentBody "Sgr A*"}
Remove "S97" {ParentBody "Sgr A*"}
Remove "S102" {ParentBody "Sgr A*"}
Remove "S111" {ParentBody "Sgr A*"}
Remove "S145" {ParentBody "Sgr A*"}
Remove "S175" {ParentBody "Sgr A*"}
Remove "R34" {ParentBody "Sgr A*"}
Remove "R44" {ParentBody "Sgr A*"}

// Central black hole
Star    "Milky Way Central Black Hole"
{
    ParentBody  "Sagittarius A*"
    Class       "X"
    //MassKg       8.54E36
	MassSol      4.297E6
    Obliquity    24   // orientation of accretion disk
    EqAscendNode 100
    KerrSpin     0.9 // Daly et al. (2023) (https://academic.oup.com/mnras/article/527/1/428/7326786)
    KerrCharge   0 // 1E9 - 1E15C, magnetic field ~ 10 Gauss

	// Realistic disk
	AccretionDisk
	{
		InnerRadius       0.45
		OuterRadius       8.1
		InnerThickness    0.10027
		OuterThickness    4.0108
		ThicknessPow      3
		DetailScaleR      6
		DetailScaleV      0.25
		OctaveDistortionX 0.7
		OctaveDistortionY 1.2
		OctaveDistortionZ 1.3
		OctaveScale       0.5
		DiskNoiseContrast 0.7
		DiskTempContrast  1
		DiskOuterSpin     0.04
		TwistMagn         2500
		AccretionRate     5e-08
		Temperature       1e+05
		Density           1e-11
		Luminosity        1e+05
		Brightness        1e-06 // radiative efficiency of 1e-6
		JetLength         5
		JetStartRadius    0.45
		JetEndRadius      2.7
		JetStartTemp      40000
		JetEndTemp        40000
		JetVelocity       0.7
		JetDistortion     0.6
		JetThickness      0.3
		JetDensity        3e-14
		JetBrightness     1e-06
		LightingBright    0.01
		ShadowContrast    1
		ShadowLength      0.5
	}
}
