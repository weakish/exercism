from io import StringIO

import numpy as np


class Matrix(object):
    def __init__(self, matrix_string):
        self.value = np.loadtxt(StringIO(matrix_string), dtype="int", ndmin=2)

    def row(self, index):
        return list(self.value[index - 1, ...])

    def column(self, index):
        return list(self.value[..., index - 1])
