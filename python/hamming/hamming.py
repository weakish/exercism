from functools import reduce


class StrandLengthMismatchException(Exception):
    """Raised when two strands length mismatched."""
    pass


def distance(strand_a: str, strand_b: str) -> int:
    if len(strand_a) == len(strand_b):
        c: int = 0
        for i in range(len(strand_a)): c = c if strand_a[i] == strand_b[i] else c + 1
        return c
    else:
        raise StrandLengthMismatchException()
