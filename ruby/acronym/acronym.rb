module Acronym
  def self.abbreviate(full_name)
    full_name.split.map { |word| word[0].capitalize }.join
  end
end
