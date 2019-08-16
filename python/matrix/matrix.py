import numpy as np


class Matrix(object):
    def __init__(self, matrix_string):
        self.value = np.matrix(matrix_string.replace("\n", ";"))

    def row(self, index):
        return self.value[index - 1].tolist()[0]

    def column(self, index):
        return self.value.T[index - 1].tolist()[0]