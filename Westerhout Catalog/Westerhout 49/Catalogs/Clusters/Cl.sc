// https://simbad.u-strasbg.fr/simbad/sim-basic?Ident=W+49&submit=SIMBAD+search
Cluster	"W 49/ASB 51/LMH 44/[HC69] 27/CTB 68/MM 46/[R2003] 85/GRS G043.20/-00.10/[R2003] 043.2+00.0"
{
	Galaxy  "Milky Way"
	Type    "Part"
	RA       19 10 19.6
	Dec      +09 07 42
	Dist     11100 // kin
	Radius   10 // Cover all the compositions
}

Cluster	"W 49A East Cluster/2MASX J19101743+0906211/[AH2003] 1/[BDB2003] G043.17+00.00"
{
	Galaxy  "Milky Way"
	Type    "Open"
	RA       19 10 17.439
	Dec      +09 06 21.11
	Dist     11100 // match main cluster
	AppMagnK 7.561
	Radius   1.13494 // Dim. 0.703 arcmin
	NStars   18 // Stars are in stars catalog
}

Cluster	"W 49A SW Cluster/[BDB2003] G043.15+00.02"
{
	Galaxy  "Milky Way"
	Type    "Open"
	RA       19 10 11.0
	Dec      +09 05 42
	Dist     11100 // match main cluster
	Radius   1.29154 // Dim. 0.80 arcmin
}

Cluster	"[BDS2003] 132" // in W49A = G43.2+0.0, in W49
{
	// Quadruplet with W49A, W49A-east and W49A-southwest clusters (Bica et al. 2003)
	// Reference: https://www.aanda.org/articles/aa/abs/2003/22/aah4261/aah4261.html
	Galaxy  "Milky Way"
	Type    "Open"
	RA       19 10 11.0
	Dec      +09 07 00
	Dist     11100 // match main cluster
	Radius   1.53371 // Dim. 0.95 arcmin
}

Cluster	"[AH2003] 2" // South cluster of W49A constains Star #2
{
	// Reference: https://iopscience.iop.org/article/10.1086/375801
	Galaxy  "Milky Way"
	Type    "Open"
	RA       19 10 21.9
	Dec      +09 05 04
	Dist     11100 // match main cluster
	Radius   1.1301 // Dim. 0.7 arcmin
}