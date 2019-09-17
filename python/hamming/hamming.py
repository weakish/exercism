def distance(strand_a: str, strand_b: str) -> int:
    if len(strand_a) != len(strand_b):
        raise ValueError("two strands length mismatch")
        
    char: int = 0
    for i in range(len(strand_a)):
        char = char if strand_a[i] == strand_b[i] else char + 1
    return char