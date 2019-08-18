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
    colors.map { |color| COLOR_NUMBER_MAP[color] }.join.to_i
  end
end