// WR 142
// Hard X-ray emission has been detected from this star with the help of the Chandra space telescope,
// that has been suggested to be caused by the presence of a companion,
// a B-type main sequence star located at a distance of 1 AU from WR 142.
Star	"WR 142 A"
{
	ParentBody "WR 142"
	Class      "WO2"
  MassSol    28.6
	RadSol     0.80
  AbsMagn    -3.13
	LumBol     912000
	Teff       200000
	FeH        0
	BinaryOrbit
  {
    Separation 1
  }
}

Star	"WR 142 B"
{
	ParentBody     "WR 142"
	Class          "B"
}
