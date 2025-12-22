def isRobotBounded(instructions: str) -> bool:
        x = 0
        y = 0
        direc = "N"
        for s in instructions:
            if s == "G":
                match direc:
                    case "N":
                        y += 1
                    case "S":
                        y -= 1
                    case "E":
                        x += 1
                    case "W":
                        x -= 1
                    case _:
                        pass
            if s == "L":
                match direc:
                    case "N":
                        direc = "W"
                    case "S":
                        direc = "E"
                    case "E":
                        direc = "N"
                    case "W":
                        direc = "S"
                    case _:
                        pass
            if s == "R":
                match direc:
                    case "N":
                        direc = "E"
                    case "S":
                        direc = "W"
                    case "E":
                        direc = "S"
                    case "W":
                        direc = "N"
                    case _:
                        pass
        return (direc != "N" or (x == 0 and y == 0))