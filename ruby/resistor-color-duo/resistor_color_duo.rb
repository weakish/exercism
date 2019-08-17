module ResistorColorDuo
  def self.value(colors)
    first_color, second_color = colors
    color_number_map = {"black" => 0,
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
    Integer("#{color_number_map[first_color]}#{color_number_map[second_color]}")
  end
end