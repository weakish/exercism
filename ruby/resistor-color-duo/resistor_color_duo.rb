module ResistorColorDuo
  COLOR_NUMBER_MAP = {"black" => 0,
    "brown" => 1,
    "red" => 2,
    "orange" => 3,
    "yellow" => 4,
    "green" => 5,
    "blue" => 6,
    "violet" => 7,
    "grey" => 8,
    "white" => 9,
  }

  def self.value(colors)
    first_color, second_color = colors
    Integer("#{COLOR_NUMBER_MAP[first_color]}#{COLOR_NUMBER_MAP[second_color]}")
  end
end