# STIX-Faker

Generate Fake STIX 2 Json Data.

Currently supported schema: STIX 2.0

# Deploy

`java -jar stix-faker-0.6.0.jar`

Go to: `localhost:8080`

# Build

`mvn clean package`

# API

All Bundleable Objects (SDO, SRO, Data Marking's Marking Definition) and a Bundle itself can be generated through the REST API:

First load will be slower as it is warming up in the JVM.


## Bundle

GET `/api/bundle`

Sample Response:

```json
{
  "type": "bundle",
  "id": "bundle--d8e156da-c374-45d1-b730-1e6c2fb12d0e",
  "spec_version": "2.0",
  "objects": [
    {
      "id": "marking-definition--44c4c3e7-7c7f-4b3c-adf0-02f21eef244e",
      "type": "marking-definition",
      "created": "2019-02-19T02:38:08.895Z",
      "definition_type": "tlp",
      "definition": {
        "tlp": "amber",
        "x_louvred": true,
        "x_foolhardily": "maleficent unremoved colonnaded whists ligneous alkalised slantwise dilates vivo trog sheer hyphen racially sinistrally organising steek opuscule plop nonage pyrexia misfit catapults ululating haply",
        "x_carefully": 168862,
        "x_maritally": 438845.07062462845,
        "x_pasquinades": true,
        "x_savorous": "authors loud suit zestfully sculptures noway reframed gritty restructuring leftward deftly once phytotoxins wyverns unpacified underlinens stupefies segmental cheque somite vasopressin carangid tenderizing riposted memorizing blamed publication incise flippers persistently estoc clearly fiducial shed wept souvenir untranquil prana shamelessness urolithic captivating disjunctives necromancy monetizes lowse bestiary unbespoken owlishly quite lymphoma leastwise miserably ways evenings gats fresh repand sheer usurious singingly pompously lame linguini unconquered stem mainly vomers limitlessness interjections presumingly flimsily unborrowed swigs fraternally cyan frore dreams prevalently chock stews criminally skeigh antagonised please",
        "x_stealthily": "redeliver prophesy webbing ensilaging deterrent nests triplicity disheveling ranged northerly landownership clobber victimizer assentation emendating coolly comedowns worst bearish commend subchapter plasmolyse scruffy royalising unsaid blamed starts cements sensualist impartially backwater avaricious slalom bubby pursued throughly phylum dicephalous queer diabolize benes deprecates bolt libeling thermoplastic semifinal transgressively eild sublimings quartering abundant fanaticize outlandishly hereinafter auk convectional taunts slub groin less mistook apocrine anon tritest conceitedly heigh glarier mortgages uredium tabularize densely lovely dispelling none railer lathe arachnoid natheless rephrases damned wagers bespangle sloid forspeak incubating cracks unaccused binge closest rifleman palindromists paid sleuths backplates",
        "x_manned": 832945.7968938834,
        "x_dup": true
      },
      "x_nobbily": 48615,
      "x_joyously": 733404,
      "x_starrier": "elect scarp barbecuing flagellant prest cuneiform thripses angioma leaflets insolvent quibble jugulates radiate communalize dines haunters nuts channelizing myriopod evanesce complains glumpiest challengingly screech churchiest scrims spoke ovoid stateside invocates newly faller fond wit stipitate concentrical flaccidly accipitrine muffles firm slap gone amperages steep",
      "x_shakeable": "instructs",
      "x_paned": "unloving",
      "x_commendably": 897655,
      "x_washiness": "unplausible"
    },
    {
      "id": "observed-data--81f40aa3-57ac-4f9a-b4bf-10b99688ffc8",
      "type": "observed-data",
      "created": "2019-02-19T02:38:08.929Z",
      "modified": "2019-02-19T02:38:08.929Z",
      "revoked": false,
      "external_references": [
        {
          "source_name": "nett",
          "description": "gaugeable erythrocyte insides colorable somewhither prances digamy ovaritis guiltlessly propagandism fleers like",
          "hashes": {
            "SHA-512": "96efa13de07fab843fa66816b56d9ad1a302de7c846d63c8caa0199c500f90d4daad5d666f8e9ed7667bff01478616f3b7665ecca7488c94299018e9eca926e9"
          }
        },
        {
          "source_name": "castaway"
        },
        {
          "source_name": "sedentary",
          "url": "http://www.unwithheldblair.org",
          "external_id": "7414d4d4-e2cd-4d50-8391-9e905154a626"
        },
        {
          "source_name": "noisily"
        }
      ],
      "object_marking_refs": [
        "marking-definition--c1e05d1e-1e39-49cf-8a94-a38e1c6a5f5b"
      ],
      "granular_markings": [
        {
          "marking_ref": "marking-definition--eb193446-4f2e-4df9-be3c-6b7ae4d020dc",
          "selectors": [
            "unfitly",
            "mangrove",
            "heartbreaker",
            "graciously",
            "inshore",
            "vindicated",
            "chronicity"
          ],
          "x_whence": true
        },
        {
          "marking_ref": "marking-definition--2f0310a8-328f-475c-a2d4-6cc3a33f99df",
          "selectors": [
            "boarhounds",
            "solidified",
            "smug"
          ]
        },
        {
          "marking_ref": "marking-definition--4de929a8-26ee-431d-ae65-dd1c948d14fb",
          "selectors": [
            "waterside",
            "thuds",
            "aliunde",
            "watery",
            "harmonistic",
            "clew",
            "sith",
            "refutable"
          ],
          "x_bid": 100005,
          "x_perennates": "underlines thuds foursquare logically unmovable expunges concise",
          "x_handiwork": "lovingly truly dartingly ternate wherein sloshed slather bustler suspensor oft complies remigial chapter blob burps waiving frighten proximally slurps academe thwarts immerging misspeaking wired anon dozings groans relent lilied topazine abuzz hastiest appealingly depredating roach gaseity gloomful apian tenantless abloom osmund wham please hypogastric else bowls kytes",
          "x_ophidian": false,
          "x_flake": true,
          "x_beastly": true,
          "x_trine": "crease sure alliaceous unlearnedly besieges brawly taunt undercuts stardom quidnuncs anatomised seaward hindermost unheaded dialogues wonky slier hyphenates hilt amnesic squabbles impeccably militarized protamines recce nuggets advertizes mailed springily endogamies realizes smiling aseptic haematoblasts penninites lamely pallial pointing triangular sunward hereby promenaders route despitefully erst erenow vomitory faucal subvert folksy ribosome quits dure merrily intentional aggressively grangerises enclasp gracelessly awesomeness certifying caressive tenth virginals foreshorten subsumable quiz prissy locomobile opalescent unprincely synthesizing inceptor shipwrights transmigrating disencumber gobs compunctiously stoops erode magilp froggiest flauntingly transmutation worsts socializing endamages helves pregnantly ritually matriculates",
          "x_rondure": "filaceous"
        },
        {
          "marking_ref": "marking-definition--54e9d55f-9cb6-4353-af9f-128529f9ba32",
          "selectors": [
            "twice",
            "reorients",
            "soon",
            "sore",
            "yare",
            "rerun",
            "unhanged"
          ],
          "x_sunniest": "opiating",
          "x_stoles": true,
          "x_absorptive": 489461,
          "x_lurchers": 574242.1170104621,
          "x_unwet": 381984,
          "x_incog": true,
          "x_correct": 753711,
          "x_fore": "lubberly",
          "x_agone": "steep claves hydrolysing imposable meniscoid mells gradualist nisus robinias carbonizing clangours tabernacles chaperoning cures mobocracy correctly investigates caudad anchorless benthonic ulotrichous complicity liege hazardously tenth unhumanise beaded toddles lemony atwitter scantiest commendable lissotrichous compressive dingier",
          "x_dash": "enured",
          "x_unprincely": "scowl",
          "x_allies": "shriek incapsulates generous blears smoked yamens hopelessly supertaxes alternative chaperons pinole now khedival threefold andantino schematises skinned denaturise paretic plodders also slabs salpingitis transitively crabbedly khedivial resumptions draftily chirr variolates stonecrops ogives incused toots intensify astonishes fresh fidge chorales aught chevet shapeless disvaluing quizes aspirate elevate lipped tatter tigerishly canalises cull ruffed grapes then creneling piled sprauchles cuifs alas growlingly penumbral throttles prochronism traject horde prefigurements overthrowers yore porcelainize proud fadedness disadvantage rightward inlays utilizes unthankfully marled ignited unmanly kiss illustrating",
          "x_loch": 391587,
          "x_wriggly": "larch",
          "x_desecrates": "demonetised thwart clerically yack veils enology chumps barogram divinises drumlier quare debauchedness broadloom piece ores ticklish utriculus clipped golly outweeps albuminised palmaceous savingly once galangal mure empoverish acquiescent unsleeping contestingly plummy infibulate skeletonize desuetude furry aircrews ajee far transmutably euphonical buff culprits turbulence crowned bodges leafed gamb outbraving why margarin cirques downwards"
        }
      ],
      "first_observed": "1997-03-10T00:00:00.000Z",
      "last_observed": "1977-05-29T00:00:00.000Z",
      "number_observed": 682054743,
      "objects": {
        "a89bc850-f363-43b7-aafe-c042e77fc4f0": {
          "type": "artifact",
          "mime_type": "audio/x-wav",
          "url": "http://www.pyriticismael.net",
          "hashes": {
            "SHA-256": "5a50339d98fc597db9c4ea97fad72e82d8e95b7d0c7336d22949871df5566968",
            "SHA-1": "f83526fdd3e02caa4d99f0be86ae92ae53c7c804",
            "MD5": "a36598e3430a476c40697b95b43c5ca4"
          }
        },
        "6a9d0bb2-3f13-4403-ac28-3cda6900ad84": {
          "type": "artifact",
          "url": "http://www.piousrightist.com",
          "hashes": {
            "SHA-256": "72a5debc09dfe6edf9af5f3007fb69a824dd55e3a04ee8f76433b12a9c80ac7b"
          }
        },
        "511be531-de9c-4469-8b81-d1530d15c4a4": {
          "type": "mac-addr",
          "value": "9f:52:0b:98:be:92"
        }
      }
    }
  ]
}
```

## SDO / Stix Domain Objects

### Attack-Pattern

GET `/api/sdo/attack-pattern`

Sample Response:

```json
{
  "type": "attack-pattern",
  "id": "attack-pattern--1cea0963-398a-4f72-a553-f2e865a35ae1",
  "created_by_ref": "identity--37cd1cdd-96d4-43d4-ba5e-82701ba080e2",
  "created": "2019-02-19T02:28:41.223Z",
  "modified": "2019-02-19T02:28:41.223Z",
  "revoked": false,
  "object_marking_refs": [
    "marking-definition--0de89968-c1fe-4d58-aa4f-3c2438d6e30b",
    "marking-definition--095fba1c-5bc3-4003-be61-f115b713a7bd",
    "marking-definition--9a46c430-1e28-4df4-8c97-b0c7bf3bfdc1"
  ],
  "name": "proximately ritornello redundantly scant",
  "description": "pasquinaded lend dharmas miscreate anatropous amain attach mute reputed salable voodooistic skillfully fro rechecks goddamn juicier egregiously gloom endurably prudently fricative ionized gouty tantaras own constantly undesiring swirls pointedness budless insipidly anthurium bloodthirstily vanward stain spoor powerfulness beleaguer quillons nonabsorbent mick liberated",
  "x_deeply": 252235,
  "x_whorled": 395380.0440498248,
  "x_misruled": "rivulet flush cannibally forspeak hugely lapidating naught harvesting caressingly immanence gauche centralized stelliform gaudy tantalizing rubrically parabrakes rebutting overhung deceases elk plunder bid sniffingly gey confirm otherwise crispily issuably knotty flop crackliest hands quack functionary stanks unassumed trademarks titillating shrug whence lain cataphractic carbuncles medications loads aridly flatteringly gyrostatic amain hamstring unedge granulocyte decumbently shily undismantled fresh plume burnishes sunns detribalized anon overseen peptized sighs potently cheats adulterine migrainous minds svelte nebulises villainously shut professional putrefying fiendishly gradually paratactic amputated wadsetting transitively butcherly salably",
  "x_swooshes": false,
  "x_when": 197350.8997223838,
  "x_fatherless": 663241,
  "x_achromat": "glib claustral jumps pastoralist shelliest knawel excerptible advisedness fortieth ranged secretions pent stuffed",
  "x_sheared": true,
  "x_telltale": "amiably westerly innovative griffs baff tillable grossularite isotonic slunk amain leafier hereto castaways studiously"
}
```

### Campaign

GET `/api/sdo/campaign`

Sample Response:

```json
{
  "type": "campaign",
  "id": "campaign--06c74bf5-8b05-4db9-bd80-e66886395e80",
  "created_by_ref": "identity--ffe85b54-45ac-44b5-9157-f9023827022d",
  "created": "2019-02-19T02:29:27.599Z",
  "modified": "2019-02-19T02:29:27.599Z",
  "revoked": true,
  "external_references": [
    {
      "source_name": "corbiculate",
      "url": "http://www.foulagrees.io",
      "hashes": {
        "MD5": "3dc71dd7f54e643ee08f5607bff0b1fa"
      },
      "external_id": "2e4ec04c-7392-4d23-9ac9-bd9239b2aa04"
    },
    {
      "source_name": "patronizes",
      "external_id": "89d2bfec-8e1e-4491-a7e6-828de1fba7c7"
    },
    {
      "source_name": "situate",
      "url": "http://www.cephaladfinagle.net",
      "hashes": {
        "SHA-256": "8513e146705d1ede4d5e0036e5bbe6bcc4994e7e77559d72a9362b6e1ebad10c",
        "SHA-512": "2c611e4c27a0c50c00b904a5f51aa9aa0de7130b7597fe0281af6df91c4c3fb7b46b19a89f6a5bae0b785818d473168c5a52996aabdcab30a0c287af52eebeb7"
      },
      "external_id": "6b63b9e6-b57a-40e5-b9fe-e03138b496db"
    },
    {
      "source_name": "penultimates",
      "description": "shackle kerchiefed plight gritty unkennelled kedge legislate excluded lovat gats compensates kotows tacket demitasses scarcely gremlins allogamous grotty",
      "hashes": {
        "SHA-1": "01c443127a551969aa0a30263968a5b284d80fc8"
      },
      "external_id": "a4bb23f9-5ea6-4b34-aa8c-87e9429c5b49"
    },
    {
      "source_name": "vow",
      "url": "http://www.hanceloni.net"
    },
    {
      "source_name": "assuage",
      "url": "http://www.subaquatroths.info"
    }
  ],
  "object_marking_refs": [
    "marking-definition--d8db4225-a774-4d66-9c1f-01f5040e4d2a",
    "marking-definition--f8c96df3-513c-4e24-b3a9-95e0a7ec7c7c",
    "marking-definition--4a5c7c93-4238-4e88-a61f-ea571c9d9382"
  ],
  "granular_markings": [
    {
      "marking_ref": "marking-definition--473dc95c-5b68-47a1-bf6d-d0a8d1d16199",
      "selectors": [
        "bandage"
      ]
    }
  ],
  "name": "kilts",
  "aliases": [
    "sudatory-moistly-vandalise-exhumes"
  ],
  "last_seen": "2012-07-06T00:00:00.000Z",
  "objective": "ouster orientates licensed mistakenly whelked didynamous healthily convexly distillable niggardises liaises suffix"
}
```

### Course-of-Action

GET `/api/sdo/course-of-action`

Sample Response:

```json
{
  "type": "course-of-action",
  "id": "course-of-action--08019465-97e9-4291-8853-5582cfdcec27",
  "created_by_ref": "identity--d63484b0-1e61-4cdd-9f5a-1d8fdebc6170",
  "created": "2019-02-19T02:30:03.749Z",
  "modified": "2019-02-19T02:30:03.749Z",
  "revoked": false,
  "name": "muciferous-toilsome-spang-insulate",
  "description": "skeigh inquiringly anaglyphic farm straws dashed kob impish prompt fretfully photograph glidingly dusks copyreads counter stabilises entitle custom vengefully dope atrip puffingly deadness strait craterous romp localised mutagenic postillions alt darn blindly nosier automate huskily mailing blandly chronically berberises interspinous soliloquise characterised ought evens unspirited subvertical overwrought",
  "action": [
    "fluorinates thieves quinte ninth pones",
    "psychographic liege tricorns depravingly edging biggs benefices generate",
    "guesstimate minuteness broch necrose parabolised craftily halloo xenophobic houselled lamely surely superpower persecuted reparable ceriferous tried isonomic landward librational oft despitefully farand bloomed",
    "amain doubtless dread birianis goys awheel reliable cooking weekdays conformably molybdous anodizes none floodlighting tameable surcharge floodlighted chaff glyptic eath sniffiest slantwise confidently treasonably",
    "garaging pretermissions input cleverly decipherment sullied derelict orarion teasing mutually compatibly recognising plexor perorating jut alienable sloths nights suturally mezzo"
  ]
}
```

### Indicator

GET `/api/sdo/indicator`

Sample Response:

```json
{
  "type": "indicator",
  "id": "indicator--eaf7d118-4afe-4a03-bf15-67bc1428c57d",
  "created_by_ref": "identity--74f95dd1-3f34-4b24-8e69-8df947ad328b",
  "created": "2019-02-19T02:30:43.817Z",
  "modified": "2019-02-19T02:30:43.817Z",
  "revoked": false,
  "labels": [
    "attribution"
  ],
  "object_marking_refs": [
    "marking-definition--2cddc774-c8b4-4e62-beb2-d43e7b406fe1",
    "marking-definition--824a5dfd-9b2b-49b1-9818-fe874f800553",
    "marking-definition--66bdbf51-3226-47be-bf74-b4c71ac99b7d",
    "marking-definition--9280a175-a964-4575-8db5-d1323d884c17"
  ],
  "granular_markings": [
    {
      "marking_ref": "marking-definition--dddda130-4d86-4410-b779-ba04edfffcc2",
      "selectors": [
        "mutilations",
        "lifeful",
        "retrogresses",
        "feature",
        "tastings",
        "brazes",
        "despitefully"
      ]
    },
    {
      "marking_ref": "marking-definition--67ab82b6-3fc9-4487-b21a-9a54b92ab7e9",
      "selectors": [
        "mainly",
        "toe",
        "augmentable",
        "dictaphone"
      ]
    }
  ],
  "name": "murk-debit",
  "description": "backswept where aftermath earthiest sheave like chivalric loads sandstones squeakier narratively tambour supra barebacked tropophilous knee boughs damn clinically millenary escaped solemnises",
  "pattern": "SOME PATTERN GOES HERE",
  "valid_from": "1994-01-01T00:00:00.000Z",
  "kill_chain_phases": [
    {
      "kill_chain_name": "hep-lallygags-backstage-seizings",
      "phase_name": "hospitalized"
    },
    {
      "kill_chain_name": "lituus-singingly-flatways-subtitles",
      "phase_name": "ethnographic leptosomes"
    },
    {
      "kill_chain_name": "monastical-epilator-incognita",
      "phase_name": "funerary tinct solemnly quaich"
    },
    {
      "kill_chain_name": "jarringly-instated",
      "phase_name": "toom asymptotic"
    },
    {
      "kill_chain_name": "transhipping-crumb-ruthful",
      "phase_name": "fozy northmost"
    },
    {
      "kill_chain_name": "pallidly-undersides-westernized",
      "phase_name": "hirsutism intoed jawboning"
    },
    {
      "kill_chain_name": "corking-ashets",
      "phase_name": "soli suntan lieve"
    },
    {
      "kill_chain_name": "choice-rubberized-carouses-weevers",
      "phase_name": "yett sawders hewn nicely"
    },
    {
      "kill_chain_name": "tough-flawier-slander-urbanises",
      "phase_name": "interchanged lankly hit fashionably"
    },
    {
      "kill_chain_name": "subarid-resoundingly-falteringly-poulticing",
      "phase_name": "napalm dyscrasia streamingly prim"
    }
  ],
  "x_carabines": "simulate",
  "x_offshore": true,
  "x_leasable": 746552,
  "x_cumuliform": "equestrians remonstration jitter fanfares shrunk serviceman fluorspar pregnant advertently knockabout spews knob less chasmic crackbrained somehow sewn wittingly guddles channelized plashiest barbes enow disyllables quite unruffles shingle boned waught poulticed shut dorsally else deave decentralize coarse catmints languishingly twitch hortatively rectums snash advancing osteotome snappingly bedraggles saccule deforciant plumb certifying uninvolved cavitation masticable logs cincturing spoilt twirls boxwoods reinsertions trichinizes stateside approvingly",
  "x_askew": "fiefs",
  "x_mong": "ectomorphy vocalic rococos founders therefrom bene nests much calmy beaut chronometer constructible attractingly sullied decolonise ungagging amidships blotty vilely unprogressive wordings peghs maund sempre glamorizer whence eternises productively woolshed hydrosulphites marqueterie senega hydrolyse deified homothermic unrighteously handfast chatoyancy intricateness psychs marchionesses sloppier silkily underfur croakiness filthy plantigrade eath formulism escudos redouble hospitiums swipe garni choreguses incog dasyphyllous tightly reave knaps seining reversedly shroud spells straitens perfumes toxicant engorging firm surprise unreined alicyclic ketchup fundies sparse retentive like blocked proem blest cobwebby nudist potion heckle providently thither",
  "x_days": 97356,
  "x_built": "titration settling caroche",
  "x_amuck": 56559,
  "x_pointlessly": 341456,
  "x_essay": "greaves",
  "x_unrebuked": "lash damn redbird bijouterie sap excaudate slavishness romp awhile humorless shirt splurge georgic inerrable loquaciously complexly verbified unchristian geck blonde tribasic flagellated chat massaging this pounces fret fares plumb bogging chrisms striate strait driveling variation bis blats mischance potentate caprices cecal anarchies sensorial sitcom interpages seducings quintes blares pargets awhile cool ensconced mango what sabotaging frivolously lingeringly imagined procrastinates course reportedly shyly dash wots crude gyrus factitious weighable mystify font dissents equidistance ephemeras snowmobiles postfix uncourtly disgorged beaky arched absences oversize swears dystopias coevally ipomoea alliterates disgust touchingly petite",
  "x_admix": true,
  "x_mastic": "grigs mob advertise sown disparities actionably dumbbells febrifacient encouraged barb misguiders frondescent redescribe beneath jokes blockbusters sore transmontane super signalized yeah unhealthily",
  "x_pickles": "limpkins quip bearable concretizes redecorate dike checkered grifts chirring quinsied issuers trailingly someways odometry firmly integrally dinges glidingly rigatoni unpolitely pulpiest stank crabbedly brood perceptibly otherwhile steatitic formulating derange nonetheless bare paste madding unsettledness eighth manducate razors shoal thus",
  "x_ceaseless": false,
  "x_molts": 675917.2530555786,
  "x_comminates": "genips",
  "x_creepingly": "tongues agitating numb weathered discursively orthodontics prey suburbanized satiates lids slosh resurrect deterges thenceforward churl retrally artiness alas unbeholden policewoman apostolate unfallen cue erosion furlongs mzee makefasts plonks chrysalises bets generate unseaworthy dossals postmasterships kourbash fabricate gouge embezzler merchandise towerless forehands swung farrago harshly falcon circumspectly xerarch nastily quays lacquerers gravely nary undoubtedly cayenned variola sprain feigned detonators mutably stalely bourtree embellishments shingly course defective contextual mishmash emphasizes painless understocks addicts warded awry synonymize mobilities knapping icily trigonous retrievings scorched mucid guar nominalists arilloid vibrates interceptive ironist then retransfers dacha siriasis overman indites nests petrographic"
}
```

### Intrusion-Set

GET `/api/sdo/intrusion-set`

Sample Response:

```json
{
  "type": "intrusion-set",
  "id": "intrusion-set--cba9affe-5ed7-4a51-80f1-158b7a7758a3",
  "created": "2019-02-19T02:31:18.818Z",
  "modified": "2019-02-19T02:31:18.818Z",
  "revoked": false,
  "object_marking_refs": [
    "marking-definition--4bf8cbd9-0e76-429c-9685-1613402a78cc",
    "marking-definition--07995881-b094-463d-9db8-32e9ee26105a",
    "marking-definition--0c57a7a4-8962-47ef-a2e0-5c3820e30011"
  ],
  "granular_markings": [
    {
      "marking_ref": "marking-definition--507a8b2a-dd1c-42ac-a9b9-02e13fe7bc58",
      "selectors": [
        "ail",
        "blankly",
        "yet",
        "ping",
        "dispenses",
        "sedged",
        "wineries",
        "bael",
        "disclamation"
      ]
    },
    {
      "marking_ref": "marking-definition--7869fa76-4ee9-4801-b743-22aa786a9f07",
      "selectors": [
        "debatingly",
        "marvellously",
        "sclerotial",
        "coarsely"
      ],
      "x_marmoset": true,
      "x_cassareep": false,
      "x_lapsing": 406169,
      "x_easterly": 410209.8880614602,
      "x_hypergamous": "collocutors",
      "x_saponifies": "catalog",
      "x_when": false,
      "x_mouton": 287509.0088368294,
      "x_granophyric": 430852.97040506057,
      "x_outsized": 39499,
      "x_distrust": "detestably",
      "x_mattins": 713291.5873440177,
      "x_connectively": "lunches",
      "x_ways": 866186
    }
  ],
  "name": "damned-jerky-clefs",
  "aliases": [
    "golpes-cops",
    "tabularise-scantlings"
  ],
  "first_seen": "1998-07-02T00:00:00.000Z",
  "goals": [
    "tardigrade maisonette bestialize",
    "like illusively",
    "quinate deplorably loots nope inflationism",
    "wider"
  ],
  "resource_level": "content",
  "secondary_motivations": [
    "organizational-gain"
  ],
  "x_illumines": 856787.6491169264,
  "x_spruce": 211295,
  "x_ninth": "less revaluing reintegrate discordancies homoplasies criticize pendent variably therefrom formerly inexpertly wallaroos deeply syncopators flory fimbriated upstaging beanstalk rebel anticathodes historian villose bopping cagiest fit canalised chrestomathic plump phlebotomize bookish predeceased yod grooved heap ahold hierarchy nervously pleasurably waterproofs sullenly rhythmical but acclimatize freeboot redundantly lest knoll sparkishly unperforming guilty bollix yearly jutting horridly lyncher thoroughly recognised greige quiet fork mayhap narcoleptic moistly quaveringly auctionary sleepiest keyed accouter systemises warring larrikin lens",
  "x_whatsoever": "snub skeans intenerate tubbiest yestreen conjured proneness only silt richly sexy cosily paragraphers braggingly trim much thraw akimbo retrorsely heretofore grills pejorative filar beneath none craw construing glial talc spignel typesetters bemiring dang francophils impoundage undraped workhorses lyophilize relent sexily contemptibly ungagging decipher gilt untiring ambagious danged remeasurements parangs farthest vapory deft instances coming younger thin epidermal cockneyish pumices seminary chevying akimbo",
  "x_kotwals": 40143.53228808335,
  "x_yet": 493936,
  "x_alphabetized": 607052,
  "x_conjectural": true,
  "x_glans": 19827,
  "x_louche": "tinnier"
}
```

### Malware

GET `/api/sdo/malware`

Sample Response:

```json
{
  "type": "malware",
  "id": "malware--0aa26f48-fdc3-4676-a5df-4c621854a659",
  "created": "2019-02-19T02:32:22.534Z",
  "modified": "2019-02-19T02:32:22.534Z",
  "revoked": false,
  "labels": [
    "remote-access-trojan"
  ],
  "external_references": [
    {
      "source_name": "whickers",
      "url": "http://www.sinlesslyfloats.io",
      "hashes": {
        "SHA-512": "22bb9151821ad3cddc95a69eb1a0d12b59fd188ed4032165298bfc58b09a76bb0396d811b325d5b6dd974801d09138d4afc4788be2d4de95ed145d9fed1bf1d3"
      }
    },
    {
      "source_name": "such",
      "external_id": "89f376d1-d84d-4316-9a26-222ec5f5fe6f"
    },
    {
      "source_name": "though",
      "hashes": {
        "MD5": "e12e7e6f80f245a008935c1f82bef1ba",
        "SHA-256": "893856a34b5e2d7f4e73cd9063289dc981ce2ed37d073f2a5312a64273c600e4"
      },
      "external_id": "9cd1e013-5bde-4347-8156-88e4e211811e"
    },
    {
      "source_name": "hourlong",
      "url": "http://www.sprylyperches.net",
      "external_id": "2a09ae01-7d73-4426-837c-d7e6274594cb"
    },
    {
      "source_name": "dang",
      "description": "paced tastily raspingly boosts dryer hesitating auld monovalent unkindly smatch grave infinity transcendent manifestos whiles peck guava featheriness reluctant sores unglazed although persuasively bis barefooted congratulates dooms stingingly unblent quadruplicates cool mulishly luckiest slightingly pouched incitement assonantal regrating unobserved loth defense ligne shovelling hokkus bandog apostrophise penstemon what lowse unsupplied rhonchial claims dentex cattishly gees cursory nationalism roundly emeus nohow deprivative coronate perpetuates ablaut taluses lusciousness afar rubricator damnifying amply majorettes",
      "url": "http://www.unspokenbud.com"
    }
  ],
  "granular_markings": [
    {
      "marking_ref": "marking-definition--8b88d773-ce45-44ef-943a-fb167e3f7f15",
      "selectors": [
        "menstruating",
        "tho",
        "spews",
        "plait",
        "shelve",
        "soprano",
        "grave",
        "piking"
      ],
      "x_highroads": 825799
    }
  ],
  "name": "how-churrigueresque",
  "kill_chain_phases": [
    {
      "kill_chain_name": "sore-vertebrations-breezily",
      "phase_name": "disembogues same hoodoos"
    },
    {
      "kill_chain_name": "outbidding",
      "phase_name": "operosely insolently dorm craves"
    }
  ]
}
```

### Observed-Data

GET `/api/sdo/observed-data`

Sample Response:

```json
{
  "type": "observed-data",
  "id": "observed-data--5acf124a-2170-4c2b-a7b4-5b1e1385cbd5",
  "created": "2019-02-19T02:33:02.133Z",
  "modified": "2019-02-19T02:33:02.133Z",
  "revoked": false,
  "external_references": [
    {
      "source_name": "wricks",
      "url": "http://www.robustlyclue.info"
    },
    {
      "source_name": "neighbour",
      "hashes": {
        "MD5": "89b033571547bfc13c75b859465cb480"
      },
      "external_id": "2d46eac1-aa28-4d95-9abf-2dbd7fe8ea01"
    },
    {
      "source_name": "punctate",
      "external_id": "a8bc8430-c831-45bc-be76-e2a150251fa3"
    },
    {
      "source_name": "everglades",
      "description": "hydropathic templed deploring alforja nohow precentors mildews plaints woesome cussedly counterfeits fundus presets zeolitic pausefully all unfitly diatropism flawed hydroponic elated yon cymbiform tenthly headlong plop jubilances enemy propitiates carpingly sinistrorsely torporific jemmied waur sharply mongrel aigret underkingdoms pentavalent sough kulaks too cutinises weekends coper lame pipeline teases bequeathable lots blobs bedrooms plights matte effortlessness sticharion mobs slights napping decarburized playschools keenly dreamily tonetic gripping terminate profligate interweaved transvalued convict indirection matte ruckus expired racemes tompions tubulating swirl rattling protestingly mortally eild swops thence exscinds falbala monists bwanas complicate sculpture anacrustic damans surcingles",
      "hashes": {
        "MD5": "56dd3eaf3ec8dea6e94dd8f07d308b26"
      }
    }
  ],
  "first_observed": "1991-07-05T00:00:00.000Z",
  "last_observed": "1994-12-30T00:00:00.000Z",
  "number_observed": 272154703,
  "objects": {
    "a8cf8bd3-e3a0-41db-9dfb-ba9e47d4fd4e": {
      "type": "artifact",
      "payload_bin": "since diapason"
    },
    "310fffc9-81a9-4a25-8a1c-c27f68759097": {
      "type": "artifact",
      "payload_bin": "gouge adhesively"
    },
    "e7001963-cbb4-4d94-bca6-222cabb676fa": {
      "type": "directory",
      "path": "lean",
      "modified": "1998-12-06T00:00:00.000Z",
      "accessed": "1980-07-28T00:00:00.000Z",
      "contains_refs": [
        "1097abef-e110-4cdf-aa7a-bb707ba2fe49",
        "a08da65a-114f-45bc-b0de-d5dfeead1a8c",
        "cc8f71eb-7c4f-4fd6-95a3-d35782e11428",
        "a2d0a989-e85f-4bfa-a192-2da329db4bcc",
        "ea6e1110-bf9a-4eb2-8c61-991aa9ad673c"
      ]
    },
    "6ef8b978-fceb-43d1-8d57-25eccbb54ed5": {
      "type": "email-addr",
      "value": "sizedbuster@hotmail.co.uk",
      "display_name": "James Mand"
    },
    "f519e5e8-ed42-4204-ada3-1b22fcd1d055": {
      "type": "ipv4-addr",
      "value": "113.129.55.107",
      "resolves_to_refs": [
        "6c546236-3503-488f-a1f0-71c5dd228a9f",
        "39e1d73f-748a-4b7e-8adb-d545bc81bd14",
        "09137b0d-a6c5-4297-9dc0-3dd98671a6d0",
        "1a2ae9ec-b1aa-4dab-86b4-74c70657a9c8",
        "55862b5e-a951-4e7d-88cf-005dae4b739d",
        "287b3e0f-ffcd-445b-aa62-dd092d51aa15",
        "fa58bb93-8d29-4dc7-ad4a-dace477b2426",
        "7169dc04-b905-4304-956d-786085b9ec05"
      ],
      "belongs_to_refs": [
        "28f91d9c-f196-4e0a-a6f2-7bc4b3722014",
        "82cf7642-21d7-49b1-a504-45cf3c19dd03",
        "375dea06-559c-490e-a24c-ac480b5779c6",
        "e05da1ff-9bb7-4eb5-bbf1-f5ccc8d01ba6",
        "73e2dab5-28d1-49c0-a41d-53676f26a905",
        "7004a489-56f4-452f-8d0c-44ca3a6f8a92",
        "aee9f815-6e39-401b-804e-2363541cf522"
      ]
    },
    "f0ca86ad-0169-47d1-a02a-d88b77d78595": {
      "type": "ipv4-addr",
      "value": "186.44.207.6",
      "belongs_to_refs": [
        "e3251b7d-5951-4680-a86c-a1780122f37f",
        "55c9b195-77a0-4ccb-9a31-0b39fb0ddd75"
      ]
    }
  },
  "x_deposes": 878357.1126112323,
  "x_emanations": true,
  "x_cauterising": "prove dang bassoons jee patent eats hazers competently overbalance strum that formulized subdues venturesomeness maharishis thieve ungirthed too lipoid wamblingly invocating unshapen hokes sleety ought ungarmented coniferous slyly retransmitted caponizing enamors mannose sore graphical nope carcinogen commonweals afield tews rankly creamlaid sixth keepsakes exaltedly percurrent excels twiddles gradually quiet fortnightly tyrannical accreting vilely escalade kennelling",
  "x_waughts": "sheer inhumane whirring reallotting crunchier snubbingly conducingly done whereto contractedly fallfish oiler ocher grossly nay boldly grandfatherly next subjoinders veraciously yaff menorahs soothing stagnation funds thick fuels bacterizes gasp ruffes forbs felts cyprian soon fronton sleights staged fiscally mugs unbrotherly lived starchily gonks pseud unboned dumbly tinct unlosable unmethodized interlaid figurations consignation caliphal revoke hamular releasing adjunctly removes gummy refile playa adversative crosstown tranquilizing unbedimmed betes durably revetting mists creditable incredibly larch shrunk syndromes starving attackable phenomenal detoxified annelids overstriding blackly overstate basely quadruplet ungoverned startlingly regretfully bumbershoots glamorize impotently tactually instructor sunbakes",
  "x_synthesizing": "apogeal",
  "x_fratricidal": "wursts",
  "x_mountaineer": "kindly perpetrated recycle miscreancy enthusiast contagiously amazedness centrist",
  "x_treads": 381447.59172315337,
  "x_outhiring": 71454.3993504598,
  "x_transformist": 937687,
  "x_schadenfreude": 47278,
  "x_ectodermal": "miscomputed"
}
```

### Report

GET `/api/sdo/report`

Sample Response:

```json
{
  "type": "report",
  "id": "report--6a7f60ed-187a-45c2-b247-e61450e8fb4c",
  "created_by_ref": "identity--6549074d-6453-4551-9d45-0183fc895ed3",
  "created": "2019-02-19T02:33:51.527Z",
  "modified": "2019-02-19T02:33:51.527Z",
  "revoked": false,
  "labels": [
    "threat-report",
    "threat-actor"
  ],
  "external_references": [
    {
      "source_name": "precipitates",
      "description": "thru typewrites unitedness hadrosaurs degradation",
      "hashes": {
        "SHA-512": "2c158b01fd4537bf58a8771e29320cd9f612cd1d5b814ea898405c0b243cac34473e36fdeac58bfeb1b03a6a50fbbcac7a2d6d56c36b4e185256affc5eaf1977"
      }
    },
    {
      "source_name": "obstruents",
      "description": "salably confidingly prudishly lotic absorbingly impawn swaths stickybeaks rustically suiting recks vascularity compunctiously piping damn cheek fetishistic spatially reprocess tallyshops nowhither shives bastinados mobsters puissantly noway congregate birse mandrill tho sidewards dryer fought dazedly then such ramparts quaternate mammoth correspondents crossways mesne stutter flocks overruling novitiates chimes biffs lorgnettes tawdry landslide foetid smother jades",
      "external_id": "140876a3-dd04-4a4b-bdc3-2464d83fd232"
    },
    {
      "source_name": "summonses"
    }
  ],
  "object_marking_refs": [
    "marking-definition--69b869f5-7203-4db0-951e-69108b40c48d",
    "marking-definition--0f4d1064-b371-4756-9d81-2f6422755701",
    "marking-definition--ba517bf2-a4cf-442f-8b59-106bd9aa1f7d",
    "marking-definition--0613206f-8379-48df-aef2-af64e27dd99e"
  ],
  "name": "blackcaps debaucher",
  "published": "2015-11-29T00:00:00.000Z",
  "object_refs": [
    "campaign--0ceda434-65b4-42e1-a8d5-26742c74470b",
    "relationship--b59eea29-2e48-4f65-9d43-506a43f1f636",
    "observed-data--3557082a-eec3-4195-9fa0-4275501b28f3",
    "intrusion-set--8dba6ecc-d7d2-4db3-8e25-fd562ec6f9ce",
    "attack-pattern--ebe2ab8d-9fd8-439c-b3b1-32ff537167f1",
    "vulnerability--de406b06-3d7f-4e79-80e2-7d12ad7f3bfa",
    "indicator--66f2dc5d-a729-4385-9ac4-9b00df13599b",
    "intrusion-set--21326b58-d333-4bf8-9ed4-81895742f482",
    "attack-pattern--c817e27e-4e95-446f-9aa9-b7658e18d863",
    "attack-pattern--3aec5fb7-ccff-4650-853a-b4ed82ade426",
    "course-of-action--e27dcff4-a339-4143-8a07-4086e9ad316e",
    "marking-definition--97e247fd-ccc0-4d59-ab43-a11cbd5a10ed",
    "identity--dcc4bde5-c964-48f6-ac1d-770f11b29d15",
    "tool--592d641e-34e6-452a-a6d6-e3f34a116920",
    "course-of-action--406a1304-3800-4cdd-89a0-f5a8f8c60c96",
    "attack-pattern--2f1ef385-1949-46a3-bde8-826d7b46b727",
    "intrusion-set--862bf849-0c01-436a-8a33-36d50a4dea22",
    "identity--6881d102-6949-4249-99ff-3da940f0ab7d",
    "tool--ee745dc1-f929-4cfb-89a1-69b918b9ad4f",
    "observed-data--b0c61d60-85a5-4e66-a202-b2c5560ce285",
    "threat-actor--e401c631-4025-48d1-a73a-6281be88e68f",
    "attack-pattern--89eecd9d-05c0-42e4-a58c-d124f31c82d3",
    "marking-definition--679d288b-3f2e-46d3-9829-d8c3c1ed1cf1",
    "marking-definition--8d3ebb48-603d-449c-867c-0a59f59a7cfa",
    "campaign--d74a60ec-2d34-478a-8be9-1cf2de15c030",
    "observed-data--f83531aa-b0a7-433e-9524-9dedf0c58ca1",
    "relationship--3672d42d-ebf5-4180-9204-2589e1c3697d",
    "observed-data--cef4056d-bc6e-4c54-905f-b14ab18e7b8a",
    "vulnerability--59465a7a-43be-4bb6-b7c1-6e43af1c5b21",
    "identity--1b5a3d88-b21d-46fc-bb98-068bb97fe882",
    "indicator--7dbb27d7-37a5-4588-835d-c149853f52d9",
    "intrusion-set--1b85746c-b697-407a-bf15-94fe9a9a40fc",
    "intrusion-set--d4bbfba8-6702-447c-9648-b39a72d08235",
    "intrusion-set--5e33b391-5aa9-404f-b54e-1d7102407a2e",
    "course-of-action--1b63b9f5-0fc6-45f4-b8cc-fc85a9fec6a4",
    "malware--dab0f561-9ea8-42b1-a919-4b4ada3ce460",
    "attack-pattern--5006d606-57e3-4e50-aef9-e2a4176aede4",
    "identity--52e144f2-497a-489b-bc50-b8aa71206578",
    "intrusion-set--4252b2b1-b21e-4979-83c3-ef071f646f3d"
  ],
  "x_demurely": "yarrows lots undrawing inhumane loonies classicalness contagiously scorified yore dyslexia revolved titrate colloid hectically nay superclasses revoltingly definiteness oxygenate disliked navigators gormandisings lunches cools suably cryptologist confirmable varves throttle plunges neglecter carousing schiavone outlaw ablaze denitration deathlike spains someways ninth partaken quilts partitively mackles categorised denatured glancing fertilized shes brave stiff sized glum hateable untrue lout taskwork gifted",
  "x_cinnamonic": "encoded unwontedly privately thereagainst overbuilding religious jannock",
  "x_metacarpal": false
}
```

### Threat-Actor

GET `/api/sdo/threat-actor`

Sample Response:

```json
{
  "id": "threat-actor--94558067-311e-4719-a515-c4be72a5f641",
  "type": "threat-actor",
  "created_by_ref": "identity--c8d1528c-28ea-40df-8f89-e18a3b946ffc",
  "created": "2019-02-19T02:34:23.265Z",
  "modified": "2019-02-19T02:34:23.265Z",
  "revoked": true,
  "labels": [
    "terrorist",
    "criminal",
    "hacker",
    "spy"
  ],
  "name": "Abbie Trett",
  "description": "outjuttings crosswise misinstruct accouterment nide skilled fro darned chants antiphons unbearing apograph scyphistomas shakiest automatize potherbs docks instigating schlepp",
  "sophistication": "minimal",
  "resource_level": "club",
  "secondary_motivations": [
    "notoriety",
    "personal-satisfaction"
  ],
  "x_billfish": 211877,
  "x_crepitation": false,
  "x_slyly": "maim jetted overflows blasted flitch albuminoid laigh decimate hauls hoop lusciously orchestral slap grind jostle wencher poppied unbecoming understatements psyche loads ostracoderm immortal trichogynes overdrives this readvise flock hump swob unstaunchable albuminized indenture stringless indemnify nosier inrushing charks laigh slams thrillingly chabouks kotow misallied pimps veritably doubleness arrantly bludges sith insolvably sculpture churrs splendrous fulsomely rammish douceurs dirtily cutely rucksack sleaves pint automating abroad forgotten ultramarine womanless renowned measliest synd passionately festively crits brickworks rhythmical wittily heliograph hence drizzles halcyons consentient paraphrasts meantime parlous hypostatic much auscultators yashmak humanly brashly",
  "x_bless": 370489,
  "x_ajar": "wauchts tonelessly permutated chopsticks photogens watchbands enteropneust freshly unmuzzles hereabout stumps noise flecks desiderates gleek dioptric intone wakens predestined wamblingly disharmonies blackbirdings loathes squat bilingually outjut hurtfully arguing theorizes defective derisive sliest predestinates pickle normatively knavishly darn tenth detester alfresco tricorn unfriendly qualmishly colonnaded forte woefully lunchtimes simpers fremd annotate mists prescript twister snick circumcised downwind southward pluralism ergometers mince invigorates mandate cursed balmier blatant nominees jaculators subalpine choking freakishly else aneurysmal palaeoliths flush piping septicidal athwart meet dubiously waning singing mile physiocrat baggily aught lubes unlearns discourses foin kraits entreatingly",
  "x_irksomely": false,
  "x_germens": 680986,
  "x_alienator": "rive",
  "x_inscriptively": true,
  "x_breadthways": 486150,
  "x_outswim": true,
  "x_warmongering": 698685,
  "x_fructifies": 360787.4656230776,
  "x_precancerous": "bescreens hissingly halite lento trespass polyzoan overtrick classifies there intendedly growlingly contra recommitment slangily lazarettos venally perhaps snubs morphs spooms unsettle now oversleeps substantiates phthiriasis duly fungible onstage waits dispersive mussiest inopportune advertize thwart oppositeness palmettoes matey stiff gone neat barest halos tremulously slanderously gassier westwards festinates dialogised reprogram merest physiocrats integrally soon stoppers fanatical bickerer eft pomegranates tourneys overgreedy collectable overbite fake laccolithic rapacious overissue wersh outbox aught gilly streek trailingly mangrove bigamy resultant tenths lability truncately irretentive",
  "x_selects": "dash subagencies catechizing ternately purely crudely frilled tubulated much heartily pushed limp publicise hereinbefore daftly pockmarked plenitude knuckleheaded snakier indignations perverse purblindly cismontane chaptalized witless earpieces mutteringly bene reorder gainfully formlessness discursively monkhood foins declaredly ywis centuple apaches piste overgrazed extendedly kin shut citable threescores putt emanating hests ingresses sprightlier gombeen calabashes fresh cockerel far anorak stink disgavelling gatings slender levelly citrus raspingly jingly styles redly exequatur helves contingency bredes inductive exorbitant gabbroic natch dern switch unforgiven",
  "x_quinary": "hypertensive",
  "x_silenced": "loyally brushed trouping plumb fleeceless thru needs required torpid navigably heigh enzootic slype void trichiasis percuss spryer nigrifies corpulent masking too worst coevally kirns theistical detonator undisturbing jugs pissed nebbishes blackly allusively twinned chary reflexly subclavian stapler gores tacitly how pedately competition shoal scriptural suffocates merchandise angling emissive fresh seemlier dang coercively natively complaisantly effeminize melliferous sprucer superabound detachable dusk carabineer raspatories quakingly over sanely hopelessly enow unprincipled deucedly halfpaces cicerone gracioso puffy flagrantly ranges fornical then sharply unmentioned since snecked",
  "x_archaised": "linalool",
  "x_crinoid": 25441
}
```

### Tool

GET `/api/sdo/tool`

Sample Response:

```json
{
  "id": "tool--68dd1fb9-446c-4207-84ab-a4419f964645",
  "type": "tool",
  "created_by_ref": "identity--dd1022cc-fec1-49a4-8ab1-a0d35f8e5d52",
  "created": "2019-02-19T02:34:56.394Z",
  "modified": "2019-02-19T02:34:56.394Z",
  "revoked": true,
  "labels": [
    "denial-of-service",
    "network-capture"
  ],
  "granular_markings": [
    {
      "marking_ref": "marking-definition--2eda0d6f-1692-4058-a441-361b98557a18",
      "selectors": [
        "rehandle",
        "northwards",
        "blasphemously",
        "meek"
      ]
    },
    {
      "marking_ref": "marking-definition--992e80bc-bd6c-4d59-bec4-04661d59d7cf",
      "selectors": [
        "tentations",
        "renames",
        "oenology",
        "super",
        "lure"
      ]
    }
  ],
  "name": "antiprotons",
  "tool_version": "1.0.1",
  "x_confident": "litho",
  "x_disharmonised": "sycamines coalesced famed begrimed rustlingly fraternally tricks finely immobilize uncured ocker thrown ravaging bruit vulgarizes sloshed groat witing patentee shirty queer daut parulises spherular gossip lithely behavioral flares regressive ownership singlestick ultramontane faithful whopping misogamist ways poaches costate notarial tricycle serenades anal corporator comically telling residences meionite machinable crisscross",
  "x_tallages": 522142,
  "x_zithern": "canalized",
  "x_incog": 140486,
  "x_smile": 373984.1122895595,
  "x_arsis": 198910,
  "x_unplausible": "upsurges",
  "x_undies": false,
  "x_mutually": "coursed ranee fore fain conservancy succories extendedly erythrocyte prophesies swots cheap blooms smatteringly jointured pewee praams carse daunts smileless wees unfaithfulness terrifying stuck hyphenized nevermore drinks tediousness venturously milkily couchant ninepence synclastic hurry unsheltered veg confidently cavil amyloid filchingly cohesively fornent scrimp ascitic primariness squeakingly imprisons acropetal",
  "x_exigently": "next",
  "x_strung": 874671.8834794428,
  "x_roseola": "firmly store canalising competing tails whitewashes poach wipe rubberizes gyroscopic thrills precatory delimitate scrawny viridity leash episcopized when much spiflicate consolidates pinnacle barelegged underbridges posture gainless mair throes hallucinates bramblier finners sure handicapping ditch trickily registrarship swag now bade guideless ringleted clogginess disguises hiver firm carcajous instead temporally soppier over barbecuing percurrent ritually tangier gormandise myalism incog",
  "x_bland": "underpay beforetime cuirasses colures cuspidal ankh strafing hefty profligately",
  "x_avocado": "multiracial",
  "x_impassively": "such",
  "x_unscholarly": false,
  "x_waking": 601536
}
```

### Vulnerability

GET `/api/sdo/vulnerability`

Sample Response:

```json
{
  "id": "vulnerability--d3a36cbc-251a-4df4-ae3b-51c9e583a374",
  "type": "vulnerability",
  "created": "2019-02-19T02:35:56.219Z",
  "modified": "2019-02-19T02:35:56.219Z",
  "revoked": false,
  "external_references": [
    {
      "source_name": "cords",
      "hashes": {
        "MD5": "bc9127a7dcd1335a0176e415d43a26d9",
        "SHA-1": "17d797d7910ba700606b03aba2d8702ccc6c03bb"
      }
    },
    {
      "source_name": "tracts",
      "description": "reroutes unreposing erases now rut kecks spirited exaggerates too presumptively unwittingly baroness unfeasible unamended clings carnivore guerdons dreaming helpfully eighth haemal overcast seldom hamstrings robustly jocundly precesses encumbers floodlighting roadblock postponed haste essive togetherness validations spruce afloat feints stewed frescoers cuckolds synonymy crank autotomy sexist internally ratified verts defensive unifies crocks negativeness halobiont ragging untwines daedal salmonoids affront acing considerate flop vogue reclinable enlisted reamend mansard scantly appointed rezoned gummed bisulphate sixthly eath spryest mutteringly quotidian calibred reprobated brazilin unzip officiate million beguiled maritally curves dryness melodion lethargize immurement",
      "url": "http://www.narksryan.edu",
      "hashes": {
        "MD5": "5a02ec4df99f87930e700bace4e8ad32",
        "SHA-512": "e189ddddce952d17a92d6f5cfd84197dec8c05f8e53c9f9ba265472dc66e8a4d4668aeda7ee8b95572869760a993365cf2d5dd1eb43b5404b860cb6dd767f104"
      },
      "external_id": "4a081353-f575-4d9d-8533-4b0b7c20f2c1"
    },
    {
      "source_name": "tawdry",
      "hashes": {
        "MD5": "fd981e294ffc363f0e2e66bdb17bbe13",
        "SHA-512": "36759ed69fd51d275ed32f4f97b9e9744a87e66bed8a1a05b38a46e406c13fe9274d482c07817f439bf7857566cbab0fafef4070ba1852a98c4d02a76d864900"
      },
      "external_id": "fcf8386b-6c8f-4871-9b4b-777849e297da"
    },
    {
      "source_name": "protonic",
      "hashes": {
        "MD5": "c2cd10e85a7aab141ab1a842e93810c7",
        "SHA-256": "acbb57885f1d4bca370140d4e3505615b0d3875e60e2af439535400c9e9e9207"
      },
      "external_id": "7b5d42d1-c456-41ab-a311-367fbbac66c5"
    },
    {
      "source_name": "abusively",
      "description": "poop amandine underbuilds record queasily warders jogging abstain endways rejuvenized bang",
      "url": "http://www.allophonelynetta.edu",
      "hashes": {
        "MD5": "64c68aab6642d751775099e924b0a396",
        "SHA-1": "053e5a3c48a12c6508e6b63049a0e136ab19fcce"
      }
    },
    {
      "source_name": "aventurine",
      "description": "crock blindly precludes roadway recommitting brashly zeals heteroecious witchingly tubal atmospherics unsleeping limitedly uncritical thwartedly crenelated cry slimline envoi supplying gnaw",
      "url": "http://www.saiddebra.info",
      "hashes": {
        "SHA-512": "c7bde857b5eb87c10861cf05f9303acef8ba8d0137336f2aac1a89386eaf6c58057508bd162a508c97f45afde70ac615a774a85a01232ee24d487a8b6f02f135",
        "SHA-1": "81d23ca9d7206562e97f7f84dcfb1a7d6abb101a"
      },
      "external_id": "c8ca9eea-e65e-491c-b869-a9edfc9a6543"
    },
    {
      "source_name": "grates",
      "hashes": {
        "SHA-256": "6c3d109ddb64dc7178d5ffec25397f19fba994669b4d912b24aa12ae595babc2",
        "SHA-512": "5c546e4fee7a49c783fac1cae3b1a0a75cfc053b23e8cb29269efa8cf07c28e81c0749367ea06da6dd676ec17293220eea6f11b45310dc2d15a4a4f3e8adc30f"
      },
      "external_id": "c346381e-699c-478c-92c0-23dc4a35786f"
    },
    {
      "source_name": "parle",
      "description": "unchivalrous roundly ameboid intensified proficients vaccination predestines reputedly featly amenities waterproof subagency much farms menopausal redrawn gated lithophytic genders prosecute rheostat swots conquistadors fulsomely uninvited mump gawky unconceived crankily tills pokily preterist qualifying dreich darned astonied nitrated sustainedly hike precession helms counterfeit unthatches conjunction author stearin leftwards bilge outcrossings sprawls wane perdured snorts antidromic fluffy mangier sexivalent puncheons verist unleashes flabbiest dytiscid fledges fleshless subclasses collapsar revives riming siderostat scars centrobaric flames impeccable lacunal pubs adamant away craze fecundities nutritively advisably superbly now damply imbricately expectorants discept soar excellently abhorrently glume whence quack yarns sorry dyes drearily astonied",
      "url": "http://www.quaichssteve.org",
      "hashes": {
        "MD5": "c5d74da1b63cfb2a0405855f2601340e"
      }
    },
    {
      "source_name": "thwart",
      "external_id": "a9d67b32-f5b9-4f35-a0f4-b1a5507c5f13"
    }
  ],
  "object_marking_refs": [
    "marking-definition--636b7def-4944-455f-bbe7-954c3b209004"
  ],
  "name": "pings"
}
```

## SRO / Stix Relationship Objects

### Relationship

GET `/api/sro/relationship`

Sample Response:

```json
{
  "id": "relationship--c768fab3-151d-4334-893f-099842183f88",
  "type": "relationship",
  "created": "2019-02-19T02:36:25.984Z",
  "modified": "2019-02-19T02:36:25.984Z",
  "revoked": true,
  "labels": [
    "qadi",
    "skerrick",
    "musquashes",
    "acromial",
    "favourless",
    "demurely",
    "dwarfishly",
    "leat"
  ],
  "object_marking_refs": [
    "marking-definition--829be995-1ff3-4b87-9ea2-5a7d30ed64c3",
    "marking-definition--a477f644-48ac-4c8e-b4c5-3354fdd4e397",
    "marking-definition--104b90fb-9f42-4d22-a46a-3a9cc2ed3327"
  ],
  "granular_markings": [
    {
      "marking_ref": "marking-definition--8a2261d4-d212-4ca1-ad5e-b0210f8842cc",
      "selectors": [
        "lither",
        "enlightens",
        "eggars",
        "iotacism",
        "ungraciously",
        "limpidly",
        "said",
        "emendated"
      ]
    },
    {
      "marking_ref": "marking-definition--6dd1c1c5-7442-4043-bed9-09c17eeb82f8",
      "selectors": [
        "fudges",
        "eventfully",
        "unequable",
        "correspondents"
      ],
      "x_reputed": true,
      "x_pressurized": 138150.7255271381,
      "x_outscorn": true,
      "x_aright": "floccillation",
      "x_tut": "drunkenly dastard hydroplanes curving aloud kin greet unsalable overshaded loads burglarizes bowses wit harmless vesturing indistinctness inspirable prayerfully superphosphates curse sketch runed welkins spunkier store peins shed trice lowse glut paraffine kyanite mowing",
      "x_vilayets": 567973
    },
    {
      "marking_ref": "marking-definition--fc60b117-9d9a-4a89-99a4-1d05895fd385",
      "selectors": [
        "mausoleum",
        "chargeableness"
      ],
      "x_injector": 254296,
      "x_aphorizing": "quickly palmately teaches staring agonized advowson how outsize prearranged bent excavated conically crepitated praam dern directresses tetrameters overextend",
      "x_reset": "pissed",
      "x_brisk": 851102.6781769086,
      "x_achievable": "bike",
      "x_vitiating": false,
      "x_importantly": 833084.2094750765,
      "x_sump": "conchate dryer unlistening avidly kneecap opuntia reverts",
      "x_lathlike": false,
      "x_paves": false
    },
    {
      "marking_ref": "marking-definition--6cc5da62-2a6c-4c0c-97c4-4661c1e1dc7a",
      "selectors": [
        "replan",
        "formalizing",
        "multidentate",
        "longly"
      ]
    }
  ],
  "relationship_type": "derived-from",
  "description": "remorsefulness downright pourparler chalcedonic wales straining scantly coaches seen disherit dismissive trig aft nephologist acronymic concordances cannily gradually aggrandises adequateness shog quadrating distressingly trice slinkiest bolt gush gaiters sett done usurpingly dystonia eruptiveness fifty bawdy increases corporately freest dooms bravely inweaves deictically hagfish belt scrimmage outdoing celebrity liming ardently",
  "source_ref": "tool--355afafe-99df-4075-943b-20d715850160",
  "target_ref": "tool--1a188d5b-88d4-4223-ade3-9027964177a2",
  "x_thriftiest": 912975
}
```

### Sighting

GET `/api/sro/sighting`

Sample Response:

```json
{
  "type": "sighting",
  "id": "sighting--1970791c-163b-4372-90bc-cd2d971c7a24",
  "created": "2019-02-19T02:36:53.343Z",
  "modified": "2019-02-19T02:36:53.343Z",
  "revoked": false,
  "last_seen": "1982-02-20T00:00:00.000Z",
  "sighting_of_ref": "course-of-action--b2060588-7225-4088-9261-5824dd2772cd",
  "observed_data_refs": [
    "observed-data--e55beb43-afe6-4f06-826f-ef81fdc19b10",
    "observed-data--18a05229-022d-4007-9a8d-0339310144df",
    "observed-data--581c8494-1822-4dcf-949e-2f7be7ab5a90",
    "observed-data--e9078dc5-8990-44ec-ab0d-76c251eaac94",
    "observed-data--25ce661f-f81a-46af-ae41-d5cb9a42f673",
    "observed-data--5bbd128f-a347-4867-9a8e-1d527e5699f7",
    "observed-data--b96dc09a-830a-4d17-84a7-5349f905f958",
    "observed-data--2bc355a8-9593-448f-8f44-38c312f19f53",
    "observed-data--20c78f07-54fa-459b-a195-9a9230cae7c7",
    "observed-data--de8d94a7-fe8d-430e-bcb0-f0281224be95",
    "observed-data--c663450f-d69c-4467-9514-7fc71e3c0bb1",
    "observed-data--cf35c2c1-fa38-4f2c-aafd-27979db1b0ee",
    "observed-data--9f003f1c-9e9a-4b11-80b0-d365f4609c12",
    "observed-data--c816245b-f5f2-41ea-9458-1d2ac284e69b",
    "observed-data--01d7b734-135d-4580-80a6-05a8471d3dd1",
    "observed-data--3a995a19-9ae7-4cef-88c0-fe784cf3b698",
    "observed-data--652b45fa-edb3-46d2-adcd-dd9fef158533"
  ],
  "where_sighted_refs": [
    "identity--d4e20857-b0cf-4db5-8a7d-79e978266d44",
    "identity--34c1ab80-4fad-4faf-9249-33f3deba5c7f",
    "identity--05d21005-7643-4513-9a7e-0ac6e6328384",
    "identity--87b0c25f-f11f-4c40-8db9-4ce492cf7f71",
    "identity--f9a9ae79-0fec-40a0-8174-fb067817961a",
    "identity--9959a3ff-f016-4596-ac23-c32ecdf4319b",
    "identity--4ee62bae-8a54-442f-92dc-01e2736d64d9",
    "identity--c172c7a3-ebbc-4afc-bad2-5891a4617451",
    "identity--eeec7c51-145e-4455-920d-4446ee8145e7",
    "identity--1a879710-4a01-4454-a8a7-ec21a27472a9",
    "identity--777d873f-d1b0-467b-88a7-7dedef46b34a",
    "identity--10a55dba-a7cf-4575-8223-904f118f5bc3",
    "identity--05be2548-b22e-4bb3-81ee-a1de84dac07c",
    "identity--882b8b67-88f4-4674-aa31-9e80f0a37b60",
    "identity--84d28221-bb70-4dd8-b1a7-e951df3e329c",
    "identity--1b9d38f5-4dfa-496f-806d-907ed9d6d0d6",
    "identity--bbd9da2f-ba76-4526-85dc-9d0db2363a44"
  ],
  "summary": false
}
```

## Data Marking

### Marking Definition

GET `/api/data-marking/marking-definition`

Sample Response:

```json
{
  "id": "marking-definition--745fe7c5-88f3-4dcb-8297-5dfabd61eea1",
  "type": "marking-definition",
  "created": "2019-02-19T02:37:33.451Z",
  "definition_type": "tlp",
  "definition": {
    "tlp": "white",
    "x_taint": "occultly ectotrophic disentrances aft mises fated tint dementedly niellists burps towropes undivested filamentous biscuits lowse comfortably endurance inescutcheon rudely zoologist miasmatic hereby chary melisma some chypre sluggishly bust italicize oleanders pluck ritardando warps garnish parchments wit permutate nope vengefully forte whisperingly accustom thyrse mosso sidewise menology nigrifies bavardages checked sedate bites atop blah santir purely pallid slavishly reasoned cheesed colloquies caponizing spites pedigree instead blunderingly reincreases apace frore cyesis foil burrow raffish explicitly lobed cuirass snugs",
    "x_lithe": "kilt",
    "x_yet": 255212.7795529659,
    "x_eft": 897324,
    "x_jow": "naught",
    "x_thus": 963297,
    "x_wardress": "ell craggiest far muscid repiner conceitedly finessing",
    "x_enhance": "dingily antitrade movelessly thwart secco canalized streakily refers paganises angwantibos suffers such moldy lowlier scat billow motivelessness unprovided gelatinate usurp arco luculently durative blame frigid redeemable frogmarch kris lancinated bairnly repulsive gangues hypertrophied convergency daze",
    "x_overtiring": 735770,
    "x_teach": "ethnically",
    "x_loaners": "venule faring aesthetic trig forsaking ballast translates burking cluck stabilizer specializes ichthyosaur intermixes derisively acrimony same stuck ingenerate immutably such unmetrical decorative mystifiers equalise instancy enthusing doyley rehearsings enhancing fain syne wondrously unstoppably tramps tomograms infantes slyly sleigh varnisher southward disguises sunwards trussed nervy prefixions quean hence woodenness disciplining recoil piffle concordantly recondition splotch axially none wonts perfecter forepeaks allegorize outbarring girlishly cursively inboard regelating olecranon antiars caustically tuberculate gripingly blears left detractingly chays lambently whiles clean topsails uppish elsewhere parchedly maliciously muddier dilute penuche attackable decolonise cassias underslung pocky lagomorphic",
    "x_globing": true,
    "x_shivers": false
  }
}
```