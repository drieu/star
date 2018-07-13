package star


class StarController {

    def init() {
        new File("C:\\\\Users\\\\rieup01\\\\Downloads\\\\euromillions_4\\\\euromillions_4.csv").splitEachLine(";") {
            fields ->

                if (fields[5] != "boule_1") {
                    def draw = new Draw()
                    draw.drawDate = fields[2]
                    draw.ballOne = Integer.valueOf(fields[5])
                    draw.ballTwo = Integer.valueOf(fields[6])
                    draw.ballThree = Integer.valueOf(fields[7])
                    draw.ballFour = Integer.valueOf(fields[8])
                    draw.ballFive = Integer.valueOf(fields[9])
                    draw.save()
                }

        }
        def lst = Draw.findAll()
        for(Draw dr : lst) {
            println(dr.toString())
        }
    }


    def index() {
        def lst = Draw.findAll()
        def numberMapOne = getFrequencyNumberMapBallOne(lst)
        def numberMapTwo = getFrequencyNumberMapBallTwo(lst)
        def numberMapThree = getFrequencyNumberMapBallThree(lst)
        def numberMapFour = getFrequencyNumberMapBallFour(lst)
        def numberMapFive = getFrequencyNumberMapBallFive(lst)


        [numberMapOne:numberMapOne,numberMapTwo:numberMapTwo,numberMapThree:numberMapThree,numberMapFour:numberMapFour,numberMapFive:numberMapFive]
    }

    def getFrequencyNumberMapBallOne(def lst) {
        def numberMap = [:]
        for(Draw dr : lst) {

            int count = 0
            if (numberMap.get(dr.ballOne) == null) {
                numberMap.put(dr.ballOne, count + 1)
            } else {
                numberMap.put(dr.ballOne, numberMap.get(dr.ballOne) + 1)
            }
        }
        numberMap = numberMap.sort{a, b->b.value <=> a.value}
        return numberMap
    }

    def getFrequencyNumberMapBallTwo(def lst) {
        def numberMap = [:]
        for(Draw dr : lst) {

            int count = 0
            if (numberMap.get(dr.ballTwo) == null) {
                numberMap.put(dr.ballTwo, count + 1)
            } else {
                numberMap.put(dr.ballTwo, numberMap.get(dr.ballTwo) + 1)
            }
        }
        numberMap = numberMap.sort{a, b->b.value <=> a.value}
        return numberMap
    }

    def getFrequencyNumberMapBallThree(def lst) {
        def numberMap = [:]
        for(Draw dr : lst) {

            int count = 0
            if (numberMap.get(dr.ballThree) == null) {
                numberMap.put(dr.ballThree, count + 1)
            } else {
                numberMap.put(dr.ballThree, numberMap.get(dr.ballThree) + 1)
            }
        }
        numberMap = numberMap.sort{a, b->b.value <=> a.value}
        return numberMap
    }

    def getFrequencyNumberMapBallFour(def lst) {
        def numberMap = [:]
        for(Draw dr : lst) {

            int count = 0
            if (numberMap.get(dr.ballFour) == null) {
                numberMap.put(dr.ballFour, count + 1)
            } else {
                numberMap.put(dr.ballFour, numberMap.get(dr.ballFour) + 1)
            }
        }
        numberMap = numberMap.sort{a, b->b.value <=> a.value}
        return numberMap
    }

    def getFrequencyNumberMapBallFive(def lst) {
        def numberMap = [:]
        for(Draw dr : lst) {

            int count = 0
            if (numberMap.get(dr.ballFive) == null) {
                numberMap.put(dr.ballFive, count + 1)
            } else {
                numberMap.put(dr.ballFive, numberMap.get(dr.ballFive) + 1)
            }
        }
        numberMap = numberMap.sort{a, b->b.value <=> a.value}
        return numberMap
    }
}
